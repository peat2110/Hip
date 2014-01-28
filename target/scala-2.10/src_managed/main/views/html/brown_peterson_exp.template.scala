
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
<div class="answerBox">
    <h5> คำตอบ </h5>
        <form>
          <input type="text" placeholder="คำที่ 1" disabled />
          <input type="text" placeholder="คำที่ 2" disabled />  
          <input type="text" placeholder="คำที่ 3" disabled />
        </form>
</div>
"""),_display_(Seq[Any](/*20.2*/footer())),format.raw/*20.10*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 27 16:52:04 ICT 2014
                    SOURCE: /home/intouch/Desktop/myProject/hipLab/app/views/brown_peterson_exp.scala.html
                    HASH: e48cddf5b6f75bc9ae639ca9fc4753a0f771db02
                    MATRIX: 877->1|953->56|1495->563|1525->571
                    LINES: 29->1|29->1|48->20|48->20
                    -- GENERATED --
                */
            