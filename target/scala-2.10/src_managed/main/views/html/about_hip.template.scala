
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
object about_hip extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/header("Human Information Processing Lab :: About HIP"))),format.raw/*1.57*/("""

<body>

<!-- Page Header -->
<center>

  <h3 style="color:#34495E; background:#BDC3C7; padding:20px 100px">Human Information Processing Lab</h3>
  <h6 style="font-size:large; font-family:Tahoma, 'Microsoft Sans Serif', AngsanaUPC, CordiaUPC">
       <a href="home.html">หน้าแรก</a>&nbsp; | &nbsp;
       <a href="#">เกี่่ยวกับ HIP Lab</a>&nbsp; | &nbsp;
       <a href="#">ผลการทดลอง</a>
  </h6>
  <!-- Dashed line-->
  <h4 style="color:34495E;; padding:0px 100px 0px 0px; border-color:#BDC3C7; border-bottom-style:dashed;"></h4>


<!-- Content -->


<iframe src="iframe/about_hip_iframe.html" frameborder="0" width="750" height="350"></iframe>



<!-- Footer -->
<br>
<h4 style="color:#34495E; padding:10px 100px; border-color:#BDC3C7; border-top-style:dashed;"></h4>
<div style="color:#34495E; background:#BDC3C7; padding:20px 100px">
<normal >Department of Computer Science</normal> <br>
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
                    DATE: Wed Jan 15 18:32:06 ICT 2014
                    SOURCE: /home/intouch/Desktop/myProject/hipLab/app/views/about_hip.scala.html
                    HASH: 0ed8091c6a571fb3aebb364734b4c92ef8264982
                    MATRIX: 868->1|944->56
                    LINES: 29->1|29->1
                    -- GENERATED --
                */
            