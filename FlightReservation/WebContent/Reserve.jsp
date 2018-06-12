<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Reserve.jsp" method="post">
	FLNO : <input type="text" name="flno"><br><br>
	SEAT : <input type="text" name="seat">
	<input type="submit" value="BOOK">
</form>

<%

System.out.println("HEy OUTSIDE");
	String flno=request.getParameter("flno");
	String seat=request.getParameter("seat");
	int flag=0;
	if(flno!=null && seat!=null){
		System.out.println("HEy INSIDE");
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javalab","root","network");
		
		Statement stmt=conn.createStatement(ResultSet.CONCUR_READ_ONLY,ResultSet.TYPE_SCROLL_INSENSITIVE);
		String sql="select flno from flight;";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()){
			if(rs.getString(1).equals(flno)){
				flag=1;
			}
		}
		
		if(flag==1){
			System.out.println("HEy EXIST");
			PreparedStatement ps=conn.prepareStatement("insert into seat values(?,?);");
			ps.setString(1, flno);
			ps.setString(2, seat);
			
			int c=ps.executeUpdate();
			System.out.println("EXC : "+c);
		}
		else{
			System.out.println("HEy DOESNOT EXISt");
			PrintWriter pw=response.getWriter();
			pw.print("INVALID");
			
		}
		
	}
%>
<br><br><hr>
<form action="show.jsp" method="post">
<select name="day">
<option value="Monday">MON</option>
<option value="Tuesday">TUE</option>
<option value="Wednesday">WED</option>
<option value="Thursday">THUR</option>
<option value="Friday">FRI</option>
</select>
<input type="submit" value="search">
</form>
</body>
</html>