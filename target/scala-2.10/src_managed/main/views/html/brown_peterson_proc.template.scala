
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
object brown_peterson_proc extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
<div class="procNotification">
    <h6 align="center"> ผลการทดลองที่ได้ไม่ได้ระบุถึงความสามารถหรือIQแต่แสดงให้เห็นว่าการประมวลสารสนเทศของมนุษย์สามารถได้รับอิทธิพลจากสิ่งเร้าหลายรูปแบบ </h6>
</div> 
<div class="procBody">
        <iframe src="STMBtProcIframe" class="procContent" frameborder="0" ></iframe>
    <div class="procButtonContainer">
         <div class="procButtonRed">
             <a href="STMBt" class="btn btn-block btn-lg btn-danger" ><span class="fui-arrow-left"></span> ย้อนกลับ</a>  &nbsp; 
         </div>
         <div class="procButtonGreen">
             <a href="STMBtExp" class="btn btn-block btn-lg btn-success" ><span class="fui-play"></span>&nbsp; เริ่มการทดลอง</a>
         </div>
    </div>
</div>
"""),_display_(Seq[Any](/*32.2*/footer())),format.raw/*32.10*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 30 15:19:58 ICT 2014
                    SOURCE: /Users/keepluck/HipLocal/app/views/brown_peterson_proc.scala.html
                    HASH: efc8e3a391157d90c6456bd8902827202dc45802
                    MATRIX: 878->1|954->56|2251->1318|2281->1326
                    LINES: 29->1|29->1|60->32|60->32
                    -- GENERATED --
                */
            