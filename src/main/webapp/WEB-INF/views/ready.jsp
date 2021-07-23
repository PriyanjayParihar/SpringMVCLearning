<%--
  Created by IntelliJ IDEA.
  pojo.User: priya
  Date: 23-07-2021
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>ready</title>
</head>
<body>
<h1>name is =${name}</h1>
<%--by sciplet loop on  list--%>
<h3>friends list</h3>
<%
    System.out.println(request.getAttribute("name"));
%>
<c:forEach var="item"  items="${friends}">
    <h1><c:out value="${item}"></c:out></h1>
</c:forEach>
</body>
</html>
