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
        <h2>Add Book Form</h2>
        <table>
            <tr>
                <td>Call-No</td>
                <td><input type="text" name="call-no" required><br></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" required><br></td>
            </tr>
            <tr>
                <td>Author</td>
                <td><input type="text" name="author" required><br></td>
            </tr>
            <tr>
                <td>Publisher</td>
                <td><input type="text" name="publisher" required><br></td>
            </tr>
            <tr>
                <td>Quantity</td>
                <td><input type="text" name="quantity" required><br></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Save Book"></td>
            </tr>

        </table>
      


    </form>
</body>
</html>