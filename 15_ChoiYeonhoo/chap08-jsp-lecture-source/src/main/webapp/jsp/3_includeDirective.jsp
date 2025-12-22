<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 25. 12. 18.
  Time: 오전 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3>###### 현재 페이지 #######</h3>
    <hr>

    <div>
    <%-- today.jsp의 내용을 읽어와 해당 위치에 포함시킴
        -> 실행 시 두 jsp가 합쳐져 하나의 Servlet으로 변환됨
    --%>
        <%@include file="today.jsp"%>
    </div>

    <hr>
    <h3>###### 현재 페이지 #######</h3>
</body>
</html>
