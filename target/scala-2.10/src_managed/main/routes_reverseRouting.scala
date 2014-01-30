// @SOURCE:/Users/keepluck/HipLocal/conf/routes
// @HASH:ede59803257b45b0da89738ade6e7983be146067
// @DATE:Thu Jan 30 15:19:54 ICT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:20
class ReverseAssets {
    

// @LINE:20
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseBrownPeterson {
    

// @LINE:15
def renderShortTermMemoryBrownPetersonTask(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "STMBt")
}
                                                

// @LINE:13
def renderShortTermMemoryBrownPetersonTaskProc(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "STMBtProc")
}
                                                

// @LINE:16
def renderShortTermMemoryBrownPetersonTaskIframe(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "STMBtIframe")
}
                                                

// @LINE:17
def renderShortTermMemoryBrownPetersonTaskExp(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "STMBtExp")
}
                                                

// @LINE:14
def renderShortTermMemoryBrownPetersonTaskProcIframe(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "STMBtProcIframe")
}
                                                
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def perceptionChangeBlindnessProcIframe(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "PCBProcIframe")
}
                                                

// @LINE:11
def perceptionChangeBlindnessProc(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "PCBProc")
}
                                                

// @LINE:10
def perceptionChangeBlindnessIframe(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "PCBIframe")
}
                                                

// @LINE:7
def home(): Call = {
   Call("POST", _prefix)
}
                                                

// @LINE:9
def perceptionChangeBlindness(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "PCB")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:8
def perceptionSignalDetection(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "PSD")
}
                                                
    
}
                          
}
                  


// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:20
class ReverseAssets {
    

// @LINE:20
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseBrownPeterson {
    

// @LINE:15
def renderShortTermMemoryBrownPetersonTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BrownPeterson.renderShortTermMemoryBrownPetersonTask",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "STMBt"})
      }
   """
)
                        

// @LINE:13
def renderShortTermMemoryBrownPetersonTaskProc : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BrownPeterson.renderShortTermMemoryBrownPetersonTaskProc",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "STMBtProc"})
      }
   """
)
                        

// @LINE:16
def renderShortTermMemoryBrownPetersonTaskIframe : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BrownPeterson.renderShortTermMemoryBrownPetersonTaskIframe",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "STMBtIframe"})
      }
   """
)
                        

// @LINE:17
def renderShortTermMemoryBrownPetersonTaskExp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BrownPeterson.renderShortTermMemoryBrownPetersonTaskExp",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "STMBtExp"})
      }
   """
)
                        

// @LINE:14
def renderShortTermMemoryBrownPetersonTaskProcIframe : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BrownPeterson.renderShortTermMemoryBrownPetersonTaskProcIframe",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "STMBtProcIframe"})
      }
   """
)
                        
    
}
              

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def perceptionChangeBlindnessProcIframe : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.perceptionChangeBlindnessProcIframe",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "PCBProcIframe"})
      }
   """
)
                        

// @LINE:11
def perceptionChangeBlindnessProc : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.perceptionChangeBlindnessProc",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "PCBProc"})
      }
   """
)
                        

// @LINE:10
def perceptionChangeBlindnessIframe : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.perceptionChangeBlindnessIframe",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "PCBIframe"})
      }
   """
)
                        

// @LINE:7
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.home",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:9
def perceptionChangeBlindness : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.perceptionChangeBlindness",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "PCB"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:8
def perceptionSignalDetection : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.perceptionSignalDetection",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "PSD"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:20
class ReverseAssets {
    

// @LINE:20
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseBrownPeterson {
    

// @LINE:15
def renderShortTermMemoryBrownPetersonTask(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BrownPeterson.renderShortTermMemoryBrownPetersonTask(), HandlerDef(this, "controllers.BrownPeterson", "renderShortTermMemoryBrownPetersonTask", Seq(), "GET", """""", _prefix + """STMBt""")
)
                      

// @LINE:13
def renderShortTermMemoryBrownPetersonTaskProc(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BrownPeterson.renderShortTermMemoryBrownPetersonTaskProc(), HandlerDef(this, "controllers.BrownPeterson", "renderShortTermMemoryBrownPetersonTaskProc", Seq(), "GET", """""", _prefix + """STMBtProc""")
)
                      

// @LINE:16
def renderShortTermMemoryBrownPetersonTaskIframe(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BrownPeterson.renderShortTermMemoryBrownPetersonTaskIframe(), HandlerDef(this, "controllers.BrownPeterson", "renderShortTermMemoryBrownPetersonTaskIframe", Seq(), "GET", """""", _prefix + """STMBtIframe""")
)
                      

// @LINE:17
def renderShortTermMemoryBrownPetersonTaskExp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BrownPeterson.renderShortTermMemoryBrownPetersonTaskExp(), HandlerDef(this, "controllers.BrownPeterson", "renderShortTermMemoryBrownPetersonTaskExp", Seq(), "GET", """""", _prefix + """STMBtExp""")
)
                      

// @LINE:14
def renderShortTermMemoryBrownPetersonTaskProcIframe(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BrownPeterson.renderShortTermMemoryBrownPetersonTaskProcIframe(), HandlerDef(this, "controllers.BrownPeterson", "renderShortTermMemoryBrownPetersonTaskProcIframe", Seq(), "GET", """""", _prefix + """STMBtProcIframe""")
)
                      
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def perceptionChangeBlindnessProcIframe(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.perceptionChangeBlindnessProcIframe(), HandlerDef(this, "controllers.Application", "perceptionChangeBlindnessProcIframe", Seq(), "GET", """""", _prefix + """PCBProcIframe""")
)
                      

// @LINE:11
def perceptionChangeBlindnessProc(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.perceptionChangeBlindnessProc(), HandlerDef(this, "controllers.Application", "perceptionChangeBlindnessProc", Seq(), "GET", """""", _prefix + """PCBProc""")
)
                      

// @LINE:10
def perceptionChangeBlindnessIframe(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.perceptionChangeBlindnessIframe(), HandlerDef(this, "controllers.Application", "perceptionChangeBlindnessIframe", Seq(), "GET", """""", _prefix + """PCBIframe""")
)
                      

// @LINE:7
def home(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.home(), HandlerDef(this, "controllers.Application", "home", Seq(), "POST", """""", _prefix + """""")
)
                      

// @LINE:9
def perceptionChangeBlindness(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.perceptionChangeBlindness(), HandlerDef(this, "controllers.Application", "perceptionChangeBlindness", Seq(), "GET", """""", _prefix + """PCB""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:8
def perceptionSignalDetection(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.perceptionSignalDetection(), HandlerDef(this, "controllers.Application", "perceptionSignalDetection", Seq(), "GET", """""", _prefix + """PSD""")
)
                      
    
}
                          
}
        
    