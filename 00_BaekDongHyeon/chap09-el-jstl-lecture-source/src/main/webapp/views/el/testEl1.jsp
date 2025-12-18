<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test EL 1</title>
</head>
<body>
    <h1>전달 된 request 객체에 저장된 속성 값 출력 하기 </h1>

    <h3>Expression Tag 방식</h3>
    <pre>
        <%= request.getAttribute("name") %>
        <%= request.getAttribute("age") %>
        <%= request.getAttribute("phone") %>
        <%= request.getAttribute("items") %>
    </pre>

    <hr>

    <h3>Expression Language 방식</h3>
    <pre>
        ${requestScope.name}
        ${requestScope.age}
        ${requestScope.phone}
        ${requestScope.items}

        ---------------------------------

        EL 구문은
        page -> request -> session -> application 순서로 탐색한다!!

        ${name}
        ${age}
        ${phone}
        ${itmes}

        items[0] : ${items.get(0)}
        items[1] : ${items[1]}
        items[2] : ${items[2]}
        

    </pre>

</body>
</html>
