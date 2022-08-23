<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Return Book</title>
</head>
<body>
<h1>Returning Book Details </h1>
<form action="ReturnServlet" method="post">
			<table>
				<tr>
					<td>Customer Id</td>
					<td><input type="text" name="cust_id" /></td>
				</tr>
				<tr>
					<td>Book ISBN number</td>
					<td><input type="text" name="isbn_num" /></td>
				</tr>
				<tr>
					<td>Return Date</td>
					<td><input type="text" name="return_date" /></td>
				</tr>

			</table>
			<input type="submit" value="Return Book" /></form>
</body>
</html>