<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Addition Form</title>
</head>
<body>
<h1>Customer Details </h1>
<form action="AddCustServlet" method="post">
			<table>
				<tr>
					<td>Customer ID</td>
					<td><input type="text" name="cust_id" /></td>
				</tr>
				<tr>
					<td>Customer Name</td>
					<td><input type="text" name="cust_name" /></td>
				</tr>
				<tr>
					<td>Customer Phonenumber</td>
					<td><input type="text" name="cust_phno" /></td>
				</tr>
				<tr>
					<td>Customer Email Id</td>
					<td><input type="text" name="cust_email" /></td>
				

			</table>
			<input type="submit" value="Add Customer" /></form>
</body>
</html>