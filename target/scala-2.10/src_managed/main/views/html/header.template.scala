
package views.html

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
/**/
object header extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title :String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*6.51*/routes/*6.57*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*6.96*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*7.51*/routes/*7.57*/.Assets.at("stylesheets/demo.css "))),format.raw/*7.92*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*8.51*/routes/*8.57*/.Assets.at("stylesheets/docs.css "))),format.raw/*8.92*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*9.51*/routes/*9.57*/.Assets.at("stylesheets/flat-ui.css "))),format.raw/*9.95*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*10.51*/routes/*10.57*/.Assets.at("stylesheets/scrollbar.css "))),format.raw/*10.97*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*11.51*/routes/*11.57*/.Assets.at("stylesheets/main.css "))),format.raw/*11.92*/("""">
    <title>"""),_display_(Seq[Any](/*12.13*/title)),format.raw/*12.18*/("""</title>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src=""""),_display_(Seq[Any](/*15.15*/routes/*15.21*/.Assets.at("javascripts/main.js"))),format.raw/*15.54*/(""""></script>

</head>
"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 20 16:56:48 ICT 2014
                    SOURCE: /home/intouch/Desktop/myProject/hipLab/app/views/header.scala.html
                    HASH: 3b2bfa81f428df4cb9773a72dd1c2fefa0df7fd9
                    MATRIX: 775->1|884->16|1073->170|1087->176|1147->215|1235->268|1249->274|1305->309|1393->362|1407->368|1463->403|1551->456|1565->462|1624->500|1713->553|1728->559|1790->599|1879->652|1894->658|1951->693|2002->708|2029->713|2178->826|2193->832|2248->865
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|43->15|43->15|43->15
                    -- GENERATED --
                */
            