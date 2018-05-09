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
	<h2>校园系统登录</h2>
  <form name="loginForm" method="post" action="showUser">
    <table>
      <tr>
        <td>用户名:<input type="text" name="username" id="userName"></td>
      </tr>
      <tr>
        <td>密码:<input type="password" name="password" id="password"></td>
      </tr>
      <tr>
        <td><input type="submit" value="登录" style="background-color:pink">  <input type="reset" value="重置" style="background-color:red"></td>     
      </tr>
    </table>
  </form>
</body>
</html>