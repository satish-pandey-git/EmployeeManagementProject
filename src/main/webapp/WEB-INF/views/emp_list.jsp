<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="menu.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
</head>
<body>
<table border="1">
	<tr>
		<th>Name</th>
		<th>Email</th>
		<th>Department</th>
		<th>Delete</th>
		<th>Update</th>
	</tr>
	<c:forEach var="employee" items="${employee}">
	<tr>
		<td>${employee.name}</td>
		<td>${employee.email}</td>
		<td>${employee.department}</td>
		<td><a href="delEmp?id=${employee.id}">delete</a></td>
		<td><a href="getEmpById?id=${employee.id}">update</a></td>
	</tr>
	</c:forEach>
</table>
${del}
${update}
</body>
</html>