<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
</head>
<body>
	<h2>SUBMITTED STUDENT DETAILS</h2>
	<table>
		<tr>
			<td>Name:</td>
			<td>${student.name}</td>
		</tr>
		<tr>
			<td>Department:</td>
			<td>${student.department}</td>
		</tr>
		<tr>
			<td>Phone:</td>
			<td>${student.phone}</td>
		</tr>
	</table>
</body>
</html>