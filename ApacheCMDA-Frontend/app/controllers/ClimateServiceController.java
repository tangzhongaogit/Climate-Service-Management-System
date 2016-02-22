/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.UserService;
import models.metadata.ClimateService;
import models.metadata.ServiceComparator;
import play.Logger;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import scala.Console;
import util.APICall;
import util.APICall.ResponseType;
import util.Constants;
import views.html.climate.*;
import play.data.DynamicForm;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ClimateServiceController extends Controller {

	final static Form<ClimateService> climateServiceForm = Form
			.form(ClimateService.class);

	public static Result home(String email, String vfile, String dataset) {
		List<ClimateService> ServiceList = ClimateService.all();
		Collections.sort(ServiceList,new ServiceComparator());
		return ok(home.render(email, vfile, dataset, ServiceList));
	}

	public static Result addClimateServices() {
		return ok(addClimateServices.render(climateServiceForm));
	}

	public static Result tutorial() {
		return ok(tutorial.render());
	}

	public static Result climateServices(String email) {
		return ok(climateServices.render(ClimateService.all(),
				climateServiceForm,email));
	}
	
	public static Result mostRecentlyAddedClimateServices(String email) {
		return ok(mostRecentlyAddedServices.render(ClimateService.getMostRecentlyAdded(),
				climateServiceForm,email));
	}
	
	public static Result mostRecentlyUsedClimateServices(String email) {
		return ok(mostRecentlyUsedServices.render(ClimateService.getMostRecentlyUsed(),
				climateServiceForm,email));
	}

	public static Result mostPopularClimateServices(String email) {
		return ok(mostPopularServices.render(ClimateService.getMostPopular(),
				climateServiceForm,email));
	}

	public static Result top3(String email) {
		return ok(top3.render(ClimateService.top3(),
				climateServiceForm,email));
	}


	public static Result newClimateService() {
		Form<ClimateService> dc = climateServiceForm.bindFromRequest();
		ObjectNode jsonData = Json.newObject();
		try {

			String originalClimateServiceName = dc.field("Name").value();
			String newClimateServiceName = originalClimateServiceName.replace(' ', '-');

			if (newClimateServiceName != null && !newClimateServiceName.isEmpty()) {
				jsonData.put("name", newClimateServiceName);
			}
			
			jsonData.put("creatorId", 1);
			jsonData.put("purpose", dc.field("Purpose").value());
			jsonData.put("url", dc.field("Url").value());
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
			Date date = new Date();
			jsonData.put("createTime", dateFormat.format(date));
			jsonData.put("scenario", dc.field("Scenario").value());
			jsonData.put("versionNo", dc.field("Version").value());
			jsonData.put("rootServiceId", dc.field("Root_Service").value());
			JsonNode response = ClimateService.create(jsonData);
			Application.flashMsg(response);
		} catch (IllegalStateException e) {
			e.printStackTrace();
			Application.flashMsg(APICall
					.createResponse(ResponseType.CONVERSIONERROR));
		} catch (Exception e) {
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}
		return redirect("/climate/climateServices");
	}

	public static Result editClimateService() {

		ObjectNode jsonData = Json.newObject();
		try {
			DynamicForm df = DynamicForm.form().bindFromRequest();
			String climateServiceName = df.field("pk").value();

			if (climateServiceName != null && !climateServiceName.isEmpty()) {
				jsonData.put("name", climateServiceName);
			}
			ClimateService originalService = ClimateService.findServiceByName(climateServiceName);
			
			if (originalService == null) {
				Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
				return notFound("not found original climateService " + climateServiceName);
			}

			jsonData.put("creatorId", 1);
			jsonData.put("purpose", originalService.getPurpose());
			jsonData.put("url", originalService.getUrl());
			jsonData.put("scenario", originalService.getScenario());
			jsonData.put("versionNo", originalService.getVersion());
			
			if (originalService.getRootservice() != null)
				
				jsonData.put("rootServiceId", originalService.getRootservice());
			String editField = df.field("name").value();
			
			if (editField != null && !editField.isEmpty()) {
				jsonData.put(editField, df.field("value").value());
			}
			
			if (editField == null || editField.isEmpty()) {
				Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
				return notFound("not found edit field");
			}

			JsonNode response = ClimateService.edit(climateServiceName, jsonData);
			Application.flashMsg(response);

		} catch (IllegalStateException e) {
			e.printStackTrace();
			Application.flashMsg(APICall
					.createResponse(ResponseType.CONVERSIONERROR));
		} catch (Exception e) {
			e.printStackTrace();
			Application.flashMsg(APICall.createResponse(ResponseType.UNKNOWN));
		}
		return ok("updated");

	}


	public static Result deleteClimateService() throws UnsupportedEncodingException {
		DynamicForm df = DynamicForm.form().bindFromRequest();
		String climateServiceId = df.field("idHolder").value();
		Logger.debug(climateServiceId);
		JsonNode response = ClimateService.delete(climateServiceId);
		Application.flashMsg(response);
		return redirect("/climate/climateServices");
	}


	public static Result downloadClimateService() {
		List<ClimateService> user = ClimateService.all();
		ObjectMapper mapper = new ObjectMapper();
		File file = new File("user.json");
		try {
			mapper.writeValue(file, user);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response().setContentType("application/x-download");
		response().setHeader("Content-disposition",
				"attachment; filename=user.json");
		return ok(file);
	}

	// new added by group 3
	public static Result searchService(String email){
		return ok(searchService.render(climateServiceForm,email,null));
	}

	public static Result oneService(String url,String email,String id) {
		System.out.println(id);
		ClimateService.updateFrequency(id);
		//return ok(oneService.render("/assets/html/" + url,email,id,ClimateService.all()));

		return ok(oneService.render("/assets/html/" + url,email,id,ClimateService.all(), UserService.getFriends(email)));
//		List<String> fakeRelationShip = new ArrayList<String>();
//		fakeRelationShip.add("Jiyu Shi");
//		fakeRelationShip.add("Zhongao Tang");
//		fakeRelationShip.add("Yuan Liu");
//		fakeRelationShip.add("Xiaoyu Wang");
//
//		return ok(oneService.render("/assets/html/" + url,email,id,ClimateService.all(),fakeRelationShip));
	}


	public static Result getSearchServiceResult(String email){

		Form<ClimateService> serviceForm = climateServiceForm.bindFromRequest();
		//String email =
		//System.out.println("serviceFornm = " + serviceForm.field("Search Service").value());
		//get the string of key words.

		System.out.println(serviceForm.field("email").value());
		String keywords = serviceForm.field("Search").value();

		if (keywords.contains("#")){
			System.out.println("find the #");
			int index = keywords.indexOf("#");
			keywords = keywords.substring(index+1);
			System.out.println(keywords);

			String result = ClimateService.findAtService(keywords);
			return ok(searchService.render(climateServiceForm,email,result));
		}else if(keywords.contains("@")) {
			System.out.println("find the @");
			int index = keywords.indexOf("@");
			keywords = keywords.substring(index+1);
			System.out.println(keywords);

			String result = ClimateService.findAtService(keywords);
			System.out.println("result = " + result +",");

			return ok(searchService.render(climateServiceForm,email,result));
		}

		return ok(climateServices.render(ClimateService.findService(serviceForm.field("Search").value()),
				climateServiceForm,serviceForm.field("email").value()));
	}


	//call to post a comment
	//	public static Result postCommentAndGrade(){
	//
	//	}


}
