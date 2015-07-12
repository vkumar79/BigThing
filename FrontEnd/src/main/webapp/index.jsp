<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Spring 4 MVC - HelloWorld Index Page</title>
</head>
<body>
<h2>Student Information</h2>
<form:form method="POST" action="/hello">
	<table>
		<tr>
			<td><form:label path="id">Name</form:label></td>
			<td><form:input path="id" /></td>
		</tr>
		<tr>
			<td><form:label path="content">Name</form:label></td>
			<td><form:input path="content" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Submit" /></td>
		</tr>
	</table>
</form:form>
</body>
</html>