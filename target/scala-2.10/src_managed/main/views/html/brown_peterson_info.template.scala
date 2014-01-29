
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
object brown_peterson_info extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/header("Human Information Processing Lab :: Home Page"))),format.raw/*1.57*/("""
<body>

<!-- Page Header -->

    <div class="">
          <h3 class="hipTitle"align="center" >Human Information Processing Lab</h3>
         <!-- Page Header Menu-->
          <h6 align="center" class="topMenu">
               <a href="#">หน้าแรก</a>&nbsp; | &nbsp;
               <a href="about_hip.html">เกี่่ยวกับ HIP Lab</a>&nbsp; | &nbsp;
               <a href="#">ผลการทดลอง</a>
          </h6>
          <!-- Dashed line-->
          <div class="titleLine"></div>
    </div>

<!-- Content -->
<!-- Explanation -->
<div class="infoContainer">
    <div class="infoContent">
        <iframe src="STMBtIframe" frameborder="0" width="450" height="350"></iframe>
    </div>
    <!-- Right Panel -->  
    <div class="infoButton" >
        <div align="center">
            <img src=""""),_display_(Seq[Any](/*27.24*/routes/*27.30*/.Assets.at("images/brown_peterson.png"))),format.raw/*27.69*/("""" class="divPngInfo">
            <h6 class="marginWord">Brown Peterson</h6>
        </div>
        <!-- Buttons -->  
            <div class="infoButtonContainer">
              <div class="infoRedButton">
                <a href=""""),_display_(Seq[Any](/*33.27*/routes/*33.33*/.Application.home())),format.raw/*33.52*/("""" class=" btn btn-block btn-lg btn-danger"  ><span class="fui-arrow-left" ></span> ย้อนกลับ</a>  &nbsp; 
              </div>

              <div class="infoGreenButton">
                <a href="STMBtProc" class=" btn btn-block btn-lg btn-primary"><span class="fui-arrow-right"></span> อ่านขั้นตอนการทดลอง</a>
              </div>
            </div>
    </div>
</div>
"""),_display_(Seq[Any](/*42.2*/footer())),format.raw/*42.10*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jan 29 14:59:57 ICT 2014
                    SOURCE: /home/intouch/Desktop/myProject/hipLab/app/views/brown_peterson_info.scala.html
                    HASH: 3fae83504a9e0046e3f166a6f623de82b433f1e5
                    MATRIX: 878->1|954->56|1803->869|1818->875|1879->914|2154->1153|2169->1159|2210->1178|2624->1557|2654->1565
                    LINES: 29->1|29->1|55->27|55->27|55->27|61->33|61->33|61->33|70->42|70->42
                    -- GENERATED --
                */
            