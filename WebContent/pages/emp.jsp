<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1 align="center">Stuts2演示</h1>
 <hr/>
 <s:form name="form1" method="post" action="empAction!save.action">
 	<s:hidden name="emp.empid"></s:hidden>
 	<s:textfield name="emp.empname" label="员工姓名"/>
 	<s:textfield name="emp.cardno" label="身份证号"/>
	<s:radio list="#{'男':'男','女':'女'}" name="emp.sex" listkey="key" listValue="value"/>
	<s:textfield name="emp.age" label="年龄"/>
 	<s:select list="#requset.nations" name="emp.nation" listKey="nationid" listVlaue="nationName"/>
	<s:submit value="保存"></s:submit>>
 </s:form> 
</body>
</html>