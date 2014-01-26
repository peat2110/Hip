
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
        <img src=""""),_display_(Seq[Any](/*26.20*/routes/*26.26*/.Assets.at("images/brown_peterson.png"))),format.raw/*26.65*/("""" class="divPngInfo"><h6 class="marginWord">Brown Peterson</h6>
    <!-- Buttons -->  
      
          <a href=""""),_display_(Seq[Any](/*29.21*/routes/*29.27*/.Application.home())),format.raw/*29.46*/("""" class="btn btn-block btn-lg btn-danger"  ><span class="fui-arrow-left" ></span> ย้อนกลับ</a>  &nbsp; 
          <a href="STMBtProc" class="btn btn-block btn-lg btn-primary"><span class="fui-arrow-right"></span> อ่านขั้นตอนการทดลอง</a>
    </div>
</div>
"""),_display_(Seq[Any](/*33.2*/footer())),format.raw/*33.10*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jan 26 18:27:50 ICT 2014
                    SOURCE: /home/intouch/Desktop/myProject/hipLab/app/views/brown_peterson_info.scala.html
                    HASH: 42d01d6efdf9e32666353d5690d2c7a9d00321ea
                    MATRIX: 878->1|954->56|1769->835|1784->841|1845->880|1998->997|2013->1003|2054->1022|2349->1282|2379->1290
                    LINES: 29->1|29->1|54->26|54->26|54->26|57->29|57->29|57->29|61->33|61->33
                    -- GENERATED --
                */
            