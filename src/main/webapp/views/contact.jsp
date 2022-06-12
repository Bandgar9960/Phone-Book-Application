<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Contact Info</title>
</head>
<body>

	<h2 style="margin-left: 60px;">Contact Info</h2>
	<form action="saveContact">
		<table>


			<tr>
				<td>Name:</td>
				<td><input type="text" name="contactName"></td>
			</tr>

			<tr>
				<td>Email:</td>
				<td><input type="text" name="contactEmail"></td>
			</tr>

			<tr>
				<td>Phno:</td>
				<td><input type="text" name="contactNumber"></td>
			</tr>



		</table>
		<input type="submit" class="btn btn-secondary" value="SUMBIT"
			style="margin-left: 90px; margin-top: 10px;" />

	</form>


</body>
</html>

