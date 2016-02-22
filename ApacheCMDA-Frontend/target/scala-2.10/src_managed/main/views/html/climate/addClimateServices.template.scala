
package views.html.climate

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one or more		   *
 * contributor license agreements.  See the NOTICE file distributed with	   *
 * this work for additional information regarding copyright ownership.         *
 * The ASF licenses this file to You under the Apache License, Version 2.0     *
 * (the "License"); you may not use this file except in compliance with        *
 * the License.  You may obtain a copy of the License at                       *
 *                                                                             *
 *    http://www.apache.org/licenses/LICENSE-2.0                               *
 *																			   *
 * Unless required by applicable law or agreed to in writing, software         *
 * distributed under the License is distributed on an "AS IS" BASIS,           *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
 * See the License for the specific language governing permissions and         *
 * limitations under the License.											   *
 *******************************************************************************/
object addClimateServices extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

    /*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one or more		   *
 * contributor license agreements.  See the NOTICE file distributed with	   *
 * this work for additional information regarding copyright ownership.         *
 * The ASF licenses this file to You under the Apache License, Version 2.0     *
 * (the "License"); you may not use this file except in compliance with        *
 * the License.  You may obtain a copy of the License at                       *
 *                                                                             *
 *    http://www.apache.org/licenses/LICENSE-2.0                               *
 *																			   *
 * Unless required by applicable law or agreed to in writing, software         *
 * distributed under the License is distributed on an "AS IS" BASIS,           *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
 * See the License for the specific language governing permissions and         *
 * limitations under the License.											   *
 *******************************************************************************/
    def apply/*18.2*/(climateServiceForm: play.data.Form[metadata.ClimateService]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*21.2*/scripts/*21.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.13*/("""
	<script src='"""),_display_(Seq[Any](/*22.16*/routes/*22.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*22.62*/("""'></script>
""")))};
Seq[Any](format.raw/*18.63*/("""
"""),format.raw/*20.1*/("""
"""),format.raw/*23.2*/("""

"""),_display_(Seq[Any](/*25.2*/main("Climate Services", null,scripts)/*25.40*/ {_display_(Seq[Any](format.raw/*25.42*/("""
	
	"""),_display_(Seq[Any](/*27.3*/flash_message())),format.raw/*27.18*/("""    
     """),_display_(Seq[Any](/*28.7*/if(true)/*28.15*/{_display_(Seq[Any](format.raw/*28.16*/("""
	    <h1>Add a new climate service</h1>
	    """),_display_(Seq[Any](/*30.7*/form(routes.ClimateServiceController.newClimateService())/*30.64*/ {_display_(Seq[Any](format.raw/*30.66*/("""   
	        """),_display_(Seq[Any](/*31.11*/inputText(
	        	climateServiceForm("Name"),
	        	'_label -> "Name * (Please DO NOT contain spaces)"
	        ))),format.raw/*34.11*/("""
	        """),_display_(Seq[Any](/*35.11*/inputText(
	        	climateServiceForm("Purpose"),
	        	'_label -> "Purpose"
	        ))),format.raw/*38.11*/("""
	        """),_display_(Seq[Any](/*39.11*/inputText(
	        	climateServiceForm("Url"),
	        	'_label -> "Url"
	        ))),format.raw/*42.11*/(""" 
	        """),_display_(Seq[Any](/*43.11*/inputText(
	        	climateServiceForm("Scenario"),
	        	'_label -> "Scenario"
	        ))),format.raw/*46.11*/("""
	         """),_display_(Seq[Any](/*47.12*/inputText(
	        	climateServiceForm("Version"),
	        	'_label -> "Version"
	        ))),format.raw/*50.11*/(""" 
	        """),_display_(Seq[Any](/*51.11*/inputText(
	        	climateServiceForm("Root_Service"),
	        	'_label -> "Root_Service"
	        ))),format.raw/*54.11*/("""
	        
	        <input class="btn" type="submit" value="Add a new service">
	        <a href=""""),_display_(Seq[Any](/*57.20*/routes/*57.26*/.ClimateServiceController.climateServices())),format.raw/*57.69*/("""" class="btn">Cancel</a>
	    """)))})),format.raw/*58.7*/("""
	
		<br>
		    
	    """),_display_(Seq[Any](/*62.7*/form(routes.ClimateServiceController.downloadClimateService(), 'class -> "form-horizontal", 'role -> "form")/*62.115*/ {_display_(Seq[Any](format.raw/*62.117*/("""
	
	        <button type="submit" name="action" value="download">Download</button>
	    """)))})),format.raw/*65.7*/("""
    """)))})),format.raw/*66.6*/("""
""")))})),format.raw/*67.2*/("""
"""))}
    }
    
    def render(climateServiceForm:play.data.Form[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(climateServiceForm)
    
    def f:((play.data.Form[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (climateServiceForm) => apply(climateServiceForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 10 19:42:51 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/addClimateServices.scala.html
                    HASH: 0571f9bdf570d5debacc5f8af18212bfdf09cecf
                    MATRIX: 3223->1205|3378->1286|3393->1293|3478->1297|3530->1313|3545->1319|3607->1359|3660->1266|3688->1284|3716->1372|3754->1375|3801->1413|3841->1415|3881->1420|3918->1435|3964->1446|3981->1454|4020->1455|4102->1502|4168->1559|4208->1561|4258->1575|4400->1695|4447->1706|4562->1799|4609->1810|4716->1895|4764->1907|4881->2002|4929->2014|5044->2107|5092->2119|5217->2222|5352->2321|5367->2327|5432->2370|5494->2401|5552->2424|5670->2532|5711->2534|5831->2623|5868->2629|5901->2631
                    LINES: 56->18|59->21|59->21|61->21|62->22|62->22|62->22|64->18|65->20|66->23|68->25|68->25|68->25|70->27|70->27|71->28|71->28|71->28|73->30|73->30|73->30|74->31|77->34|78->35|81->38|82->39|85->42|86->43|89->46|90->47|93->50|94->51|97->54|100->57|100->57|100->57|101->58|105->62|105->62|105->62|108->65|109->66|110->67
                    -- GENERATED --
                */
            