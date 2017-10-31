<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>系统登录</title>
</head>
<body>
	<h1 align="center">系统登录</h1>
	<hr/>
	
	<s:form action="loginAction.action" method="post" name="form1">
	
	用户名称：<s:textfield name="username"/><br/>
	登录密码：<s:password name="password"/><br/>
	<input type="submit" value="登录">
	</s:form>
</body>
</html>