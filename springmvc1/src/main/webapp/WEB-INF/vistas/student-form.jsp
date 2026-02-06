<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
</head>
<body>
	<form:form action="save" method="post" modelAttribute="student">
		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="name"/></td>
				<td><form:errors path="name" style="color:red;"/></td>
			</tr>
			<tr>
				<td>Department:</td>
				<td><form:input path="department"/></td>
				<td><form:errors path="department" style="color:red;"/></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><form:input path="phone"/></td>
				<td><form:errors path="phone" style="color:red;"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>