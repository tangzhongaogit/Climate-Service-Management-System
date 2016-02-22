
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
object bugReporting extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[BugReport],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(bugReportForm: play.data.Form[BugReport]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*18.44*/("""

"""),format.raw/*22.1*/("""
"""),_display_(Seq[Any](/*23.2*/main("Bug Report",null)/*23.25*/ {_display_(Seq[Any](format.raw/*23.27*/("""
    
    """),_display_(Seq[Any](/*25.6*/flash_message())),format.raw/*25.21*/("""
        
    """),_display_(Seq[Any](/*27.6*/helper/*27.12*/.form(action = routes.BugReportController.newReport)/*27.64*/ {_display_(Seq[Any](format.raw/*27.66*/("""
        
        <fieldset>
            <legend>Bug Report</legend>
            
            """),_display_(Seq[Any](/*32.14*/inputText(
                bugReportForm("name"), 
                '_label -> "Your name",                 
                '_error -> bugReportForm.globalError                                
            ))),format.raw/*36.14*/("""
            """),_display_(Seq[Any](/*37.14*/inputText(
                bugReportForm("title"), 
                '_label -> "Bug Title",                 
                '_error -> bugReportForm.globalError                                
            ))),format.raw/*41.14*/("""
            """),_display_(Seq[Any](/*42.14*/inputText(
                bugReportForm("email"), 
                '_label -> "Email",
                '_helper -> "You must be a registered user to report a bug",                 
                '_error -> bugReportForm.globalError                                
            ))),format.raw/*47.14*/("""
            """),_display_(Seq[Any](/*48.14*/inputText(
                bugReportForm("organization"), 
                '_label -> "Organization",                 
                '_error -> bugReportForm.globalError                                
            ))),format.raw/*52.14*/("""
            """),_display_(Seq[Any](/*53.14*/textarea(
                bugReportForm("description"), 
                '_label -> "Description", 'cols -> 65, 'rows -> 7                                               
            ))),format.raw/*56.14*/("""
           
        </fieldset>
        
      
        <div class="actions">
            <input type="submit" class="btn primary" value="Submit">
            <a href=""""),_display_(Seq[Any](/*63.23*/routes/*63.29*/.ClimateServiceController.home())),format.raw/*63.61*/("""" class="btn">Cancel</a>
        </div>
        
    """)))})),format.raw/*66.6*/("""
    
""")))})),format.raw/*68.2*/("""
"""))}
    }
    
    def render(bugReportForm:play.data.Form[BugReport]): play.api.templates.HtmlFormat.Appendable = apply(bugReportForm)
    
    def f:((play.data.Form[BugReport]) => play.api.templates.HtmlFormat.Appendable) = (bugReportForm) => apply(bugReportForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 10 19:42:51 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/bugReporting.scala.html
                    HASH: c9a469204b46b0a7f7393e9d2a2ea32943839714
                    MATRIX: 3203->1205|3390->1247|3419->1300|3456->1302|3488->1325|3528->1327|3574->1338|3611->1353|3661->1368|3676->1374|3737->1426|3777->1428|3908->1523|4136->1729|4186->1743|4415->1950|4465->1964|4767->2244|4817->2258|5056->2475|5106->2489|5311->2672|5517->2842|5532->2848|5586->2880|5671->2934|5709->2941
                    LINES: 56->18|62->18|64->22|65->23|65->23|65->23|67->25|67->25|69->27|69->27|69->27|69->27|74->32|78->36|79->37|83->41|84->42|89->47|90->48|94->52|95->53|98->56|105->63|105->63|105->63|108->66|110->68
                    -- GENERATED --
                */
            