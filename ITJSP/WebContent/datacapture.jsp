<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	String name=(String)session.getAttribute("user");
	String msg="HI "+name+" !";
	String date=new Date().toString();
	String mTax=" ";
%>
<%= msg %><br><%=date %><br><br><hr>

<form action="calculate.jsp" method="post">
	<input type="number" name="salary">
	<input type="submit" value="Calculate"> 
	
<%if((session.getAttribute("tax")!=null)){
	
	mTax=session.getAttribute("tax").toString();
	
}%>
<%=mTax %>
<a href="index.jsp?status=2">LOGOUT</a>
</form>
</body>
</html>