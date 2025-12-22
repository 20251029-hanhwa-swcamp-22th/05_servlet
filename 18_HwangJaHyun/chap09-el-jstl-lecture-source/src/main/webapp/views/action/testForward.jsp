<%--
  Created by IntelliJ IDEA.
  User: playdata2
  Date: 2025-12-18
  Time: 오전 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--Expression Tag--%>
    <h1><%=request.getAttribute("name")%></h1>
    <%--Expression Languege, EL--%>
    <h1>${name}</h1>
</body>
</html>
