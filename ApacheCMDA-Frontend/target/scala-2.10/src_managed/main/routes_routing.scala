// @SOURCE:/Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/conf/routes
// @HASH:e6dcd39e1f32a32143f472f02dfe151ac54ec8c7
// @DATE:Fri Dec 11 10:39:23 EST 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_ClimateServiceController_home0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home"))))
        

// @LINE:7
private[this] lazy val controllers_ClimateServiceController_home1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Application_createSuccess2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createSuccess"))))
        

// @LINE:11
private[this] lazy val controllers_BugReportController_reports3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugs"))))
        

// @LINE:12
private[this] lazy val controllers_BugReportController_newReport4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newReport"))))
        

// @LINE:13
private[this] lazy val controllers_BugReportController_list5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bug/list"))))
        

// @LINE:14
private[this] lazy val controllers_BugReportController_deleteReport6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/report"))))
        

// @LINE:15
private[this] lazy val controllers_BugReportController_solveReport7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("solve/report"))))
        

// @LINE:18
private[this] lazy val controllers_AboutusController_aboutUs8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutus"))))
        

// @LINE:19
private[this] lazy val controllers_AboutusController_aboutProject9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutProject"))))
        

// @LINE:22
private[this] lazy val controllers_ClimateServiceController_home10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate"))))
        

// @LINE:23
private[this] lazy val controllers_ClimateServiceController_tutorial11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/tutorial"))))
        

// @LINE:24
private[this] lazy val controllers_ClimateServiceController_climateServices12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/climateServices"))))
        

// @LINE:25
private[this] lazy val controllers_ClimateServiceController_mostRecentlyAddedClimateServices13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostRecentlyAddedClimateServices"))))
        

// @LINE:26
private[this] lazy val controllers_ClimateServiceController_mostRecentlyUsedClimateServices14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostRecentlyUsedClimateServices"))))
        

// @LINE:27
private[this] lazy val controllers_ClimateServiceController_mostPopularClimateServices15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/mostPopularClimateServices"))))
        

// @LINE:28
private[this] lazy val controllers_ClimateServiceController_top316 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/top3"))))
        

// @LINE:30
private[this] lazy val controllers_ClimateServiceController_newClimateService17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/new/climateServices"))))
        

// @LINE:31
private[this] lazy val controllers_ClimateServiceController_deleteClimateService18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/delete/climateServices"))))
        

// @LINE:32
private[this] lazy val controllers_ClimateServiceController_downloadClimateService19 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/download/climateServices"))))
        

// @LINE:33
private[this] lazy val controllers_ClimateServiceController_editClimateService20 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/edit/climateServices"))))
        

// @LINE:34
private[this] lazy val controllers_ClimateServiceController_addClimateServices21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/new/climateServices"))))
        

// @LINE:35
private[this] lazy val controllers_ClimateServiceController_oneService22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/oneService"))))
        

// @LINE:38
private[this] lazy val controllers_DatasetController_datasetList23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/datasets"))))
        

// @LINE:39
private[this] lazy val controllers_DatasetController_searchDataset24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/searchDataSet"))))
        

// @LINE:40
private[this] lazy val controllers_DatasetController_getSearchResult25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/getSearchResult"))))
        

// @LINE:43
private[this] lazy val controllers_Assets_at26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:45
private[this] lazy val controllers_ClimateServiceController_searchService27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/searchService"))))
        

// @LINE:46
private[this] lazy val controllers_ClimateServiceController_getSearchServiceResult28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/getSearchServiceResult"))))
        

// @LINE:49
private[this] lazy val controllers_Application_sign29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/sign"))))
        

// @LINE:50
private[this] lazy val controllers_Application_authenticate30 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/authenticate"))))
        

// @LINE:51
private[this] lazy val controllers_Application_login31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/log"))))
        

// @LINE:52
private[this] lazy val controllers_Application_findFriend32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cimate/findFriend"))))
        

