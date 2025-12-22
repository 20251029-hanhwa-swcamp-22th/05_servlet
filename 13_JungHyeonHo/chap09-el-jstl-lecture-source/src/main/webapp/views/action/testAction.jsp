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
    - 원인 : 컴파일 전에 두 jsp 코드가 하나로 합쳐지면서(정적)
            변수명 중복이 발생함
    <%@include file="common.jsp" %>
    --%>

    <%-- JSP  액션 태그 : include
        - 런타임 중에  jsp를 포함 시킴(동적)
        - 변수명 중복 문제 X
    --%>
    <jsp:include page="common.jsp"></jsp:include>
    <%--전달할 파라미터는 태그 사이에 적어야됨--%>


    <%-- forward : 요청 위임 --%>
    <%--
    <%
        RequestDispatcher rd = request.getRequestDispatcher("주소");
        rd.forward(request,response);
    %>
    --%>
    <%
        request.setAttribute("name","강성훈");
    %>
    <%-- /testForward => 루트밑에 바로 tertForward
    testForward => 같은 디렉터리의 testForward --%>
    <jsp:forward page="testForward.jsp"></jsp:forward>

</div>
<hr>
</body>
</html>
