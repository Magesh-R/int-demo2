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

			<table class="table table-striped table-dark">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">Client Name</th>
						<th scope="col">Creation Date</th>
						<th scope="col">ref id</th>
						<th scope="col">amount</th>
						<th scope="col">status</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="invoice" items="${allInvoices}">
						<tr>
							<td><c:out value="${invoice.id}" /></td>
							<td><c:out value="${invoice.clientName}" /></td>
							<td><c:out value="${invoice.creDate}" /></td>
							<td><c:out value="${invoice.refId}" /></td>
							<td><c:out value="${invoice.amount}" /></td>
							<td><c:out value="${invoice.status}" /></td>
						<tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>