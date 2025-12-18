<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>주문 결과 페이지</title>
</head>
<body>
    <%
        String menuName = request.getParameter("menuName");
        int amount = Integer.parseInt(request.getParameter("amount"));

        int orderPrice = (Integer)request.getAttribute("orderPrice");
    %>

    <h1>주문 내역</h1>
    <h3>주문한 음식 : <%= menuName%></h3>
    <h3>주문한 수량 : <%= amount%></h3>
    <h3>결제 금액 : <%= orderPrice%></h3>

</body>
</html>
