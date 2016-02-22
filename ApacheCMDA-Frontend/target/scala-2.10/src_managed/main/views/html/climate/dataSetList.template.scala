
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
object dataSetList extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[DataSet],play.data.Form[DataSet],String,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(dataSets: List[DataSet], dataSetForm: play.data.Form[DataSet],email:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
	<script src='"""),_display_(Seq[Any](/*23.16*/routes/*23.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.62*/("""'></script>
	<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*25.30*/("""{"""),format.raw/*25.31*/("""
		//alert($("#url").text());
	"""),format.raw/*27.2*/("""}"""),format.raw/*27.3*/(""");
	</script>
""")))};
Seq[Any](format.raw/*18.78*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("Dataset List", email ,scripts)/*31.38*/ {_display_(Seq[Any](format.raw/*31.40*/("""
	
	"""),_display_(Seq[Any](/*33.3*/flash_message())),format.raw/*33.18*/("""   
	 
    <h1>Climate Datasets</h1>
    <h2>"""),_display_(Seq[Any](/*36.10*/dataSets/*36.18*/.size())),format.raw/*36.25*/(""" Datasets Found</h2>
    <div style="overflow-y:scroll">

		<table class="table table-striped table-bordered table-condensed tablesorter" id ="myTable">
		<thead>
	<tr >
		<th style = "vertical-align: top;" class="col-md-1 header">Id</th>
		<th style = "vertical-align: top;" class="col-md-2">Dataset Name</th>
		<th style = "vertical-align: top;" class="col-md-1">Agency</th>
		<th style = "vertical-align: top;" class="col-md-1">Instrument</th>
		<th style = "vertical-align: top;" class="col-md-2">Physical variable</th>
		<th style = "vertical-align: top;" class="col-md-1">Variable short name</th>
		<th style = "vertical-align: top;" class="col-md-1">Units</th>
		<th style = "vertical-align: top;" class="col-md-1">Grid Dimension</th>
		<!--  
		<th style = "vertical-align: top;" class="col-md-3">Source</th> 
		<th style = "vertical-align: top;" class="col-md-3">Status</th>
		<th style = "vertical-align: top;" class="col-md-4">Responsible Person</th>
		<th style = "vertical-align: top;" class="col-md-4">Data Source Name in Web Interface</th> 
		-->
		<th style = "vertical-align: top;" class="col-md-2">Variable Name in Web Interface</th>
		<th style = "vertical-align: top;" class="col-md-1">Data Source Input Parameter</th>
		<!-- <th style = "vertical-align: top;" class="col-md-3">Variable Name Input Parameter</th> -->
		<th style = "vertical-align: top;" class="col-md-1">Dataset Start Time</th>
		<th style = "vertical-align: top;"class="col-md-1">Dataset End Time</th>

	</tr>
	</thead>
	<tbody>
	"""),_display_(Seq[Any](/*65.3*/for(dataSet <- dataSets) yield /*65.27*/{_display_(Seq[Any](format.raw/*65.28*/("""
	<tr>
		<td><font size="2">"""),_display_(Seq[Any](/*67.23*/dataSet/*67.30*/.getId())),format.raw/*67.38*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*68.23*/dataSet/*68.30*/.getDataSetName())),format.raw/*68.47*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*69.23*/dataSet/*69.30*/.getAgencyId())),format.raw/*69.44*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*70.23*/dataSet/*70.30*/.getInstrument())),format.raw/*70.46*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*71.23*/dataSet/*71.30*/.getPhysicalVariable())),format.raw/*71.52*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*72.23*/dataSet/*72.30*/.getCMIP5VarName())),format.raw/*72.48*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*73.23*/dataSet/*73.30*/.getUnits())),format.raw/*73.41*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*74.23*/dataSet/*74.30*/.getGridDimension())),format.raw/*74.49*/("""</font></td>
		<!--
		<td><font size="2">"""),_display_(Seq[Any](/*76.23*/dataSet/*76.30*/.getSource())),format.raw/*76.42*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*77.23*/dataSet/*77.30*/.getStatus())),format.raw/*77.42*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*78.23*/dataSet/*78.30*/.getResponsiblePerson())),format.raw/*78.53*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*79.23*/dataSet/*79.30*/.getDataSourceName())),format.raw/*79.50*/("""</font></td>
		-->
		<td><font size="2">"""),_display_(Seq[Any](/*81.23*/dataSet/*81.30*/.getVariableName())),format.raw/*81.48*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*82.23*/dataSet/*82.30*/.getDataSourceInput())),format.raw/*82.51*/("""</font></td>
		<!--<td><font size="2">"""),_display_(Seq[Any](/*83.27*/dataSet/*83.34*/.getVariableNameInput())),format.raw/*83.57*/("""</font></td> -->
		<td><font size="2">"""),_display_(Seq[Any](/*84.23*/dataSet/*84.30*/.getStartTime())),format.raw/*84.45*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*85.23*/dataSet/*85.30*/.getEndTime())),format.raw/*85.43*/("""</font></td>
		
	</tr>
	
	""")))})),format.raw/*89.3*/("""
	</tbody>
    </table>
    
 
    
    </div>
""")))})),format.raw/*96.2*/("""
"""))}
    }
    
    def render(dataSets:List[DataSet],dataSetForm:play.data.Form[DataSet],email:String): play.api.templates.HtmlFormat.Appendable = apply(dataSets,dataSetForm,email)
    
    def f:((List[DataSet],play.data.Form[DataSet],String) => play.api.templates.HtmlFormat.Appendable) = (dataSets,dataSetForm,email) => apply(dataSets,dataSetForm,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 10 19:42:51 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/dataSetList.scala.html
                    HASH: a9c3cf000ed3870a9534f5fdd5e589cbd8c39889
                    MATRIX: 3221->1205|3391->1302|3406->1309|3491->1313|3543->1329|3558->1335|3620->1375|3722->1449|3751->1450|3809->1481|3837->1482|3892->1281|3921->1300|3949->1497|3987->1500|4032->1536|4072->1538|4112->1543|4149->1558|4231->1604|4248->1612|4277->1619|5831->3138|5871->3162|5910->3163|5975->3192|5991->3199|6021->3207|6092->3242|6108->3249|6147->3266|6218->3301|6234->3308|6270->3322|6341->3357|6357->3364|6395->3380|6466->3415|6482->3422|6526->3444|6597->3479|6613->3486|6653->3504|6724->3539|6740->3546|6773->3557|6844->3592|6860->3599|6901->3618|6979->3660|6995->3667|7029->3679|7100->3714|7116->3721|7150->3733|7221->3768|7237->3775|7282->3798|7353->3833|7369->3840|7411->3860|7488->3901|7504->3908|7544->3926|7615->3961|7631->3968|7674->3989|7749->4028|7765->4035|7810->4058|7885->4097|7901->4104|7938->4119|8009->4154|8025->4161|8060->4174|8118->4201|8197->4249
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|79->36|79->36|79->36|108->65|108->65|108->65|110->67|110->67|110->67|111->68|111->68|111->68|112->69|112->69|112->69|113->70|113->70|113->70|114->71|114->71|114->71|115->72|115->72|115->72|116->73|116->73|116->73|117->74|117->74|117->74|119->76|119->76|119->76|120->77|120->77|120->77|121->78|121->78|121->78|122->79|122->79|122->79|124->81|124->81|124->81|125->82|125->82|125->82|126->83|126->83|126->83|127->84|127->84|127->84|128->85|128->85|128->85|132->89|139->96
                    -- GENERATED --
                */
            