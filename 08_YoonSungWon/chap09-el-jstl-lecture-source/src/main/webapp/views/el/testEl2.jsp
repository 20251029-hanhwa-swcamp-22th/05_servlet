<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
        <title>EL Test 2</title>
</head>
<body>
        <h1>전달된 request 객체에 저장된 Member 객체 출력하기</h1>

        <pre>

                Member : ${requestScope.member}

                이름 : ${requestScope.member.name}
                나이 : ${requestScope.member.age}
                전화번호 : ${requestScope.member.phone}
                이메일 : ${requestScope.member.email}

        </pre>
</body>
</html>
