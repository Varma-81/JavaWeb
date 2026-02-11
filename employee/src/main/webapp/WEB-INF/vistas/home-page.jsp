<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
	<head>
	<title>HOMEPAGE</title>
	</head>
	<body>
		<h2 style="text-align:center;">WELCOME TO EMPLOYEE MANAGEMENT SYSTEM</h2>
		<table>
			<tr>
				<td>
					<form action="add" method="get">
						ADD EMPLOYEE: <input type="submit" value="Add"/>
					</form>
					<br>
					
					<form action="search">
						SEARCH EMPLOYEE:  <input type="submit" value="Search"/>
					</form>
					
					<form action="search">
						ADD COMPENSATION: <input type="submit" value="Add Compensation">
					</form>
				</td>
			</tr>
		</table>
	</body>
</html>