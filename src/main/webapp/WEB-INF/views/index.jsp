<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee</title>
</head>
<body>
<h1>Enter Employee Details</h1>
<form action="addEmployee" method="post">
<table border="1">
<tr><td>Name<td><td><input type="text" name="name"></td></tr>
<tr><td>Email<td><td><input type="text" name="email"></td></tr>
<tr><td>Department<td><td><input type="text" name="department"></td></tr>
<tr><td><input type="submit" value="Save"></td></tr>
</table>
</form>
${msg}
</body>
</html>