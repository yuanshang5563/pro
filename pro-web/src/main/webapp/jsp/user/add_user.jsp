<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    
    <title>add_user</title>
    <jsp:include page="/commons/meta.jsp"></jsp:include>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<script type="text/javascript">
		function submitUser(){
			var url = $("#userForm").attr("action");
			var data = $("#userForm").serialize();
			$.ajax({
	            url:url,
	            type:"post",
	            dataType:"json",
	            data:data,
	            success:function(response){
	 				alert("插入成功！");
	            },error:function() {
	            	
	            }
        	});
		}
	</script>
  </head>
  
  <body>
  	<form id="userForm" name="userForm" action="${root}/UserController/addUser" method="post">
    <table>
    	<tr>
    		<td>用户名：</td>
    		<td><input type="text" id="userName" name="userName"/></td>
    	</tr>
    	<tr>
    		<td>证件号：</td>
    		<td><input type="text" id="userName" name="userName"/></td>
    	</tr>
    	<tr>
    		<td>密码：</td>
    		<td><input type="password" id="password" name="password"/></td>
    	</tr>
    	<tr>
    		<td>密码确认：</td>
    		<td><input type="password" id="confirmPassword" name="confirmPassword"/></td>
    	</tr>    	
    	<tr>
    		<td>手机：</td>
    		<td><input type="text" id="mobile" name="mobile"/></td>
    	</tr> 
    	<tr>
    		<td>邮箱：</td>
    		<td><input type="text" id="email" name="email"/></td>
    	</tr>
    	<tr>
    		<td>生日</td>
    		<td><input type="text" id="birthday" name="birthday"></td>
    	</tr>  
    	<tr>
    		<td><input type="reset" value="重置"/></td>
    		<td><input type="button" value="提交" onclick="submitUser()"/></td>
    	</tr>     	  	    	   	    	    	
    </table>
    </form>
  </body>
</html>
