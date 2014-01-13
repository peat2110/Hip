
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
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user :User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.14*/("""
<html>
<head>
<meta http-equiv="Content-Language" content="th" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
<meta http-equiv="content-Type" content="text/html; charset=window-874"> 
<meta http-equiv="content-Type" content="text/html; charset=tis-620"> 
<!-- CSS link -->
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*9.51*/routes/*9.57*/.Assets.at("stylesheets/demo.css "))),format.raw/*9.92*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*10.51*/routes/*10.57*/.Assets.at("stylesheets/main.css "))),format.raw/*10.92*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*11.51*/routes/*11.57*/.Assets.at("stylesheets/docs.css "))),format.raw/*11.92*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*12.51*/routes/*12.57*/.Assets.at("stylesheets/flat-ui.css "))),format.raw/*12.95*/("""">
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*13.51*/routes/*13.57*/.Assets.at("stylesheets/scrollbar.css "))),format.raw/*13.97*/("""">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js">
</script>

<!-- Slide Image script -->
<script> 
$(document).ready(function()"""),format.raw/*19.29*/("""{"""),format.raw/*19.30*/("""
  $("#slide01").click(function()"""),format.raw/*20.33*/("""{"""),format.raw/*20.34*/("""
    $("#panel02").slideUp("fast");
	$("#panel03").slideUp("fast");
	$("#panel01").slideToggle("fast");
  """),format.raw/*24.3*/("""}"""),format.raw/*24.4*/(""");
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/(""");
</script>

<script> 
$(document).ready(function()"""),format.raw/*29.29*/("""{"""),format.raw/*29.30*/("""
  $("#slide02").click(function()"""),format.raw/*30.33*/("""{"""),format.raw/*30.34*/("""
	$("#panel01").slideUp("fast");
	$("#panel03").slideUp("fast");
    $("#panel02").slideToggle("fast");
  """),format.raw/*34.3*/("""}"""),format.raw/*34.4*/(""");
"""),format.raw/*35.1*/("""}"""),format.raw/*35.2*/(""");
</script>

<script> 
$(document).ready(function()"""),format.raw/*39.29*/("""{"""),format.raw/*39.30*/("""
  $("#slide03").click(function()"""),format.raw/*40.33*/("""{"""),format.raw/*40.34*/("""
	$("#panel01").slideUp("fast");
	$("#panel02").slideUp("fast");
    $("#panel03").slideToggle("fast");
  """),format.raw/*44.3*/("""}"""),format.raw/*44.4*/(""");
"""),format.raw/*45.1*/("""}"""),format.raw/*45.2*/(""");
</script>
<!-- Title -->    
<title>Human Information Processing Lab :: Home Page</title>
<div> """),_display_(Seq[Any](/*49.8*/user/*49.12*/.username)),format.raw/*49.21*/(""" </div>
</head>

<body>

<!-- Page Header -->
<center>

  <h3 style="color:#34495E; background:#BDC3C7; padding:20px 100px">Human Information Processing Lab</h3>
 <!-- Page Header Menu-->
  <h6 style="font-size:large; font-family:Tahoma, 'Microsoft Sans Serif', AngsanaUPC, CordiaUPC">
       <a href="#">หน้าแรก</a>&nbsp; | &nbsp;
       <a href="about_hip.html">เกี่่ยวกับ HIP Lab</a>&nbsp; | &nbsp;
       <a href="#">ผลการทดลอง</a>
  </h6>
  <!-- Dashed line-->
  <h4 style="color:34495E;; padding:0px 100px 0px 0px; border-color:#BDC3C7; border-bottom-style:dashed;"></h4>

<br>
<!-- Image Slide Menu -->
<table border="0" cellpadding="5">
<tr>

<!--Perception -->
<td align="center"><div class="tile" id="slide01" style="padding:20px 20px 30px 20px; border:none;size:200px 200px;"><img src=""""),_display_(Seq[Any](/*73.129*/routes/*73.135*/.Assets.at("images/perception.png"))),format.raw/*73.170*/("""" width="150" height="150"><br><br><br>
<a  id="slide01" class="btn btn-block btn-lg btn-primary">
<span class="fui-list"></span>&nbsp;&nbsp;Perception</a></div>
</div></td>

