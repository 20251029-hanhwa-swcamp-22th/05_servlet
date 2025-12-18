<%--
  Created by IntelliJ IDEA.
  User: playdata2
  Date: 25. 12. 18.
  Time: 오후 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>전달된 객체 출력</h1>

    <pre>
        <b>
        member : ${requestScope.member}

        이름 : ${requestScope.member.getName()}
        나이 : ${requestScope.member.age}
            <b>
        번호 : ${member.phone}
        이메일 : ${member.email}


    </pre>
    </b>
</body>
</html>
