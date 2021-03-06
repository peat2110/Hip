
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
  <div id="cloud" class="clouds"></div>
  <div id="counter" class="counterText" align="center"></div>
</div>
<div class="answerBox">
    
  <span class="headerBox">คำตอบ</span>
  <span class="headerNumberBox">ใส่ตัวเลข</span>
        <form>
          <input class="inputBox" id = "text1" type="text" placeholder="      คำตอบ" disabled />
          <input class="inputBox" id = "text2" type="text" placeholder="      คำตอบ" disabled />  
          <input class="inputBox"id = "text3" type="text" placeholder="      คำตอบ" disabled />
          <input class="inputNumberBox" id = "text4" type="text" placeholder="  เลข" disabled />

          <input type="submit" class="sbutton" disabled name="Submit" value="ยืนยัน" />
        </form>
</div>
"""),_display_(Seq[Any](/*35.2*/footer())),format.raw/*35.10*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jan 29 16:53:42 ICT 2014
                    SOURCE: /home/intouch/Desktop/myProject/hipLab/app/views/brown_peterson_exp.scala.html
                    HASH: 6115dd5a1132b51e47e0de64ad436347611eb9cc
                    MATRIX: 877->1|953->56|2283->1351|2313->1359
                    LINES: 29->1|29->1|63->35|63->35
                    -- GENERATED --
                */
            