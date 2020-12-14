// JScript 文件
function MakeAd()
{//定义大图内容
    var strAd="<div id=adimage style=\"width:100%\">"+
                    "<div id=adBig><a href=\"\TaManage.html\" " +
                    "target=_blank><img title=展览小网站 "+
                    "src=\"../takeaway/images/2.jpg\" " +
                    "border=0></A></div>"+
	//定义小图片内容
                    "<div id=adSmall style=\"display: none,width:100%\">" +
		            "<div><a href=\"\TaManage.html\" target=_blank><img src=\"../takeaway/images/banner.jpg\" /></a></div>" +
	                "</div></div>"+
					"<div style=\"height:7px; clear:both;overflow:hidden\"></div>";
    return strAd;
}
document.write(MakeAd());
$(function(){
	//过两秒显示 showImage(); 内容
    setTimeout("showImage();",1500);
    //setTimeout("showImage();",50);
    //alert(location);
});
function showImage()
{
    $("#adBig").slideUp(1000,function(){$("#adSmall").slideDown(100);});
    //$("#adBig").slideUp(50,function(){$("#adSmall").slideDown(50);});

}


