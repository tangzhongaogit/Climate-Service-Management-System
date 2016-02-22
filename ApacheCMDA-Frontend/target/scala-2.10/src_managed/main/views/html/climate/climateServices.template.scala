
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
object climateServices extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[metadata.ClimateService],play.data.Form[metadata.ClimateService],String,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(climateServices: List[metadata.ClimateService], climateServiceForm: play.data.Form[metadata.ClimateService],email:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
	<script src='"""),_display_(Seq[Any](/*23.16*/routes/*23.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.62*/("""'></script>
	<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*25.30*/("""{"""),format.raw/*25.31*/("""

	"""),format.raw/*27.2*/("""}"""),format.raw/*27.3*/(""");
	</script>
""")))};
Seq[Any](format.raw/*18.124*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("Climate Services",email,scripts)/*31.40*/ {_display_(Seq[Any](format.raw/*31.42*/("""
	
	"""),_display_(Seq[Any](/*33.3*/flash_message())),format.raw/*33.18*/("""   
	 
    <h1>"""),_display_(Seq[Any](/*35.10*/climateServices/*35.25*/.size())),format.raw/*35.32*/(""" Climate Services</h1>
		<table class="table table-striped table-bordered table-condensed ex2 tablesorter" id = "csTable">
		<thead>
	<tr>
		<th class="col-md-2">Climate Service Name</td>
		<th class="col-md-4">Purpose</td>
		<th class="col-md-2">Url</td>
		<th class="col-md-2">Version</td>
		
	</tr>
	</thead>
	"""),_display_(Seq[Any](/*46.3*/for(climateService <- climateServices) yield /*46.41*/{_display_(Seq[Any](format.raw/*46.42*/("""
	<tr>
		<td><a href = """"),_display_(Seq[Any](/*48.19*/{routes.ClimateServiceController.oneService(climateService.getUrl(),email,climateService.getId())})),format.raw/*48.117*/(""""><font size="3">"""),_display_(Seq[Any](/*48.135*/climateService/*48.149*/.getClimateServiceName())),format.raw/*48.173*/("""</a></font></td>

		<td><span class=""""),_display_(Seq[Any](/*50.21*/climateService/*50.35*/.getClimateServiceName())),format.raw/*50.59*/(""" editable"  data-name='purpose'><font size="3">
				"""),_display_(Seq[Any](/*51.6*/climateService/*51.20*/.getPurpose())),format.raw/*51.33*/(""" </font></span></td>
		
		<td class = "text-center" ><span class=""""),_display_(Seq[Any](/*53.44*/climateService/*53.58*/.getClimateServiceName())),format.raw/*53.82*/(""" editable" id = "url" data-name='url'>
				<a href = """"),_display_(Seq[Any](/*54.17*/{routes.ClimateServiceController.oneService(climateService.getUrl(),email,climateService.getId())})),format.raw/*54.115*/("""">
					<img src='"""),_display_(Seq[Any](/*55.17*/climateService/*55.31*/.getPhoto())),format.raw/*55.42*/("""' style="height: 150px; width: 150px" ></a>
		</span></td>

		<td><span class=""""),_display_(Seq[Any](/*58.21*/climateService/*58.35*/.getClimateServiceName())),format.raw/*58.59*/(""" editable" data-name='versionNo'>
		"""),_display_(Seq[Any](/*59.4*/for(version <- climateService.getVerionList()) yield /*59.50*/{_display_(Seq[Any](format.raw/*59.51*/("""
			<a href = """"),_display_(Seq[Any](/*60.16*/{routes.ClimateServiceController.oneService(climateService.findUrl(version),email,climateService.getId())})),format.raw/*60.122*/("""">"""),_display_(Seq[Any](/*60.125*/version)),format.raw/*60.132*/("""</a><br>
		""")))})),format.raw/*61.4*/("""
		</span></td>




	
	</tr>
	""")))})),format.raw/*69.3*/("""
    </table>
 
    
     """),_display_(Seq[Any](/*73.7*/if(false)/*73.16*/{_display_(Seq[Any](format.raw/*73.17*/("""
		    
	    """),_display_(Seq[Any](/*75.7*/form(routes.ClimateServiceController.downloadClimateService(), 'class -> "form-horizontal", 'role -> "form")/*75.115*/ {_display_(Seq[Any](format.raw/*75.117*/("""
	
	        <button type="submit" name="action" value="download">Download</button>
	    """)))})),format.raw/*78.7*/("""
    """)))})),format.raw/*79.6*/("""
""")))})),format.raw/*80.2*/("""
"""))}
    }
    
    def render(climateServices:List[metadata.ClimateService],climateServiceForm:play.data.Form[metadata.ClimateService],email:String): play.api.templates.HtmlFormat.Appendable = apply(climateServices,climateServiceForm,email)
    
    def f:((List[metadata.ClimateService],play.data.Form[metadata.ClimateService],String) => play.api.templates.HtmlFormat.Appendable) = (climateServices,climateServiceForm,email) => apply(climateServices,climateServiceForm,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 10 19:42:51 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/climateServices.scala.html
                    HASH: 6c783893239202230305946f3c5191d437b28458
                    MATRIX: 3257->1205|3473->1348|3488->1355|3573->1359|3625->1375|3640->1381|3702->1421|3804->1495|3833->1496|3863->1499|3891->1500|3947->1327|3976->1346|4004->1515|4042->1518|4089->1556|4129->1558|4169->1563|4206->1578|4258->1594|4282->1609|4311->1616|4660->1930|4714->1968|4753->1969|4814->1994|4935->2092|4990->2110|5014->2124|5061->2148|5135->2186|5158->2200|5204->2224|5292->2277|5315->2291|5350->2304|5453->2371|5476->2385|5522->2409|5613->2464|5734->2562|5789->2581|5812->2595|5845->2606|5961->2686|5984->2700|6030->2724|6102->2761|6164->2807|6203->2808|6255->2824|6384->2930|6424->2933|6454->2940|6497->2952|6559->2983|6621->3010|6639->3019|6678->3020|6727->3034|6845->3142|6886->3144|7006->3233|7043->3239|7076->3241
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|78->35|78->35|78->35|89->46|89->46|89->46|91->48|91->48|91->48|91->48|91->48|93->50|93->50|93->50|94->51|94->51|94->51|96->53|96->53|96->53|97->54|97->54|98->55|98->55|98->55|101->58|101->58|101->58|102->59|102->59|102->59|103->60|103->60|103->60|103->60|104->61|112->69|116->73|116->73|116->73|118->75|118->75|118->75|121->78|122->79|123->80
                    -- GENERATED --
                */
            