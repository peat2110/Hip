// @SOURCE:/Users/keepluck/HipLocal/conf/routes
// @HASH:ede59803257b45b0da89738ade6e7983be146067
// @DATE:Thu Jan 30 15:19:54 ICT 2014


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
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_home1 = Route("POST", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Application_perceptionSignalDetection2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("PSD"))))
        

// @LINE:9
private[this] lazy val controllers_Application_perceptionChangeBlindness3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("PCB"))))
        

// @LINE:10
private[this] lazy val controllers_Application_perceptionChangeBlindnessIframe4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("PCBIframe"))))
        

// @LINE:11
private[this] lazy val controllers_Application_perceptionChangeBlindnessProc5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("PCBProc"))))
        

// @LINE:12
private[this] lazy val controllers_Application_perceptionChangeBlindnessProcIframe6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("PCBProcIframe"))))
        

// @LINE:13
private[this] lazy val controllers_BrownPeterson_renderShortTermMemoryBrownPetersonTaskProc7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("STMBtProc"))))
        

// @LINE:14
private[this] lazy val controllers_BrownPeterson_renderShortTermMemoryBrownPetersonTaskProcIframe8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("STMBtProcIframe"))))
        

// @LINE:15
private[this] lazy val controllers_BrownPeterson_renderShortTermMemoryBrownPetersonTask9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("STMBt"))))
        

// @LINE:16
private[this] lazy val controllers_BrownPeterson_renderShortTermMemoryBrownPetersonTaskIframe10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("STMBtIframe"))))
        

// @LINE:17
private[this] lazy val controllers_BrownPeterson_renderShortTermMemoryBrownPetersonTaskExp11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("STMBtExp"))))
        

// @LINE:20
private[this] lazy val controllers_Assets_at12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""POST""", prefix,"""controllers.Application.home()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """PSD""","""controllers.Application.perceptionSignalDetection()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """PCB""","""controllers.Application.perceptionChangeBlindness()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """PCBIframe""","""controllers.Application.perceptionChangeBlindnessIframe()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """PCBProc""","""controllers.Application.perceptionChangeBlindnessProc()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """PCBProcIframe""","""controllers.Application.perceptionChangeBlindnessProcIframe()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """STMBtProc""","""controllers.BrownPeterson.renderShortTermMemoryBrownPetersonTaskProc()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """STMBtProcIframe""","""controllers.BrownPeterson.renderShortTermMemoryBrownPetersonTaskProcIframe()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """STMBt""","""controllers.BrownPeterson.renderShortTermMemoryBrownPetersonTask()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """STMBtIframe""","""controllers.BrownPeterson.renderShortTermMemoryBrownPetersonTaskIframe()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """STMBtExp""","""controllers.BrownPeterson.renderShortTermMemoryBrownPetersonTaskExp()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_home1(params) => {
   call { 
        invokeHandler(controllers.Application.home(), HandlerDef(this, "controllers.Application", "home", Nil,"POST", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Application_perceptionSignalDetection2(params) => {
   call { 
        invokeHandler(controllers.Application.perceptionSignalDetection(), HandlerDef(this, "controllers.Application", "perceptionSignalDetection", Nil,"GET", """""", Routes.prefix + """PSD"""))
   }
}
        

// @LINE:9
case controllers_Application_perceptionChangeBlindness3(params) => {
   call { 
        invokeHandler(controllers.Application.perceptionChangeBlindness(), HandlerDef(this, "controllers.Application", "perceptionChangeBlindness", Nil,"GET", """""", Routes.prefix + """PCB"""))
   }
}
        

// @LINE:10
case controllers_Application_perceptionChangeBlindnessIframe4(params) => {
   call { 
        invokeHandler(controllers.Application.perceptionChangeBlindnessIframe(), HandlerDef(this, "controllers.Application", "perceptionChangeBlindnessIframe", Nil,"GET", """""", Routes.prefix + """PCBIframe"""))
   }
}
        

// @LINE:11
case controllers_Application_perceptionChangeBlindnessProc5(params) => {
   call { 
        invokeHandler(controllers.Application.perceptionChangeBlindnessProc(), HandlerDef(this, "controllers.Application", "perceptionChangeBlindnessProc", Nil,"GET", """""", Routes.prefix + """PCBProc"""))
   }
}
        

// @LINE:12
case controllers_Application_perceptionChangeBlindnessProcIframe6(params) => {
   call { 
        invokeHandler(controllers.Application.perceptionChangeBlindnessProcIframe(), HandlerDef(this, "controllers.Application", "perceptionChangeBlindnessProcIframe", Nil,"GET", """""", Routes.prefix + """PCBProcIframe"""))
   }
}
        

// @LINE:13
case controllers_BrownPeterson_renderShortTermMemoryBrownPetersonTaskProc7(params) => {
   call { 
        invokeHandler(controllers.BrownPeterson.renderShortTermMemoryBrownPetersonTaskProc(), HandlerDef(this, "controllers.BrownPeterson", "renderShortTermMemoryBrownPetersonTaskProc", Nil,"GET", """""", Routes.prefix + """STMBtProc"""))
   }
}
        

// @LINE:14
case controllers_BrownPeterson_renderShortTermMemoryBrownPetersonTaskProcIframe8(params) => {
   call { 
        invokeHandler(controllers.BrownPeterson.renderShortTermMemoryBrownPetersonTaskProcIframe(), HandlerDef(this, "controllers.BrownPeterson", "renderShortTermMemoryBrownPetersonTaskProcIframe", Nil,"GET", """""", Routes.prefix + """STMBtProcIframe"""))
   }
}
        

// @LINE:15
case controllers_BrownPeterson_renderShortTermMemoryBrownPetersonTask9(params) => {
   call { 
        invokeHandler(controllers.BrownPeterson.renderShortTermMemoryBrownPetersonTask(), HandlerDef(this, "controllers.BrownPeterson", "renderShortTermMemoryBrownPetersonTask", Nil,"GET", """""", Routes.prefix + """STMBt"""))
   }
}
        

// @LINE:16
case controllers_BrownPeterson_renderShortTermMemoryBrownPetersonTaskIframe10(params) => {
   call { 
        invokeHandler(controllers.BrownPeterson.renderShortTermMemoryBrownPetersonTaskIframe(), HandlerDef(this, "controllers.BrownPeterson", "renderShortTermMemoryBrownPetersonTaskIframe", Nil,"GET", """""", Routes.prefix + """STMBtIframe"""))
   }
}
        

// @LINE:17
case controllers_BrownPeterson_renderShortTermMemoryBrownPetersonTaskExp11(params) => {
   call { 
        invokeHandler(controllers.BrownPeterson.renderShortTermMemoryBrownPetersonTaskExp(), HandlerDef(this, "controllers.BrownPeterson", "renderShortTermMemoryBrownPetersonTaskExp", Nil,"GET", """""", Routes.prefix + """STMBtExp"""))
   }
}
        

// @LINE:20
case controllers_Assets_at12(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     