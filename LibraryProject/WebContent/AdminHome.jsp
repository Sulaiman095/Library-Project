<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.killer.dao.LoginDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>

</head>
<body>
	<h2>eLibrary</h2>
	<br>
	<h3>
		Welcome
		<%=(String) request.getAttribute("adminname")%></h3>
	<ul>
		<li><a href="home.html">Home</a></li>
		<li><a href="AddLibrarian.jsp">Add Librarian</a></li>
		<li>
			<form action="ViewLibrarians" method="post">
				<input type="submit" name="" value="View librarians" id="">
			</form>
		</li>
		<li>
			<form action="AdminLogout" method="get">
				<input type="submit" value="Logout">
			</form>
		</li>
	</ul>
</body>
</html>