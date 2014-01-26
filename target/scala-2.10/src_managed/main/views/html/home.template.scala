
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
    def apply/*1.2*/(user:User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.13*/("""
"""),_display_(Seq[Any](/*2.2*/header("Human Information Processing Lab :: Home Page"))),format.raw/*2.57*/("""

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
<br>
<!-- Image Slide Menu -->

    <!--Perception -->
            <div class="homeMain">
                <div class="tile homeMenu1" id="slide01" ><img src=""""),_display_(Seq[Any](/*24.70*/routes/*24.76*/.Assets.at("images/perception.png"))),format.raw/*24.111*/("""" width="150" height="150"><br><br><br>
                <a  id="slide01" class="btn btn-block btn-lg btn-primary">
                <span class="fui-list"></span>&nbsp;&nbsp;Perception</a></div>

    <!-- Attention -->
                <div class="tile homeMenu1" id="slide02" ><img src=""""),_display_(Seq[Any](/*29.70*/routes/*29.76*/.Assets.at("images/attention.png"))),format.raw/*29.110*/("""" width="150" height="150"><br><br><br>
                <a  id="slide02" class="btn btn-block btn-lg btn-primary">
                <span class="fui-list"></span>&nbsp;&nbsp;Short-Term Memory</a></div>

    <!--Short-Term Memory -->
                <div class="tile homeMenu1" id="slide03" ><img src=""""),_display_(Seq[Any](/*34.70*/routes/*34.76*/.Assets.at("images/shortmem.png"))),format.raw/*34.109*/("""" width="150" height="150"><br><br><br>
                <a  id="slide01" class="btn btn-block btn-lg btn-primary">
                <span class="fui-list"></span>&nbsp;&nbsp;Attention</a></div>
            </div>
<br>


<!-- Perception Panel -->
<div class="divSlideContainer"  id="panel01">
        <div class="divSlideTitle" >
            <span class="fui-list"></span>&nbsp;&nbsp;Perception
        </div>
        <div class="divContainer1" >
             <div class="divExperimentIcon" >
                      <a  href="PCB"><img class="divPng"  src=""""),_display_(Seq[Any](/*48.65*/routes/*48.71*/.Assets.at("images/change_blindness.png"))),format.raw/*48.112*/(""""></a>
                   <div>
                      <a href="PCB">Change Blindness</a>
                   </div> 
             </div> 
        </div>
</div>


<!-- Short-Term Memory Panel -->

<div class="divSlideContainer"  id="panel02">
    <div class="divSlideTitle"><span class="fui-list"></span>&nbsp;&nbsp;Attention</div>
    
    <div class="divContainer">

      <div class="divExperimentIcon" >
        <a  href="XXXXX"><img class="divPng"  src=""""),_display_(Seq[Any](/*65.53*/routes/*65.59*/.Assets.at("images/sternberg_search.png"))),format.raw/*65.100*/(""""></a>
          <div><a href="XXXXX">Sternberg Search</a></div> 
      </div>
      <div class="divExperimentIcon" >
        <a  href="STMBt"><img class="divPng"  src=""""),_display_(Seq[Any](/*69.53*/routes/*69.59*/.Assets.at("images/brown_peterson.png"))),format.raw/*69.98*/(""""></a>
          <div><a href="STMBt">Brown-Peterson Task</a></div> 
      </div>
    </div>
</div>


<!-- Attention Panel -->

<div class="divSlideContainer"  id="panel03">
    <div class="divSlideTitle"><span class="fui-list"></span>&nbsp;&nbsp;Attention</div>
    
    <div class="divContainer">

      <div class="divExperimentIcon" >
        <a  href="XXXXX"><img class="divPng"  src=""""),_display_(Seq[Any](/*84.53*/routes/*84.59*/.Assets.at("images/stroop_effect.png"))),format.raw/*84.97*/(""""></a>
          <div><a href="XXXXX">Stroop Effect</a></div> 
      </div>
      <div class="divExperimentIcon" >
        <a  href="XXXXX"><img class="divPng"  src=""""),_display_(Seq[Any](/*88.53*/routes/*88.59*/.Assets.at("images/attention_blink.png"))),format.raw/*88.99*/(""""></a>
          <div><a href="XXXXX">Attention Blink</a></div> 
      </div>
    </div>
</div>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
"""),_display_(Seq[Any](/*95.2*/footer())),format.raw/*95.10*/("""

"""))}
    }
    
    def render(user:User): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((User) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jan 26 21:28:47 ICT 2014
                    SOURCE: /home/intouch/Desktop/myProject/hipLab/app/views/home.scala.html
                    HASH: 8b4b25c86fe2d792870d6d4fa3202fef4b0af601
                    MATRIX: 771->1|876->12|913->15|989->70|1692->737|1707->743|1765->778|2093->1070|2108->1076|2165->1110|2507->1416|2522->1422|2578->1455|3183->2024|3198->2030|3262->2071|3773->2546|3788->2552|3852->2593|4062->2767|4077->2773|4138->2812|4580->3218|4595->3224|4655->3262|4862->3433|4877->3439|4939->3479|5168->3673|5198->3681
                    LINES: 26->1|29->1|30->2|30->2|52->24|52->24|52->24|57->29|57->29|57->29|62->34|62->34|62->34|76->48|76->48|76->48|93->65|93->65|93->65|97->69|97->69|97->69|112->84|112->84|112->84|116->88|116->88|116->88|123->95|123->95
                    -- GENERATED --
                */
            