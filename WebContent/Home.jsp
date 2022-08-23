<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>Select Action</h1>
<form action="Add.jsp" method="post">		
	<input type="submit" value="Add a Book" />
</form>
<form action="Issue.jsp" method="post">		
	<input type="submit" value="Issue a Book" />
</form>
<form action="Return.jsp" method="post">		
	<input type="submit" value="Return a Book" />
</form>
<form action="AddCust.jsp" method="post">		
	<input type="submit" value="Add new Customer details" />
</form>
<form action="ShowbookServlet" >		
	<input type="submit" value="Show all books" />
</form>
</body>
</html>