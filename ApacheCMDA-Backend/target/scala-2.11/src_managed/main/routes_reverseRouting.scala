// @SOURCE:/home/SOC-Fall-2015/Dev/ApacheCMDA-Backend/conf/routes
// @HASH:805311a57a5956f8ceed0b7d8d85e26a52011d13
// @DATE:Fri Dec 11 03:30:55 UTC 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
package controllers {

// @LINE:66
class ReverseAssets {


// @LINE:66
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
class ReverseInstrumentController {


// @LINE:30
def getAllInstruments(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "instrument/getAllInstruments/json")
}
                        

// @LINE:31
def getInstrument(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "instrument/getInstrument/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:32
def addInstrument(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "instrument/addInstrument")
}
                        

// @LINE:33
def updateInstrumentById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "instrument/updateInstrument/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:34
def deleteInstrument(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "instrument/deleteInstrument/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
class ReverseUserController {


// @LINE:61
def isUserEmailValid(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "users/isUserEmailValid")
}
                        

// @LINE:55
def addUser(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "users/add")
}
                        

// @LINE:54
def getUser(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:56
def updateUser(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "users/update/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:58
def getAllUsers(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "users/getAllUsers/json")
}
                        

// @LINE:62
def addFriend(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "users/addFriend")
}
                        

// @LINE:63
def getFriends(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "users/getFriends")
}
                        

// @LINE:57
def deleteUser(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "users/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:60
def deleteUserByUserNameandPassword(userName:String, password:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "users/delete/userName/" + implicitly[PathBindable[String]].unbind("userName", dynamicString(userName)) + "/password/" + implicitly[PathBindable[String]].unbind("password", dynamicString(password)))
}
                        

// @LINE:59
def isUserValid(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "users/isUserValid")
}
                        

}
                          

// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
class ReverseParameterController {


// @LINE:45
def getAllParameters(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "parameter/getAllParameters/json")
}
                        

// @LINE:47
def getParameterById(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "parameter/getParameter/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:49
def updateParameterById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "parameter/updateParameter/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:46
def getParameterByName(id:Long, name:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "parameter/getParameter/service/" + implicitly[PathBindable[Long]].unbind("id", id) + "/name/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/json")
}
                        

// @LINE:50
def updateParameterByName(oldName:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "parameter/updateParameter/name/" + implicitly[PathBindable[String]].unbind("oldName", dynamicString(oldName)))
}
                        

// @LINE:51
def deleteParameterByName(id:Long, name:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "parameter/deleteParameter/service/" + implicitly[PathBindable[Long]].unbind("id", id) + "/name/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                        

// @LINE:48
def addParameter(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "parameter/addParameter")
}
                        

}
                          

// @LINE:72
// @LINE:71
// @LINE:70
class ReversePostController {


// @LINE:72
def getAllAtClimateServices(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "posts/getAllAtClimateServices/name")
}
                        

// @LINE:71
def createPost(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "posts/add")
}
                        

// @LINE:70
def getAllPosts(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "posts/getAllPosts/json")
}
                        

}
                          

// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
class ReverseDatasetController {


// @LINE:38
def getDataset(id:Long): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "dataset/getDataset/id/" + implicitly[PathBindable[Long]].unbind("id", id) + "/json")
}
                        

// @LINE:37
def getAllDatasets(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "dataset/getAllDatasets/json")
}
                        

// @LINE:42
def queryDatasets(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "dataset/queryDataset")
}
                        

// @LINE:41
def deleteDataset(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "dataset/deleteDataset/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:39
def addDataset(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "dataset/addDataset")
}
                        

// @LINE:40
def updateDatasetById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "dataset/updateDataset/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseClimateServiceController {


// @LINE:26
def getTop3MostRecentServices(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getTop3MostRecentServices/json")
}
                        

// @LINE:13
def getAllClimateServicesOrderByCreateTime(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllMostRecentClimateServicesByCreateTime/json")
}
                        

// @LINE:21
def deleteClimateServiceById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "climateService/deleteClimateService/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:15
def getAllClimateServicesOrderByCount(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllMostUsedClimateServices/json")
}
                        

// @LINE:18
def addServiceEntry(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/addServiceEntry")
}
                        

// @LINE:25
def addFreq(): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "climateService/addFreq/")
}
                        

// @LINE:27
def setTime(): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "climateService/setTime/")
}
                        

// @LINE:23
def getTop3GradesServices(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getTop3GradesServices/json")
}
                        

// @LINE:16
def addClimateService(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "climateService/addClimateService")
}
                        

