
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
object bugs extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[LinkedList[BugReport],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(bugReports: LinkedList[BugReport]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*18.37*/("""

"""),format.raw/*21.1*/("""
"""),_display_(Seq[Any](/*22.2*/main("Bug Reports",null)/*22.26*/ {_display_(Seq[Any](format.raw/*22.28*/("""
    
    """),_display_(Seq[Any](/*24.6*/flash_message())),format.raw/*24.21*/("""
        
    <h1> Bug Reports(s)</h1>
		<table class="table table-striped table-bordered ">
			<thead ">
			<tr>
	    	  <td>Solved</td>
	    	  <td>Report Title</td>
	    	  <td>Reporter Name</td>
	    	  <td>Reporter's email</td>
	    	  <td>Reporter's organization</td>
	    	  <td>Bug content</td>
	    	  <td>Operation</td>
	        </tr>
			</thead>
			
			<tbody>
            <tr>
               """),_display_(Seq[Any](/*42.17*/for(bugReport <- bugReports) yield /*42.45*/ {_display_(Seq[Any](format.raw/*42.47*/("""
                    <tr>
                    	<td>
                    		"""),_display_(Seq[Any](/*45.24*/{if(bugReport.getSolved()==1){"Yes"}
                    			else{"No"}
                    		})),format.raw/*47.24*/("""
                    			
                    	</td>
                        <td>
                            """),_display_(Seq[Any](/*51.30*/bugReport/*51.39*/.getTitle())),format.raw/*51.50*/("""
                        </td>
                        <td> 
                            """),_display_(Seq[Any](/*54.30*/bugReport/*54.39*/.getName())),format.raw/*54.49*/("""
                        </td>
                        <td> 
                            """),_display_(Seq[Any](/*57.30*/bugReport/*57.39*/.getEmail())),format.raw/*57.50*/("""
                        </td>
                        <td> 
                            """),_display_(Seq[Any](/*60.30*/bugReport/*60.39*/.getOrganization())),format.raw/*60.57*/("""
                        </td>
                        <td> 
                            """),_display_(Seq[Any](/*63.30*/bugReport/*63.39*/.getDescription())),format.raw/*63.56*/("""
                        </td>
                        
                        
                        <td>
                        <div class="input-group input-group-sm">
                        <span>
						"""),_display_(Seq[Any](/*70.8*/form(routes.BugReportController.solveReport())/*70.54*/{_display_(Seq[Any](format.raw/*70.55*/("""
               		 		<input name="idHolder" type="hidden" value=""""),_display_(Seq[Any](/*71.66*/bugReport/*71.75*/.getId())),format.raw/*71.83*/("""">
        					<input type="submit"  class="btn btn-success" value="Solve" onclick="return confirm('Are you sure you want to solve this issue?')">
        				""")))})),format.raw/*73.14*/("""	
        				</span>
                        <span>
						"""),_display_(Seq[Any](/*76.8*/form(routes.BugReportController.deleteReport())/*76.55*/{_display_(Seq[Any](format.raw/*76.56*/("""
               		 		<input name="idHolder" type="hidden" value=""""),_display_(Seq[Any](/*77.66*/bugReport/*77.75*/.getId())),format.raw/*77.83*/("""">
        					<input type="submit"  class="btn btn-danger" value="Delete" onclick="return confirm('Are you sure you want to delete this issue?')">
        				""")))})),format.raw/*79.14*/("""	
        				</span>
        				</div>
           				
						
						</td>
                    </tr>
                """)))})),format.raw/*86.18*/("""
            </tr>
            </tbody>

    </table>
    
""")))})))}
    }
    
    def render(bugReports:LinkedList[BugReport]): play.api.templates.HtmlFormat.Appendable = apply(bugReports)
    
    def f:((LinkedList[BugReport]) => play.api.templates.HtmlFormat.Appendable) = (bugReports) => apply(bugReports)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 10 19:42:51 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/bugs.scala.html
                    HASH: 18b9e7b3c519a64234ad53a891410957e8d15d87
                    MATRIX: 3191->1205|3337->1240|3366->1259|3403->1261|3436->1285|3476->1287|3522->1298|3559->1313|4000->1718|4044->1746|4084->1748|4195->1823|4311->1917|4457->2027|4475->2036|4508->2047|4634->2137|4652->2146|4684->2156|4810->2246|4828->2255|4861->2266|4987->2356|5005->2365|5045->2383|5171->2473|5189->2482|5228->2499|5476->2712|5531->2758|5570->2759|5672->2825|5690->2834|5720->2842|5913->3003|6008->3063|6064->3110|6103->3111|6205->3177|6223->3186|6253->3194|6447->3356|6598->3475
                    LINES: 56->18|60->18|62->21|63->22|63->22|63->22|65->24|65->24|83->42|83->42|83->42|86->45|88->47|92->51|92->51|92->51|95->54|95->54|95->54|98->57|98->57|98->57|101->60|101->60|101->60|104->63|104->63|104->63|111->70|111->70|111->70|112->71|112->71|112->71|114->73|117->76|117->76|117->76|118->77|118->77|118->77|120->79|127->86
                    -- GENERATED --
                */
            