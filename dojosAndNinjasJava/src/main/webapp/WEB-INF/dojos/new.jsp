<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page isErrorPage="true"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Login and Registration</title>
</head>
<body>
    <c:forEach  items="${dojos}" var="dojo">
	<div class="d-flex">
	<p> Name: ${dojo.name}</p>
	<a class="ml-2"href="/dojos/${dojo.id}">Show one</a>
	<a class="ml-2"href="/dojos/delete/${dojo.id}">Delete</a>
	

</div>
</c:forEach>
        <form:form action="/dojos" method="post" modelAttribute="dojo">
		    <p>
		        <form:label path="name">Name</form:label>
		        <form:input path="name"/>
		        <form:errors path="name"/>
		    </p>
		    <input type="submit" value="Create"/>
		</form:form>
	<a href="/ninjas/new">Create Ninja</a>
    </body>
</html>