// @LINE:12
def getAllClimateServices(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllClimateServices/json")
}
                        

// @LINE:10
def getClimateService(name:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getClimateService/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)) + "/json")
}
                        

// @LINE:24
def getTop3MostRecentlyUsedServices(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getTop3MostRecentlyUsedServices/json")
}
                        

// @LINE:19
def updateClimateServiceById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "climateService/updateClimateService/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:11
def getClimateServiceById(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getClimateService/id/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:14
def getAllClimateServicesOrderByLatestAccessTime(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllMostRecentClimateServicesByLatestAccessTime/json")
}
                        

// @LINE:17
def getAllServiceEntries(): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("format", "json")))
   Call("GET", _prefix + { _defaultPrefix } + "climateService/getAllServiceEntries/json")
}
                        

// @LINE:20
def updateClimateServiceByName(oldName:String): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "climateService/updateClimateService/name/" + implicitly[PathBindable[String]].unbind("oldName", dynamicString(oldName)))
}
                        

// @LINE:22
def deleteClimateServiceByName(name:String): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "climateService/deleteClimateService/name/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                        

}
                          
}
                  


// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:66
class ReverseAssets {


// @LINE:66
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
class ReverseInstrumentController {


// @LINE:30
def getAllInstruments : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.getAllInstruments",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/getAllInstruments/json"})
      }
   """
)
                        

// @LINE:31
def getInstrument : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.getInstrument",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/getInstrument/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:32
def addInstrument : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.addInstrument",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/addInstrument"})
      }
   """
)
                        

// @LINE:33
def updateInstrumentById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.updateInstrumentById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/updateInstrument/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:34
def deleteInstrument : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InstrumentController.deleteInstrument",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "instrument/deleteInstrument/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
class ReverseUserController {


// @LINE:61
def isUserEmailValid : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.isUserEmailValid",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/isUserEmailValid"})
      }
   """
)
                        

// @LINE:55
def addUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.addUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/add"})
      }
   """
)
                        

// @LINE:54
def getUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getUser",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:56
def updateUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.updateUser",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "users/update/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:58
def getAllUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getAllUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getAllUsers/json"})
      }
   """
)
                        

// @LINE:62
def addFriend : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.addFriend",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/addFriend"})
      }
   """
)
                        

// @LINE:63
def getFriends : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getFriends",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/getFriends"})
      }
   """
)
                        

// @LINE:57
def deleteUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.deleteUser",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "users/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:60
def deleteUserByUserNameandPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.deleteUserByUserNameandPassword",
   """
      function(userName,password) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "users/delete/userName/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userName", encodeURIComponent(userName)) + "/password/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("password", encodeURIComponent(password))})
      }
   """
)
                        

// @LINE:59
def isUserValid : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.isUserValid",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/isUserValid"})
      }
   """
)
                        

}
              

// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
class ReverseParameterController {


// @LINE:45
def getAllParameters : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.getAllParameters",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/getAllParameters/json"})
      }
   """
)
                        

// @LINE:47
def getParameterById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.getParameterById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/getParameter/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:49
def updateParameterById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.updateParameterById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/updateParameter/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:46
def getParameterByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.getParameterByName",
   """
      function(id,name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/getParameter/service/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/json"})
      }
   """
)
                        

// @LINE:50
def updateParameterByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.updateParameterByName",
   """
      function(oldName) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/updateParameter/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("oldName", encodeURIComponent(oldName))})
      }
   """
)
                        

// @LINE:51
def deleteParameterByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.deleteParameterByName",
   """
      function(id,name) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/deleteParameter/service/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

// @LINE:48
def addParameter : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParameterController.addParameter",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "parameter/addParameter"})
      }
   """
)
                        

}
              

// @LINE:72
// @LINE:71
// @LINE:70
class ReversePostController {


// @LINE:72
def getAllAtClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PostController.getAllAtClimateServices",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/getAllAtClimateServices/name"})
      }
   """
)
                        

// @LINE:71
def createPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PostController.createPost",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/add"})
      }
   """
)
                        

// @LINE:70
def getAllPosts : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PostController.getAllPosts",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/getAllPosts/json"})
      }
   """
)
                        

}
              

// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
class ReverseDatasetController {


// @LINE:38
def getDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getDataset",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/getDataset/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/json"})
      }
   """
)
                        

// @LINE:37
def getAllDatasets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getAllDatasets",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/getAllDatasets/json"})
      }
   """
)
                        

