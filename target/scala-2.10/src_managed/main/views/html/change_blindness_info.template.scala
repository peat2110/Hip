
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
object change_blindness_info extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
        <iframe src="PCBIframe" frameborder="0" width="450" height="350"></iframe>
    </div>
    <!-- Right Panel -->  
    <div class="infoButton" >
        <img src=""""),_display_(Seq[Any](/*26.20*/routes/*26.26*/.Assets.at("images/change_blindness.png"))),format.raw/*26.67*/("""" class="divPngInfo"><h6 class="marginWord">Signal Detection</h6>
    <!-- Buttons -->  
      
          <a href=""""),_display_(Seq[Any](/*29.21*/routes/*29.27*/.Application.home())),format.raw/*29.46*/("""" class="btn btn-block btn-lg btn-danger"  ><span class="fui-arrow-left" ></span> ย้อนกลับ</a>  &nbsp; 
          <a href="PCBProc" class="btn btn-block btn-lg btn-primary"><span class="fui-arrow-right"></span> อ่านขั้นตอนการทดลอง</a>
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
                    DATE: Thu Jan 30 15:19:58 ICT 2014
                    SOURCE: /Users/keepluck/HipLocal/app/views/change_blindness_info.scala.html
                    HASH: e5d00c804f39dbca21c29999782b8a02bb896ef9
                    MATRIX: 880->1|956->56|1769->833|1784->839|1847->880|2002->999|2017->1005|2058->1024|2351->1282|2381->1290
                    LINES: 29->1|29->1|54->26|54->26|54->26|57->29|57->29|57->29|61->33|61->33
                    -- GENERATED --
                */
            