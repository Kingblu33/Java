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
    <h1>New Ninja</h1>
        <form:form action="/ninjas" method="post" modelAttribute="ninja">
        	<p>
        		<label for="dojo_id">Dojo</label>
        		<select name="dojo_id" id="dojo_id">
        			<c:forEach items="${dojos}" var="dojo">
        				<option value="${dojo.id}">
        					<c:out value="${dojo.name}"></c:out>
       					</option>
        			</c:forEach>
        		</select>
        	</p>
		    <p>
		        <form:label path="firstName">First Name</form:label>
		        <form:input path="firstName"/>
		        <form:errors path="firstName"/>
		    </p>
		    <p>
		        <form:label path="lastName">Last Name</form:label>
		        <form:input path="lastName"/>
		        <form:errors path="lastName"/>
		    </p>
		    <p>
		        <form:label path="age">Age</form:label>
		        <form:input path="age"/>
		        <form:errors type="number"  path="age"/>
		    </p>
		    <input type="submit" value="Create"/>
		</form:form>
		<a href="/dojos/new">Dashboard</a>
    </body>
</html>