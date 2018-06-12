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

	double tax;
	double income;
	
	income=Double.parseDouble(request.getParameter("salary"));
	
	if(income>50000){
		tax=income*0.2;
	}
	else if(income>10000 && income<=50000){
		tax=income*0.15;
	}
	else{
		tax=0;
	}
	
	session.setAttribute("tax", tax);
	RequestDispatcher view =request.getRequestDispatcher("/datacapture.jsp");
	view.forward(request, response);
%>
</body>
</html>