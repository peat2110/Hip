
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
object template_no_top_menu extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<html>
<head>
<meta http-equiv="Content-Language" content="th" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
<meta http-equiv="content-Type" content="text/html; charset=window-874"> 
<meta http-equiv="content-Type" content="text/html; charset=tis-620"> 
<!-- CSS link -->
    <link rel="stylesheet" type="text/css" href="..\Flat-UI-master\css\demo.css">
 	<link rel="stylesheet" type="text/css" href="..\Flat-UI-master\css\docs.css">
 	<link rel="stylesheet" type="text/css" href="..\Flat-UI-master\css\flat-ui.css">
 	<link rel="stylesheet" type="text/css" href="..\Flat-UI-master\css\scrollbar.css">
<!-- Title -->    
<title>Human Information Processing Lab ::</title>

</head>

<body>

<!-- Page Header -->
<center>

  <h3 style="color:#34495E; background:#BDC3C7; padding:20px 100px">Human Information Processing Lab</h3>

  <!-- Dashed line-->
  <h4 style="color:34495E;; padding:25px 100px 0px 0px; border-color:#BDC3C7; border-bottom-style:dashed;"></h4>


<!-- Content -->






<!-- Footer -->
<br>
<h4 style="color:#34495E; padding:10px 100px; border-color:#BDC3C7; border-top-style:dashed;"></h4>
<div style="color:#34495E; background:#BDC3C7; padding:20px 100px">
<normal >Department of Computer Science</normal> <br>
<small >Faculty of Science and Technology, Thammasat University</small> <br>


</body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 30 15:19:58 ICT 2014
                    SOURCE: /Users/keepluck/HipLocal/app/views/template_no_top_menu.scala.html
                    HASH: b60ec41d5ab6ca846848d9eec9d6518082bd2004
                    MATRIX: 870->0
                    LINES: 29->1
                    -- GENERATED --
                */
            