// @LINE:42
def queryDatasets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.queryDatasets",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/queryDataset"})
      }
   """
)
                        

// @LINE:41
def deleteDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.deleteDataset",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/deleteDataset/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:39
def addDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.addDataset",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/addDataset"})
      }
   """
)
                        

// @LINE:40
def updateDatasetById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.updateDatasetById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset/updateDataset/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseClimateServiceController {


// @LINE:26
def getTop3MostRecentServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getTop3MostRecentServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getTop3MostRecentServices/json"})
      }
   """
)
                        

// @LINE:13
def getAllClimateServicesOrderByCreateTime : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllClimateServicesOrderByCreateTime",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllMostRecentClimateServicesByCreateTime/json"})
      }
   """
)
                        

// @LINE:21
def deleteClimateServiceById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.deleteClimateServiceById",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/deleteClimateService/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:15
def getAllClimateServicesOrderByCount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllClimateServicesOrderByCount",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllMostUsedClimateServices/json"})
      }
   """
)
                        

// @LINE:18
def addServiceEntry : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addServiceEntry",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/addServiceEntry"})
      }
   """
)
                        

// @LINE:25
def addFreq : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addFreq",
   """
      function() {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/addFreq/"})
      }
   """
)
                        

// @LINE:27
def setTime : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.setTime",
   """
      function() {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/setTime/"})
      }
   """
)
                        

// @LINE:23
def getTop3GradesServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getTop3GradesServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getTop3GradesServices/json"})
      }
   """
)
                        

// @LINE:16
def addClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/addClimateService"})
      }
   """
)
                        

// @LINE:12
def getAllClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllClimateServices/json"})
      }
   """
)
                        

// @LINE:10
def getClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getClimateService",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getClimateService/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/json"})
      }
   """
)
                        

// @LINE:24
def getTop3MostRecentlyUsedServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getTop3MostRecentlyUsedServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getTop3MostRecentlyUsedServices/json"})
      }
   """
)
                        

// @LINE:19
def updateClimateServiceById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.updateClimateServiceById",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/updateClimateService/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:11
def getClimateServiceById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getClimateServiceById",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getClimateService/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:14
def getAllClimateServicesOrderByLatestAccessTime : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllClimateServicesOrderByLatestAccessTime",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllMostRecentClimateServicesByLatestAccessTime/json"})
      }
   """
)
                        

// @LINE:17
def getAllServiceEntries : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.getAllServiceEntries",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/getAllServiceEntries/json"})
      }
   """
)
                        

// @LINE:20
def updateClimateServiceByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.updateClimateServiceByName",
   """
      function(oldName) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/updateClimateService/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("oldName", encodeURIComponent(oldName))})
      }
   """
)
                        

// @LINE:22
def deleteClimateServiceByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.deleteClimateServiceByName",
   """
      function(name) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "climateService/deleteClimateService/name/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

}
              
}
        


// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
package controllers.ref {


// @LINE:66
class ReverseAssets {


// @LINE:66
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
class ReverseInstrumentController {


// @LINE:30
def getAllInstruments(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getAllInstruments(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "getAllInstruments", Seq(classOf[String]), "GET", """ Instrument""", _prefix + """instrument/getAllInstruments/json""")
)
                      

// @LINE:31
def getInstrument(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).getInstrument(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "getInstrument", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """instrument/getInstrument/id/$id<[^/]+>/json""")
)
                      

// @LINE:32
def addInstrument(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).addInstrument(), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "addInstrument", Seq(), "POST", """""", _prefix + """instrument/addInstrument""")
)
                      

// @LINE:33
def updateInstrumentById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).updateInstrumentById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "updateInstrumentById", Seq(classOf[Long]), "PUT", """""", _prefix + """instrument/updateInstrument/id/$id<[^/]+>""")
)
                      

