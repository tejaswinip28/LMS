<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Issue Book</title>
</head>
<body>
<h1>Issuing Book Details </h1>
<form action="IssueServlet" method="post">
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
					<td>Staff Id</td>
					<td><input type="text" name="staff_id" /></td>
				</tr>
				<tr>
					<td>Issue Date</td>
					<td><input type="text" name="issue_date" /></td>
				</tr>
					<tr>
					<td>Return Date</td>
					<td><input type="text" name="return_date" /></td>
				</tr>
				<tr>
					<td>Payment Status</td>
					<td><input type="text" name="pay_status" /></td>
				</tr>
				<tr>
					<td>Paid Amount</td>
					<td><input type="text" name="paid_amount" /></td>
				</tr>

			</table>
			<input type="submit" value="Issue Book" /></form>
</body>
</html>