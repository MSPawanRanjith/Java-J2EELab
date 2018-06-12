<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>IT Returns</title>
</head>
<body>

	<form action="ITReturns" method="post">
		<label>Name : </label><input type="text" name="name"><br>
		<label>Salary : </label><input type="number" min="1000" name="salary"><br>
		<label>Tax : </label><input type="number" max="10" min="0" name="tax"><br>
		<input type="submit" id="submit">

	</form>

</body>
</html>