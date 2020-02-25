<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Librarian</title>
</head>
<body>
	<h2>Add Librarian</h2>
	<form action="AddLibrarian" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="lname" id="" placeholder=" Name"
					required><br></td>
			</tr>
			<tr>
				<td>Email Address</td>
				<td><input type="email" name="lemail" placeholder=" Email"
					required id=""><br></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="lpassword"
					placeholder=" Password" required id=""></td>
			</tr>
			<tr>
				<td>Mobile Number</td>
				<td><input type="number" name="lnumber" placeholder=" Number"
					required id=""><br></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>