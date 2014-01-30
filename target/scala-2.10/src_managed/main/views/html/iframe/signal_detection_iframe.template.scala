
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
object signal_detection_iframe extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
<title>Human Information Processing Lab :: Login</title>

</head>

<body>

<!-- Page Header -->
<div style="background-color:#ECF0F1; font-family:Tahoma, 'Microsoft Sans Serif', AngsanaUPC, CordiaUPC" >

<br>
<p>Signal Detection ทำการศึกษาเรื่องความสามารถในการตรวจจับรูปแบบ (Signal) ซึ่งปะปนอยู่ในสารสนเทศ 
รวมไปถึงการระบุว่า ในสารสนเทศที่รับรู้นั้น มี Signal ปนอยู่หรือไม่</p>
<p>การศึกษาเรื่อง Signal Detection นั้น มีความสำคัญต่อศาสตร์อื่น ๆ ที่ต้องอาศัยการตรวจจับรูปแบบแปลกปลอมต่าง ๆ เช่น
รังสีวิทยา  ระบบเรดาร์  และการตรวจหาสาเหตุต่าง ๆ  
</p>

<br><br>
<div style="font-size:15px">
<p>อ้างอิง</p>

<ul>
Heeger, D. (1997). Signal Detection.
Available online at http://www.cns.nyu.edu/~david/handouts/sdt-advanced.pdf</ul>

<ul>LU, Z. and Eskew R. T. Jr. (2007). A Special Issue on Applications of Signal Detection Theory to Visual Perception. 
Spatial Vision, 20 (1-2). Available on at http://lobes.osu.edu/Journals/SptVis07.pdf</ul>

<ul>Bohil, C.J., Szalma, J.L., & Hancock, P.A. (in press).  
Psychophysical methods and signal detection: Recent advances in theory. In: R.R. Hoffman, P.A. Hancock, M.W. Scerbo, J.L. Szalma, and R. Parasuraman (Eds.),
 The Cambridge handbook of applied perception.  Cambridge: Cambridge University Press.</ul>
</div>

<br>







</body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 30 15:19:58 ICT 2014
                    SOURCE: /Users/keepluck/HipLocal/app/views/iframe/signal_detection_iframe.scala.html
                    HASH: 22f005b1dc6a9b58672276a7846870f4820359d8
                    MATRIX: 880->0
                    LINES: 29->1
                    -- GENERATED --
                */
            