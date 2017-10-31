<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>调用Action中的方法</title>
</head>
<body>
	<h1 align="center">调用Action中的方法</h1>
	<hr/>
	<s:debug/>
	<a href="${pageContext.request.contextPath}/methodAction.action?action=execute">调用execute函数</a><br/>
	<a href="${pageContext.request.contextPath}/methodAction1.action?action=add">调用add函数</a><br/>
	<a href="${pageContext.request.contextPath}/methodAction!del.action?action=del">调用del函数</a><br/>
	<a href="${pageContext.request.contextPath}/methodAction2.action?action=update">调用update函数</a><br/>
	<a href="${pageContext.request.contextPath}/methodAction!save.action?action=save">调用save函数</a><br/>
	<a href="${pageContext.request.contextPath}/methodAction3.action?action=list">调用list函数</a><br/>
</body>
</html>