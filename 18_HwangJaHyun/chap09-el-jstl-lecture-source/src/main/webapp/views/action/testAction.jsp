<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Action Tag</title>
</head>
<body>
    <h1>testAction.jsp입니다.</h1>
    <hr>
    <div>
        <%
            int num = 200;
        %>
        <%--컴파일 오류 발생
            -> 컴파일 전에 두 jsp 코드가 하나로 합쳐지면서 변수명 중복이 발생함
            동적 인클루드
        --%>
        <%--<%@include file="common.jsp"%>--%>

        <%--JSP 액션 태그 : include
             * 런타임 중에 jsp를 포함시킴
             * 변수명 중복 문제 X
             * 동적 인클루드
        --%>
        <%--<jsp:include page="common.jsp" flush="true"></jsp:include>--%>
        <jsp:include page="common.jsp"/>

        <%--forward: 요청 위임--%>
        <%--<%
            RequestDispatcher rd = request.getRequestDispatcher("주소");
            rd.forward(request, response);
        %>--%>
        <%
            request.setAttribute("name","장원영");
        %>
        <jsp:forward page="testForward.jsp"/>
    </div>
</body>
</html>