// @LINE:53
private[this] lazy val controllers_Application_getFindFriendResult33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cimate/findFriendResult"))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home""","""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix,"""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createSuccess""","""controllers.Application.createSuccess()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugs""","""controllers.BugReportController.reports()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newReport""","""controllers.BugReportController.newReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bug/list""","""controllers.BugReportController.list()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/report""","""controllers.BugReportController.deleteReport()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """solve/report""","""controllers.BugReportController.solveReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutus""","""controllers.AboutusController.aboutUs(email:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutProject""","""controllers.AboutusController.aboutProject(email:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate""","""controllers.ClimateServiceController.home(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/tutorial""","""controllers.ClimateServiceController.tutorial()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/climateServices""","""controllers.ClimateServiceController.climateServices(email:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostRecentlyAddedClimateServices""","""controllers.ClimateServiceController.mostRecentlyAddedClimateServices(email:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostRecentlyUsedClimateServices""","""controllers.ClimateServiceController.mostRecentlyUsedClimateServices(email:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/mostPopularClimateServices""","""controllers.ClimateServiceController.mostPopularClimateServices(email:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/top3""","""controllers.ClimateServiceController.top3(email:String ?= null)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/new/climateServices""","""controllers.ClimateServiceController.newClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/delete/climateServices""","""controllers.ClimateServiceController.deleteClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/download/climateServices""","""controllers.ClimateServiceController.downloadClimateService()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/edit/climateServices""","""controllers.ClimateServiceController.editClimateService()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/new/climateServices""","""controllers.ClimateServiceController.addClimateServices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/oneService""","""controllers.ClimateServiceController.oneService(url:String ?= null, email:String ?= null, id:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/datasets""","""controllers.DatasetController.datasetList(email:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/searchDataSet""","""controllers.DatasetController.searchDataset(email:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/getSearchResult""","""controllers.DatasetController.getSearchResult(email:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/searchService""","""controllers.ClimateServiceController.searchService(email:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/getSearchServiceResult""","""controllers.ClimateServiceController.getSearchServiceResult(email:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/sign""","""controllers.Application.sign()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/authenticate""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/log""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cimate/findFriend""","""controllers.Application.findFriend(email:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cimate/findFriendResult""","""controllers.Application.getFindFriendResult(email:String ?= "")""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_ClimateServiceController_home0(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ Home page""", Routes.prefix + """home"""))
   }
}
        

