
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
object brown_peterson_exp extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[brownPeterson.Question],Integer,Form[brownPeterson.Answer],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(questions : List[brownPeterson.Question],count : Integer,answerForm : Form[brownPeterson.Answer]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.100*/("""
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
      <div align="center" class="questionWord" id="word1"></div>
      <div align="center" class="questionWord" id="word2"></div>
      <div align="center" class="questionWord" id="word3"></div>
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
          <input class="inputBox" id = "text1" name = "firstWord" type="text" placeholder="      คำตอบ" disabled />
          <input class="inputBox" id = "text2" name = "secondWord" type="text" placeholder="      คำตอบ" disabled />
          <input class="inputBox" id = "text3" name = "thirdWord" type="text" placeholder="     คำตอบ" value="assh" disabled />
          <input class="inputNumberBox" id = "text4" name = "countdownResult" type="text" placeholder="  เลข" disabled />
          <input class="inputBox" id = "text5" name = "usedTime" type="text" disabled />
          <input type="submit" class="sbutton" disabled id="SubmitButton" value="ยืนยัน" onclick="return submitButtonClick()"/>
        </form>
</div>
"""),_display_(Seq[Any](/*36.2*/footer())),format.raw/*36.10*/("""
"""))}
    }
    
    def render(questions:List[brownPeterson.Question],count:Integer,answerForm:Form[brownPeterson.Answer]): play.api.templates.HtmlFormat.Appendable = apply(questions,count,answerForm)
    
    def f:((List[brownPeterson.Question],Integer,Form[brownPeterson.Answer]) => play.api.templates.HtmlFormat.Appendable) = (questions,count,answerForm) => apply(questions,count,answerForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 30 22:14:09 ICT 2014
                    SOURCE: /Users/keepluck/HipLocal/app/views/brown_peterson_exp.scala.html
                    HASH: fdef07acadeb9536c77ae5db3aa7f436f88a93dc
                    MATRIX: 844->1|1037->99|1073->101|1149->156|1847->818|1874->823|2064->977|2079->983|2159->1041|2935->1782|2965->1790
                    LINES: 26->1|29->1|30->2|30->2|49->21|49->21|55->27|55->27|55->27|64->36|64->36
                    -- GENERATED --
                */
            