<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<link rel="stylesheet"
		href="https://formden.com/static/cdn/bootstrap-iso.css" />

	<!-- Inline CSS based on choices in "Settings" tab -->
	<style>
.bootstrap-iso .formden_header h2, .bootstrap-iso .formden_header p,
	.bootstrap-iso form {
	font-family: Arial, Helvetica, sans-serif;
	color: black
}

.bootstrap-iso form button, .bootstrap-iso form button:hover {
	color: white !important;
}

.asteriskField {
	color: red;
}
</style>
	<div class="bootstrap-iso">
		<div class="container-fluid">
			<%-- 
		<div class="container-fluid">
			<ul class="list-group">
				<c:forEach var="course" items="${allCourses}">
					<li class="list-group-item"><c:out value="${course.name}" /></li>
				</c:forEach>

			</ul>  
		</div>   --%>

			<table class="table table-striped table-dark">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">Amount</th>
						<th scope="col">Ref Id</th>
						<th scope="col">Date</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="txn" items="${allTransactions}">
						<tr>
							<td><c:out value="${txn.id}" /></td>
							<td><c:out value="${txn.amount}" /></td>
							<td><c:out value="${txn.refId}" /></td>
							<td><c:out value="${txn.transDate}" /></td>
						<tr>
					</c:forEach>
				</tbody>
		</div>
	</div>
</body>
</html>