
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
object aboutProject extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,String,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(message: String,email:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*18.32*/("""

"""),_display_(Seq[Any](/*20.2*/main("About Project",email)/*20.29*/ {_display_(Seq[Any](format.raw/*20.31*/("""

   <h1>About Project</h1>
   <div class="jumbotron">
   <p>This project aims to develop an online collaborative working environment, where scientists can not only efficiently perform their 
   climate data analyses but also effectively share their analysis tools, datasets, and results with others. This project is based on a tight collaboration between Jet Propulsion 
   Laboratory (JPL) and Carnegie Mellon University (CMU).</p>
   <p>JPL has developed a technology that wraps existing climate data analysis tools into web services, with programmable interfaces that are universally accessible from the Internet. 
   Based on the technology, JPL has developed a collection of web services that enable multi-aspect physics-based and phenomenon-oriented climate model performance evaluation and 
   diagnosis through the comprehensive and synergistic use of multiple observational data, reanalysis data, and model outputs. The system is called Climate Model Diagnostic Analyzer (CMDA).</p>
   <p>CMU has developed a technology to model software usage behaviors into social networks, and based on semantics-oriented analytics to assist Earth scientists in designing data 
   analysis procedures. Using the technology, CMU has developed a semantic model for CMDA services in order to capture various hidden relationships, including semantic relationships 
   and usage relationships in CMDA services, to help users not only learn available datasets and web services, but also learn how to use them and design climate analytics workflows 
   faster than before. CMU has also developed a provenance model to record and track scientists’ activities and behaviors using CMDA services.</p>
   <p>One of the key outcomes of this project will be a repository of climate data analytics web services, equipped with mechanisms to organize and manage these climate analytics 
   services and help share and reuse the services properly. Our vision is that the climate data analytics web services can be shared, organized, searched, and recommended like photos 
   and videos on YouTube and Shutterfly. We intend to build the web service repository with a full understanding of the needs of the Earth science researchers, and make it easy for the 
   next-generation Earth scientists to contribute to a pool of data analytics tools, build communities, and form collaborative relationships.</p>
</div>
""")))})))}
    }
    
    def render(message:String,email:String): play.api.templates.HtmlFormat.Appendable = apply(message,email)
    
    def f:((String,String) => play.api.templates.HtmlFormat.Appendable) = (message,email) => apply(message,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 10 19:42:51 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/aboutProject.scala.html
                    HASH: 6d399f712c9cc64ba4a883da0a2ff4cac196b72f
                    MATRIX: 3191->1206|3316->1236|3354->1239|3390->1266|3430->1268
                    LINES: 56->18|59->18|61->20|61->20|61->20
                    -- GENERATED --
                */
            