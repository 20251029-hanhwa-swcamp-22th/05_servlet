<%--
  Created by IntelliJ IDEA.
  User: playdata2
  Date: 2025-12-18
  Time: 오후 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>파라미터 값 받아서 출력하기</title>
</head>
<body>
<h1>파라미터 값 받아서 출력하기</h1>
<pre>
    상품명 : <%=request.getParameter("name")%>
<%--    가격 : ${price} = <%=request.getAttribute("price")%>  attribute가 아닌 parameter로 설정(쿼리스트링) --%>
    가격 : ${param.price}
    제품번호 : ${param.no}  <%-- 배열 주소가 출력됨 --%>
    제품번호[] : ${paramValues.no}  <%-- 배열 전체가 출력됨 --%>
    제품번호[1] : ${paramValues.no[1]}  <%-- 1번 인덱스가 출력됨 --%>

    <%-- EL 내에서 간단한 연산 가능 --%>
    옵션 : ${empty param.option ? "옵션 없음" : param.option}

</pre>
</body>
</html>
