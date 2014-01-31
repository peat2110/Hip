
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
object brown_peterson_exp extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[brownPeterson.Question,Integer,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(question : brownPeterson.Question,count : Integer):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.53*/("""
"""),_display_(Seq[Any](/*2.2*/header("Human Information Processing Lab :: Home Page"))),format.raw/*2.57*/("""
<body>

<!-- Page Header -->
    <div class="">
          <h3 class="hipTitle"align="center" >Human Information Processing Lab</h3>
          <!-- Dashed line-->
          <div class="titleLine"></div>
    </div>
<div class="brownPeterson"></div>
<!-- Content -->
<div class="questionBox">
      <div align="center" class="questionWord" id="word1" style="visibility:hidden">"""),_display_(Seq[Any](/*14.86*/question/*14.94*/.firstWord)),format.raw/*14.104*/("""</div>
      <div align="center" class="questionWord" id="word2" style="visibility:hidden">"""),_display_(Seq[Any](/*15.86*/question/*15.94*/.secondWord)),format.raw/*15.105*/("""</div>
      <div align="center" class="questionWord" id="word3" style="visibility:hidden">"""),_display_(Seq[Any](/*16.86*/question/*16.94*/.thirdWord)),format.raw/*16.104*/("""</div>
</div>
<div class="rabbitContainer">
  <div id="hopRabbit"class="rabbit"></div>
  <div id="cloud" class="clouds"></div>
  <div id="counter" class="counterText" align="center">"""),_display_(Seq[Any](/*21.57*/count)),format.raw/*21.62*/("""</div>
</div>
<div class="answerBox">
    
  <span class="headerBox">คำตอบ</span>
  <span class="headerNumberBox">ใส่ตัวเลข</span>
        <form action=""""),_display_(Seq[Any](/*27.24*/routes/*27.30*/.BrownPeterson.renderShortTermMemoryBrownPetersonTaskExp())),format.raw/*27.88*/("""" method="post">
          <input class="inputBox" id = "firstWord" name = "firstWord" type="text" placeholder="      คำตอบ" disabled />
          <input class="inputBox" id = "secondWord" name = "secondWord" type="text" placeholder="      คำตอบ" disabled />
          <input class="inputBox" id = "thirdWord" name = "thirdWord" type="text" placeholder="     คำตอบ"  disabled />
          <input class="inputNumberBox" id = "countdownResult" name = "countdownResult" type="text" placeholder="  เลข" disabled />
          <input class="inputNumberBox" id = "usedTime" name = "usedTime" type="text" disabled hidden/>
          <input type="submit" class="sbutton" disabled id="SubmitButton" value="ยืนยัน" onclick="return submitButtonClick()"/>
        </form>
</div>
"""),_display_(Seq[Any](/*36.2*/footer())),format.raw/*36.10*/("""
"""))}
    }
    
    def render(question:brownPeterson.Question,count:Integer): play.api.templates.HtmlFormat.Appendable = apply(question,count)
    
    def f:((brownPeterson.Question,Integer) => play.api.templates.HtmlFormat.Appendable) = (question,count) => apply(question,count)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Feb 01 00:10:11 ICT 2014
                    SOURCE: /Users/keepluck/HipLocal/app/views/brown_peterson_exp.scala.html
                    HASH: 63ceadd2589ca69c50169b93b444d4350312731a
                    MATRIX: 811->1|956->52|992->54|1068->109|1480->485|1497->493|1530->503|1658->595|1675->603|1709->614|1837->706|1854->714|1887->724|2106->907|2133->912|2323->1066|2338->1072|2418->1130|3220->1897|3250->1905
                    LINES: 26->1|29->1|30->2|30->2|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|49->21|49->21|55->27|55->27|55->27|64->36|64->36
                    -- GENERATED --
                */
            