
package views.html.climate

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
object searchService extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[play.data.Form[metadata.ClimateService],String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(climateServiceForm: play.data.Form[metadata.ClimateService],email:String,comment:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*5.6*/scripts/*5.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.17*/("""
        <script src='"""),_display_(Seq[Any](/*6.23*/routes/*6.29*/.Assets.at("javascripts/edit_button.js"))),format.raw/*6.69*/("""'></script>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">
        """),format.raw/*8.71*/("""
        <script src="//code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
        <script type="text/javascript">
                $(function() """),format.raw/*11.30*/("""{"""),format.raw/*11.31*/("""
                    var availableServiceNames = [
                        "2-D-Variable-Map",
                        "2-D-Variable-Zonal-Mean",
                        "2-D-Variable-Time-Series",
                        "3-D-Variable-2-D-Slice",
                        "3-D-Variable-Zonal-Mean",
                        "3-D-Variable-Average-Vertical-Profile",
                        "Scatter-and-Histogram-Plot-of-Two-Variables",
                        "Difference-Plot-of-Two-Time-Averaged-Variables",
                        "Conditional-Sampling-with-One-Variable",
                        "Conditional-Sampling-with-Two-Variables",
                        "Time-Lagged-Correlation-Map-of-Two-Variables",
                        "Regrid-and-Download"
                    ];

                    $("#serviceName").autocomplete("""),format.raw/*27.52*/("""{"""),format.raw/*27.53*/("""
                        source : availableServiceNames
                    """),format.raw/*29.21*/("""}"""),format.raw/*29.22*/(""");
                """),format.raw/*30.17*/("""}"""),format.raw/*30.18*/(""");

                $(function()"""),format.raw/*32.29*/("""{"""),format.raw/*32.30*/("""
                    var idNumber = 0;
                    var JsonComment = """"),_display_(Seq[Any](/*34.41*/comment)),format.raw/*34.48*/("""";
                    JsonComment = JsonComment.replace(/&quot;/g,'"');
                    JsonComment = JsonComment.replace(/&lt;/g,'<');
                    JsonComment = JsonComment.replace(/&gt;/g,'>');
                    JsonComment = JsonComment.replace(/&#x27;/g,"'");
                    console.log(JsonComment);
                    $.each($.parseJSON(JsonComment), function(i, aComment) """),format.raw/*40.76*/("""{"""),format.raw/*40.77*/("""
                        var climateID = aComment.climateServiceID;
                        var postTime = new Date(aComment.postTime);
                        idNumber = idNumber + 1;
                        var year = postTime.getFullYear();
                        var month = postTime.getMonth() + 1;
                        var day = postTime.getDate();
                        var hours=postTime.getHours();
                        var minutes = postTime.getMinutes();
                        if(parseInt(minutes) < 10)"""),format.raw/*49.51*/("""{"""),format.raw/*49.52*/("""
                            minutes = "0" + minutes;
                        """),format.raw/*51.25*/("""}"""),format.raw/*51.26*/("""
                        var seconds =postTime.getSeconds();
                        if(parseInt(seconds) < 10)"""),format.raw/*53.51*/("""{"""),format.raw/*53.52*/("""
                            seconds = "0" + seconds;
                        """),format.raw/*55.25*/("""}"""),format.raw/*55.26*/("""
                        var dateString = year+"-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds;
                        $("#post").append("<div id='"+idNumber+"'class='col-md-8 blogShort'></div>");
                        var imgString = "<img id='userIcon' class='pull-left img-responsive thumb margin10 img-thumbnail' src='"""),_display_(Seq[Any](/*58.129*/routes/*58.135*/.Assets.at("images/Usericon.jpg"))),format.raw/*58.168*/("""'>";
                        $("#"+idNumber).append("<h4>By " +aComment.user +"</h4>");
                        $("#"+idNumber).append("<input id='rating" +idNumber +"' value="+ aComment.grade +" class='rating userRating' type='number' data-size='xs' readonly/>");
                        $("#rating"+idNumber).rating('create');
                        $("#"+idNumber).append(imgString);
                        $("#"+idNumber).append("</img>");
                        $("#"+idNumber).append("<article><p>"+aComment.comment+"<article></p>");
                        $("#"+idNumber).append("<p class='text-right'>"+dateString+"</p>");
                    """),format.raw/*66.21*/("""}"""),format.raw/*66.22*/(""");
                """),format.raw/*67.17*/("""}"""),format.raw/*67.18*/(""");
        </script>
        <style>
        #commentActionArea"""),format.raw/*70.27*/("""{"""),format.raw/*70.28*/("""
        resize: none;
        width: 760px;
        margin-left: 5px;
        """),format.raw/*74.9*/("""}"""),format.raw/*74.10*/("""
        #commentActionContainer"""),format.raw/*75.32*/("""{"""),format.raw/*75.33*/("""
        border:1px solid #9e9e9e;
        width: 780px;
        margin-top: 10px;
        """),format.raw/*79.9*/("""}"""),format.raw/*79.10*/("""

        #commentAction"""),format.raw/*81.23*/("""{"""),format.raw/*81.24*/("""
        margin-top: 5px;
        """),format.raw/*83.9*/("""}"""),format.raw/*83.10*/("""

        #userIcon"""),format.raw/*85.18*/("""{"""),format.raw/*85.19*/("""
        height: 50px;
        """),format.raw/*87.9*/("""}"""),format.raw/*87.10*/("""

        .text-right"""),format.raw/*89.20*/("""{"""),format.raw/*89.21*/("""
        font-size: x-small;
        """),format.raw/*91.9*/("""}"""),format.raw/*91.10*/("""

        .blogShort"""),format.raw/*93.19*/("""{"""),format.raw/*93.20*/("""
        border:1px solid dimgray;
        margin-top: 10px;
        """),format.raw/*96.9*/("""}"""),format.raw/*96.10*/("""

        article"""),format.raw/*98.16*/("""{"""),format.raw/*98.17*/("""
        margin-left: 90px;
        """),format.raw/*100.9*/("""}"""),format.raw/*100.10*/("""
        </style>
    """)))};
