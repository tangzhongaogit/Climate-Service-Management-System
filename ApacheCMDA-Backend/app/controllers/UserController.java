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

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Friend;
import models.FriendRepository;
import models.User;
import models.UserRepository;
import play.libs.Json;
import play.mvc.*;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;


/**
 * The main set of web services.
 */
@Named
@Singleton
public class UserController extends Controller {


	private final UserRepository userRepository;
	private final FriendRepository friendRepository;

	// We are using constructor injection to receive a repository to support our
	// desire for immutability.
	@Inject
	public UserController(final UserRepository userRepository, final FriendRepository friendRepository) {
		this.userRepository = userRepository;
		this.friendRepository = friendRepository;
	}


	public Result addUser() {
		JsonNode json = request().body().asJson();
		ObjectNode obj = Json.newObject();


		if (json == null) {
			System.out.println("User not created, expecting Json data");
			obj.put("result", "failure");
			return badRequest(new Gson().toJson(obj));
		}

		// Parse JSON file
		String userName = json.path("userName").asText();
		String password = json.path("password").asText();
		String firstName = json.path("firstName").asText();
		String lastName = json.path("lastName").asText();
//		String middleInitial = json.path("middleInitial").asText();
//	    String affiliation = json.path("affiliation").asText();
//	    String title = json.path("title").asText();
	    String email = json.path("email").asText();
//	    String mailingAddress = json.path("mailingAddress").asText();
//	    String phoneNumber = json.path("phoneNumber").asText();
//	    String faxNumber = json.path("faxNumber").asText();
//	    String researchFields = json.path("researchFields").asText();
//	    String highestDegree = json.path("highestDegree").asText();

		try {
			if (userRepository.findByUserName(userName).size()>0) {
				System.out.println("UserName has been used: " + userName);
//				return badRequest("UserName has been used");
				obj.put("result", "failure");
				return badRequest(new Gson().toJson(obj));
			}else if (userRepository.findByEmail(email) != null) {
				System.out.println("Email has been used: " + userName);
//				return badRequest("UserName has been used");
				obj.put("result", "failure");
				return badRequest(new Gson().toJson(obj));
			}
//			User user = new User(userName, password, firstName, lastName, middleInitial, affiliation, title, email, mailingAddress, phoneNumber, faxNumber, researchFields, highestDegree);
			User user = new User(userName, password, firstName, lastName, email);
			userRepository.save(user);
			System.out.println("User saved: " + user.getId());
//			return created(new Gson().toJson(user.getId()));
			obj.put("result", "success");
			return ok(new Gson().toJson(obj));
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("User not saved: " + firstName + " " + lastName);
//			return badRequest("User not saved: " + firstName + " " + lastName);
			obj.put("result", "failure");
			return badRequest(new Gson().toJson(obj));
		}
	}

	public Result deleteUser(Long id) {
		User deleteUser = userRepository.findOne(id);
		if (deleteUser == null) {
			System.out.println("User not found with id: " + id);
			return notFound("User not found with id: " + id);
		}

		userRepository.delete(deleteUser);
		System.out.println("User is deleted: " + id);
		return ok("User is deleted: " + id);
	}

	public Result updateUser(long id) {
		JsonNode json = request().body().asJson();
		if (json == null) {
			System.out.println("User not saved, expecting Json data");
			return badRequest("User not saved, expecting Json data");
		}

		// Parse JSON file
		String firstName = json.path("firstName").asText();
		String lastName = json.path("lastName").asText();
		String middleInitial = json.path("middleInitial").asText();
	    String affiliation = json.path("affiliation").asText();
	    String title = json.path("title").asText();
	    String email = json.path("email").asText();
	    String mailingAddress = json.path("mailingAddress").asText();
	    String phoneNumber = json.path("phoneNumber").asText();
	    String faxNumber = json.path("faxNumber").asText();
	    String researchFields = json.path("researchFields").asText();
	    String highestDegree = json.path("highestDegree").asText();
		try {
			User updateUser = userRepository.findOne(id);

			updateUser.setFirstName(firstName);
			updateUser.setLastName(lastName);
			updateUser.setAffiliation(affiliation);
			updateUser.setEmail(email);
			updateUser.setFaxNumber(faxNumber);
			updateUser.setHighestDegree(highestDegree);
			updateUser.setMailingAddress(mailingAddress);
			updateUser.setMiddleInitial(middleInitial);
			updateUser.setPhoneNumber(phoneNumber);
			updateUser.setResearchFields(researchFields);
			updateUser.setTitle(title);
			
			User savedUser = userRepository.save(updateUser);
			System.out.println("User updated: " + savedUser.getFirstName()
					+ " " + savedUser.getLastName());
			return created("User updated: " + savedUser.getFirstName() + " "
					+ savedUser.getLastName());
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("User not updated: " + firstName + " "
					+ lastName);
			return badRequest("User not updated: " + firstName + " " + lastName);
		}
	}

	public Result getUser(Long id, String format) {
		if (id == null) {
			System.out.println("User id is null or empty!");
			return badRequest("User id is null or empty!");
		}

		User user = userRepository.findOne(id);

		if (user == null) {
			System.out.println("User not found with with id: " + id);
			return notFound("User not found with with id: " + id);
		}
		String result = new String();
		if (format.equals("json")) {
			result = new Gson().toJson(user);
		}

		return ok(result);
	}
	