// @LINE:34
def deleteInstrument(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.InstrumentController]).deleteInstrument(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.InstrumentController", "deleteInstrument", Seq(classOf[Long]), "DELETE", """""", _prefix + """instrument/deleteInstrument/id/$id<[^/]+>""")
)
                      

}
                          

// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
class ReverseUserController {


// @LINE:61
def isUserEmailValid(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).isUserEmailValid(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "isUserEmailValid", Seq(), "POST", """""", _prefix + """users/isUserEmailValid""")
)
                      

// @LINE:55
def addUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).addUser(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "addUser", Seq(), "POST", """""", _prefix + """users/add""")
)
                      

// @LINE:54
def getUser(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getUser(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getUser", Seq(classOf[Long], classOf[String]), "GET", """ Users""", _prefix + """users/$id<[^/]+>""")
)
                      

// @LINE:56
def updateUser(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).updateUser(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "updateUser", Seq(classOf[Long]), "PUT", """""", _prefix + """users/update/$id<[^/]+>""")
)
                      

// @LINE:58
def getAllUsers(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getAllUsers(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getAllUsers", Seq(classOf[String]), "GET", """""", _prefix + """users/getAllUsers/json""")
)
                      

// @LINE:62
def addFriend(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).addFriend(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "addFriend", Seq(), "POST", """""", _prefix + """users/addFriend""")
)
                      

// @LINE:63
def getFriends(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).getFriends(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "getFriends", Seq(), "POST", """""", _prefix + """users/getFriends""")
)
                      

// @LINE:57
def deleteUser(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUser(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteUser", Seq(classOf[Long]), "DELETE", """""", _prefix + """users/delete/$id<[^/]+>""")
)
                      

// @LINE:60
def deleteUserByUserNameandPassword(userName:String, password:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).deleteUserByUserNameandPassword(userName, password), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "deleteUserByUserNameandPassword", Seq(classOf[String], classOf[String]), "DELETE", """""", _prefix + """users/delete/userName/$userName<[^/]+>/password/$password<[^/]+>""")
)
                      

// @LINE:59
def isUserValid(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.UserController]).isUserValid(), HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "isUserValid", Seq(), "POST", """""", _prefix + """users/isUserValid""")
)
                      

}
                          

// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
class ReverseParameterController {


// @LINE:45
def getAllParameters(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getAllParameters(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getAllParameters", Seq(classOf[String]), "GET", """ Parameter""", _prefix + """parameter/getAllParameters/json""")
)
                      

// @LINE:47
def getParameterById(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterById(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getParameterById", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """parameter/getParameter/id/$id<[^/]+>/json""")
)
                      

// @LINE:49
def updateParameterById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "updateParameterById", Seq(classOf[Long]), "PUT", """""", _prefix + """parameter/updateParameter/id/$id<[^/]+>""")
)
                      

// @LINE:46
def getParameterByName(id:Long, name:String, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).getParameterByName(id, name, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "getParameterByName", Seq(classOf[Long], classOf[String], classOf[String]), "GET", """""", _prefix + """parameter/getParameter/service/$id<[^/]+>/name/$name<[^/]+>/json""")
)
                      

// @LINE:50
def updateParameterByName(oldName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).updateParameterByName(oldName), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "updateParameterByName", Seq(classOf[String]), "PUT", """""", _prefix + """parameter/updateParameter/name/$oldName<[^/]+>""")
)
                      

// @LINE:51
def deleteParameterByName(id:Long, name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).deleteParameterByName(id, name), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "deleteParameterByName", Seq(classOf[Long], classOf[String]), "DELETE", """""", _prefix + """parameter/deleteParameter/service/$id<[^/]+>/name/$name<[^/]+>""")
)
                      

// @LINE:48
def addParameter(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ParameterController]).addParameter(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ParameterController", "addParameter", Seq(), "POST", """""", _prefix + """parameter/addParameter""")
)
                      

}
                          

// @LINE:72
// @LINE:71
// @LINE:70
class ReversePostController {


// @LINE:72
def getAllAtClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.PostController]).getAllAtClimateServices(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PostController", "getAllAtClimateServices", Seq(), "POST", """""", _prefix + """posts/getAllAtClimateServices/name""")
)
                      

// @LINE:71
def createPost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.PostController]).createPost(), HandlerDef(this.getClass.getClassLoader, "", "controllers.PostController", "createPost", Seq(), "POST", """""", _prefix + """posts/add""")
)
                      

// @LINE:70
def getAllPosts(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.PostController]).getAllPosts(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.PostController", "getAllPosts", Seq(classOf[String]), "GET", """ Post""", _prefix + """posts/getAllPosts/json""")
)
                      

}
                          

// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
class ReverseDatasetController {


// @LINE:38
def getDataset(id:Long, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getDataset(id, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getDataset", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """dataset/getDataset/id/$id<[^/]+>/json""")
)
                      

// @LINE:37
def getAllDatasets(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).getAllDatasets(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "getAllDatasets", Seq(classOf[String]), "GET", """ Dataset""", _prefix + """dataset/getAllDatasets/json""")
)
                      

// @LINE:42
def queryDatasets(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).queryDatasets(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "queryDatasets", Seq(), "POST", """""", _prefix + """dataset/queryDataset""")
)
                      

// @LINE:41
def deleteDataset(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).deleteDataset(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "deleteDataset", Seq(classOf[Long]), "DELETE", """""", _prefix + """dataset/deleteDataset/id/$id<[^/]+>""")
)
                      

// @LINE:39
def addDataset(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).addDataset(), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "addDataset", Seq(), "POST", """""", _prefix + """dataset/addDataset""")
)
                      

// @LINE:40
def updateDatasetById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.DatasetController]).updateDatasetById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.DatasetController", "updateDatasetById", Seq(classOf[Long]), "PUT", """""", _prefix + """dataset/updateDataset/id/$id<[^/]+>""")
)
                      

}
                          

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseClimateServiceController {


// @LINE:26
def getTop3MostRecentServices(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getTop3MostRecentServices(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getTop3MostRecentServices", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getTop3MostRecentServices/json""")
)
                      

