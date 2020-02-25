<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList, com.killer.beans.LibrarianBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Librarian</title>
<link href="StyleSheet.css" rel="Stylesheet">
</head>
<body>
<br>
<br>
	<table align="center">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
			<th>Mobile</th>
		</tr>
		<tr>
			<%
				ArrayList<LibrarianBean> list = (ArrayList<LibrarianBean>) request.getAttribute("view");
				for (LibrarianBean lb : list) {
					Integer id = lb.getId();
					String name = lb.getName();
					String email = lb.getEmail();
					String password = lb.getPassword();
					Long mobile = lb.getMobile();
			%>
		
		<tr>
			<td><%=id%></td>
			<td><%=name%></td>
			<td><%=email%></td>
			<td><%=password%></td>
			<td><%=mobile%></td>

		</tr>

		<%
			}
		%>

	</table>
</body>
</html>