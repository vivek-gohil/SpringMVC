<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
</head>
<body>
	<h3>Employee Form</h3>
	<hr>
	<form action="employeeConfirmation">
		<table>
			<tr>
				<td>Employee Id</td>
				<td><input type="text" name="txtEmployeeId" /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td> <input type="text" name="txtName"> </td>
			</tr>
			<tr>
				<td>Salary</td>
				<td> <input type="text" name="txtSalary"> </td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Go"> </td>
			</tr>
		</table>
	</form>
</body>
</html>