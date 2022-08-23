<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form for Adding a new book</title>
</head>
<body>
<h1>Book Details </h1>
<form action="AddServlet" method="post">
			<table>
				<tr>
					<td>Book ID</td>
					<td><input type="text" name="book_id" /></td>
				</tr>
				<tr>
					<td>Book Name</td>
					<td><input type="text" name="book_name" /></td>
				</tr>
				<tr>
					<td>Author Name</td>
					<td><input type="text" name="author_name" /></td>
				</tr>
				<tr>
					<td>Category</td>
					<td><input type="text" name="category" /></td>
				</tr>
					<tr>
					<td>Number of copies</td>
					<td><input type="text" name="numofcopies" /></td>
				</tr>
					<tr>
					<td>Book Price</td>
					<td><input type="text" name="price" /></td>
				</tr>

			</table>
			<input type="submit" value="Add Book" /></form>
</body>
</html>