
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
object mostRecentlyAddedServices extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[metadata.ClimateService],play.data.Form[metadata.ClimateService],String,play.api.templates.HtmlFormat.Appendable] {

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
		//alert($("#url").text());
	"""),format.raw/*27.2*/("""}"""),format.raw/*27.3*/(""");
	</script>
""")))};
Seq[Any](format.raw/*18.124*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("Climate Services",email, scripts)/*31.41*/ {_display_(Seq[Any](format.raw/*31.43*/("""
	
	"""),_display_(Seq[Any](/*33.3*/flash_message())),format.raw/*33.18*/("""   
	 
    <h1>"""),_display_(Seq[Any](/*35.10*/climateServices/*35.25*/.size())),format.raw/*35.32*/(""" Most Recently Added Climate Services</h1>
		<table class="table table-striped table-bordered table-condensed ex2">
	<tr>
		<td class="col-md-2">Climate Service Name</td>
		<td class="col-md-4">Purpose</td>
		<td class="col-md-4">Url</td>
		<td class="col-md-2">Scenario</td>
		<td class="col-md-2">Version</td>
		<td class="col-md-2">Root Service</td>
		 """),_display_(Seq[Any](/*44.5*/if(true)/*44.13*/{_display_(Seq[Any](format.raw/*44.14*/("""
			<td class="col-md-3">Operation</td> 
	     """)))})),format.raw/*46.8*/(""" 
	</tr>
	"""),_display_(Seq[Any](/*48.3*/for(climateService <- climateServices) yield /*48.41*/{_display_(Seq[Any](format.raw/*48.42*/("""
	<tr>
		<td><a href = """"),_display_(Seq[Any](/*50.19*/{routes.ClimateServiceController.oneService(climateService.getUrl(),email,climateService.getId())})),format.raw/*50.117*/("""">"""),_display_(Seq[Any](/*50.120*/climateService/*50.134*/.getClimateServiceName())),format.raw/*50.158*/("""</a></td>

		<td><span class=""""),_display_(Seq[Any](/*52.21*/climateService/*52.35*/.getClimateServiceName())),format.raw/*52.59*/(""" editable" data-name='purpose'>
				"""),_display_(Seq[Any](/*53.6*/climateService/*53.20*/.getPurpose())),format.raw/*53.33*/(""" </span></td>
		
		<td><span class=""""),_display_(Seq[Any](/*55.21*/climateService/*55.35*/.getClimateServiceName())),format.raw/*55.59*/(""" editable" id = "url" data-name='url'>
				<a href = """"),_display_(Seq[Any](/*56.17*/{routes.ClimateServiceController.oneService(climateService.getUrl(),email,climateService.getId())})),format.raw/*56.115*/(""""><img src='"""),_display_(Seq[Any](/*56.128*/climateService/*56.142*/.getPhoto())),format.raw/*56.153*/("""' style="height: 100px; width: 100px" ></a> </span></td>
				
		<td><span class=""""),_display_(Seq[Any](/*58.21*/climateService/*58.35*/.getClimateServiceName())),format.raw/*58.59*/(""" editable" data-name='scenario'>
				"""),_display_(Seq[Any](/*59.6*/climateService/*59.20*/.getScenario())),format.raw/*59.34*/(""" </span></td>

		<td><span class=""""),_display_(Seq[Any](/*61.21*/climateService/*61.35*/.getClimateServiceName())),format.raw/*61.59*/(""" editable" data-name='versionNo'>
		"""),_display_(Seq[Any](/*62.4*/for(version <- climateService.getVerionList()) yield /*62.50*/{_display_(Seq[Any](format.raw/*62.51*/("""
			<a href = """"),_display_(Seq[Any](/*63.16*/{routes.ClimateServiceController.oneService(climateService.findUrl(version),email,climateService.getId())})),format.raw/*63.122*/("""">"""),_display_(Seq[Any](/*63.125*/version)),format.raw/*63.132*/("""</a><br>
		""")))})),format.raw/*64.4*/("""
		</span></td>
				
		<td><span class=""""),_display_(Seq[Any](/*67.21*/climateService/*67.35*/.getClimateServiceName())),format.raw/*67.59*/(""" editable" data-name='rootServiceId'>
				"""),_display_(Seq[Any](/*68.6*/climateService/*68.20*/.getRootservice())),format.raw/*68.37*/(""" </span></td>
				
		"""),_display_(Seq[Any](/*70.4*/if(true)/*70.12*/{_display_(Seq[Any](format.raw/*70.13*/(""" 
			<td class="operation">
				<input type="button" class="edit-btn btn btn-primary" value="Edit" 
					data-pk='"""),_display_(Seq[Any](/*73.16*/climateService/*73.30*/.getClimateServiceName())),format.raw/*73.54*/("""'
					data-url='"""),_display_(Seq[Any](/*74.17*/routes/*74.23*/.ClimateServiceController.editClimateService())),format.raw/*74.69*/("""' 
				>
				"""),_display_(Seq[Any](/*76.6*/form(routes.ClimateServiceController.deleteClimateService())/*76.66*/{_display_(Seq[Any](format.raw/*76.67*/(""" 
					<input
						name="idHolder" class="hidden" type="hidden"
						value=""""),_display_(Seq[Any](/*79.15*/climateService/*79.29*/.getId())),format.raw/*79.37*/(""""> 
					<input
						type="submit" class="btn btn-danger delete-btn span2" value="Delete"
						onclick="return confirm('Are you sure you want to delete this item?')">
				""")))})),format.raw/*83.6*/("""
			</td> 
		""")))})),format.raw/*85.4*/("""
	</tr>
	""")))})),format.raw/*87.3*/("""
    </table>
 
    
     """),_display_(Seq[Any](/*91.7*/if(true)/*91.15*/{_display_(Seq[Any](format.raw/*91.16*/("""
		    
	    """),_display_(Seq[Any](/*93.7*/form(routes.ClimateServiceController.downloadClimateService(), 'class -> "form-horizontal", 'role -> "form")/*93.115*/ {_display_(Seq[Any](format.raw/*93.117*/("""
	
	        <button type="submit" name="action" value="download">Download</button>
	    """)))})),format.raw/*96.7*/("""
    """)))})),format.raw/*97.6*/("""
""")))})),format.raw/*98.2*/("""
"""))}
    }
    
    def render(climateServices:List[metadata.ClimateService],climateServiceForm:play.data.Form[metadata.ClimateService],email:String): play.api.templates.HtmlFormat.Appendable = apply(climateServices,climateServiceForm,email)
    
    def f:((List[metadata.ClimateService],play.data.Form[metadata.ClimateService],String) => play.api.templates.HtmlFormat.Appendable) = (climateServices,climateServiceForm,email) => apply(climateServices,climateServiceForm,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 10 19:42:51 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/mostRecentlyAddedServices.scala.html
                    HASH: 8f0964ae316640c19a3b1a951b60e9efb46e5e63
                    MATRIX: 3267->1205|3483->1348|3498->1355|3583->1359|3635->1375|3650->1381|3712->1421|3814->1495|3843->1496|3901->1527|3929->1528|3985->1327|4014->1346|4042->1543|4080->1546|4128->1585|4168->1587|4208->1592|4245->1607|4297->1623|4321->1638|4350->1645|4742->2002|4759->2010|4798->2011|4877->2059|4923->2070|4977->2108|5016->2109|5077->2134|5198->2232|5238->2235|5262->2249|5309->2273|5376->2304|5399->2318|5445->2342|5517->2379|5540->2393|5575->2406|5648->2443|5671->2457|5717->2481|5808->2536|5929->2634|5979->2647|6003->2661|6037->2672|6155->2754|6178->2768|6224->2792|6297->2830|6320->2844|6356->2858|6427->2893|6450->2907|6496->2931|6568->2968|6630->3014|6669->3015|6721->3031|6850->3137|6890->3140|6920->3147|6963->3159|7040->3200|7063->3214|7109->3238|7187->3281|7210->3295|7249->3312|7306->3334|7323->3342|7362->3343|7513->3458|7536->3472|7582->3496|7636->3514|7651->3520|7719->3566|7768->3580|7837->3640|7876->3641|7991->3720|8014->3734|8044->3742|8249->3916|8294->3930|8335->3940|8397->3967|8414->3975|8453->3976|8502->3990|8620->4098|8661->4100|8781->4189|8818->4195|8851->4197
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|78->35|78->35|78->35|87->44|87->44|87->44|89->46|91->48|91->48|91->48|93->50|93->50|93->50|93->50|93->50|95->52|95->52|95->52|96->53|96->53|96->53|98->55|98->55|98->55|99->56|99->56|99->56|99->56|99->56|101->58|101->58|101->58|102->59|102->59|102->59|104->61|104->61|104->61|105->62|105->62|105->62|106->63|106->63|106->63|106->63|107->64|110->67|110->67|110->67|111->68|111->68|111->68|113->70|113->70|113->70|116->73|116->73|116->73|117->74|117->74|117->74|119->76|119->76|119->76|122->79|122->79|122->79|126->83|128->85|130->87|134->91|134->91|134->91|136->93|136->93|136->93|139->96|140->97|141->98
                    -- GENERATED --
                */
            