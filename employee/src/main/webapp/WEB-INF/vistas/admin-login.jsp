<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
	<head>
		<title>Admin Login</title>
		<style>
			body {
            font-family: Arial, sans-serif;
            background-color: #f4f6f8;
        	}
        .login-box {
            width: 350px;
            margin: 100px auto;
            padding: 25px;
            background: #fff;
            border-radius: 6px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        	}
        h2 {
            text-align: center;
            margin-bottom: 20px;
        	}
        .form-group {
            margin-bottom: 15px;
        	}
        label {
            display: block;
            font-weight: bold;
        	}
        input {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
        	}
        .error {
            color: red;
            font-size: 12px;
        	}
        button {
            width: 100%;
            padding: 10px;
            background: #007bff;
            border: none;
            color: white;
            font-size: 16px;
            cursor: pointer;
        	}
        button:hover {
            background: #0056b3;
        	}
		</style>
	</head>
	<body>
		<div class="login-box">
		<h2>Admin Login</h2>
		<form:form action="homepage" method="post" modelAttribute="admin">
		
			<div class="form-group">
				<label>USERNAME</label>
				<form:input path="userName"/>
				<form:errors path="userName" cssClass="error"/>
			</div>
			
			<div class="form-group">
				<label>PASSWORD</label>
				<form:password path="password"/>
				<form:errors path="password" cssClass="error"/>
			</div>
			
			<button type="submit">Login</button>

		</form:form>
		</div>
	</body>

</html>