// @LINE:7
case controllers_ClimateServiceController_home1(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Application_createSuccess2(params) => {
   call { 
        invokeHandler(controllers.Application.createSuccess(), HandlerDef(this, "controllers.Application", "createSuccess", Nil,"GET", """""", Routes.prefix + """createSuccess"""))
   }
}
        

// @LINE:11
case controllers_BugReportController_reports3(params) => {
   call { 
        invokeHandler(controllers.BugReportController.reports(), HandlerDef(this, "controllers.BugReportController", "reports", Nil,"GET", """ BugReporting""", Routes.prefix + """bugs"""))
   }
}
        

// @LINE:12
case controllers_BugReportController_newReport4(params) => {
   call { 
        invokeHandler(controllers.BugReportController.newReport(), HandlerDef(this, "controllers.BugReportController", "newReport", Nil,"GET", """""", Routes.prefix + """newReport"""))
   }
}
        

// @LINE:13
case controllers_BugReportController_list5(params) => {
   call { 
        invokeHandler(controllers.BugReportController.list(), HandlerDef(this, "controllers.BugReportController", "list", Nil,"GET", """""", Routes.prefix + """bug/list"""))
   }
}
        

// @LINE:14
case controllers_BugReportController_deleteReport6(params) => {
   call { 
        invokeHandler(controllers.BugReportController.deleteReport(), HandlerDef(this, "controllers.BugReportController", "deleteReport", Nil,"POST", """""", Routes.prefix + """delete/report"""))
   }
}
        

// @LINE:15
case controllers_BugReportController_solveReport7(params) => {
   call { 
        invokeHandler(controllers.BugReportController.solveReport(), HandlerDef(this, "controllers.BugReportController", "solveReport", Nil,"POST", """""", Routes.prefix + """solve/report"""))
   }
}
        

// @LINE:18
case controllers_AboutusController_aboutUs8(params) => {
   call(params.fromQuery[String]("email", Some(null))) { (email) =>
        invokeHandler(controllers.AboutusController.aboutUs(email), HandlerDef(this, "controllers.AboutusController", "aboutUs", Seq(classOf[String]),"GET", """ About Us""", Routes.prefix + """aboutus"""))
   }
}
        

// @LINE:19
case controllers_AboutusController_aboutProject9(params) => {
   call(params.fromQuery[String]("email", Some(null))) { (email) =>
        invokeHandler(controllers.AboutusController.aboutProject(email), HandlerDef(this, "controllers.AboutusController", "aboutProject", Seq(classOf[String]),"GET", """""", Routes.prefix + """aboutProject"""))
   }
}
        

// @LINE:22
case controllers_ClimateServiceController_home10(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ Climate Model""", Routes.prefix + """climate"""))
   }
}
        

// @LINE:23
case controllers_ClimateServiceController_tutorial11(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.tutorial(), HandlerDef(this, "controllers.ClimateServiceController", "tutorial", Nil,"GET", """""", Routes.prefix + """climate/tutorial"""))
   }
}
        

// @LINE:24
case controllers_ClimateServiceController_climateServices12(params) => {
   call(params.fromQuery[String]("email", Some(null))) { (email) =>
        invokeHandler(controllers.ClimateServiceController.climateServices(email), HandlerDef(this, "controllers.ClimateServiceController", "climateServices", Seq(classOf[String]),"GET", """""", Routes.prefix + """climate/climateServices"""))
   }
}
        

// @LINE:25
case controllers_ClimateServiceController_mostRecentlyAddedClimateServices13(params) => {
   call(params.fromQuery[String]("email", Some(null))) { (email) =>
        invokeHandler(controllers.ClimateServiceController.mostRecentlyAddedClimateServices(email), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyAddedClimateServices", Seq(classOf[String]),"GET", """""", Routes.prefix + """climate/mostRecentlyAddedClimateServices"""))
   }
}
        

// @LINE:26
case controllers_ClimateServiceController_mostRecentlyUsedClimateServices14(params) => {
   call(params.fromQuery[String]("email", Some(null))) { (email) =>
        invokeHandler(controllers.ClimateServiceController.mostRecentlyUsedClimateServices(email), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyUsedClimateServices", Seq(classOf[String]),"GET", """""", Routes.prefix + """climate/mostRecentlyUsedClimateServices"""))
   }
}
        

// @LINE:27
case controllers_ClimateServiceController_mostPopularClimateServices15(params) => {
   call(params.fromQuery[String]("email", Some(null))) { (email) =>
        invokeHandler(controllers.ClimateServiceController.mostPopularClimateServices(email), HandlerDef(this, "controllers.ClimateServiceController", "mostPopularClimateServices", Seq(classOf[String]),"GET", """""", Routes.prefix + """climate/mostPopularClimateServices"""))
   }
}
        

// @LINE:28
case controllers_ClimateServiceController_top316(params) => {
   call(params.fromQuery[String]("email", Some(null))) { (email) =>
        invokeHandler(controllers.ClimateServiceController.top3(email), HandlerDef(this, "controllers.ClimateServiceController", "top3", Seq(classOf[String]),"GET", """""", Routes.prefix + """climate/top3"""))
   }
}
        

// @LINE:30
case controllers_ClimateServiceController_newClimateService17(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.newClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "newClimateService", Nil,"POST", """""", Routes.prefix + """climate/new/climateServices"""))
   }
}
        

// @LINE:31
case controllers_ClimateServiceController_deleteClimateService18(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.deleteClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "deleteClimateService", Nil,"POST", """""", Routes.prefix + """climate/delete/climateServices"""))
   }
}
        

// @LINE:32
case controllers_ClimateServiceController_downloadClimateService19(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.downloadClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "downloadClimateService", Nil,"POST", """""", Routes.prefix + """climate/download/climateServices"""))
   }
}
        

// @LINE:33
case controllers_ClimateServiceController_editClimateService20(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.editClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "editClimateService", Nil,"POST", """""", Routes.prefix + """climate/edit/climateServices"""))
   }
}
        

// @LINE:34
case controllers_ClimateServiceController_addClimateServices21(params) => {
   call { 
        invokeHandler(controllers.ClimateServiceController.addClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "addClimateServices", Nil,"GET", """""", Routes.prefix + """climate/new/climateServices"""))
   }
}
        

// @LINE:35
case controllers_ClimateServiceController_oneService22(params) => {
   call(params.fromQuery[String]("url", Some(null)), params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("id", Some(null))) { (url, email, id) =>
        invokeHandler(controllers.ClimateServiceController.oneService(url, email, id), HandlerDef(this, "controllers.ClimateServiceController", "oneService", Seq(classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """climate/oneService"""))
   }
}
        

// @LINE:38
case controllers_DatasetController_datasetList23(params) => {
   call(params.fromQuery[String]("email", Some(null))) { (email) =>
        invokeHandler(controllers.DatasetController.datasetList(email), HandlerDef(this, "controllers.DatasetController", "datasetList", Seq(classOf[String]),"GET", """Keyword search""", Routes.prefix + """climate/datasets"""))
   }
}
        

// @LINE:39
case controllers_DatasetController_searchDataset24(params) => {
   call(params.fromQuery[String]("email", Some(null))) { (email) =>
        invokeHandler(controllers.DatasetController.searchDataset(email), HandlerDef(this, "controllers.DatasetController", "searchDataset", Seq(classOf[String]),"GET", """""", Routes.prefix + """climate/searchDataSet"""))
   }
}
        

// @LINE:40
case controllers_DatasetController_getSearchResult25(params) => {
   call(params.fromQuery[String]("email", Some(null))) { (email) =>
        invokeHandler(controllers.DatasetController.getSearchResult(email), HandlerDef(this, "controllers.DatasetController", "getSearchResult", Seq(classOf[String]),"GET", """""", Routes.prefix + """climate/getSearchResult"""))
   }
}
        

// @LINE:43
case controllers_Assets_at26(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:45
case controllers_ClimateServiceController_searchService27(params) => {
   call(params.fromQuery[String]("email", Some(""))) { (email) =>
        invokeHandler(controllers.ClimateServiceController.searchService(email), HandlerDef(this, "controllers.ClimateServiceController", "searchService", Seq(classOf[String]),"GET", """""", Routes.prefix + """climate/searchService"""))
   }
}
        

// @LINE:46
case controllers_ClimateServiceController_getSearchServiceResult28(params) => {
   call(params.fromQuery[String]("email", Some(""))) { (email) =>
        invokeHandler(controllers.ClimateServiceController.getSearchServiceResult(email), HandlerDef(this, "controllers.ClimateServiceController", "getSearchServiceResult", Seq(classOf[String]),"GET", """""", Routes.prefix + """climate/getSearchServiceResult"""))
   }
}
        

// @LINE:49
case controllers_Application_sign29(params) => {
   call { 
        invokeHandler(controllers.Application.sign(), HandlerDef(this, "controllers.Application", "sign", Nil,"GET", """Sign Up Page""", Routes.prefix + """climate/sign"""))
   }
}
        

// @LINE:50
case controllers_Application_authenticate30(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """climate/authenticate"""))
   }
}
        

// @LINE:51
case controllers_Application_login31(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """climate/log"""))
   }
}
        

// @LINE:52
case controllers_Application_findFriend32(params) => {
   call(params.fromQuery[String]("email", Some(""))) { (email) =>
        invokeHandler(controllers.Application.findFriend(email), HandlerDef(this, "controllers.Application", "findFriend", Seq(classOf[String]),"GET", """""", Routes.prefix + """cimate/findFriend"""))
   }
}
        

// @LINE:53
case controllers_Application_getFindFriendResult33(params) => {
   call(params.fromQuery[String]("email", Some(""))) { (email) =>
        invokeHandler(controllers.Application.getFindFriendResult(email), HandlerDef(this, "controllers.Application", "getFindFriendResult", Seq(classOf[String]),"GET", """""", Routes.prefix + """cimate/findFriendResult"""))
   }
}
        
}

}
     