
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
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*12.51*/routes/*12.57*/.Assets.at("stylesheets/rabbit.css "))),format.raw/*12.94*/("""">
    <title>"""),_display_(Seq[Any](/*13.13*/title)),format.raw/*13.18*/("""</title>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src=""""),_display_(Seq[Any](/*16.15*/routes/*16.21*/.Assets.at("javascripts/main.js"))),format.raw/*16.54*/(""""></script>
<script src=""""),_display_(Seq[Any](/*17.15*/routes/*17.21*/.Assets.at("javascripts/brownPetersonExperiment.js"))),format.raw/*17.73*/(""""></script>
</head>
"""))}
    }
    
    def render(title:String): play.api.templates.HtmlFormat.Appendable = apply(title)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (title) => apply(title)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 28 21:02:02 ICT 2014
                    SOURCE: /home/intouch/Desktop/myProject/hipLab/app/views/header.scala.html
                    HASH: 205de14332884d3060e6949d3797aab0cf9cd8f2
                    MATRIX: 775->1|884->16|1073->170|1087->176|1147->215|1235->268|1249->274|1305->309|1393->362|1407->368|1463->403|1551->456|1565->462|1624->500|1713->553|1728->559|1790->599|1879->652|1894->658|1951->693|2040->746|2055->752|2114->789|2165->804|2192->809|2341->922|2356->928|2411->961|2473->987|2488->993|2562->1045
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|44->16|44->16|44->16|45->17|45->17|45->17
                    -- GENERATED --
                */
            