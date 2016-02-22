
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
object header extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*19.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*19.4*/("""
<style>
	#myButtons"""),format.raw/*21.12*/("""{"""),format.raw/*21.13*/("""
		margin-top: 15px;
	"""),format.raw/*23.2*/("""}"""),format.raw/*23.3*/("""
</style>
<div class="navbar navbar-default navbar-fixed-top" role="navigation">
	<div class="container">
		<div class="row">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
				class="icon-bar"></span> <span class="icon-bar"></span> <span
				class="icon-bar"></span>
				</button>
				<a class="navbar-brand navbar-collapse collapse" style="padding-bottom: 0 ;" href="/climate">
					<img
					src='"""),_display_(Seq[Any](/*37.12*/routes/*37.18*/.Assets.at("images/NASA_JPL_logo.png"))),format.raw/*37.56*/("""' style="height: 40px ; width: 220px ;">
					<img
					src='"""),_display_(Seq[Any](/*39.12*/routes/*39.18*/.Assets.at("images/logo.png"))),format.raw/*39.47*/("""' style="height: 15px ; width: 250px ;">
				</a>
			</div>
			<div id="myButtons" class="navbar-collapse collapse" style="height:">
				<form class="navbar-form navbar-right" role="register">
					<a class="btn btn-primary" href="/climate/sign" role="button">Register&raquo;</a>
				</form>
				<ul class="nav navbar-nav navbar-right">

					"""),format.raw/*48.62*/("""
						"""),format.raw/*49.35*/("""
							"""),format.raw/*50.84*/("""
							"""),format.raw/*51.79*/("""
						"""),format.raw/*52.17*/("""
						"""),format.raw/*53.72*/("""
					"""),format.raw/*54.17*/("""

				<div class="navbar-form navbar-right">
					"""),_display_(Seq[Any](/*57.7*/helper/*57.13*/.form(routes.Application.login)/*57.44*/{_display_(Seq[Any](format.raw/*57.45*/("""
						<div class="form-group">
							<input class="form-control" id="ex1" type="email" name="email" placeholder="Email" >
							<input type="password" class="form-control" name="password" placeholder="Password" >
							<button type="submit" class="btn btn-success" >Login</button>
						</div>
					""")))})),format.raw/*63.7*/("""
				</div>

					<li class="dropdown"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown">Service<b class="caret"></b> </a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(Seq[Any](/*69.22*/routes/*69.28*/.ClimateServiceController.searchService())),format.raw/*69.69*/("""">Search Service </a></li>
							<li><a href=""""),_display_(Seq[Any](/*70.22*/routes/*70.28*/.ClimateServiceController.climateServices())),format.raw/*70.71*/("""">Service List</a></li>
							<li><a href=""""),_display_(Seq[Any](/*71.22*/routes/*71.28*/.ClimateServiceController.mostPopularClimateServices())),format.raw/*71.82*/("""">Most Popular Service</a></li>
							<li><a href=""""),_display_(Seq[Any](/*72.22*/routes/*72.28*/.ClimateServiceController.mostRecentlyAddedClimateServices())),format.raw/*72.88*/("""">Recent Added Service</a></li>
							<li><a href=""""),_display_(Seq[Any](/*73.22*/routes/*73.28*/.ClimateServiceController.mostRecentlyUsedClimateServices())),format.raw/*73.87*/("""">Recent Used  Service</a></li>
							<li><a href=""""),_display_(Seq[Any](/*74.22*/routes/*74.28*/.ClimateServiceController.top3())),format.raw/*74.60*/("""">Top 3 Graded Service</a></li>
						</ul>
					</li>
					<li class="dropdown"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown">Dataset<b
					class="caret"></b> </a>
						<ul class="dropdown-menu">

							<li><a href=""""),_display_(Seq[Any](/*82.22*/routes/*82.28*/.DatasetController.datasetList())),format.raw/*82.60*/("""">Dataset List</a></li>
							<li><a href=""""),_display_(Seq[Any](/*83.22*/routes/*83.28*/.DatasetController.searchDataset())),format.raw/*83.62*/("""">Search dataset</a></li>
						</ul>
					</li>
					"""),format.raw/*86.42*/("""
					"""),format.raw/*87.66*/("""
					"""),format.raw/*88.32*/("""
					"""),format.raw/*89.36*/("""
					"""),format.raw/*90.99*/("""
					"""),format.raw/*91.104*/("""
					"""),format.raw/*92.15*/("""
					"""),format.raw/*93.15*/("""
					<li class="dropdown"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown">About<b
					class="caret"></b> </a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(Seq[Any](/*98.22*/routes/*98.28*/.ClimateServiceController.home())),format.raw/*98.60*/("""">Home</a></li>
							<li><a href=""""),_display_(Seq[Any](/*99.22*/routes/*99.28*/.AboutusController.aboutUs())),format.raw/*99.56*/("""">About Us</a></li>
							<li><a href=""""),_display_(Seq[Any](/*100.22*/routes/*100.28*/.AboutusController.aboutProject())),format.raw/*100.61*/("""">About project</a></li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
	</div>
</div>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 11 10:48:50 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/header.scala.html
                    HASH: 574beeede6533b5d2dbbddd55739494f64e9ddcb
                    MATRIX: 3171->1205|3267->1207|3315->1227|3344->1228|3393->1250|3421->1251|4007->1801|4022->1807|4082->1845|4180->1907|4195->1913|4246->1942|4617->2341|4652->2376|4688->2460|4724->2539|4759->2556|4794->2628|4828->2645|4914->2696|4929->2702|4969->2733|5008->2734|5343->3038|5570->3229|5585->3235|5648->3276|5732->3324|5747->3330|5812->3373|5893->3418|5908->3424|5984->3478|6073->3531|6088->3537|6170->3597|6259->3650|6274->3656|6355->3715|6444->3768|6459->3774|6513->3806|6788->4045|6803->4051|6857->4083|6938->4128|6953->4134|7009->4168|7091->4258|7125->4324|7159->4356|7193->4392|7227->4491|7262->4595|7296->4610|7330->4625|7548->4807|7563->4813|7617->4845|7690->4882|7705->4888|7755->4916|7833->4957|7849->4963|7905->4996
                    LINES: 56->19|59->19|61->21|61->21|63->23|63->23|77->37|77->37|77->37|79->39|79->39|79->39|88->48|89->49|90->50|91->51|92->52|93->53|94->54|97->57|97->57|97->57|97->57|103->63|109->69|109->69|109->69|110->70|110->70|110->70|111->71|111->71|111->71|112->72|112->72|112->72|113->73|113->73|113->73|114->74|114->74|114->74|122->82|122->82|122->82|123->83|123->83|123->83|126->86|127->87|128->88|129->89|130->90|131->91|132->92|133->93|138->98|138->98|138->98|139->99|139->99|139->99|140->100|140->100|140->100
                    -- GENERATED --
                */
            