Seq[Any](format.raw/*1.91*/("""

    """),format.raw/*4.1*/("""
    """),format.raw/*102.6*/("""

    """),_display_(Seq[Any](/*104.6*/main("Search Service",email,scripts)/*104.42*/{_display_(Seq[Any](format.raw/*104.43*/("""

        """),_display_(Seq[Any](/*106.10*/if(comment!= null && comment.compareTo("")==0)/*106.56*/{_display_(Seq[Any](format.raw/*106.57*/("""
            <div class="alert alert-warning fade in">
                <strong>No results found!</strong>
                <button class="btn btn-warning  pull-right" aria-label="Close" data-dismiss="alert">  OK  </button>
            </div>
        """)))})),format.raw/*111.10*/("""
        """),_display_(Seq[Any](/*112.10*/flash_message())),format.raw/*112.25*/("""
        """),format.raw/*113.62*/("""
        """),_display_(Seq[Any](/*114.10*/form(routes.ClimateServiceController.getSearchServiceResult(email))/*114.77*/ {_display_(Seq[Any](format.raw/*114.79*/("""
            """),format.raw/*115.108*/("""
            <div class="ui-widget col-sm-offset-3 col-sm-7 col-md-offset-3 col-md-7 col-lg-offset-3 col-lg-7">
                <div class = "form-group" align="center" >
                    """),_display_(Seq[Any](/*118.22*/inputText(climateServiceForm("Search"), 'class -> "form-control",'id -> "serviceName", 'placeholder -> "Service Name", 'size->70))),format.raw/*118.151*/("""
                    <input type="text" class="hidden" name="email" value="""),_display_(Seq[Any](/*119.75*/email)),format.raw/*119.80*/(""">
                </div>
                <div align="center">
                    <input class="btn btn-info" type="submit" value="GO">
                </div>
            </div>
            """),format.raw/*125.24*/("""
        """)))})),format.raw/*126.10*/("""
        <div id="commentArea" class="container col-lg-offset-3 col-lg-11">
            <div id="post">
            </div>
        </div>
    """)))})))}
    }
    
    def render(climateServiceForm:play.data.Form[metadata.ClimateService],email:String,comment:String): play.api.templates.HtmlFormat.Appendable = apply(climateServiceForm,email,comment)
    
    def f:((play.data.Form[metadata.ClimateService],String,String) => play.api.templates.HtmlFormat.Appendable) = (climateServiceForm,email,comment) => apply(climateServiceForm,email,comment)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 10 20:56:56 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/searchService.scala.html
                    HASH: 936fe38ab695873ef3b1c245166b5b9f1133cb63
                    MATRIX: 837->1|1019->119|1034->126|1118->130|1176->153|1190->159|1251->199|1397->380|1568->523|1597->524|2460->1359|2489->1360|2593->1436|2622->1437|2669->1456|2698->1457|2758->1489|2787->1490|2902->1569|2931->1576|3359->1976|3388->1977|3941->2502|3970->2503|4076->2581|4105->2582|4244->2693|4273->2694|4379->2772|4408->2773|4775->3103|4791->3109|4847->3142|5530->3797|5559->3798|5606->3817|5635->3818|5726->3881|5755->3882|5861->3961|5890->3962|5950->3994|5979->3995|6097->4086|6126->4087|6178->4111|6207->4112|6268->4146|6297->4147|6344->4166|6373->4167|6431->4198|6460->4199|6509->4220|6538->4221|6602->4258|6631->4259|6679->4279|6708->4280|6804->4349|6833->4350|6878->4367|6907->4368|6971->4404|7001->4405|7063->90|7095->113|7128->4428|7171->4435|7217->4471|7257->4472|7305->4483|7361->4529|7401->4530|7684->4780|7731->4790|7769->4805|7807->4867|7854->4877|7931->4944|7972->4946|8015->5054|8244->5246|8397->5375|8509->5450|8537->5455|8756->5656|8799->5666
                    LINES: 26->1|29->5|29->5|31->5|32->6|32->6|32->6|34->8|37->11|37->11|53->27|53->27|55->29|55->29|56->30|56->30|58->32|58->32|60->34|60->34|66->40|66->40|75->49|75->49|77->51|77->51|79->53|79->53|81->55|81->55|84->58|84->58|84->58|92->66|92->66|93->67|93->67|96->70|96->70|100->74|100->74|101->75|101->75|105->79|105->79|107->81|107->81|109->83|109->83|111->85|111->85|113->87|113->87|115->89|115->89|117->91|117->91|119->93|119->93|122->96|122->96|124->98|124->98|126->100|126->100|129->1|131->4|132->102|134->104|134->104|134->104|136->106|136->106|136->106|141->111|142->112|142->112|143->113|144->114|144->114|144->114|145->115|148->118|148->118|149->119|149->119|155->125|156->126
                    -- GENERATED --
                */
            