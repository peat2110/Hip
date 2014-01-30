
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

Seq[Any](_display_(Seq[Any](/*1.2*/header("Human Information Processing Lab"))),format.raw/*1.44*/("""
<body>

<!-- Page Header -->

  <h3 class="hipTitle"align="center" >Human Information Processing Lab</h3>
   <h4 class="titleLine"></h4>

<!-- Login -->
  <br><br>
<div class="middle">
<!-- Login Left Panel -->
    <div class="cstuIcon"  align="center">
          <img src=""""),_display_(Seq[Any](/*14.22*/routes/*14.28*/.Assets.at("images/cstu.png"))),format.raw/*14.57*/(""""  width="80" height="80">
         <br><br>
         <h4 class="tile-title">Hello and welcome!</h4>
         <small style="font-size:14px;">Type-in your username and password to login</small>
    </div >

<!-- Login Right Panel -->
<!-- Login Right Panel : Gray BG -->
        <div   class="loginI login-form ">
            
<!-- Login Right Panel : Username form --> 

            <form action=""""),_display_(Seq[Any](/*26.28*/routes/*26.34*/.Application.home())),format.raw/*26.53*/("""" method="post"> 
            <div class="form-group">
              <input name="username" style="padding:10px 38px;" type="text" class="form-control login-field login-name" value="" placeholder="Username">
              <label class="login-field-icon fui-user" for="login-name"></label>
            </div>
            
<!-- Login Right Panel : Password form --> 
            <div class="form-group">
              <input name="password" style="padding:10px 38px;" type="password" class="form-control login-field login-pass" value="" placeholder="Password" >
              <label class="login-field-icon fui-lock" for="login-pass"></label>
            </div>

<!-- Login Right Panel : Login Button -->           
          <br> 
                     
           <button class="btn btn-block btn-lg btn-success" type="submit"> 
            Login
            </button> 
            </form>
      </div>
</div>
"""),_display_(Seq[Any](/*47.2*/footer())),format.raw/*47.10*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 30 15:19:58 ICT 2014
                    SOURCE: /Users/keepluck/HipLocal/app/views/index.scala.html
                    HASH: ffc2d8865592aa4e6c7413258be3231bfb755d43
                    MATRIX: 864->1|927->43|1252->332|1267->338|1318->367|1764->777|1779->783|1820->802|2786->1733|2816->1741
                    LINES: 29->1|29->1|42->14|42->14|42->14|54->26|54->26|54->26|75->47|75->47
                    -- GENERATED --
                */
            