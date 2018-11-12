<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>使用struts2查看值栈结构</title>
</head>
<body>
	<!--使用struts2查看值栈结构 -->
	<s:debug></s:debug>
	<!--获取值栈中字符串 -->
	获取值栈中字符串
	<br/>
	<s:property value="username"/>
	<!--获取值栈中对象的值  -->
	<br/>
	获取值栈中对象的值 
	<br/>
	<s:property value="user.username"/>
	<s:property value="user.password"/>
	<s:property value="user.address"/>
	<!--获取值栈中list集合 数据 -->
		第一种方式实现 （以知固定值
		<s:property value="list[0].username"/>
		<s:property value="list[0].password"/>
		<s:property value="list[0].address"/>
		<br/>
		<s:property value="list[1].username"/>
		<s:property value="list[1].password"/>
		<s:property value="list[1].address"/>
		<br/>
		第二张方式实现 
		<!--s:iterator 类似于jstll中的foreach
		value属性值：为action中的属性
		 -->
		<s:iterator value="list">
			<!--便利list得到每个list里面的User对象  -->
				<s:property value="username"/>
				<s:property value="password"/>
				<s:property value="address"/>
				<br/>
		</s:iterator>
		第三种方式实现：
		<br/>
		<s:iterator value="list" var="user">
		<!-- 
			遍历值栈list集合，得到每个user对象
			机制：把每次遍历出来的user对象放到context里面,临时开辟一个空间key-value;
			获取context中数据特点：写ognl表达式
			使用特殊符号#
		 -->
			<s:property value="#user.username"/>
			<s:property value="#user.password"/>
			<s:property value="#user.address"/>
			<br/>
		</s:iterator>
		<!--获取set方法中的值
			根据名称获取值
		  -->
		  获取set方法中的值:
		 <s:property value="username"/>
		 <br/>
		 获取push方法设置的值
		 <s:property value="[0].top"/>
		 <br>
		 使用foreach标签+el表达式
		 <br/>
		 <c:forEach items="${list}" var="user">
		 	${user.username }
		 	${user.password }
			 ${user.address }
		 </c:forEach>
</body>
</html>