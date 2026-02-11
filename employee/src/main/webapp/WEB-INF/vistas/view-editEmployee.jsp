<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View/Edit Employee </title>
</head>
<body>
	<h2>VIEW / EDIT EMPLOYEE</h2>
	
	
	<!-- Updated Successfully -->
	<c:if test="${not empty successMessage}">
    	<p class="success">${successMessage}</p>
	</c:if>
	
	
	
	
	<form:form action="update" method="post" modelAttribute="employee">
	
		<!-- Error in updating the data -->
		<form:errors path="*" style="color:red" />
	
		<table>
			<tr>
				<td>Employee Id</td>
				<td>
					<form:input path="uid" readonly="true"/>
					<form:hidden path="uid"/>
				</td>
			</tr>
			<tr>
				<td>First Name</td>
				<td>
					<form:input path="firstName" />
					<form:errors path="firstName" />
				</td>
				 
			</tr>
			<tr>
				<td>Middle Name</td>
				<td>
					<form:input path="middleName"/>
					<form:errors path="middleName" />
				</td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td>
					<form:input path="lastName"/>
					<form:errors path="lastName" />
				</td>
			</tr>
			<tr>
				<td>Birth Date</td>
				<td>
					<form:input path="birthDate"/>
					<form:errors path="birthDate" />
				</td>
			</tr>
			<tr>
				<td>Position</td>
				<td>
					<form:input path="position"/>
					<form:errors path="position" />
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Update"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>