<!-- Attention -->
<td align="center"><div class="tile" id="slide02" style="padding:20px 20px 30px 20px; border:none; size:200px 200px;"><img src=""""),_display_(Seq[Any](/*79.130*/routes/*79.136*/.Assets.at("images/attention.png"))),format.raw/*79.170*/("""" width="150" height="150"><br><br><br>
<a  id="slide02" class="btn btn-block btn-lg btn-primary">
<span class="fui-list"></span>&nbsp;&nbsp;Short-Term Memory</a></div></td>

<!--Short-Term Memory -->
<td align="center"><div class="tile" id="slide03" style="padding:20px 20px 30px 20px; border:none;size:200px 200px;"><img src=""""),_display_(Seq[Any](/*84.129*/routes/*84.135*/.Assets.at("images/shortmem.png"))),format.raw/*84.168*/("""" width="150" height="150"><br><br><br>
<a  id="slide01" class="btn btn-block btn-lg btn-primary">
<span class="fui-list"></span>&nbsp;&nbsp;Attention</a></div></td>
</tr>
</table>

<br>
<!-- Perception Panel -->
<div id="panel01">
    <div style="font-size:large; padding:0px 0px 5px 0px; color:#FFFFFF; background-color:#95A5A6"><span class="fui-list"></span>&nbsp;&nbsp;Perception</div>
    <br>
    
    <div style="alignment-adjust:central">
<table align="center">
<tr>
<!--<td><a href=""""),_display_(Seq[Any](/*99.19*/routes/*99.25*/.Application.perceptionSignalDetection())),format.raw/*99.65*/(""""><img src=""""),_display_(Seq[Any](/*99.78*/routes/*99.84*/.Assets.at("images/signal_detection.png"))),format.raw/*99.125*/("""" style="padding:0px 50px 0px 50px; width:80px; height:80px; border-width:0px"></a></td>--!>
<td><a href=""""),_display_(Seq[Any](/*100.15*/routes/*100.21*/.Application.perceptioniChangeBlindness())),format.raw/*100.62*/(""""><img src=""""),_display_(Seq[Any](/*100.75*/routes/*100.81*/.Assets.at("images/change_blindness.png"))),format.raw/*100.122*/("""" style="padding:0px 50px 0px 50px; width:80px; height:80px; border-width:0px"></a></td>
<!--<td><a href="garner_interference_info.html"><img src=""""),_display_(Seq[Any](/*101.60*/routes/*101.66*/.Assets.at("images/garner_interference.png"))),format.raw/*101.110*/("""" style="padding:0px 50px 0px 50px; width:80px; height:80px; border-width:0px"></a></td>--!>
</tr>
<tr>
    <td align="center"><br><a href=""""),_display_(Seq[Any](/*104.38*/routes/*104.44*/.Application.perceptioniChangeBlindness())),format.raw/*104.85*/("""">Change Blindness</a></td>  
   <!-- <td align="center"><br><a href="garner_interference_info.html">Garner Interference</a></td>--!>
</tr>
</table><br>
    </div>
    
</div>
<!-- Short-Term Memory Panel -->
<div id="panel02">
    <div style="font-size:large; padding:0px 0px 5px 0px; color:#FFFFFF; background-color:#95A5A6"><span class="fui-list"></span>&nbsp;&nbsp;Short-Term Memory</div>
    <br>
    
    <div style="alignment-adjust:central">
<table align="center">
<tr>
<td>    <a href="sternberg_search_info.html"><img src=""""),_display_(Seq[Any](/*119.57*/routes/*119.63*/.Assets.at("images/sternberg_search.png"))),format.raw/*119.104*/("""" style="padding:0px 50px 0px 50px; width:80px; height:80px; border-width:0px"></a> </td>
<td>    <a href="brown_peterson_info.html"><img src=""""),_display_(Seq[Any](/*120.55*/routes/*120.61*/.Assets.at("images/brown_peterson.png"))),format.raw/*120.100*/("""" style="padding:0px 50px 0px 50px; width:80px; height:80px; border-width:0px"></a></td>
</tr>
<tr>
    <td align="center"><br><a href="sternburg_search_info.html">Sternberg Search</a></td>  <td align="center"><br><a href="brown_peterson_info.html">Brown-Peterson Task</a></td>
