<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form enctype="multipart/form-data" id="batchUpload"  action="user.do/upload" method="post" class="form-horizontal">    
    <button class="btn btn-success btn-xs" id="uploadEventBtn" style="height:26px;"  type="button" >选择文件</button>  
    <input type="file" name="file"  style="width:0px;height:0px;" id="uploadEventFile">  
    <input id="uploadEventPath"  disabled="disabled"  type="text" placeholder="请选择excel表" style="border: 1px solid #e6e6e6; height: 26px;width: 200px;" >                                           
<button type="submit" class="btn btn-success btn-sm"   >上传</button>  
</form>  
<!-- <button type="button" class="btn btn-success btn-sm"  onclick="userDevice.uploadBtn()" >上传</button> -->
</body>
<script src="http://www.jq22.com/jquery/jquery-2.1.1.js"></script>
<script type="text/javascript">
var User = function(){  
    alert(1231);
    this.init = function(){  
          
        //模拟上传excel  
         $("#uploadEventBtn").unbind("click").bind("click",function(){  
             $("#uploadEventFile").click();  
         });  
         $("#uploadEventFile").bind("change",function(){  
             $("#uploadEventPath").attr("value",$("#uploadEventFile").val());  
         });  
          
    };  
    //点击上传按钮  
    this.uploadBtn = function(){ 
        var uploadEventFile = $("#uploadEventFile").val();  
        if(uploadEventFile == ''){  
            alert("请选择excel,再上传");  
        }else if(uploadEventFile.lastIndexOf(".xls")<0){//可判断以.xls和.xlsx结尾的excel  
            alert("只能上传Excel文件");  
        }else{  
            var url =  '/user.do/upload';  
            var formData = new FormData($('form')[0]);  
            user.sendAjaxRequest(url,'POST',formData);  
        }  
    };  
      
    this.sendAjaxRequest = function(url,type,data){ 
    	alert(0);
        $.ajax({  
            url : url,  
            type : type,  
            data : data,  
            success : function(result) {  
                alert( result);  
            },  
            error : function() {  
                alert( "excel上传失败");  
            },  
            cache : false,  
            contentType : false,  
            processData : false  
        });  
    };  
}  
    function submitFile(){
    	alert(13);
    	var url =  'user.do/upload';  
        var data = new FormData($('form')[0]);
        alert(data);
    	$.ajax({  
            url : url,  
            type : 'POST',  
            data : data,
            dateType:'JSON',
            success : function(result) {  
                alert( result);  
            },  
            error : function() {  
                alert( "excel上传失败");  
            },  
            cache : false,  
            contentType : false,  
            processData : false  
        });
    }  
  
var user;  
$(function(){  
    user = new User();  
    user.init();  
});  
</script>
</html>