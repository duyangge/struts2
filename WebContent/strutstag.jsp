<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--form标签  -->
	<s:form>
		<!--theme= simple 都在一行-->
		<!-- 普通输入项 -->
		<s:textfield name="username" label="username"></s:textfield>
		
		<!-- 密码输入项 -->
		<s:password name="password" label="password"></s:password>
		
		<!-- 单选输入项 -->
			<!--value值与显示值一样  -->
			<s:radio list="{'男','女'}" name="sex" label="性别"></s:radio>
			
			<!--value值与显示值不一样  -->
			<s:radio list="#{'man':'男','woman':'女'}" name="sex" label="性别"></s:radio>
			
		<!--复选输入项  -->
		<s:checkboxlist list="{'篮球','羽毛球','兵兵球','足球'}" name="hobby" label="hobby"></s:checkboxlist>
		
		<!--下拉输入框  -->
		<s:select list="{'大专','本科','硕士','博士'}" name="collage" label="collage"></s:select>
		
		<!--文件上传项  -->
		<s:file name="file" label="file"></s:file>
		
		<!--隐藏项  -->
		<s:hidden></s:hidden>
		
		<!--文本域  -->
		<s:textarea name="introcemyself" label="introcemyself"></s:textarea>
		
			<!--提交按钮  -->
		<s:submit value="提交"></s:submit>
		
		<!--重置按钮 -->
		<s:reset value="重置"></s:reset>
	</s:form>
</body>
</html>