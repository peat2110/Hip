
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

Seq[Any](format.raw/*1.1*/("""<html>
<head>
<meta http-equiv="Content-Language" content="th" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
<meta http-equiv="content-Type" content="text/html; charset=window-874"> 
<meta http-equiv="content-Type" content="text/html; charset=tis-620"> 
<!-- CSS link -->
    <link rel="stylesheet" type="text/css" href="..\Flat-UI-master\css\demo.css">
 	<link rel="stylesheet" type="text/css" href="..\Flat-UI-master\css\docs.css">
 	<link rel="stylesheet" type="text/css" href="..\Flat-UI-master\css\flat-ui.css">
 	<link rel="stylesheet" type="text/css" href="..\Flat-UI-master\css\scrollbar.css">
<!-- Title -->    
<title>Human Information Processing Lab :: Brown-Peterson</title>

</head>

<body>

<!-- Page Header -->
<center>

  <h3 style="color:#34495E; background:#BDC3C7; padding:20px 100px">Human Information Processing Lab</h3>
  <h6 style="font-size:large; font-family:Tahoma, 'Microsoft Sans Serif', AngsanaUPC, CordiaUPC">
       <a href="home.html">หน้าแรก</a>&nbsp; | &nbsp;
       <a href="about_hip.html">เกี่่ยวกับ HIP Lab</a>&nbsp; | &nbsp;
       <a href="#">ผลการทดลอง</a>
  </h6>
  <!-- Dashed line-->
  <h4 style="color:34495E;; padding:0px 100px 0px 0px; border-color:#BDC3C7; border-bottom-style:dashed;"></h4>


<!-- Content -->

<table>
<tr>
<td><iframe src="STMBtProcIframe" frameborder="0" width="750" height="350"></iframe></td></tr>

<tr>
<td align="right">
<br><a href="brown_peterson_info.html" class="btn btn-block btn-lg btn-danger" style="padding:10px 5px"><span class="fui-arrow-left"></span> ย้อนกลับ</a>  &nbsp; 
          <a href="#fakelink" class="btn btn-block btn-lg btn-success" style="padding:10px 80px"><span class="fui-play"></span>&nbsp; เริ่มการทดลอง</a>
<br>
</td>
</tr>
</table>




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
                    DATE: Sun Jan 26 18:37:40 ICT 2014
                    SOURCE: /home/intouch/Desktop/myProject/hipLab/app/views/brown_peterson_proc.scala.html
                    HASH: 4ab2a26800f5cbe99fab0ddfb3dfffbadb2bef02
                    MATRIX: 869->0
                    LINES: 29->1
                    -- GENERATED --
                */
            