<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel=stylesheet href="style.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lab02</title>
</head>
<body>
	<div>
	<display:table name="${employees}" decorator="ca.bcit.a00843681.data.DateDecorator" sort="list" requestURI="lab02">
		<display:column property="id" title="ID" sortable="true"/>
		<display:column property="firstName" title="First Name" sortable="true"/>
		<display:column property="lastName" title ="Last Name" sortable="true"/>
		<display:column property="dob" title="Date of Birth" sortable="true"/>
	</display:table>
	</div>
</body>
</html>