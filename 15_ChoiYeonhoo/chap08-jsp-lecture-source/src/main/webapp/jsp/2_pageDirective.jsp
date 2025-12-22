
<%@ page contentType="text/html;charset=UTF-8" language="java"
    import="java.util.Date" errorPage="error.jsp"
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% // 스크립틀릿
        Date date = new Date();
        System.out.println(date);

    %>

    <%--
      <%= %> : expression 태그
       - 클라이언트 브라우저에 출력하는 태그
       - out.print()
    --%>
<h1>현재 시간 : <%=date %> </h1>


<%
    // 강제 예외 발생
    String str = null;
    System.out.println(str.length());
%>
</body>
</html>
