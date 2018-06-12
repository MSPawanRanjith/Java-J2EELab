<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TShirt</title>
</head>
<body>
<form action="TShirtBuy" method="post">
	<label>Tag Line : </label><input type="text" name="tag"><br>
	
	<label>Accessories : </label>
	<input type="checkbox" name="acc" value="cap">
	<input type="checkbox" name="acc" value="belt">
	<input type="checkbox" name="acc" values="band">
	<br>
	
	<label>Pocket : </label>
	<label>WithPocket</label>
	<input type="radio" name="pocket" value="WithPocket">
	<label>WithOutPocket</label>
	<input type="radio" name="pocket" value="WithoutPocket">
	<br>
	<label>Color : </label>
	<select name="color">
		<option value="red">Red</option>
		<option value="blue">Blue</option>
		<option value="yellow">Yellow</option>
	</select>
	<br>
	<input type="submit" value="Click Me">
</form>
</body>
</html>