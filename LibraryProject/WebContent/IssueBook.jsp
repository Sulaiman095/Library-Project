<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	    <form action="">
        <h2>Issue Book Form</h2>
        <table>
            <tr>
                <td>Book Call-No</td>
                <td><input type="text" name="bookno" required><br></td>
            </tr>
            <tr>
                <td>Student Id</td>
                <td><input type="text" name="sno" required><br></td>
            </tr>
            <tr>
                <td>Student Name</td>
                <td><input type="text" name="sname" required><br></td>
            </tr>
            <tr>
                <td>Student Mobile</td>
                <td><input type="text" name="smobile" required><br></td>
            </tr>
            
            <tr>
                <td></td>
                <td><input type="submit" value="Issue Book"></td>
            </tr>

        </table>
      
    </form>
</body>
</html>