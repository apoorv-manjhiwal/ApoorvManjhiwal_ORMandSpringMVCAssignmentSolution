<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGpLSa9DKKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
	
	
<title>Customer directory</title>
</head>
<body>

	<div class="container">
		<h3>customer List</h3>
		<hr>
		<form action="CustomerManagement/customer/list" class="form-inline">
			<a href="CustomerManagement/customer/showFormForAdd"
				class="btn btn-primary btn-sm mb-3"> Add customer</a>
		</form>


		<table class="table table-bordered table-stripped">
			<thead class="thead-dark">
				<tr>

					<th>First Name</th>
					<th>Last name</th>
					<th>email</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${Customer }" var="tempStudent">
					<tr>
						<td><c:out value=${ tempCustomer.firstName} /></td>
						<td><c:out value=${ tempCustomer.lastName} /></td>
						<td><c:out value=${ tempCustomer.email} /></td>
						
						<td><a
							href="CustomerManagement/customer/showFormForUpdate? id = ${tempCustomer }"
							class="btn btn-info btn-sm ">Update</a> <a
							href="CustomerManagement/Customer/delete? id = ${tempCustomer }"
							class="btn btn-danger btn-sm "
							onlick="if(!(confirm('are you sure you want to delete?'))) return false">delete</a>
						</td>
					</tr>
				</c:forEach>

			</tbody>

		</table>
	</div>


</body>
</html>