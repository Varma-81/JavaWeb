<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SEARCH EMPLOYEE</title>
</head>
<body>
		<h2>Search Employee</h2>
		<form:form action="${pageContext.request.contextPath}/system/search/results"  method="get" modelAttribute="searchEmployee">
		
			<label>First Name:</label>
			<form:input path="firstName"/>
			
			<label>Last Name:</label>
			<form:input path="lastName"/>
			
			<label>Position:</label>
			<form:input path="position"/>
			
			<input type="submit" value="Search"/>
			
			<input type="button" value="Clear" 
       			onclick="window.location='${pageContext.request.contextPath}/system/search'"/>
		</form:form>
		
		<!-- Results  If Found-->
	<c:if test="${not empty employeeList}">
		<table border="1">
			<tr>
				<td>EID</td>
				<td>FIRST NAME</td>
				<td>MIDDLE NAME</td>
				<td>LAST NAME</td>
				<td>DATE OF BIRTH</td>
				<td>POSITION</td>
			</tr>
			
			
			<c:forEach items="${employeeList}" var="emp">
				<tr>
					<td>${emp.uid}</td>
	                <td>${emp.firstName}</td>
	                <td>${emp.middleName}</td>
	                <td>${emp.lastName}</td>
	                <td>${emp.birthDate}</td>
	                <td>${emp.position}</td>
	                <td>
		                <button>
		                	<a href="${pageContext.request.contextPath}/system/viewEdit?uid=${emp.uid}">View/Edit</a>
		                </button>
		                
		                <button>
		                	<a href="${pageContext.request.contextPath}/system/addCompensation?uid=${emp.uid}">Add Compensation</a>
		                </button>
	                </td>
	       
				</tr>
			</c:forEach>
		</table>
	</c:if>	
	
	<!-- Results If Not Found -->
	<c:if test="${employeeList != null and empty employeeList}">
		<p><strong>0 results found</strong></p>
	</c:if>
		
</body>
</html>