	public Result getAllUsers(String format) {
		Iterable<User> userIterable = userRepository.findAll();
		List<User> userList = new ArrayList<User>();
		for (User user : userIterable) {
			userList.add(user);
		}
		String result = new String();
		if (format.equals("json")) {
			result = new Gson().toJson(userList);
		}
		return ok(result);
	}
	
	public Result isUserValid() {
		JsonNode json = request().body().asJson();
		ObjectNode obj = Json.newObject();


		if (json == null) {
			System.out.println("Cannot check user, expecting Json data");
			obj.put("result", "failure");
			return badRequest(new Gson().toJson(obj));
//			return badRequest("Cannot check user, expecting Json data");
		}
		String email = json.path("email").asText();
		String password = json.path("password").asText();
		User user = userRepository.findByEmail(email);
		if (user.getPassword().equals(password)) {
			System.out.println("User is valid");
			obj.put("result", "success");
			return ok(new Gson().toJson(obj));
//			return ok("User is valid");
		} else {
			System.out.println("User is not valid");
			obj.put("result", "failure");
			return badRequest(new Gson().toJson(obj));
//			return badRequest("User is not valid");
		}
	}
	
	public Result deleteUserByUserNameandPassword(String userName, String password) {
		try {
			List<User> users = userRepository.findByUserName(userName);
			if (users.size()==0) {
				System.out.println("User is not existed");
				return badRequest("User is not existed");
			}
			User user = users.get(0);
			if (user.getPassword().equals(password)) {
				System.out.println("User is deleted: "+user.getId());
				userRepository.delete(user);
				return ok("User is deleted");
			}
			else {
				System.out.println("User is not deleted for wrong password");
				return badRequest("User is not deleted for wrong password");
			}
		}
		catch (PersistenceException pe) {
			pe.printStackTrace();
			System.out.println("User is not deleted");
			return badRequest("User is not deleted");
		}
		
	}
	public Result isUserEmailValid() {
		JsonNode json = request().body().asJson();
		ObjectNode obj = Json.newObject();


		if (json == null) {
			System.out.println("Cannot check user, expecting Json data");
			obj.put("result", "failure");
			return badRequest(new Gson().toJson(obj));
//			return badRequest("Cannot check user, expecting Json data");
		}
		String email = json.path("email").asText();
		User user = userRepository.findByEmail(email);
		if (user != null) {
			System.out.println("User is valid");
			obj.put("result", "success");
			return ok(new Gson().toJson(obj));
//			return ok("User is valid");
		} else {
			System.out.println("User is not valid");
			obj.put("result", "failure");
			return badRequest(new Gson().toJson(obj));
//			return badRequest("User is not valid");
		}
	}


	public Result addFriend() {
		JsonNode json = request().body().asJson();
		ObjectNode obj = Json.newObject();
		System.out.println("addFriend Called");

		if (json == null) {
			System.out.println("Cannot check user, expecting Json data");
			obj.put("result", "failure");
			return badRequest(new Gson().toJson(obj));
//			return badRequest("Cannot check user, expecting Json data");
		}
		String usr1 = json.path("user1").asText();
		String usr2 = json.path("user2").asText();

		System.out.println("USER1 = " + usr1);
		System.out.println("USER1 = " + usr2);
		System.out.println();

		User user2 = userRepository.findByEmail(usr2);
		if (user2 == null){
			System.out.println("User is not valid");
			obj.put("result", "failure");
			return badRequest(new Gson().toJson(obj));
//			return badRequest("User is not valid");
		}

		Iterable<Friend> userIterable = friendRepository.findAllByUser1(usr1);
		for (Friend user : userIterable) {
			if( user.getUser2().equals(usr2) ){
				System.out.println("Friends relationship already exists");
				obj.put("result", "failure");
				return ok(new Gson().toJson(obj));
//			return badRequest("User is not valid");
			}
		}


		User user = userRepository.findByEmail(usr1);
		if (user != null) {
			Friend friend = new Friend(usr1, usr2);
			friendRepository.save(friend);

			System.out.println("User is valid");
			obj.put("result", "success");
			return ok(new Gson().toJson(obj));
//			return ok("User is valid");
		} else {
			System.out.println("User is not valid");
			obj.put("result", "failure");
			return badRequest(new Gson().toJson(obj));
//			return badRequest("User is not valid");
		}
	}

	public Result getFriends() {
		JsonNode json = request().body().asJson();
		ObjectNode obj = Json.newObject();
		System.out.println("getFriends Called");
		System.out.println();
		if (json == null) {
			System.out.println("Cannot check user, expecting Json data");
			obj.put("result", "failure");
			return badRequest(new Gson().toJson(obj));
//			return badRequest("Cannot check user, expecting Json data");
		}
		String usr1 = json.path("user1").asText();


		Iterable<Friend> userIterable = friendRepository.findAllByUser1(usr1);
		List<User> userList = new ArrayList<User>();
		for (Friend user : userIterable) {
//			userList.add(user);
			User temp = userRepository.findByEmail(user.getUser2());
			if( temp != null ){
				userList.add(temp);
			}
		}

		String result = new String();
		result = new Gson().toJson(userList);

		return ok(result);
	}
}
