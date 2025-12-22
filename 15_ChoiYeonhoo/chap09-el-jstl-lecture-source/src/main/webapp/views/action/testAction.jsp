<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Action Tag</title>
</head>
<body>

<h1>testAction.jsp 입니다.</h1>
<hr>
<div>
    <%
        int num = 200;
    %>

    <%-- 컴파일 오류 발생
    - 원인 : 컴파일 전에 2 JSP 코드가 하나로 합쳐지면서
            변수명 중복이 발생
     <%@include file="commom.jsp"%>
     --%>
    <%-- JSP Action Tag : include
        - 런타임 중에 jsp를 포함 시킴
        - 변수명 중복 문제 X
    --%>
<%--    <jsp:include page="commom.jsp" flush="true"></jsp:include>--%>

    <%-- forward : 요청 위임 --%>

<%--        RequestDispatcher rd = request.getRequestDispatcher("주소");--%>
<%--        rd.forward(request,response);--%>
<%--    %>--%>
    <%
        request.setAttribute("name","최연후");
    %>
    <jsp:forward page="testForward.jsp"/>
</div>
<hr>

</body>
</html>
