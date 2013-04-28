<%@ include file="/WEB-INF/pages/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
  <title><fmt:message key="title"/></title>
  <style>
    .error { color: red; }
  </style>  
</head>
<body>
<h1>Increase of the amazing amount <c:out value="${priceIncrease.percentage}"/> applied.</h1>
</body>
</html>