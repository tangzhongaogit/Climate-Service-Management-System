
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
object top3 extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[metadata.ClimateService],play.data.Form[metadata.ClimateService],String,play.api.templates.HtmlFormat.Appendable] {

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
  <script src='"""),_display_(Seq[Any](/*23.17*/routes/*23.23*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.63*/("""'></script>
  <script type="text/javascript">
          $(document).ready(function()"""),format.raw/*25.39*/("""{"""),format.raw/*25.40*/("""
            //alert($("#url").text());
          """),format.raw/*27.11*/("""}"""),format.raw/*27.12*/(""");
  </script>
""")))};
Seq[Any](format.raw/*18.124*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("Climate Services",email, scripts)/*31.41*/ {_display_(Seq[Any](format.raw/*31.43*/("""

  """),_display_(Seq[Any](/*33.4*/flash_message())),format.raw/*33.19*/("""

  <h1>Top """),_display_(Seq[Any](/*35.12*/climateServices/*35.27*/.size())),format.raw/*35.34*/(""" Climate Services</h1>
  <table class="table table-striped table-bordered table-condensed ex2">
    <tr>
      <td class="col-md-2">Climate Service Name</td>
      <td class="col-md-4">Purpose</td>
      <td class="col-md-4">Url</td>
      <td class="col-md-2">Scenario</td>
      <td class="col-md-2">Version</td>
      <td class="col-md-2">Root Service</td>
      """),_display_(Seq[Any](/*44.8*/if(true)/*44.16*/{_display_(Seq[Any](format.raw/*44.17*/("""
        <td class="col-md-3">Operation</td>
      """)))})),format.raw/*46.8*/("""
    </tr>
    """),_display_(Seq[Any](/*48.6*/for(climateService <- climateServices) yield /*48.44*/{_display_(Seq[Any](format.raw/*48.45*/("""

