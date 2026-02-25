<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Search</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="../resources/js/employee-search.js"></script>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
	<h1>Employee Search</h1>

	<div class="search-container">
		<input type="text" id="searchInput" placeholder="Search employees...">
		<button id="searchButton">Search</button>
		<div id="loading" class="loading">Loading...</div>
	</div>

	<table id="resultsTable">
		<thead>
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Department</th>
				<th>Email</th>
			</tr>
		</thead>
		<tbody id="resultsBody">
			<!-- Results will be inserted here by JavaScript -->
		</tbody>
	</table>
</body>
</html>