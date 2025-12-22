<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL Test 2</title>
</head>
<body>
    <h1>전달된 request 객체에 저장된 Member 객체 출력하기 </h1>
    <pre>
        member : ${requestScope.member}

        이름 : ${requestScope.member.getName()}
        나이 : ${requestScope.member.age} <%-- 필드명을 쓰더라도, servlet으로 변환 될때, getAge()로 변환 해줌 --%>
        전화번호 : ${member.phone}
        이메일 : ${member.email}

        <%-- EL은 null을 빈칸으로 처리함 --%>
    </pre>
</body>
</html>
