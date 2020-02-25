<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Return Book Form</h3>
	<form action="">
		<table>
			<tr>
				<td>CallNo</td>
				<td><input type="text" name="callno" required
					placeholder=" CallNo" id=""><br></td>
			</tr>
			<tr>
				<td>Student Id</td>
				<td><input type="text" name="sid" placeholder=" Student Id"
					required id=""><br></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Return Book"></td>
			</tr>
		</table>
	</form>
</body>
</html>