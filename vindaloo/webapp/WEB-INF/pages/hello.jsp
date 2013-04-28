<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/pages/include.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><fmt:message key="hello.title"/></title>
</head>
<body>
	<h1>Greetings, it is now <c:out value="${now}"/></h1>
	
	<h3>Products</h3>
	<c:forEach items="${products}" var="prod">
		<c:out value="${prod.description}"/> <i>$<c:out value="${prod.price}"/></i>
		<br><br>
	</c:forEach>
	
</body>
</html>