</tr>
</table><br>
    </div>
</div>

<!-- Attention Panel -->
<div id="panel03">
    <div style="font-size:large; padding:0px 0px 5px 0px; color:#FFFFFF; background-color:#95A5A6"><span class="fui-list"></span>&nbsp;&nbsp;Attention</div>
    <br>
    
    <div style="alignment-adjust:central">
<table align="center">
<tr>
<td><a href="stroop_effect_info.html"><img src=""""),_display_(Seq[Any](/*137.50*/routes/*137.56*/.Assets.at("images/stroop_effect.png"))),format.raw/*137.94*/("""" style="padding:0px 50px 0px 50px; width:80px; height:80px; border-width:0px"></a></td>
<td><a href="attention_blink_info.html"><img src=""""),_display_(Seq[Any](/*138.52*/routes/*138.58*/.Assets.at("images/attention_blink.png"))),format.raw/*138.98*/("""" style="padding:0px 50px 0px 50px; width:80px; height:80px; border-width:0px"></a></td>
</tr>
<tr>
    <td align="center"><br><a href="stroop_effect_info.html">Stroop Effect</a></td>  <td align="center"><br><a href="attention_blink_info.html">Attention Blink</a></td>
</tr>
</table><br>
    </div>
</div>
  
<br>
<h4 style="color:#34495E; padding:10px 100px; border-color:#BDC3C7; border-top-style:dashed;"></h4>
<div style="color:#34495E; background:#BDC3C7; padding:20px 100px">
<normal >Department of Computer Science</normal> <br>
<small >Faculty of Science and Technology, Thammasat University</small> <br>


</center>
</body>
</html>
"""))}
    }
    
    def render(user:User): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((User) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 13 16:01:04 ICT 2014
                    SOURCE: /home/intouch/Desktop/myProject/Hip/app/views/home.scala.html
                    HASH: da921d83f94abc91a401522efd3e5edeef2736c4
                    MATRIX: 771->1|877->13|1269->370|1283->376|1339->411|1429->465|1444->471|1501->506|1591->560|1606->566|1663->601|1753->655|1768->661|1828->699|1918->753|1933->759|1995->799|2193->969|2222->970|2284->1004|2313->1005|2450->1115|2478->1116|2509->1120|2537->1121|2621->1177|2650->1178|2712->1212|2741->1213|2878->1323|2906->1324|2937->1328|2965->1329|3049->1385|3078->1386|3140->1420|3169->1421|3306->1531|3334->1532|3365->1536|3393->1537|3532->1641|3545->1645|3576->1654|4435->2476|4451->2482|4509->2517|4875->2846|4891->2852|4948->2886|5319->3220|5335->3226|5391->3259|5935->3767|5950->3773|6012->3813|6061->3826|6076->3832|6140->3873|6285->3981|6301->3987|6365->4028|6415->4041|6431->4047|6496->4088|6682->4237|6698->4243|6766->4287|6947->4431|6963->4437|7027->4478|7613->5027|7629->5033|7694->5074|7876->5219|7892->5225|7955->5264|8660->5932|8676->5938|8737->5976|8915->6117|8931->6123|8994->6163
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|47->19|47->19|48->20|48->20|52->24|52->24|53->25|53->25|57->29|57->29|58->30|58->30|62->34|62->34|63->35|63->35|67->39|67->39|68->40|68->40|72->44|72->44|73->45|73->45|77->49|77->49|77->49|101->73|101->73|101->73|107->79|107->79|107->79|112->84|112->84|112->84|127->99|127->99|127->99|127->99|127->99|127->99|128->100|128->100|128->100|128->100|128->100|128->100|129->101|129->101|129->101|132->104|132->104|132->104|147->119|147->119|147->119|148->120|148->120|148->120|165->137|165->137|165->137|166->138|166->138|166->138
                    -- GENERATED --
                */
            