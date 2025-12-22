<%--
  Created by IntelliJ IDEA.
  User: playdata2
  Date: 2025-12-18
  Time: 오후 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>전달 된 request 객체에 저장된 속성 값 출력 하기</h1>

<h3>Expression Tag 방식</h3>
<pre>
    <%=request.getAttribute("name")%>
    <%=request.getAttribute("age")%>
    <%=request.getAttribute("phone")%>
    <%=request.getAttribute("items")%>
</pre>

<hr>
<h3>Expression Language 방식</h3>
<pre>
    ${requestScope.name}
    ${requestScope.age}
    ${requestScope.phone}
    ${requestScope.items}

    --------------------------------------------

    EL 구문은
    page -> request -> session -> application 순서로 탐색한다!!!

    name:${name} page에서 조회해보고 -> request에서 조회해보고 -> session -> application
    age:${age}
    phone:${phone}
    items:${items}

    items[0] : ${items.get(0)}
    items[1] : ${items[1]}  ArrayList.get대신 [ ] 안에 index를 넣기만 해도 된다
    items[2] : ${items[2]}

    
</pre>

</body>
</html>
