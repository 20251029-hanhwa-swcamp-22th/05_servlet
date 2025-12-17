package com.mycompany.chap04forwardredirectlecturesource.section01.forward;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/print")
public class PrintLoginSuccess extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String userId = request.getParameter("userId");
    String password = request.getParameter("password");

    StringBuilder sb = new StringBuilder();

    sb.append("<html>")
        .append("<head><title>로그인 성공 페이지</title></head>")
        .append("<body>")
        .append("<h3>userId : ").append(userId).append("</h3>")
        .append("<h3>password : ").append(password).append("</h3>")
        .append("</body>")
        .append("</html>");

    PrintWriter out = response.getWriter();
    out.print(sb);
    out.flush();
    out.close();
  }

}