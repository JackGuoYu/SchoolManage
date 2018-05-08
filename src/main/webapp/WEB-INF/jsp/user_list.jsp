<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <title>登录页面</title>
</head>
<body>
	<center/>
	<h2>用户管理</h2>
  
    <table>
    	<tr>
    		<th>账号</th>
    		<th>角色</th>
    		<th>性别</th>
    		<th>年龄</th>
    		<th>电话</th>
    		<th>院校</th>
    		<th>专业</th>
    		<th>操作</th>
    	</tr>
	
		 <c:forEach items="${users}" var = "user">  
		       <tr>  
		       <td><input type = "checkbox" name ="stuid" value ="${user.id}"/></td>  
		       <td>${user.username}</td>  
		       <td>${user.role_name}</td>    
		       <td>${user.sex}</td>    
		       <td>${user.age}</td>  
		       <td>${user.phone}</td>    
		       <td>${user.college_name}</td>  
		       <td>${user.class_name}</td>   
		       <td><!-- #默认的锚点是＃top 也就是网页的上端 -->  
		           <!-- 而javascript:void(0)  仅仅表示一个死链 -->  
		           <a href="javascript:void(0)" >编辑</a></td>         
		        </tr>  
		   </c:forEach>  
	  
    </table>
</body>
</html>