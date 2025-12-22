<%--
  Created by IntelliJ IDEA.
  User: playdata2
  Date: 25. 12. 18.
  Time: 오후 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>전달된 객체 출력</h1>

<h3>Expression Tag 방식</h3>
<pre>
    <%= request.getAttribute("name")%>
    <%= request.getAttribute("age")%>
    <%= request.getAttribute("phone")%>
    <%= request.getAttribute("items")%>
</pre>

<hr>

<h3>Expression Language 방식</h3>
<pre>
${requestScope.name}
${requestScope.age}
${requestScope.phone}
${requestScope.items}

    -----------

    EL 구문은 page -> request -> session -> application 순서로 탐색한다!
     -> 밑에 달러에 대괄호 있는것들은 순차적으로 검색
<b>
    ${name}
    ${age}
    ${phone}
    ${items}

    items[0] : ${items.get(0)}
    items[1] : ${items[1]}
    items[2] : ${items[2]}

</b>

</pre>
</body>
</html>
