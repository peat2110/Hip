
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
object brown_peterson_exp extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/header("Human Information Processing Lab :: Home Page"))),format.raw/*1.57*/("""
<body>

<!-- Page Header -->
    <div class="">
          <h3 class="hipTitle"align="center" >Human Information Processing Lab</h3>
          <!-- Dashed line-->
          <div class="titleLine"></div>
    </div>

<!-- Content -->
<div class="questionBox">
      <div align="center" class="questionWord" id="word1">1234567890</div>
      <div align="center" class="questionWord" id="word2">123</div>
      <div align="center" class="questionWord" id="word3">123456</div>
</div>
<div class="rabbitContainer">
  <div id="hopRabbit"class="rabbit"></div>
  <div id="counter" class="questionWord" align="center"></div>
</div>
<div class="answerBox">
    <h5> คำตอบ </h5>
        <form>
          <input id = "text1" type="text" placeholder="คำที่ 1" disabled />
          <input id = "text2" type="text" placeholder="คำที่ 2" disabled />  
          <input id = "text3" type="text" placeholder="คำที่ 3" disabled />
          <input id = "submitButton" type="submit" disabled />
        </form>
</div>
"""),_display_(Seq[Any](/*30.2*/footer())),format.raw/*30.10*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 28 17:37:44 ICT 2014
                    SOURCE: /home/intouch/Desktop/myProject/hipLab/app/views/brown_peterson_exp.scala.html
                    HASH: ae2f00084ff80b8a16fb1c2461c9f2bf87e30005
                    MATRIX: 877->1|953->56|1987->1055|2017->1063
                    LINES: 29->1|29->1|58->30|58->30
                    -- GENERATED --
                */
            