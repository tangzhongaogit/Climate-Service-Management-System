
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
/*******************************************************************************
* Licensed to the Apache Software Foundation (ASF) under one or more		   *
* contributor license agreements.  See the NOTICE file distributed with	   *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*																			   *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.											   *
*******************************************************************************/
object oneService extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,String,String,List[metadata.ClimateService],List[String],play.api.templates.HtmlFormat.Appendable] {

    /*******************************************************************************
* Licensed to the Apache Software Foundation (ASF) under one or more		   *
* contributor license agreements.  See the NOTICE file distributed with	   *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*																			   *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.											   *
*******************************************************************************/
    def apply/*18.2*/(url: String, email: String, id: String,climateServices: List[metadata.ClimateService],friendList: List[String]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
    <style type="text/css">
    /*override atwho's style*/
    .atwho-inserted """),format.raw/*25.21*/("""{"""),format.raw/*25.22*/("""
    color: #4183C4;
    """),format.raw/*27.5*/("""}"""),format.raw/*27.6*/("""
    /*.atwho-query """),format.raw/*28.20*/("""{"""),format.raw/*28.21*/("""*/
    /*color: #4183C4;*/
    /*"""),format.raw/*30.7*/("""}"""),format.raw/*30.8*/("""*/
    </style>
    <script src='"""),_display_(Seq[Any](/*32.19*/routes/*32.25*/.Assets.at("javascripts/jquery.atwho.js"))),format.raw/*32.66*/("""'
    type="text/javascript"></script>
    <link href='"""),_display_(Seq[Any](/*34.18*/routes/*34.24*/.Assets.at("stylesheets/Hashstyle.css"))),format.raw/*34.63*/("""'
    rel="stylesheet" />
    <link href='"""),_display_(Seq[Any](/*36.18*/routes/*36.24*/.Assets.at("stylesheets/jquery.atwho.css"))),format.raw/*36.66*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src="http://ichord.github.io/Caret.js/src/jquery.caret.js"></script>
    <script type="text/javascript">
            $(document).ready(function()"""),format.raw/*40.41*/("""{"""),format.raw/*40.42*/("""
                var obj = document.getElementById("iframe");
                resizeIframe(obj);
            """),format.raw/*43.13*/("""}"""),format.raw/*43.14*/(""");

            function resizeIframe(obj) """),format.raw/*45.40*/("""{"""),format.raw/*45.41*/("""
                obj.style.height = obj.contentWindow.document.body.scrollHeight + 'px';
            """),format.raw/*47.13*/("""}"""),format.raw/*47.14*/("""

            $(function()"""),format.raw/*49.25*/("""{"""),format.raw/*49.26*/("""
                var idNumber = 0;
                var ServiceList = [];
                var friendsList = [];
                var i = 0;
                friendsList[0] = "Hello";
                """),_display_(Seq[Any](/*55.18*/for(climateService <- climateServices) yield /*55.56*/ {_display_(Seq[Any](format.raw/*55.58*/("""
                ServiceList[i] = (""""),_display_(Seq[Any](/*56.37*/climateService/*56.51*/.getClimateServiceName)),format.raw/*56.73*/("""");
                i = i + 1;
                """)))})),format.raw/*58.18*/("""
                i = 0;
                """),_display_(Seq[Any](/*60.18*/for(friend <- friendList) yield /*60.43*/ {_display_(Seq[Any](format.raw/*60.45*/("""
                    friendsList[i] = (""""),_display_(Seq[Any](/*61.41*/friend)),format.raw/*61.47*/("""");
                    i = i + 1;
                """)))})),format.raw/*63.18*/("""
                console.log(friendsList);
//        console.log(ServiceList);
                var tags = ["ShiZong","Tangzhongao","WangXiaoYu","LiuYuan"];
                $('#commentActionArea').atwho("""),format.raw/*67.47*/("""{"""),format.raw/*67.48*/("""
                    at: "@",
                    data: friendsList,
                    limit: 200,
                """),format.raw/*71.17*/("""}"""),format.raw/*71.18*/(""");
                $('#commentActionArea').atwho("""),format.raw/*72.47*/("""{"""),format.raw/*72.48*/("""
                    at: "#",
                    data: ServiceList,
                    limit: 200,
                """),format.raw/*76.17*/("""}"""),format.raw/*76.18*/(""");
                $.ajax("""),format.raw/*77.24*/("""{"""),format.raw/*77.25*/("""
                    type: 'GET',
                    url: 'http://localhost:9034/posts/getAllPosts/json',
                    success: function(data) """),format.raw/*80.45*/("""{"""),format.raw/*80.46*/("""
                        console.log(data);

                        $.each($.parseJSON(data), function(i, aComment) """),format.raw/*83.73*/("""{"""),format.raw/*83.74*/("""
                            var climateID = aComment.climateServiceID;
                            if (climateID == """),_display_(Seq[Any](/*85.47*/id)),format.raw/*85.49*/(""")"""),format.raw/*85.50*/("""{"""),format.raw/*85.51*/("""
                                var postTime = new Date(aComment.postTime);
                                idNumber = idNumber + 1;
                                var year = postTime.getFullYear();
                                var month = postTime.getMonth() + 1;
                                var day = postTime.getDate();
                                var hours=postTime.getHours();
                                var minutes = postTime.getMinutes();
                                if(parseInt(minutes) < 10)"""),format.raw/*93.59*/("""{"""),format.raw/*93.60*/("""
                                    minutes = "0" + minutes;
                                """),format.raw/*95.33*/("""}"""),format.raw/*95.34*/("""
                                var seconds =postTime.getSeconds();
                                if(parseInt(seconds) < 10)"""),format.raw/*97.59*/("""{"""),format.raw/*97.60*/("""
                                    seconds = "0" + seconds;
                                """),format.raw/*99.33*/("""}"""),format.raw/*99.34*/("""
                                var dateString = year+"-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds;
                                $("#post").append("<div id='"+idNumber+"'class='col-md-8 blogShort'></div>");
                                var imgString = "<img id='userIcon' class='pull-left img-responsive thumb margin10 img-thumbnail' src='"""),_display_(Seq[Any](/*102.137*/routes/*102.143*/.Assets.at("images/Usericon.jpg"))),format.raw/*102.176*/("""'>";
                                $("#"+idNumber).append("<h4>By " +aComment.user +"</h4>");
                                $("#"+idNumber).append("<input id='rating" +idNumber +"' value="+ aComment.grade +" class='rating userRating' type='number' data-size='xs' readonly/>");
                                $("#rating"+idNumber).rating('create');
                                $("#"+idNumber).append(imgString);
                                $("#"+idNumber).append("</img>");
                                $("#"+idNumber).append("<article><p>"+aComment.comment+"<article></p>");
                                $("#"+idNumber).append("<p class='text-right'>"+dateString+"</p>");
                            """),format.raw/*110.29*/("""}"""),format.raw/*110.30*/("""
                        """),format.raw/*111.25*/("""}"""),format.raw/*111.26*/(""");
                    """),format.raw/*112.21*/("""}"""),format.raw/*112.22*/(""",
                    error: function() """),format.raw/*113.39*/("""{"""),format.raw/*113.40*/("""
                        alert('error');
                    """),format.raw/*115.21*/("""}"""),format.raw/*115.22*/("""
                """),format.raw/*116.17*/("""}"""),format.raw/*116.18*/(""");
                $("#submitComment").click(function()"""),format.raw/*117.53*/("""{"""),format.raw/*117.54*/("""
                    var comment = $("#commentActionArea").text();
                    var atService = "null";
                    var Count = 1;
                    console.log(comment);
                    var start_index = -1;
                    $('.atwho-inserted').each(function()"""),format.raw/*123.57*/("""{"""),format.raw/*123.58*/("""
                        if($(this).text().indexOf("#") > -1) """),format.raw/*124.62*/("""{"""),format.raw/*124.63*/("""
                            var hashTagInThis  = $(this).text().indexOf("#");
                            var hashTagIndex = comment.indexOf("#",start_index+1 );
                            start_index = hashTagIndex;
                        """),format.raw/*128.25*/("""}"""),format.raw/*128.26*/(""" else """),format.raw/*128.32*/("""{"""),format.raw/*128.33*/("""
                            hashTagInThis = $(this).text().indexOf("@");
                            var hashTagIndex = comment.indexOf("@",start_index+1);
                            start_index = hashTagIndex;
                        """),format.raw/*132.25*/("""}"""),format.raw/*132.26*/("""
                        console.log(hashTagIndex + "......");
                        console.log(hashTagInThis + "dddddd");
                        if(hashTagIndex > -1)"""),format.raw/*135.46*/("""{"""),format.raw/*135.47*/("""
                            var hashText = $(this).text();
                            console.log(hashText);
                            Count = 2;
                            SymbolIndex = hashTagIndex + hashText.length;
                            comment = comment.substr(0,SymbolIndex) + comment.substr(SymbolIndex + 1);
//                            hashTagIndex = comment.indexOf("#");
//                            comment = comment.substr(0,hashTagIndex)+ "<span>" + comment.substr(hashTagIndex,hashTagIndex+hashText.length)
//                                    +"</span>" + comment.substr(hashTagIndex+hashText.length);
//                            start_index = hashTagIndex+hashText.length;
                            //            console.log(SymbolIndex);
                            console.log(comment);
                            if(hashText.indexOf("#") > -1) """),format.raw/*147.60*/("""{"""),format.raw/*147.61*/("""
                                atService = hashText.substring(1);
                            """),format.raw/*149.29*/("""}"""),format.raw/*149.30*/("""
                        """),format.raw/*150.25*/("""}"""),format.raw/*150.26*/("""
                    """),format.raw/*151.21*/("""}"""),format.raw/*151.22*/(""");
//                    var hashText = $("#commentActionArea").find(".atwho-inserted").text();
//                    if(hashText != "")"""),format.raw/*153.41*/("""{"""),format.raw/*153.42*/("""
//                    """),format.raw/*154.23*/("""}"""),format.raw/*154.24*/("""
                    console.log(atService);
                    if(comment.length > 0) """),format.raw/*156.44*/("""{"""),format.raw/*156.45*/("""
                        var star_rating = $("#commentRating").val();
                        var date = new Date();
                        var year = date.getFullYear();
                        var month = date.getMonth() + 1;
                        var day = date.getDate();
                        var hours=date.getHours();
                        var minutes = date.getMinutes();
                        var email = """"),_display_(Seq[Any](/*164.39*/email)),format.raw/*164.44*/("""";
                        if(email=="")
                            email = "Guest";
                        var serviceID = -1;
                        serviceID = """"),_display_(Seq[Any](/*168.39*/id)),format.raw/*168.41*/("""";
                        if(parseInt(minutes) < 10)"""),format.raw/*169.51*/("""{"""),format.raw/*169.52*/("""
                            minutes = "0" + minutes;
                        """),format.raw/*171.25*/("""}"""),format.raw/*171.26*/("""
                        var seconds =date.getSeconds();
                        var dateString = year+"-"+month+"-"+day+" "+hours+":"+minutes+":"+seconds;
                        var commentContent = new Object();
                        commentContent.comment = comment;
                        commentContent.userEmail = email;
                        commentContent.climateId = serviceID;
                        commentContent.grade = star_rating;
                        commentContent.createTime = date.getTime();
                        commentContent.atService = atService;
                        var commentJson = JSON.stringify(commentContent);
//                console.log(commentJson);
                        $.ajax("""),format.raw/*183.32*/("""{"""),format.raw/*183.33*/("""
                            type: 'POST',
                            url: 'http://localhost:9034/posts/add',
                            data: commentJson,
                            dataType: 'json',
                            contentType: 'application/json',
                            success: function()"""),format.raw/*189.48*/("""{"""),format.raw/*189.49*/("""
                                $('#CommentPrompt').modal('show');
                                idNumber = idNumber + 1;
                                $("#post").append("<div id='"+idNumber+"'class='col-md-8 blogShort'></div>");
                                var imgString = "<img id='userIcon' class='pull-left img-responsive thumb margin10 img-thumbnail' src='"""),_display_(Seq[Any](/*193.137*/routes/*193.143*/.Assets.at("images/Usericon.jpg"))),format.raw/*193.176*/("""'>";
                                $("#"+idNumber).append('<h4>By '+email+'</h4>');
                                $("#"+idNumber).append("<input id='rating" +idNumber +"' value="+ star_rating +" class='rating userRating' type='number' data-size='xs' readonly/>");
                                $("#rating"+idNumber).rating('create');
                                $("#"+idNumber).append(imgString);
                                $("#"+idNumber).append("</img>");
                                $("#"+idNumber).append("<article><p>"+comment+"<article></p>");
                                $("#"+idNumber).append("<p class='text-right'>"+dateString+"</p>");
                                $("#commentActionArea").html("");
                            """),format.raw/*202.29*/("""}"""),format.raw/*202.30*/(""",
                            error: function() """),format.raw/*203.47*/("""{"""),format.raw/*203.48*/("""
                                alert('error' + commentJson);
                            """),format.raw/*205.29*/("""}"""),format.raw/*205.30*/("""
                        """),format.raw/*206.25*/("""}"""),format.raw/*206.26*/(""");
                    """),format.raw/*207.21*/("""}"""),format.raw/*207.22*/("""
                """),format.raw/*208.17*/("""}"""),format.raw/*208.18*/(""");
            """),format.raw/*209.13*/("""}"""),format.raw/*209.14*/(""");
    </script>
""")))};
Seq[Any](format.raw/*18.114*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*211.2*/("""

"""),_display_(Seq[Any](/*213.2*/main("Service",email, scripts)/*213.32*/ {_display_(Seq[Any](format.raw/*213.34*/("""



    <script type="text/javascript">
    </script>

    <style>
    #commentActionArea"""),format.raw/*221.23*/("""{"""),format.raw/*221.24*/("""
    resize: none;
    width: 760px;
    margin-left: 5px;
    """),format.raw/*225.5*/("""}"""),format.raw/*225.6*/("""
    #commentActionContainer"""),format.raw/*226.28*/("""{"""),format.raw/*226.29*/("""
    border:1px solid #9e9e9e;
    width: 780px;
    margin-top: 10px;
    margin-left: 12px;
    """),format.raw/*231.5*/("""}"""),format.raw/*231.6*/("""

    #commentAction"""),format.raw/*233.19*/("""{"""),format.raw/*233.20*/("""
    margin-top: 5px;
    """),format.raw/*235.5*/("""}"""),format.raw/*235.6*/("""

    #userIcon"""),format.raw/*237.14*/("""{"""),format.raw/*237.15*/("""
    height: 50px;
    """),format.raw/*239.5*/("""}"""),format.raw/*239.6*/("""

    .text-right"""),format.raw/*241.16*/("""{"""),format.raw/*241.17*/("""
    font-size: x-small;
    """),format.raw/*243.5*/("""}"""),format.raw/*243.6*/("""

    .blogShort"""),format.raw/*245.15*/("""{"""),format.raw/*245.16*/("""
    border:1px solid dimgray;
    margin-top: 10px;
    """),format.raw/*248.5*/("""}"""),format.raw/*248.6*/("""
    #iframe"""),format.raw/*249.12*/("""{"""),format.raw/*249.13*/("""
    margin-top: 100px;;
    """),format.raw/*251.5*/("""}"""),format.raw/*251.6*/("""

    article"""),format.raw/*253.12*/("""{"""),format.raw/*253.13*/("""
    margin-left: 90px;
    """),format.raw/*255.5*/("""}"""),format.raw/*255.6*/("""
    </style>
    <iframe id="iframe" width="100%" height="600px" src=""""),_display_(Seq[Any](/*257.59*/url)),format.raw/*257.62*/("""" frameborder="0" >
    </iframe>


    <div id="commentArea" class="container">
        <h2>Comment Area</h2>
        <hr/>
        <div id="post">
        </div>
    </div>
    <div id = "commentActionContainer" class="container pull-left">
        <div class="row" id="commentAction">
            <div id="commentActionArea" class="inputor" placeholder="Please enter your comment." contentEditable="true"></div>
        </div>
        <div class="row">
            <div class="col-sm-7 col-md-7">
                <input id="commentRating" class="rating" type="number" data-size="xs"/>
            </div>
            <div class="col-sm-5 col-md-5">
                <button id="submitComment" class="btn btn-success pull-right">Submit</button>
            </div>
        </div>
    </div>
    <div class="modal fade" id="CommentPrompt" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="exampleModalLabel">Congratulations!</h4>
                </div>
                <div class="modal-body">
                    <form>
                        <span>Your post has been submitted to the server successfully</span>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-success" data-dismiss="modal">OK</button>
                </div>
            </div>
        </div>
    </div>
""")))})))}
    }
    
    def render(url:String,email:String,id:String,climateServices:List[metadata.ClimateService],friendList:List[String]): play.api.templates.HtmlFormat.Appendable = apply(url,email,id,climateServices,friendList)
    
    def f:((String,String,String,List[metadata.ClimateService],List[String]) => play.api.templates.HtmlFormat.Appendable) = (url,email,id,climateServices,friendList) => apply(url,email,id,climateServices,friendList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 10 20:12:35 EST 2015
                    SOURCE: /Users/jiyushi1/Desktop/18655/git/SOC-Fall-2015-Team3-Lead-Jiyu-Shi/ApacheCMDA-Frontend/app/views/climate/oneService.scala.html
                    HASH: fef10e92cdbbced26e4e27220b58adfca0db00ac
                    MATRIX: 3209->1189|3415->1322|3430->1329|3515->1333|3623->1413|3652->1414|3704->1439|3732->1440|3780->1460|3809->1461|3869->1494|3897->1495|3967->1529|3982->1535|4045->1576|4137->1632|4152->1638|4213->1677|4292->1720|4307->1726|4371->1768|4605->1974|4634->1975|4771->2084|4800->2085|4871->2128|4900->2129|5029->2230|5058->2231|5112->2257|5141->2258|5374->2455|5428->2493|5468->2495|5541->2532|5564->2546|5608->2568|5688->2616|5765->2657|5806->2682|5846->2684|5923->2725|5951->2731|6035->2783|6265->2985|6294->2986|6439->3104|6468->3105|6545->3154|6574->3155|6719->3272|6748->3273|6802->3299|6831->3300|7010->3451|7039->3452|7184->3569|7213->3570|7367->3688|7391->3690|7420->3691|7449->3692|7999->4214|8028->4215|8150->4309|8179->4310|8334->4437|8363->4438|8485->4532|8514->4533|8906->4887|8923->4893|8980->4926|9728->5645|9758->5646|9812->5671|9842->5672|9894->5695|9924->5696|9993->5736|10023->5737|10113->5798|10143->5799|10189->5816|10219->5817|10303->5872|10333->5873|10648->6159|10678->6160|10769->6222|10799->6223|11071->6466|11101->6467|11136->6473|11166->6474|11432->6713|11462->6714|11662->6885|11692->6886|12604->7769|12634->7770|12759->7866|12789->7867|12843->7892|12873->7893|12923->7914|12953->7915|13118->8051|13148->8052|13200->8075|13230->8076|13347->8164|13377->8165|13839->8590|13867->8595|14072->8763|14097->8765|14179->8818|14209->8819|14316->8897|14346->8898|15107->9630|15137->9631|15478->9943|15508->9944|15917->10315|15934->10321|15991->10354|16783->11117|16813->11118|16890->11166|16920->11167|17040->11258|17070->11259|17124->11284|17154->11285|17206->11308|17236->11309|17282->11326|17312->11327|17356->11342|17386->11343|17445->1301|17474->1320|17503->11361|17542->11364|17582->11394|17623->11396|17741->11485|17771->11486|17862->11549|17891->11550|17948->11578|17978->11579|18104->11677|18133->11678|18182->11698|18212->11699|18266->11725|18295->11726|18339->11741|18369->11742|18420->11765|18449->11766|18495->11783|18525->11784|18582->11813|18611->11814|18656->11830|18686->11831|18771->11888|18800->11889|18841->11901|18871->11902|18928->11931|18957->11932|18999->11945|19029->11946|19085->11974|19114->11975|19223->12047|19249->12050
                    LINES: 56->18|59->22|59->22|61->22|64->25|64->25|66->27|66->27|67->28|67->28|69->30|69->30|71->32|71->32|71->32|73->34|73->34|73->34|75->36|75->36|75->36|79->40|79->40|82->43|82->43|84->45|84->45|86->47|86->47|88->49|88->49|94->55|94->55|94->55|95->56|95->56|95->56|97->58|99->60|99->60|99->60|100->61|100->61|102->63|106->67|106->67|110->71|110->71|111->72|111->72|115->76|115->76|116->77|116->77|119->80|119->80|122->83|122->83|124->85|124->85|124->85|124->85|132->93|132->93|134->95|134->95|136->97|136->97|138->99|138->99|141->102|141->102|141->102|149->110|149->110|150->111|150->111|151->112|151->112|152->113|152->113|154->115|154->115|155->116|155->116|156->117|156->117|162->123|162->123|163->124|163->124|167->128|167->128|167->128|167->128|171->132|171->132|174->135|174->135|186->147|186->147|188->149|188->149|189->150|189->150|190->151|190->151|192->153|192->153|193->154|193->154|195->156|195->156|203->164|203->164|207->168|207->168|208->169|208->169|210->171|210->171|222->183|222->183|228->189|228->189|232->193|232->193|232->193|241->202|241->202|242->203|242->203|244->205|244->205|245->206|245->206|246->207|246->207|247->208|247->208|248->209|248->209|251->18|253->21|254->211|256->213|256->213|256->213|264->221|264->221|268->225|268->225|269->226|269->226|274->231|274->231|276->233|276->233|278->235|278->235|280->237|280->237|282->239|282->239|284->241|284->241|286->243|286->243|288->245|288->245|291->248|291->248|292->249|292->249|294->251|294->251|296->253|296->253|298->255|298->255|300->257|300->257
                    -- GENERATED --
                */
            