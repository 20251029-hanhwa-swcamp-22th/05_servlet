<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL Test 2</title>
</head>
<body>
<h1>전달된 request 객체에 저장된 Member 객체 출력하기</h1>
<pre>
    member : ${requestScope.member}

    이름 : ${requestScope.member.name}  <%--그냥 필드명을 적으면 서블릿으로 변할때 getName()으로 바뀐다--%>
    나이 : ${requestScope.member.age}     <%-- 근데 getage()로 선언되어있으면 getAge()가 아니므로 못불러옴--%>
    전화번호 : ${member.phone}  <%-- request scope를 자동으로 탐색--%>
    이메일 : ${member.email}
</pre>
</body>
</html>
