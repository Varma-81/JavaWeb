<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADD EMPLOYEE</title>
</head>
<body>
	<form:form modelAttribute="employee">
	
		<table>
		
			<tr>
				<td>FirstName:</td>
				<td>
					<form:input path="firstName"/>
					<form:errors path="firstName" />
				</td>
			</tr>
			
			<tr>
				<td>MiddleName:</td>
				<td>
					<form:input path="middleName"/>
					<form:errors path="middleName" />
				</td>
			</tr>
			
			<tr>
				<td>LastName:</td>
				<td>
					<form:input path="lastName"/>
					<form:errors path="lastName" />
				</td>
			</tr>
			
			<tr>
				<td>DateOfBirth:</td>
				<td>
					<form:input path="birthDate" type="date"/>
					<form:errors path="birthDate" />
				</td>
			</tr>
			
			<tr>
				<td>Position:</td>
				<td>
					<form:input path="position" />
					<form:errors path="position" />
				</td>
			</tr>
			
			<tr>
				<td>
					<button type="submit">Add Employee</button>
				</td>
			</tr>
			
			
		</table>
	</form:form>
</body>
</html>