// @LINE:13
def getAllClimateServicesOrderByCreateTime(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCreateTime(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByCreateTime", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllMostRecentClimateServicesByCreateTime/json""")
)
                      

// @LINE:21
def deleteClimateServiceById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "deleteClimateServiceById", Seq(classOf[Long]), "DELETE", """""", _prefix + """climateService/deleteClimateService/id/$id<[^/]+>""")
)
                      

// @LINE:15
def getAllClimateServicesOrderByCount(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByCount(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByCount", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllMostUsedClimateServices/json""")
)
                      

// @LINE:18
def addServiceEntry(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addServiceEntry(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addServiceEntry", Seq(), "POST", """""", _prefix + """climateService/addServiceEntry""")
)
                      

// @LINE:25
def addFreq(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addFreq(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addFreq", Seq(), "PUT", """""", _prefix + """climateService/addFreq/""")
)
                      

// @LINE:27
def setTime(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).setTime(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "setTime", Seq(), "PUT", """""", _prefix + """climateService/setTime/""")
)
                      

// @LINE:23
def getTop3GradesServices(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getTop3GradesServices(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getTop3GradesServices", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getTop3GradesServices/json""")
)
                      

// @LINE:16
def addClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).addClimateService(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "addClimateService", Seq(), "POST", """""", _prefix + """climateService/addClimateService""")
)
                      

// @LINE:12
def getAllClimateServices(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServices(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServices", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllClimateServices/json""")
)
                      

// @LINE:10
def getClimateService(name:String, format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateService(name, format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getClimateService", Seq(classOf[String], classOf[String]), "GET", """ Climate Service""", _prefix + """climateService/getClimateService/$name<[^/]+>/json""")
)
                      

// @LINE:24
def getTop3MostRecentlyUsedServices(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getTop3MostRecentlyUsedServices(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getTop3MostRecentlyUsedServices", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getTop3MostRecentlyUsedServices/json""")
)
                      

// @LINE:19
def updateClimateServiceById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "updateClimateServiceById", Seq(classOf[Long]), "PUT", """""", _prefix + """climateService/updateClimateService/id/$id<[^/]+>""")
)
                      

// @LINE:11
def getClimateServiceById(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getClimateServiceById(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getClimateServiceById", Seq(classOf[Long]), "GET", """""", _prefix + """climateService/getClimateService/id/$id<[^/]+>""")
)
                      

// @LINE:14
def getAllClimateServicesOrderByLatestAccessTime(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllClimateServicesOrderByLatestAccessTime(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllClimateServicesOrderByLatestAccessTime", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllMostRecentClimateServicesByLatestAccessTime/json""")
)
                      

// @LINE:17
def getAllServiceEntries(format:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).getAllServiceEntries(format), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "getAllServiceEntries", Seq(classOf[String]), "GET", """""", _prefix + """climateService/getAllServiceEntries/json""")
)
                      

// @LINE:20
def updateClimateServiceByName(oldName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).updateClimateServiceByName(oldName), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "updateClimateServiceByName", Seq(classOf[String]), "PUT", """""", _prefix + """climateService/updateClimateService/name/$oldName<[^/]+>""")
)
                      

// @LINE:22
def deleteClimateServiceByName(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ClimateServiceController]).deleteClimateServiceByName(name), HandlerDef(this.getClass.getClassLoader, "", "controllers.ClimateServiceController", "deleteClimateServiceByName", Seq(classOf[String]), "DELETE", """""", _prefix + """climateService/deleteClimateService/name/$name<[^/]+>""")
)
                      

}
                          
}
        
    