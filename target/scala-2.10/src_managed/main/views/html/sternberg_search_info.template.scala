
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
object sternberg_search_info extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
<title>Human Information Processing Lab :: Sternberg Search</title>

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
<!-- Explanation -->
<td rowspan="2"><iframe src="iframe/sternberg_search_iframe.html" frameborder="0" width="450" height="350"></iframe></td>

<!-- Right Panel -->  
    <td align="center" style="padding-left:15px"><img src="../icon/sternberg_search.png" style="padding:20px 20px 20px 20px; height:120; width:120"><br><h6>Sternberg Search</h6></td>
<!-- Buttons -->  
  <tr>
      <td style="padding-left:15px"><a href="home.html" class="btn btn-block btn-lg btn-danger" style="padding:10px 5px"><span class="fui-arrow-left"></span> ย้อนกลับ</a>  &nbsp; 
          <a href="sternberg_search_proc.html" class="btn btn-block btn-lg btn-primary"><span class="fui-arrow-right"></span> อ่านขั้นตอนการทดลอง</a>
  </tr>
</td>
</tr>
</table>
          



<!-- Footer -->

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
                    DATE: Thu Jan 30 15:19:58 ICT 2014
                    SOURCE: /Users/keepluck/HipLocal/app/views/sternberg_search_info.scala.html
                    HASH: 1df7f568895a9d45d8a282d517a30f0739903f67
                    MATRIX: 871->0
                    LINES: 29->1
                    -- GENERATED --
                */
            