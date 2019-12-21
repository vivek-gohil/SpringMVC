<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Employee</title>
</head>
<body>
	<h3>New Employee Form</h3>
	<form:form action="confirmDetails" modelAttribute="empObject">
		<table>
			<tr>
				<td>Employee Id</td>
				<td><form:input path="employeeId" /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><form:input path="salary" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Go"></td>
			</tr>
		</table>
	</form:form>


</body>
</html>