<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
</head>
<body>
<h1>Update Employee Details</h1>
<form action="updateEmp" method="post">
<table border="1">
		<tr><td><input type="hidden" name="id" value="${employee.id}"></td></tr>
		<tr><td>Name</td><td><input type="text" name="name" value="${employee.name}" ></td></tr>
		<tr><td>Email</td><td><input type="text" name="email" value="${employee.email}"></td></tr>
		<tr><td>Department</td><td><input type="text" name="department" value="${employee.department}"></td></tr>
		<tr><td><input type="submit" value="Update"></td></tr>
</table>
</form>
</body>
</html>