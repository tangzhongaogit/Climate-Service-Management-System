
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,Html,Html,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(title: String,email:String, moreScripts: Html = Html(""))(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*18.75*/("""

<!DOCTYPE html>

<html>
	<head>

		<title>"""),_display_(Seq[Any](/*25.11*/title)),format.raw/*25.16*/("""</title>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<link rel="stylesheet"
		href='"""),_display_(Seq[Any](/*31.10*/routes/*31.16*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*31.55*/("""'>
		<link rel="stylesheet"
		href='"""),_display_(Seq[Any](/*33.10*/routes/*33.16*/.Assets.at("stylesheets/navbar-fixed-top.css"))),format.raw/*33.62*/("""'>
		<link rel="stylesheet"
		href='"""),_display_(Seq[Any](/*35.10*/routes/*35.16*/.Assets.at("stylesheets/custom.css"))),format.raw/*35.52*/("""'>
		<link rel="stylesheet" media="screen"
		href='"""),_display_(Seq[Any](/*37.10*/routes/*37.16*/.Assets.at("stylesheets/main.css"))),format.raw/*37.50*/("""'>
		<link rel="shortcut icon" type="image/png"
		href='"""),_display_(Seq[Any](/*39.10*/routes/*39.16*/.Assets.at("images/favicon.png"))),format.raw/*39.48*/("""'>
		<link href='"""),_display_(Seq[Any](/*40.16*/routes/*40.22*/.Assets.at("stylesheets/bootstrap-editable.css"))),format.raw/*40.70*/("""'
		rel="stylesheet" />
		<link href='"""),_display_(Seq[Any](/*42.16*/routes/*42.22*/.Assets.at("stylesheets/jquery.tablesorter.pager.css"))),format.raw/*42.76*/("""'
		rel="stylesheet" />
		<link href='"""),_display_(Seq[Any](/*44.16*/routes/*44.22*/.Assets.at("stylesheets/style.css"))),format.raw/*44.57*/("""'
		rel="stylesheet" />
		<link rel="stylesheet"  href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
		<link rel="stylesheet" href='"""),_display_(Seq[Any](/*48.33*/routes/*48.39*/.Assets.at("stylesheets/star-rating.css"))),format.raw/*48.80*/("""' media="all" rel="stylesheet" type="text/css"/>

		<script src='"""),_display_(Seq[Any](/*50.17*/routes/*50.23*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*50.68*/("""'type="text/javascript"></script>
		<script src='"""),_display_(Seq[Any](/*51.17*/routes/*51.23*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*51.65*/("""' type="text/javascript"></script>
		<script type='text/javascript' src='"""),_display_(Seq[Any](/*52.40*/routes/*52.46*/.Assets.at("javascripts/lastLoader.js"))),format.raw/*52.85*/("""'></script>
		<script type='text/javascript' src='"""),_display_(Seq[Any](/*53.40*/routes/*53.46*/.Assets.at("javascripts/jquery.metadata.js"))),format.raw/*53.90*/("""'></script>
		<script type='text/javascript' src='"""),_display_(Seq[Any](/*54.40*/routes/*54.46*/.Assets.at("javascripts/jquery.tablesorter.js"))),format.raw/*54.93*/("""'></script>

		<script type='text/javascript' src='"""),_display_(Seq[Any](/*56.40*/routes/*56.46*/.Assets.at("javascripts/jstree.js"))),format.raw/*56.81*/("""'></script>
		<script type='text/javascript' src='"""),_display_(Seq[Any](/*57.40*/routes/*57.46*/.Assets.at("javascripts/keyword_tree.js"))),format.raw/*57.87*/("""'></script>
		<script src='"""),_display_(Seq[Any](/*58.17*/routes/*58.23*/.Assets.at("javascripts/star-rating.js"))),format.raw/*58.63*/("""' type="text/javascript"></script>

		<script src='"""),_display_(Seq[Any](/*60.17*/routes/*60.23*/.Assets.at("javascripts/bootstrap-editable.min.js"))),format.raw/*60.74*/("""'></script>




"""),_display_(Seq[Any](/*65.2*/moreScripts)),format.raw/*65.13*/("""
</head>

<body>
	"""),_display_(Seq[Any](/*69.3*/if(email == null || email =="")/*69.34*/{_display_(Seq[Any](format.raw/*69.35*/("""
		"""),_display_(Seq[Any](/*70.4*/header())),format.raw/*70.12*/("""
	""")))}/*71.3*/else/*71.7*/{_display_(Seq[Any](format.raw/*71.8*/("""
		"""),_display_(Seq[Any](/*72.4*/loginHeader(email))),format.raw/*72.22*/("""
	""")))})),format.raw/*73.3*/("""


	<div class="container">

		"""),_display_(Seq[Any](/*78.4*/content)),format.raw/*78.11*/("""

	</div>

	<!-- Footer -->
		<div class="footer" >
			<div class="row">
				<div class="col-lg-6 col-lg-offset-3">
					<p class="text-muted" style="text-align: center; font-size: 14px;">&copy;
						Carnegie Mellon University - Silicon Valley ; NASA Jet Propulsion Laboratory 2015</p>
				</div>
			</div>
		</div>

</body>
</html>
"""))}
    }
    
    def render(title:String,email:String,moreScripts:Html,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,email,moreScripts)(content)
    
    def f:((String,String,Html) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,email,moreScripts) => (content) => apply(title,email,moreScripts)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 10 19:42:51 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/main.scala.html
                    HASH: 758d32967a47ceed00c63a2052acb2244bf6ed10
                    MATRIX: 3163->1189|3331->1262|3412->1307|3439->1312|3673->1510|3688->1516|3749->1555|3822->1592|3837->1598|3905->1644|3978->1681|3993->1687|4051->1723|4139->1775|4154->1781|4210->1815|4303->1872|4318->1878|4372->1910|4426->1928|4441->1934|4511->1982|4586->2021|4601->2027|4677->2081|4752->2120|4767->2126|4824->2161|5144->2445|5159->2451|5222->2492|5324->2558|5339->2564|5406->2609|5492->2659|5507->2665|5571->2707|5681->2781|5696->2787|5757->2826|5844->2877|5859->2883|5925->2927|6012->2978|6027->2984|6096->3031|6184->3083|6199->3089|6256->3124|6343->3175|6358->3181|6421->3222|6485->3250|6500->3256|6562->3296|6650->3348|6665->3354|6738->3405|6790->3422|6823->3433|6877->3452|6917->3483|6956->3484|6995->3488|7025->3496|7046->3499|7058->3503|7096->3504|7135->3508|7175->3526|7209->3529|7276->3561|7305->3568
                    LINES: 56->18|59->18|66->25|66->25|72->31|72->31|72->31|74->33|74->33|74->33|76->35|76->35|76->35|78->37|78->37|78->37|80->39|80->39|80->39|81->40|81->40|81->40|83->42|83->42|83->42|85->44|85->44|85->44|89->48|89->48|89->48|91->50|91->50|91->50|92->51|92->51|92->51|93->52|93->52|93->52|94->53|94->53|94->53|95->54|95->54|95->54|97->56|97->56|97->56|98->57|98->57|98->57|99->58|99->58|99->58|101->60|101->60|101->60|106->65|106->65|110->69|110->69|110->69|111->70|111->70|112->71|112->71|112->71|113->72|113->72|114->73|119->78|119->78
                    -- GENERATED --
                */
            