<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>添加用户</title>
<link rel="stylesheet" type="text/css" href="css/css.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
</head>
<body>
	<form action="create"  method="post">
	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="img/coin02.png" /><span><a href="#">首页</a>&nbsp;-&nbsp;<a
					href="#">公共管理</a>&nbsp;-</span>&nbsp;意见管理
			</div>
		</div>
		<div class="page ">
			<!-- 会员注册页面样式 -->
			<div class="banneradd bor">
				<div class="baTopNo">
					<span>用户注册</span>
				</div>
				<div class="baBody">
					<div class="bbD">
						&nbsp;&nbsp;&nbsp;用户名：<input name="username" type="text" class="input3" />
					</div>
					<div class="bbD">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;密码：<input name="password" type="password" 
							class="input3" />
					</div>
					<div class="bbD">
						年龄：<input name="age" type="text" class="input3" />
					</div>
					<div class="bbD">
						电话：<input name="phone" type="text" class="input3" />
					</div>
					<div class="bbD">
						性别：
						<select name="sex"  value="${user.sex}">     
						  <option value="0">-请选择-</option>     
						  <option value="1" <c:if test="${'1' eq user.sex}">selected</c:if> >男</option>     
						  <option value="2" <c:if test="${'2' eq user.sex}">selected</c:if> >女</option>  
						 </select>  
					</div>
					<div class="bbD">
						地址：<input name="address" type="text" class="input3" />
					</div>
					<div class="bbD">
						<p class="bbDP">
							<input type="submit" value="保存" style="background-color:pink">
							<a class="btn_ok btn_no" href="login">取消</a>
						</p>
					</div>
				</div>
			</div>

			<!-- 会员注册页面样式end -->
		</div>
	</div>
	</form>
</body>
</html>