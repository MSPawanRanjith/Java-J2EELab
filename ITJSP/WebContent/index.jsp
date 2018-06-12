<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>IT JSP</title>
</head>
<body>
	
	<%
		HashMap<String, String> user=new HashMap<String,String>();
		user.put("admin","admin");
		
		String name;
		String pass;
		String msg="";
		String status=request.getParameter("status");
		
		if(status!=null){
			name=request.getParameter("name");
			pass=request.getParameter("pass");
			
			System.out.println("Name : "+name+" Password : "+pass);
			if(status.equals("1")){
				if(user.containsKey(name)&& user.get(name).equals(pass)){
					System.out.println("Name : "+name+" Password : "+pass);
					session.setAttribute("user", name);
					RequestDispatcher view =request.getRequestDispatcher("/datacapture.jsp");
					view.forward(request,response);
					
				}
				else{
					msg="INVALID";
				}
			}
			else if(status.equals("2")){
				session.invalidate();
			}
		}
		
	%>
	<%= msg %>
	<%@ include file="login.html" %>
</body>
</html>