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
        <h1 class="text-center"><c:out value="${dojo.name}"></c:out> Location Ninja's</h1>
        <table class="table">
        	<thead>
        		<tr>
        			<td>First Name</td>
        			<td>Last Name</td>
        			<td>Age</td>
        		</tr>
        	</thead>
        	<tbody>
        		<c:forEach items="${dojo.ninjas}" var="ninja">
        			<tr>
        				<td><c:out value="${ninja.firstName}"></c:out></td>
        				<td><c:out value="${ninja.lastName}"></c:out></td>
        				<td><c:out value="${ninja.age}"></c:out></td>
       				</tr>
        		</c:forEach>
        	</tbody>
        </table>
        <a href="/dojos/new">Dashboard</a>
        
    </body>
</html>