      <tr>
        <td><a href = """"),_display_(Seq[Any](/*51.25*/{routes.ClimateServiceController.oneService(climateService.getUrl(),email,climateService.getId())})),format.raw/*51.123*/("""">"""),_display_(Seq[Any](/*51.126*/climateService/*51.140*/.getClimateServiceName())),format.raw/*51.164*/("""</a></td>

        <td><span class=""""),_display_(Seq[Any](/*53.27*/climateService/*53.41*/.getClimateServiceName())),format.raw/*53.65*/(""" editable" data-name='purpose'>
        """),_display_(Seq[Any](/*54.10*/climateService/*54.24*/.getPurpose())),format.raw/*54.37*/(""" </span></td>

        <td><span class=""""),_display_(Seq[Any](/*56.27*/climateService/*56.41*/.getClimateServiceName())),format.raw/*56.65*/(""" editable" id = "url" data-name='url'>
          <a href = """"),_display_(Seq[Any](/*57.23*/{routes.ClimateServiceController.oneService(climateService.getUrl(),email,climateService.getId())})),format.raw/*57.121*/(""""><img src='"""),_display_(Seq[Any](/*57.134*/climateService/*57.148*/.getPhoto())),format.raw/*57.159*/("""' style="height: 100px; width: 100px" ></a> </span></td>

        <td><span class=""""),_display_(Seq[Any](/*59.27*/climateService/*59.41*/.getClimateServiceName())),format.raw/*59.65*/(""" editable" data-name='scenario'>
        """),_display_(Seq[Any](/*60.10*/climateService/*60.24*/.getScenario())),format.raw/*60.38*/(""" </span></td>

        <td><span class=""""),_display_(Seq[Any](/*62.27*/climateService/*62.41*/.getClimateServiceName())),format.raw/*62.65*/(""" editable" data-name='versionNo'>
        """),_display_(Seq[Any](/*63.10*/for(version <- climateService.getVerionList()) yield /*63.56*/{_display_(Seq[Any](format.raw/*63.57*/("""
          <a href = """"),_display_(Seq[Any](/*64.23*/{routes.ClimateServiceController.oneService(climateService.findUrl(version),email,climateService.getId())})),format.raw/*64.129*/("""">"""),_display_(Seq[Any](/*64.132*/version)),format.raw/*64.139*/("""</a><br>
          """)))})),format.raw/*65.12*/("""
        </span></td>

        <td><span class=""""),_display_(Seq[Any](/*68.27*/climateService/*68.41*/.getClimateServiceName())),format.raw/*68.65*/(""" editable" data-name='rootServiceId'>
        """),_display_(Seq[Any](/*69.10*/climateService/*69.24*/.getRootservice())),format.raw/*69.41*/(""" </span></td>

        """),_display_(Seq[Any](/*71.10*/if(true)/*71.18*/{_display_(Seq[Any](format.raw/*71.19*/("""
          <td class="operation">
            <input type="button" class="edit-btn btn btn-primary" value="Edit"
            data-pk='"""),_display_(Seq[Any](/*74.23*/climateService/*74.37*/.getClimateServiceName())),format.raw/*74.61*/("""'
            data-url='"""),_display_(Seq[Any](/*75.24*/routes/*75.30*/.ClimateServiceController.editClimateService())),format.raw/*75.76*/("""'
            >
            """),_display_(Seq[Any](/*77.14*/form(routes.ClimateServiceController.deleteClimateService())/*77.74*/{_display_(Seq[Any](format.raw/*77.75*/("""
              <input
              name="idHolder" class="hidden" type="hidden"
              value=""""),_display_(Seq[Any](/*80.23*/climateService/*80.37*/.getId())),format.raw/*80.45*/("""">
              <input
              type="submit" class="btn btn-danger delete-btn span2" value="Delete"
              onclick="return confirm('Are you sure you want to delete this item?')">
              """)))})),format.raw/*84.16*/("""
          </td>
        """)))})),format.raw/*86.10*/("""
      </tr>
    """)))})),format.raw/*88.6*/("""
  </table>


  """),_display_(Seq[Any](/*92.4*/if(true)/*92.12*/{_display_(Seq[Any](format.raw/*92.13*/("""

    """),_display_(Seq[Any](/*94.6*/form(routes.ClimateServiceController.downloadClimateService(), 'class -> "form-horizontal", 'role -> "form")/*94.114*/ {_display_(Seq[Any](format.raw/*94.116*/("""

      <button type="submit" name="action" value="download">Download</button>
    """)))})),format.raw/*97.6*/("""
  """)))})),format.raw/*98.4*/("""
""")))})))}
    }
    
    def render(climateServices:List[metadata.ClimateService],climateServiceForm:play.data.Form[metadata.ClimateService],email:String): play.api.templates.HtmlFormat.Appendable = apply(climateServices,climateServiceForm,email)
    
    def f:((List[metadata.ClimateService],play.data.Form[metadata.ClimateService],String) => play.api.templates.HtmlFormat.Appendable) = (climateServices,climateServiceForm,email) => apply(climateServices,climateServiceForm,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 11 10:26:46 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/top3.scala.html
                    HASH: d9fa6c13f930fc01a8b99ff6fdbf8b808f507ba0
                    MATRIX: 3216->1189|3432->1332|3447->1339|3532->1343|3585->1360|3600->1366|3662->1406|3774->1490|3803->1491|3881->1541|3910->1542|3967->1311|3996->1330|4024->1558|4062->1561|4110->1600|4150->1602|4190->1607|4227->1622|4276->1635|4300->1650|4329->1657|4731->2024|4748->2032|4787->2033|4870->2085|4921->2101|4975->2139|5014->2140|5087->2177|5208->2275|5248->2278|5272->2292|5319->2316|5392->2353|5415->2367|5461->2391|5538->2432|5561->2446|5596->2459|5673->2500|5696->2514|5742->2538|5839->2599|5960->2697|6010->2710|6034->2724|6068->2735|6188->2819|6211->2833|6257->2857|6335->2899|6358->2913|6394->2927|6471->2968|6494->2982|6540->3006|6619->3049|6681->3095|6720->3096|6779->3119|6908->3225|6948->3228|6978->3235|7030->3255|7115->3304|7138->3318|7184->3342|7267->3389|7290->3403|7329->3420|7389->3444|7406->3452|7445->3453|7616->3588|7639->3602|7685->3626|7746->3651|7761->3657|7829->3703|7894->3732|7963->3792|8002->3793|8141->3896|8164->3910|8194->3918|8434->4126|8492->4152|8541->4170|8593->4187|8610->4195|8649->4196|8691->4203|8809->4311|8850->4313|8965->4397|9000->4401
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|78->35|78->35|78->35|87->44|87->44|87->44|89->46|91->48|91->48|91->48|94->51|94->51|94->51|94->51|94->51|96->53|96->53|96->53|97->54|97->54|97->54|99->56|99->56|99->56|100->57|100->57|100->57|100->57|100->57|102->59|102->59|102->59|103->60|103->60|103->60|105->62|105->62|105->62|106->63|106->63|106->63|107->64|107->64|107->64|107->64|108->65|111->68|111->68|111->68|112->69|112->69|112->69|114->71|114->71|114->71|117->74|117->74|117->74|118->75|118->75|118->75|120->77|120->77|120->77|123->80|123->80|123->80|127->84|129->86|131->88|135->92|135->92|135->92|137->94|137->94|137->94|140->97|141->98
                    -- GENERATED --
                */
            