
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*8.51*/routes/*8.57*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*8.96*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*9.51*/routes/*9.57*/.Assets.at("stylesheets/demo.css "))),format.raw/*9.92*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*10.51*/routes/*10.57*/.Assets.at("stylesheets/docs.css "))),format.raw/*10.92*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*11.51*/routes/*11.57*/.Assets.at("stylesheets/flat-ui.css "))),format.raw/*11.95*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*12.51*/routes/*12.57*/.Assets.at("stylesheets/scrollbar.css "))),format.raw/*12.97*/("""">
<!-- Title -->    
<title>Human Information Processing Lab :: Login</title>

</head>

<body>

<!-- Page Header -->
<center>

  <h3 style="color:#34495E; background:#BDC3C7; padding:20px 100px">Human Information Processing Lab</h3>
   <h4 style="color:#34495E; padding:10px 100px; border-color:#BDC3C7; border-bottom-style:dashed;"></h4>

<!-- Login -->
  <br><br>

<!-- Login Left Panel -->
  <table>
    <tr>
    <form action=""""),_display_(Seq[Any](/*32.20*/routes/*32.26*/.Application.home())),format.raw/*32.45*/("""" method="post"> 
    <td width="200" align="center">
          <img src=""""),_display_(Seq[Any](/*34.22*/routes/*34.28*/.Assets.at("images/cstu.png"))),format.raw/*34.57*/(""""  width="80" height="80">
         <br><br>
         <h4 class="tile-title">Hello and welcome!</h4>
         <small style="font-size:14px;">Type-in your username and password to login</small>
    </td>

<!-- Login Right Panel -->
    <td width="325" align="center">
    
<!-- Login Right Panel : Gray BG -->
        <div class="login-form">
            
<!-- Login Right Panel : Username form --> 
            <div class="form-group">
              <input name="username" style="padding:10px 38px;" type="text" class="form-control login-field" value="" placeholder="Username" id="login-name">
              <label class="login-field-icon fui-user" for="login-name"></label>
            </div>
            
<!-- Login Right Panel : Password form --> 
            <div class="form-group">
              <input name="password" style="padding:10px 38px;" type="password" class="form-control login-field" value="" placeholder="Password" id="login-pass">
              <label class="login-field-icon fui-lock" for="login-pass"></label>
            </div>

<!-- Login Right Panel : Login Button -->           
          <br>            <br>             <br>
                     
           <button class="btn btn-block  btn-lg btn-success" type="submit"> 
            Login
            </button> 
           
      </div>
        </div>
      </div>
    </td>
    </form>
    </tr>
</table>
<br><br>
<h4 style="color:#34495E; padding:10px 100px; border-color:#BDC3C7; border-top-style:dashed;"></h4>
<div style="color:#34495E; background:#BDC3C7; padding:20px 100px">
<small >Faculty of Science and Technology, Thammasat University</small> <br>


</body>
</html>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 13 15:05:35 ICT 2014
                    SOURCE: /home/intouch/Desktop/myProject/Hip/app/views/index.scala.html
                    HASH: d89128ca582e84078a9c327bbaffd32c4a97eade
                    MATRIX: 855->0|1245->355|1259->361|1319->400|1408->454|1422->460|1478->495|1568->549|1583->555|1640->590|1730->644|1745->650|1805->688|1895->742|1910->748|1972->788|2460->1240|2475->1246|2516->1265|2629->1342|2644->1348|2695->1377
                    LINES: 29->1|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|60->32|60->32|60->32|62->34|62->34|62->34
                    -- GENERATED --
                */
            