<%@ page contentType="text/html;charset=UTF-8" language="java"
    isErrorPage="true"
%>
<html>
<head>
    <title>Error 처리 페이지</title>
</head>
<body>

<%
    // isErrorPage = "true" 설정 시
    // exception 내장 객체를 사용할 수 있다.
    String exceptionType = exception.getClass().getName();
    String exceptionMessage = exception.getMessage();
%>

<h1 style="color: maroon">
    <%= exceptionType%>
</h1>

<pre style="border: 3px solid #726e86; border-radius: 10px; padding: 20px">
    <%= exceptionMessage%>
</pre>

</body>
</html>
