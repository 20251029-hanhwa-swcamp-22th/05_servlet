<%--
  Created by IntelliJ IDEA.
  User: thsck
  Date: 25. 12. 18.
  Time: 오전 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String menuName = request.getParameter("menuName");
    int amount = Integer.parseInt(request.getParameter("amount"));

    int orderPrice = (Integer) request.getAttribute("orderPrice");
%>

    <h1>주문 내역</h1>
    <h3>주문한 음식 : <%= menuName%></h3>
    <h3>주문한 수량 : <%= amount%></h3>
    <h3>결제 금액 : <%= orderPrice%></h3>

</body>
</html>
