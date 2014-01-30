
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
object change_blindness_iframe extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/header("Human Information Processing Lab :: Home Page"))),format.raw/*1.57*/("""
<body>

<!-- Page Header -->
<div class="iframeContent" >

<p>Change Blindness ทำการศึกษาความสามารถในการมองเห็นการเปลี่ยนแปลงในสภาพแวดล้อมและวัตถุ</p>


<div>
<p>อ้างอิง</p>
<br>
<br>
<p>
Matlin, M.W. (2009). Cognitive Psychology. John Wiley & Sons.</p>

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
                    SOURCE: /Users/keepluck/HipLocal/app/views/iframe/change_blindness_iframe.scala.html
                    HASH: 6b463d3ff89b43058906e1a5a74a118830756256
                    MATRIX: 889->1|965->56
                    LINES: 29->1|29->1
                    -- GENERATED --
                */
            