
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
object brown_peterson_proc_iframe extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/header("Human Information Processing Lab :: Home Page"))),format.raw/*1.57*/("""
<body>

<!-- Page Header -->
<div class="iframeContent" >
    <p><u>Brown – Peterson Task</u></p>
    <p>การทดลองนี้จะทดสอบความทรงจำระยะสั้น โดยมีขั้นตอนดังนี้</p>
    <ol>
    <li> โจทย์กำหนดคำมาให้ซึ่งอาจจะมีความหมายหรือไม่ก็ได้ </li>
    <li>  โจทย์จะหายไป </li>
    <li>  มีตัวเลขปรากฏขึ้นมา 1 ตัว  </li>
    <li>  ตัวเลขนั้นจะหายไป  </li>
    <li>  ให้ท่านนับถอยหลังทีละ 3 ทุก ๆ ครั้งที่แฟลชขึ้น  (เช่น 20 , 17 ,14 ,11 , 8) จนกว่าจะมีช่องคำตอบ </li>
    <li>  เมื่อช่องคำตอบปรากฏขึ้นมา 2 ช่อง ให้ท่านตอบทั้งคำในข้างต้น และตัวเลขสุดท้ายที่นับได้ </li>
    </ol>
</div>

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
                    SOURCE: /Users/keepluck/HipLocal/app/views/iframe/brown_peterson_proc_iframe.scala.html
                    HASH: 1ea34f47f23cf42e72b145dc3ee37a94657af9a6
                    MATRIX: 892->1|968->56
                    LINES: 29->1|29->1
                    -- GENERATED --
                */
            