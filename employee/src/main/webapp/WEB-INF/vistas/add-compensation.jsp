<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee Compensation</title>
</head>
<body>
	<h2>Add Employee Compensation</h2>
	
	<!-- Employee Compensation Added Successfully -->
	<c:if test="${not empty successMessage}">
   	 	<p style="color:green;">${successMessage}</p>
	</c:if>
	
	<!-- Error Message -->
	<c:if test="${not empty duplicateMessage}">
	    <p style="color:red;">${duplicateMessage}</p>
	</c:if>
		
	
	<!-- Error Message -->
	<c:if test="${not empty errorMessage}">
	    <p style="color:red;">${errorMessage}</p>
	</c:if>
		
	
	<form:form action="${pageContext.request.contextPath}/system/addCompensation" method="post" modelAttribute="compensation">
	
		
			<table>
					<td>Employee ID:</td>
					    <td>
					        <form:input path="eid" readonly="true" />
					    </td>
					<tr>
						<td>Compensation Type:</td>
						<td>
							<form:select path="compensationType">
								<form:option value="" label="----Select----"></form:option>
								<form:option value="SALARY" >SALARY</form:option>
								<form:option value="BONUS">BONUS</form:option>
								<form:option value="COMMISSION">COMMISSION</form:option>
								<form:option value="ALLOWANCE">ALLOWANCE</form:option>
								<form:option value="ADJUSTMENT">ADJUSTMENT</form:option>
							</form:select>
						</td>
						<td><form:errors path="compensationType" style="color:red"/></td>
					<tr>
					
					<tr>
						<td>Compensation Month:</td>
						<td><form:input path="compDate" type="month" ></form:input></td>
						<td><form:errors path="compDate" style="color:red"/></td>
					</tr>
					
					<tr>
						<td>Amount:</td>
						<td><form:input path="amount"></form:input></td>
						<td><form:errors path="amount" style="color:red"/></td>
					</tr>
					
					<tr>
						<td>Description:</td>
						<td><form:input path="description"></form:input></td>
						 <td><form:errors path="description" cssStyle="color:red"/></td>
					</tr>
					<tr>
						 <td colspan="2" style="text-align:center;">
                			<input type="submit" value="Add Compensation"/>
           			 	 </td>
					</tr>
					
			</table>
	</form:form>
</body>
</html>