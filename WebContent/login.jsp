<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆页面</title>
</head>
<body>
	<div class="login_all">
	<div class="login_content">
		<form action="${pageContext.request.contextPath}/user_login.action" method="post" name="userlogin" id="login">
			<div class="alllogin">
			<c:remove var="name"/>
				<div>
					<h2>Sign In</h2>
				</div>
				<div class="input_login">
					<div class="login">
						<input class="text" type="text" id="username"  placeholder="输入用户名/手机号" name="username" autocomplete="off"/>
						<br/>
						 <font class="mess">
							<c:if test="${not empty mess}">
								<c:out value="${mess}"/>
							</c:if>
						</font>
						<c:remove var="mess"/>
					</div>
					<br>
					<div class="login">
						<input class="textpass" id="password" type="password"  placeholder="输入密码" name="password">
					</div>
					<br>
					<br>
					<div>
						<input class="button" type="button"  name="login" value="LOGIN" onclick="return reformsheet()">	
					</div>
					<br>
					
				</div>	
			</div>
		</form>
	</div>
</div>
</body>
</html>