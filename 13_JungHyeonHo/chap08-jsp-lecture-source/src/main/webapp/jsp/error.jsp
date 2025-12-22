<%@ page contentType="text/html;charset=UTF-8" language="java"
         isErrorPage="true"
%>
<%--isErrorPage가 true라면 exception 내장 객체를 쓸 수 있다.--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String exceptionType = exception.getClass().getName();
    String exceptionMessage = exception.getMessage();
%>
<h1 style="color:red">
    <%= exceptionType %>
</h1>
<pre style="boarder : 3px solid #ddd; boarder-radius: 10px;padding:20px">
    <%= exceptionMessage %>
</pre>
</body>
</html>
