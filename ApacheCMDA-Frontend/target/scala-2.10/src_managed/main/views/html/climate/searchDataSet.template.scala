
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
object searchDataSet extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[play.data.Form[DataSet],String,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(dataSetForm: play.data.Form[DataSet],email:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
	<script src='"""),_display_(Seq[Any](/*23.16*/routes/*23.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.62*/("""'></script>
	<link rel="stylesheet" href="//code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">
	<script src="//code.jquery.com/jquery-1.10.2.js"></script>
  	<script src="//code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
	<script type="text/javascript">
	$(function() """),format.raw/*28.15*/("""{"""),format.raw/*28.16*/("""
	    var availableDataSetNames = [
	                "AIRS Air Temperature",
					"AIRS Near-Surface Air Temperature",
					"AIRS Specific Humidity",
					"AMSRE Sea Surface Temperature",
					"ARGO Ocean Salinity",
					"ARGO Ocean Temperature",
					"AVISO Sea Surface Height",
					"CAM5 Air Temperature",
					"CAM5 Cloud Ice Water Content",
					"CAM5 Cloud Liquid Water Content",
					"CAM5 Leaf Area Index",
					"CAM5 Near-Surface Wind Speed",
					"CAM5 Precipitation Flux",
					"CAM5 Relative Humidity",
					"CAM5 Sea Surface Height",
					"CAM5 Sea Surface Temperature",
					"CAM5 Specific Humidity",
					"CAM5 Surface Downwelling Clear-Sky Shortwave Radiation",
					"CAM5 Surface Downwelling Longwave Radiation",
					"CAM5 Surface Downwelling Shortwave Radiation",
					"CAM5 Surface Temperature",
					"CAM5 Surface Upwelling Clear-Sky Shortwave Radiation",
					"CAM5 Surface Upwelling Longwave Radiation",
					"CAM5 Surface Upwelling Shortwave Radiation",
					"CAM5 TOA Incident Shortwave Radiation",
					"CAM5 TOA Outgoing Clear-Sky Longwave Radiation",
					"CAM5 TOA Outgoing Clear-Sky Shortwave Radiation",
					"CAM5 TOA Outgoing Longwave Radiation",
					"CAM5 TOA Outgoing Shortwave Radiation",
					"CAM5 Total Cloud Fraction",
					"CAM5 Vertical Wind Velocity",
					"CANAM4 Air Temperature",
					"CANAM4 Cloud Ice Water Content",
					"CANAM4 Cloud Liquid Water Content",
					"CANAM4 Eastward Near-Surface Wind",
					"CANAM4 Near-Surface Air Temperature",
					"CANAM4 Near-Surface Relative Humidity",
					"CANAM4 Near-Surface Wind Speed",
					"CANAM4 Northward Near-Surface Wind",
					"CANAM4 Precipitation Flux",
					"CANAM4 Relative Humidity",
					"CANAM4 Specific Humidity",
					"CANAM4 Surface Downwelling Clear-Sky Longwave Radiation",
					"CANAM4 Surface Downwelling Clear-Sky Shortwave Radiation",
					"CANAM4 Surface Downwelling Longwave Radiation",
					"CANAM4 Surface Downwelling Shortwave Radiation",
					"CANAM4 Surface Temperature",
					"CANAM4 Surface Upwelling Clear-Sky Shortwave Radiation",
					"CANAM4 Surface Upwelling Longwave Radiation",
					"CANAM4 Surface Upwelling Shortwave Radiation",
					"CANAM4 TOA Incident Shortwave Radiation",
					"CANAM4 TOA Outgoing Clear-Sky Longwave Radiation",
					"CANAM4 TOA Outgoing Clear-Sky Shortwave Radiation",
					"CANAM4 TOA Outgoing Longwave Radiation",
					"CANAM4 TOA Outgoing Shortwave Radiation",
					"CANAM4 Total Cloud Fraction",
					"CANAM4 Vertical Wind Velocity",
					"CERES Surface Downwelling Clear-Sky Longwave Radiation",
					"CERES Surface Downwelling Clear-Sky Shortwave Radiation",
					"CERES Surface Downwelling Longwave Radiation",
					"CERES Surface Downwelling Shortwave Radiation",
					"CERES Surface Upwelling Clear-Sky Shortwave Radiation",
					"CERES Surface Upwelling Longwave Radiation",
					"CERES Surface Upwelling Shortwave Radiation",
					"CERES TOA Incident Shortwave Radiation",
					"CERES TOA Outgoing Clear-Sky Longwave Radiation",
					"CERES TOA Outgoing Clear-Sky Shortwave Radiation",
					"CERES TOA Outgoing Longwave Radiation",
					"CERES TOA Outgoing Shortwave Radiation",
					"CM3 Air Temperature",
					"CM3 Cloud Ice Water Content",
					"CM3 Cloud Liquid Water Content",
					"CM3 Eastward Near-Surface Wind",
					"CM3 Near-Surface Wind Speed",
					"CM3 Northward Near-Surface Wind",
					"CM3 Precipitation Flux",
					"CM3 Relative Humidity",
					"CM3 Specific Humidity",
					"CM3 Surface Downwelling Clear-Sky Longwave Radiation",
					"CM3 Surface Downwelling Clear-Sky Shortwave Radiation",
					"CM3 Surface Downwelling Longwave Radiation",
					"CM3 Surface Downwelling Shortwave Radiation",
					"CM3 Surface Temperature",
					"CM3 Surface Upwelling Clear-Sky Shortwave Radiation",
					"CM3 Surface Upwelling Longwave Radiation",
					"CM3 Surface Upwelling Shortwave Radiation",
					"CM3 TOA Incident Shortwave Radiation",
					"CM3 TOA Outgoing Clear-Sky Longwave Radiation",
					"CM3 TOA Outgoing Clear-Sky Shortwave Radiation",
					"CM3 TOA Outgoing Longwave Radiation",
					"CM3 TOA Outgoing Shortwave Radiation",
					"CM3 Total Cloud Fraction",
					"CM3 Vertical Wind Velocity",
					"CM5A-LR Air Temperature",
					"CM5A-LR Cloud Ice Water Content",
					"CM5A-LR Cloud Liquid Water Content",
					"CM5A-LR Eastward Near-Surface Wind",
					"CM5A-LR Leaf Area Index",
					"CM5A-LR Near-Surface Wind Speed",
					"CM5A-LR Northward Near-Surface Wind",
					"CM5A-LR Precipitation Flux",
					"CM5A-LR Specific Humidity",
					"CM5A-LR Surface Downwelling Clear-Sky Longwave Radiation",
					"CM5A-LR Surface Downwelling Clear-Sky Shortwave Radiation",
					"CM5A-LR Surface Downwelling Longwave Radiation",
					"CM5A-LR Surface Downwelling Shortwave Radiation",
					"CM5A-LR Surface Temperature",
					"CM5A-LR Surface Upwelling Clear-Sky Shortwave Radiation",
					"CM5A-LR Surface Upwelling Longwave Radiation",
					"CM5A-LR Surface Upwelling Shortwave Radiation",
					"CM5A-LR TOA Incident Shortwave Radiation",
					"CM5A-LR TOA Outgoing Clear-Sky Longwave Radiation",
					"CM5A-LR TOA Outgoing Clear-Sky Shortwave Radiation",
					"CM5A-LR TOA Outgoing Longwave Radiation",
					"CM5A-LR TOA Outgoing Shortwave Radiation",
					"CM5A-LR Total Cloud Fraction",
					"E2-H Air Temperature",
					"E2-H Cloud Ice Water Content",
					"E2-H Cloud Liquid Water Content",
					"E2-H Eastward Near-Surface Wind",
					"E2-H Near-Surface Wind Speed",
					"E2-H Northward Near-Surface Wind",
					"E2-H Precipitation Flux",
					"E2-H Relative Humidity",
					"E2-H Sea Surface Temperature",
					"E2-H Specific Humidity",
					"E2-H Surface Downwelling Clear-Sky Longwave Radiation",
					"E2-H Surface Downwelling Clear-Sky Shortwave Radiation",
					"E2-H Surface Downwelling Longwave Radiation",
					"E2-H Surface Downwelling Shortwave Radiation",
					"E2-H Surface Temperature",
					"E2-H Surface Upwelling Clear-Sky Shortwave Radiation",
					"E2-H Surface Upwelling Longwave Radiation",
					"E2-H Surface Upwelling Shortwave Radiation",
					"E2-H TOA Incident Shortwave Radiation",
					"E2-H TOA Outgoing Clear-Sky Longwave Radiation",
					"E2-H TOA Outgoing Clear-Sky Shortwave Radiation",
					"E2-H TOA Outgoing Longwave Radiation",
					"E2-H TOA Outgoing Shortwave Radiation",
					"E2-H Total Cloud Fraction",
					"E2-H Vertical Wind Velocity",
					"E2-R Air Temperature",
					"E2-R Cloud Ice Water Content",
					"E2-R Cloud Liquid Water Content",
					"E2-R Eastward Near-Surface Wind",
					"E2-R Near-Surface Wind Speed",
					"E2-R Northward Near-Surface Wind",
					"E2-R Precipitation Flux",
					"E2-R Relative Humidity",
					"E2-R Sea Surface Height",
					"E2-R Sea Surface Temperature",
					"E2-R Specific Humidity",
					"E2-R Surface Downwelling Clear-Sky Longwave Radiation",
					"E2-R Surface Downwelling Clear-Sky Shortwave Radiation",
					"E2-R Surface Downwelling Shortwave Radiation",
					"E2-R Surface Temperature",
					"E2-R Surface Upwelling Clear-Sky Shortwave Radiation",
					"E2-R Surface Upwelling Longwave Radiation",
					"E2-R Surface Upwelling Shortwave Radiation",
					"E2-R TOA Incident Shortwave Radiation",
					"E2-R TOA Outgoing Clear-Sky Longwave Radiation",
					"E2-R TOA Outgoing Clear-Sky Shortwave Radiation",
					"E2-R TOA Outgoing Longwave Radiation",
					"E2-R TOA Outgoing Shortwave Radiation",
					"E2-R Total Cloud Fraction",
					"E2-R Vertical Wind Velocity",
					"ESM2G Air Temperature",
					"ESM2G Cloud Ice Water Content",
					"ESM2G Cloud Liquid Water Content",
					"ESM2G Eastward Near-Surface Wind",
					"ESM2G Leaf Area Index",
					"ESM2G Near-Surface Wind Speed",
					"ESM2G Northward Near-Surface Wind",
					"ESM2G Precipitation Flux",
					"ESM2G Relative Humidity",
					"ESM2G Sea Surface Height",
					"ESM2G Sea Surface Temperature",
					"ESM2G Specific Humidity",
					"ESM2G Surface Downwelling Clear-Sky Longwave Radiation",
					"ESM2G Surface Downwelling Longwave Radiation",
					"ESM2G Surface Temperature",
					"ESM2G Surface Upwelling Longwave Radiation",
					"ESM2G TOA Incident Shortwave Radiation",
					"ESM2G TOA Outgoing Clear-Sky Longwave Radiation",
					"ESM2G TOA Outgoing Clear-Sky Shortwave Radiation",
					"ESM2G TOA Outgoing Longwave Radiation",
					"ESM2G TOA Outgoing Shortwave Radiation",
					"ESM2G Total Cloud Fraction",
					"ESM2G Vertical Wind Velocity",
					"GPCP Precipitation Flux",
					"GRACE Equivalent Water Height Over Land",
					"GRACE Equivalent Water Height Over Ocean",
					"HadGEM2-A Air Temperature",
					"HadGEM2-A Cloud Ice Water Content",
					"HadGEM2-A Cloud Liquid Water Content",
					"HadGEM2-A Eastward Near-Surface Wind",
					"HadGEM2-A Near-Surface Relative Humidity",
					"HadGEM2-A Near-Surface Wind Speed",
					"HadGEM2-A Northward Near-Surface Wind",
					"HadGEM2-A Precipitation Flux",
					"HadGEM2-A Relative Humidity",
					"HadGEM2-A Specific Humidity",
					"HadGEM2-A Surface Downwelling Clear-Sky Longwave Radiation",
					"HadGEM2-A Surface Downwelling Clear-Sky Shortwave Radiation",
					"HadGEM2-A Surface Downwelling Longwave Radiation",
					"HadGEM2-A Surface Downwelling Shortwave Radiation",
					"HadGEM2-A Surface Temperature",
					"HadGEM2-A Surface Upwelling Clear-Sky Shortwave Radiation",
					"HadGEM2-A Surface Upwelling Longwave Radiation",
					"HadGEM2-A Surface Upwelling Shortwave Radiation",
					"HadGEM2-A TOA Incident Shortwave Radiation",
					"HadGEM2-A TOA Outgoing Clear-Sky Longwave Radiation",
					"HadGEM2-A TOA Outgoing Clear-Sky Shortwave Radiation",
					"HadGEM2-A TOA Outgoing Longwave Radiation",
					"HadGEM2-A TOA Outgoing Shortwave Radiation",
					"HadGEM2-A Total Cloud Fraction",
					"HadGEM2-A Vertical Wind Velocity",
					"HadGEM2-ES Air Temperature",
					"HadGEM2-ES Cloud Ice Water Content",
					"HadGEM2-ES Cloud Liquid Water Content",
					"HadGEM2-ES Eastward Near-Surface Wind",
					"HadGEM2-ES Leaf Area Index",
					"HadGEM2-ES Near-Surface Wind Speed",
					"HadGEM2-ES Northward Near-Surface Wind",
					"HadGEM2-ES Precipitation Flux",
					"HadGEM2-ES Relative Humidity",
					"HadGEM2-ES Sea Surface Height",
					"HadGEM2-ES Sea Surface Temperature",
					"HadGEM2-ES Specific Humidity",
					"HadGEM2-ES Surface Downwelling Clear-Sky Longwave Radiation",
					"HadGEM2-ES Surface Downwelling Clear-Sky Shortwave Radiation",
					"HadGEM2-ES Surface Downwelling Longwave Radiation",
					"HadGEM2-ES Surface Downwelling Shortwave Radiation",
					"HadGEM2-ES Surface Temperature",
					"HadGEM2-ES Surface Upwelling Clear-Sky Shortwave Radiation",
					"HadGEM2-ES Surface Upwelling Longwave Radiation",
					"HadGEM2-ES Surface Upwelling Shortwave Radiation",
					"HadGEM2-ES TOA Incident Shortwave Radiation",
					"HadGEM2-ES TOA Outgoing Clear-Sky Longwave Radiation",
					"HadGEM2-ES TOA Outgoing Clear-Sky Shortwave Radiation",
					"HadGEM2-ES TOA Outgoing Longwave Radiation",
					"HadGEM2-ES TOA Outgoing Shortwave Radiation",
					"HadGEM2-ES Total Cloud Fraction",
					"HadGEM2-ES Vertical Wind Velocity",
					"MIROC5 Air Temperature", "MIROC5 Cloud Ice Water Content",
					"MIROC5 Cloud Liquid Water Content",
					"MIROC5 Eastward Near-Surface Wind",
					"MIROC5 Leaf Area Index", "MIROC5 Near-Surface Wind Speed",
					"MIROC5 Northward Near-Surface Wind",
					"MIROC5 Precipitation Flux", "MIROC5 Relative Humidity",
					"MIROC5 Specific Humidity",
					"MIROC5 Surface Downwelling Clear-Sky Longwave Radiation",
					"MIROC5 Surface Downwelling Clear-Sky Shortwave Radiation",
					"MIROC5 Surface Downwelling Longwave Radiation",
					"MIROC5 Surface Downwelling Shortwave Radiation",
					"MIROC5 Surface Temperature",
					"MIROC5 Surface Upwelling Clear-Sky Shortwave Radiation",
					"MIROC5 Surface Upwelling Longwave Radiation",
					"MIROC5 Surface Upwelling Shortwave Radiation",
					"MIROC5 TOA Incident Shortwave Radiation",
					"MIROC5 TOA Outgoing Clear-Sky Longwave Radiation",
					"MIROC5 TOA Outgoing Clear-Sky Shortwave Radiation",
					"MIROC5 TOA Outgoing Longwave Radiation",
					"MIROC5 TOA Outgoing Shortwave Radiation",
					"MIROC5 Total Cloud Fraction",
					"MIROC5 Vertical Wind Velocity", "MK3.6 Air Temperature",
					"MK3.6 Cloud Ice Water Content",
					"MK3.6 Cloud Liquid Water Content",
					"MK3.6 Eastward Near-Surface Wind",
					"MK3.6 Near-Surface Wind Speed",
					"MK3.6 Northward Near-Surface Wind",
					"MK3.6 Precipitation Flux", "MK3.6 Relative Humidity",
					"MK3.6 Specific Humidity",
					"MK3.6 Surface Downwelling Clear-Sky Longwave Radiation",
					"MK3.6 Surface Downwelling Clear-Sky Shortwave Radiation",
					"MK3.6 Surface Downwelling Longwave Radiation",
					"MK3.6 Surface Downwelling Shortwave Radiation",
					"MK3.6 Surface Temperature",
					"MK3.6 Surface Upwelling Clear-Sky Shortwave Radiation",
					"MK3.6 Surface Upwelling Longwave Radiation",
					"MK3.6 Surface Upwelling Shortwave Radiation",
					"MK3.6 TOA Incident Shortwave Radiation",
					"MK3.6 TOA Outgoing Clear-Sky Longwave Radiation",
					"MK3.6 TOA Outgoing Clear-Sky Shortwave Radiation",
					"MK3.6 TOA Outgoing Longwave Radiation",
					"MK3.6 TOA Outgoing Shortwave Radiation",
					"MK3.6 Total Cloud Fraction",
					"MK3.6 Vertical Wind Velocity", "MLS Air Temperature",
					"MLS Specific Humidity", "MODIS Leaf Area Index",
					"MODIS Total Cloud Fraction",
					"NODC Ocean Heat Content Anomaly within 2000 m Depth",
					"NODC Ocean Heat Content Anomaly within 700 m Depth",
					"NORESM Air Temperature", "NORESM Cloud Ice Water Content",
					"NORESM Cloud Liquid Water Content",
					"NORESM Eastward Near-Surface Wind",
					"NORESM Leaf Area Index",
					"NORESM Northward Near-Surface Wind",
					"NORESM Precipitation Flux", "NORESM Relative Humidity",
					"NORESM Sea Surface Height",
					"NORESM Sea Surface Temperature",
					"NORESM Specific Humidity",
					"NORESM Surface Downwelling Clear-Sky Longwave Radiation",
					"NORESM Surface Downwelling Clear-Sky Shortwave Radiation",
					"NORESM Surface Downwelling Longwave Radiation",
					"NORESM Surface Downwelling Shortwave Radiation",
					"NORESM Surface Temperature",
					"NORESM Surface Upwelling Clear-Sky Shortwave Radiation",
					"NORESM Surface Upwelling Longwave Radiation",
					"NORESM Surface Upwelling Shortwave Radiation",
					"NORESM TOA Incident Shortwave Radiation",
					"NORESM TOA Outgoing Clear-Sky Longwave Radiation",
					"NORESM TOA Outgoing Clear-Sky Shortwave Radiation",
					"NORESM TOA Outgoing Longwave Radiation",
					"NORESM TOA Outgoing Shortwave Radiation",
					"NORESM Total Cloud Fraction",
					"NORESM Vertical Wind Velocity",
					"QuikSCAT Eastward Near-Surface Wind",
					"QuikSCAT Near-Surface Wind Speed",
					"QuikSCAT Northward Near-Surface Wind",
					"TRMM Precipitation Flux",
					"interim Eastward Near-Surface Wind",
					"interim Near-Surface Wind Speed",
					"interim Northward Near-Surface Wind",
					"interim Relative Humidity",
					"interim Sea Surface Temperature",
					"interim Total Cloud Fraction",
					"interim Vertical Wind Velocity" ];
			
			var availableAgency = [ "ARGO", "CCCMA", "CSIRO", "ECMWF",
					"Flux,kg", "GFDL", "GFDL", "GISS", "IPSL", "MIROC", "NASA",
					"NASA", "NCAR", "NCC", "NOAA", "UKMO", "UKMO" ];

			var availableInstruments = [ "AIRS", "AMSRE", "ARGO", "AVISO",
					"CAM5", "CANAM4", "CERES", "CM3", "CM5A-LR", "E2-H",
					"E2-R", "ESM2G", "GPCP", "GRACE", "HadGEM2-A",
					"HadGEM2-ES", "MIROC5", "MK3.6", "MLS", "MODIS", "NODC",
					"NORESM", "QuikSCAT", "TRMM", "interim" ];

		var availablePhysicalVariable = [ "Air Temperature",
					"Cloud Ice Water Content", "Cloud Liquid Water Content",
					"Eastward Near-Surface Wind",
					"Equivalent Water Height Over Land",
					"Equivalent Water Height Over Ocean", "Leaf Area Index",
					"Near-Surface Air Temperature",
					"Near-Surface Relative Humidity",
					"Near-Surface Wind Speed", "Northward Near-Surface Wind",
					"Ocean Heat Content Anomaly within 2000 m Depth",
					"Ocean Heat Content Anomaly within 700 m Depth",
					"Ocean Salinity", "Ocean Temperature",
					"Precipitation Flux", "Precipitation", "Relative Humidity",
					"Sea Surface Height", "Sea Surface Temperature",
					"Specific Humidity",
					"Surface Downwelling Clear-Sky Longwave Radiation",
					"Surface Downwelling Clear-Sky Shortwave Radiation",
					"Surface Downwelling Longwave Radiation",
					"Surface Downwelling Shortwave Radiation",
					"Surface Temperature",
					"Surface Upwelling Clear-Sky Shortwave Radiation",
					"Surface Upwelling Longwave Radiation",
					"Surface Upwelling Shortwave Radiation",
					"TOA Incident Shortwave Radiation",
					"TOA Outgoing Clear-Sky Longwave Radiation",
					"TOA Outgoing Clear-Sky Shortwave Radiation",
					"TOA Outgoing Longwave Radiation",
					"TOA Outgoing Shortwave Radiation", "Total Cloud Fraction",
					"Vertical Wind Velocity" ];
			var availableGridDimension = [ "2D", "3D" ];
			$("#dataSetName").autocomplete("""),format.raw/*397.35*/("""{"""),format.raw/*397.36*/("""
				source : availableDataSetNames
			"""),format.raw/*399.4*/("""}"""),format.raw/*399.5*/(""");
			$("#agency").autocomplete("""),format.raw/*400.30*/("""{"""),format.raw/*400.31*/("""
				source : availableAgency
			"""),format.raw/*402.4*/("""}"""),format.raw/*402.5*/(""");
			$("#instrument").autocomplete("""),format.raw/*403.34*/("""{"""),format.raw/*403.35*/("""
				source : availableInstruments
			"""),format.raw/*405.4*/("""}"""),format.raw/*405.5*/(""");
			$("#physicalVariable").autocomplete("""),format.raw/*406.40*/("""{"""),format.raw/*406.41*/("""
				source : availablePhysicalVariable
			"""),format.raw/*408.4*/("""}"""),format.raw/*408.5*/(""");
			$("#gridDimension").autocomplete("""),format.raw/*409.37*/("""{"""),format.raw/*409.38*/("""
				source : availableGridDimension
			"""),format.raw/*411.4*/("""}"""),format.raw/*411.5*/(""");
		"""),format.raw/*412.3*/("""}"""),format.raw/*412.4*/(""");

		$(document)
				.ready(
						function() """),format.raw/*416.18*/("""{"""),format.raw/*416.19*/("""
							$("#preview")
									.click(
											function() """),format.raw/*419.23*/("""{"""),format.raw/*419.24*/("""
												var target = document
														.getElementById("show");
												if (target.style.display == "none") """),format.raw/*422.49*/("""{"""),format.raw/*422.50*/("""
													target.style.display = "block";
													$("#preview").text("Hide");
													var dataSetName = $(
															"#dataSetName")
															.val();
													var agency = $("#agency")
															.val();
													var instrument = $(
															"#instrument")
															.val();
													var physicalVariable = $(
															"#physicalVariable")
															.val();
													var gridDimension = $(
															"#gridDimension")
															.val();
													var dataSetStartTime = $(
															"#dataSetStartTime")
															.val();
													var dataSetEndTime = $(
															"#dataSetEndTime")
															.val();

													if (dataSetName != "") """),format.raw/*446.37*/("""{"""),format.raw/*446.38*/("""
														$("#content")
																.append(
																		" Dataset Name = "
																				+ dataSetName);
													"""),format.raw/*451.14*/("""}"""),format.raw/*451.15*/("""
													if (agency != ""
															&& agency != null) """),format.raw/*453.35*/("""{"""),format.raw/*453.36*/("""
														$("#content")
																.append(
																		" Agency = "
																				+ agency);
													"""),format.raw/*458.14*/("""}"""),format.raw/*458.15*/("""
													if (instrument != ""
															&& instrument != null) """),format.raw/*460.39*/("""{"""),format.raw/*460.40*/("""
														$("#content")
																.append(
																		" Instrument = "
																				+ instrument);
													"""),format.raw/*465.14*/("""}"""),format.raw/*465.15*/("""
													if (physicalVariable != ""
															&& physicalVariable != null) """),format.raw/*467.45*/("""{"""),format.raw/*467.46*/("""
														$("#content")
																.append(
																		" Physical Variable = "
																				+ physicalVariable);
													"""),format.raw/*472.14*/("""}"""),format.raw/*472.15*/("""
													if (gridDimension != ""
															&& gridDimension != null) """),format.raw/*474.42*/("""{"""),format.raw/*474.43*/("""
														$("#content")
																.append(
																		" Grid Dimension = "
																				+ gridDimension);
													"""),format.raw/*479.14*/("""}"""),format.raw/*479.15*/("""
													if (dataSetStartTime != ""
															&& dataSetStartTime != null) """),format.raw/*481.45*/("""{"""),format.raw/*481.46*/("""
														$("#content")
																.append(
																		" Dataset Start Time = "
																				+ dataSetStartTime);
													"""),format.raw/*486.14*/("""}"""),format.raw/*486.15*/("""
													if (dataSetEndTime != ""
															&& dataSetEndTime != null) """),format.raw/*488.43*/("""{"""),format.raw/*488.44*/("""
														$("#content")
																.append(
																		" Dataset End Time = "
																				+ dataSetEndTime);
													"""),format.raw/*493.14*/("""}"""),format.raw/*493.15*/("""

												"""),format.raw/*495.13*/("""}"""),format.raw/*495.14*/(""" else """),format.raw/*495.20*/("""{"""),format.raw/*495.21*/("""
													$("#content").val('');
													target.style.display = "none";
													$("#preview").text(
															"Preview");
												"""),format.raw/*500.13*/("""}"""),format.raw/*500.14*/("""
											"""),format.raw/*501.12*/("""}"""),format.raw/*501.13*/(""");
						"""),format.raw/*502.7*/("""}"""),format.raw/*502.8*/(""");
	</script>
""")))};
Seq[Any](format.raw/*18.53*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*504.2*/("""

"""),_display_(Seq[Any](/*506.2*/main("Search Dataset",email, scripts)/*506.39*/{_display_(Seq[Any](format.raw/*506.40*/("""
	
	"""),_display_(Seq[Any](/*508.3*/flash_message())),format.raw/*508.18*/("""   
	 
    <h1 style="margin-left:490px">Search Dataset</h1>
    """),_display_(Seq[Any](/*511.6*/helper/*511.12*/.form(routes.DatasetController.getSearchResult())/*511.61*/ {_display_(Seq[Any](format.raw/*511.63*/("""
    	<div class="ui-widget col-sm-offset-3 col-sm-7">
    	<div class = "form-group">
    		"""),_display_(Seq[Any](/*514.8*/inputText(dataSetForm("Dataset Name"), 'class -> "form-control", 'id -> "dataSetName", '_label -> Messages("Dataset Name"), 'placeholder -> "ARGO Ocean Temperature", 'size->70))),format.raw/*514.184*/("""
			<input type="text" class="hidden" name="email" value="""),_display_(Seq[Any](/*515.58*/email)),format.raw/*515.63*/(""">
    	</div>
    	<div class = "form-group">
    		"""),_display_(Seq[Any](/*518.8*/inputText(dataSetForm("Agency"), 'class -> "form-control", 'id -> "agency", '_label -> Messages("Agency"), 'placeholder -> "NOAA", 'size->70))),format.raw/*518.149*/(""" 
    	</div>
    	<div class = "form-group">
    		"""),_display_(Seq[Any](/*521.8*/inputText(dataSetForm("Instrument"), 'class -> "form-control", 'id -> "instrument", '_label -> Messages("Instrument"), 'placeholder -> "ARGO", 'size->70))),format.raw/*521.161*/(""" 
       	</div>
       	<div class = "form-group">
       		"""),_display_(Seq[Any](/*524.11*/inputText(dataSetForm("Physical Variable"), 'class -> "form-control", 'id -> "physicalVariable", '_label -> Messages("Physical Variable"), 'placeholder -> "Ocean temperature", 'size->70))),format.raw/*524.197*/("""
	    </div>
	    <div class = "form-group">
	    	"""),_display_(Seq[Any](/*527.8*/inputText(dataSetForm("Grid Dimension"), 'class -> "form-control", 'id -> "gridDimension", '_label -> Messages("Grids Dimension"), 'placeholder -> "3D", 'size->70))),format.raw/*527.171*/("""
	    	
	    </div>
	    <div class = "form-group">
	    	"""),_display_(Seq[Any](/*531.8*/inputText(dataSetForm("Dataset Start Time"), 'class -> "form-control", 'id -> "dataSetStartTime", '_label -> Messages("Dataset Start Time"), 'placeholder -> "YYYYMM", 'size->70))),format.raw/*531.185*/("""
	    	"""),_display_(Seq[Any](/*532.8*/inputText(dataSetForm("Dataset End Time"), 'class -> "form-control", 'id -> "dataSetEndTime", '_label -> Messages("Dataset End Time"), 'placeholder -> "YYYYMM", 'size->70))),format.raw/*532.179*/("""
	    	
	    	<div id="show" style="display: none;">
	    		<textarea style="width: 640px" rows="4" id="content"></textarea>
	    	</div>
	    </div>

	    <div align="center">
	    	<button id="preview" type="button" class="btn btn-info"> Preview</button>
	    	<input class="btn" type="submit" value="Search">
	    </div>
	    </div>
	    
	    """)))})),format.raw/*545.7*/("""
	 """)))})))}
    }
    
    def render(dataSetForm:play.data.Form[DataSet],email:String): play.api.templates.HtmlFormat.Appendable = apply(dataSetForm,email)
    
    def f:((play.data.Form[DataSet],String) => play.api.templates.HtmlFormat.Appendable) = (dataSetForm,email) => apply(dataSetForm,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 10 19:42:52 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/searchDataSet.scala.html
                    HASH: a156be3b7519ce1aad5f6597d34239d8c6cb15a0
                    MATRIX: 3209->1205|3354->1277|3369->1284|3454->1288|3506->1304|3521->1310|3583->1350|3890->1629|3919->1630|20984->18666|21014->18667|21081->18706|21110->18707|21171->18739|21201->18740|21262->18773|21291->18774|21356->18810|21386->18811|21452->18849|21481->18850|21552->18892|21582->18893|21653->18936|21682->18937|21750->18976|21780->18977|21848->19017|21877->19018|21910->19023|21939->19024|22015->19071|22045->19072|22135->19133|22165->19134|22316->19256|22346->19257|23117->19999|23147->20000|23316->20140|23346->20141|23440->20206|23470->20207|23628->20336|23658->20337|23760->20410|23790->20411|23956->20548|23986->20549|24100->20634|24130->20635|24309->20785|24339->20786|24447->20865|24477->20866|24650->21010|24680->21011|24794->21096|24824->21097|25004->21248|25034->21249|25144->21330|25174->21331|25350->21478|25380->21479|25423->21493|25453->21494|25488->21500|25518->21501|25700->21654|25730->21655|25771->21667|25801->21668|25838->21677|25867->21678|25922->1256|25951->1275|25980->21693|26019->21696|26066->21733|26106->21734|26147->21739|26185->21754|26287->21820|26303->21826|26362->21875|26403->21877|26533->21971|26733->22147|26828->22205|26856->22210|26945->22263|27110->22404|27199->22457|27376->22610|27475->22672|27685->22858|27773->22910|27960->23073|28055->23132|28256->23309|28300->23317|28495->23488|28875->23836
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|67->28|67->28|436->397|436->397|438->399|438->399|439->400|439->400|441->402|441->402|442->403|442->403|444->405|444->405|445->406|445->406|447->408|447->408|448->409|448->409|450->411|450->411|451->412|451->412|455->416|455->416|458->419|458->419|461->422|461->422|485->446|485->446|490->451|490->451|492->453|492->453|497->458|497->458|499->460|499->460|504->465|504->465|506->467|506->467|511->472|511->472|513->474|513->474|518->479|518->479|520->481|520->481|525->486|525->486|527->488|527->488|532->493|532->493|534->495|534->495|534->495|534->495|539->500|539->500|540->501|540->501|541->502|541->502|544->18|546->21|547->504|549->506|549->506|549->506|551->508|551->508|554->511|554->511|554->511|554->511|557->514|557->514|558->515|558->515|561->518|561->518|564->521|564->521|567->524|567->524|570->527|570->527|574->531|574->531|575->532|575->532|588->545
                    -- GENERATED --
                */
            