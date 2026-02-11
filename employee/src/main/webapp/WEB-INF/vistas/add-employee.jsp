<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<title>ADD EMPLOYEE</title>
	</head>
	<body>
	
	<c:if test="${not empty successMessage}">
    	<p style="color:green; font-weight:bold;">${successMessage}</p>
	</c:if>
	
	<c:if test="${not empty duplicateError}">
    	<p style="color:red; font-weight:bold;">${duplicateError}</p>
	</c:if>
	
	<c:if test="${not empty genericError}">
    	<p style="color:red; font-weight:bold;">${genericError}</p>
	</c:if>
	
		<form:form action="${pageContext.request.contextPath}/system/homepage" method="post">
			<td><button type="submit">Return to Home</button></td>
		</form:form>
	
	
		<form:form  action="add" method="post" modelAttribute="employee">
			<h2>ADD EMPLOYEE</h2>
			<table>
				<tr>
					<td>FirstName:</td>
					<td><form:input path="firstName"/></td>
					<td><form:errors path="firstName" style="color:red;"/></td>
				</tr>
				<tr>
					<td>MiddleName:</td>
					<td><form:input path="middleName"/></td>
					<td><form:errors path="middleName" style="color:red;"/></td>
				</tr>
				<tr>
					<td>LastName:</td>
					<td><form:input path="lastName"/></td>
					<td><form:errors path="lastName" style="color:red;"/></td>
				</tr>
				<tr>
					<td>DateOfBirth:</td>
					<td><form:input path="birthDate" placeholder="YYYY-MM-DD"/></td>
					<td><form:errors path="birthDate" style="color:red;"/></td>
				</tr>
				<tr>
					<td>Position:</td>
					<td><form:input path="position"/></td>
					<td><form:errors path="position" style="color:red;"/></td>
				</tr>
				<tr>
						<td><input type="submit" value="Save"></td>
				</tr>
			</table>
		</form:form>
	</body>
</html>