
package views.html.iframe

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
object brown_peterson_iframe extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/header("Human Information Processing Lab :: Home Page"))),format.raw/*1.57*/("""
<body>

<!-- Page Header -->
<div class="iframeContent" >

<p>Brown-Peterson Task ศึกษาเรื่องความสามารถในการจำข้อมูลรูปแบบต่าง ๆ เช่น อักษรไร้ความหมาย คำ ตัวเลข สี รูป โดยมีกระบวนการทางความคิดอื่น ๆ เข้ามารบกวน เช่น การคำนวณตัวเลข
</p>

<div >
<p>อ้างอิง</p>

<p>
Peterson, L. R. and Peterson, M. J. (1959). Short-Term Retention of Individual Verbal Items. Journal of Experimental Psychology, 58 (3), pp.193-198.</p>

</div>

<br>

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
                    SOURCE: /Users/keepluck/HipLocal/app/views/iframe/brown_peterson_iframe.scala.html
                    HASH: 0a4514a44476c4dbef278bd8c9aedfcde5ae9be4
                    MATRIX: 887->1|963->56
                    LINES: 29->1|29->1
                    -- GENERATED --
                */
            