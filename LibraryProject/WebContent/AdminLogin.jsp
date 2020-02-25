<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
	<h2>Admin Login</h2>
	<form action="AdminLogin" method="post">
		<table>
			<tr>
				<td>Email Address</td>
				<td><input type="email" name="aemail" placeholder=" Email"
					required id=""><br></td>

			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="apassword"
					placeholder=" Password" required id=""><br></td>

			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>