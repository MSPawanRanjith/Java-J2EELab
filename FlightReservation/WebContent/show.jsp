<%@ page import="java.sql.*" %>
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
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javalab","root","network");

	String day=request.getParameter("day");
	Statement stmt=conn.createStatement(ResultSet.CONCUR_READ_ONLY,ResultSet.TYPE_SCROLL_INSENSITIVE);	
	String sql="select * from flight where day='"+day+"';";
	ResultSet rs=stmt.executeQuery(sql);
%>
<table >

<thead>
<th>FLNO</th>
<tbody>
<%
while(rs.next()){%>

<td><% out.println(rs.getString(1)); %></td>
	
<%} %>


</tbody>
</thead>
</table>
		

</body>
</html>