<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/data3.action" method="post">
		<table>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="user.username"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="user.password"></td>
			</tr>
			<tr>
				<td>address:</td>
				<td><input type="text" name="user.address"></td>
			</tr>
		</table>
		<br>
		<br>
		<input type="submit">
	</form>
</body>
</html>