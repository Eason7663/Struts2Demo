<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>新增学生资料</title>
</head>
<body>
	<h1 align="center">新增学生资料</h1>
	<hr/>
	<s:form name="form1" action="studAction1.action" method="post">
		学	号：<s:textfield name="studid"/><br/>
		姓	名：<s:textfield name="studname"/><br/>
		年	龄：<s:textfield name="age"/><br/>
		身份证：<s:textfield name="cardno"/><br/>
		性	别：<s:radio name="sex" list="#{'男':'男','女':'女'}" listkey="key" listvalue="value"/><br/>
		民	族：<s:select name="nation" list="#request.nationList" listKey="nationid" listValue="nationName" style="width:155px"/><br/>
		班	级：<s:select name="classid" list="#request.classList" listKey="classid" listValue="classname" style="width:155px"/><br/>
		<s:submit value="新增"></s:submit>
	</s:form>
</body>
</html>