
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
object index2 extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/header("Human Information Processing Lab"))),format.raw/*1.44*/("""
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
    <form action=""""),_display_(Seq[Any](/*16.20*/routes/*16.26*/.Application.home())),format.raw/*16.45*/("""" method="post"> 
    <td width="200" align="center">
          <img src=""""),_display_(Seq[Any](/*18.22*/routes/*18.28*/.Assets.at("images/cstu.png"))),format.raw/*18.57*/(""""  width="80" height="80">
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
                    DATE: Thu Jan 30 15:19:58 ICT 2014
                    SOURCE: /Users/keepluck/HipLocal/app/views/index2.scala.html
                    HASH: 497655e0a014f1d249bc58234415470b31d8a37a
                    MATRIX: 865->1|928->43|1308->387|1323->393|1364->412|1475->487|1490->493|1541->522
                    LINES: 29->1|29->1|44->16|44->16|44->16|46->18|46->18|46->18
                    -- GENERATED --
                */
            