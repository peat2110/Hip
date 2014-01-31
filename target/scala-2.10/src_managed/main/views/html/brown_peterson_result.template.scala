
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
object brown_peterson_result extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[brownPeterson.Answer],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(answers : List[brownPeterson.Answer]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.40*/("""
<!DOCTYPE html>
<html>
<head>
    <title>Result Page</title>
</head>
<body>

    """),_display_(Seq[Any](/*9.6*/for(ans <- answers) yield /*9.25*/ {_display_(Seq[Any](format.raw/*9.27*/("""
        First Word : """),_display_(Seq[Any](/*10.23*/ans/*10.26*/.firstWord)),format.raw/*10.36*/(""" ,
        Second Word : """),_display_(Seq[Any](/*11.24*/ans/*11.27*/.secondWord)),format.raw/*11.38*/(""" ,
        Third Word : """),_display_(Seq[Any](/*12.23*/ans/*12.26*/.thirdWord)),format.raw/*12.36*/(""" ,
        countDownResult : """),_display_(Seq[Any](/*13.28*/ans/*13.31*/.countdownResult)),format.raw/*13.47*/("""
        UsedTime : """),_display_(Seq[Any](/*14.21*/ans/*14.24*/.usedTime)),format.raw/*14.33*/("""
    """)))})),format.raw/*15.6*/("""
</body>
</html>"""))}
    }
    
    def render(answers:List[brownPeterson.Answer]): play.api.templates.HtmlFormat.Appendable = apply(answers)
    
    def f:((List[brownPeterson.Answer]) => play.api.templates.HtmlFormat.Appendable) = (answers) => apply(answers)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jan 31 23:52:27 ICT 2014
                    SOURCE: /Users/keepluck/HipLocal/app/views/brown_peterson_result.scala.html
                    HASH: b0ead879c4d515ac98a6a873d8493fe32c0e4ba9
                    MATRIX: 810->1|942->39|1059->122|1093->141|1132->143|1191->166|1203->169|1235->179|1297->205|1309->208|1342->219|1403->244|1415->247|1447->257|1513->287|1525->290|1563->306|1620->327|1632->330|1663->339|1700->345
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15
                    -- GENERATED --
                */
            