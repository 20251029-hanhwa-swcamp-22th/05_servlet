<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP액션 태그</title>
</head>
<body>
<%
    // 자바코드를 태그모양으로 바꾸는게 액션태그
%>

    <h1>testAction.jsp 입니다.</h1>
<hr>
<div>
    <%
        int num = 200;
    %>
<%-- 컴파일오류 (실행전 오류 "정적")
- 원인 : 컴파일 전에 두 jsp  코드가 하나로 합쳐지면서
        변수명(int) 가 중복되어 오류가 발생함
   <%@include file="common.jsp"%>--%>

    <%--JSP 액션 태그 : include
        - 런타임 중에 jsp를 포함 시킹
        - 변수명 중복 문제 X
    --%>
    <jsp:include page="common.jsp"></jsp:include>
    <jsp:include page="common.jsp"/>

<%--    &lt;%&ndash; forward :  요청 위임 &ndash;%&gt;
    <%
        RequestDispatcher rd = request.getRequestDispatcher("주소");
        rd.forward(request, response); 이긴걸 밑에꺼로 줄여씀
    %>--%>
    <%
        request.setAttribute("name", "백동훈");
    %>
  
    <jsp:forward page="testForward.jsp"/>
    

</div>
<hr>

</body>
</html>
