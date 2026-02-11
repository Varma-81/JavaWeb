<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HOME PAGE</title>
	<style>
		body {
            font-family: Arial, sans-serif;
        }
        .header {
            padding: 15px;
            background-color: #2c3e50;
            color: white;
            font-size: 22px;
            text-align: center;
        }
        .container {
            display: flex;
            margin-top: 20px;
            margin-bottom:20px;
        }
        .functions {
            width: 95%;
            border: 1px solid #ccc;
            padding: 15px;
            margin-right: 20px;
        }
        .views {
            width: 95%;
            border: 1px solid #ccc;
            padding: 15px;
        }
        .placeholder {
            color: #999;
            font-style: italic;
        }
	</style>
</head>
<body>
		<div class="header">
		EMPLOYEE SYSTEM
	</div>
	<div class="container">
		<div class="functions">
			<h3>Functions</h3>
			
			<a href="/employee/add">
            	Add Employee
        	</a>
			
		</div>
	</div>
	<div class="views">
		<h3>Default</h3>
		<p class="placeholder">[Default views will be displayed here]</p>
	</div>
</body>
</html>