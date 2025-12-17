package org.ho.chap04forwardredirectlecturesoruce.chap02.redirect;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/redirect")
public class Redirect extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    /* redirect로 인한 클라이언트의 재 요청은 무조건 Get 방식이다!!!!!! */
    System.out.println("/redirect 처리 서블릿으로 리다이렉트 완료!!!!");

    response.setContentType("text/html"); //자동으로 charset=UTF-8 지정됨
    PrintWriter out = response.getWriter();
    out.print("<h1>/redirect 처리 서블릿으로 리다이렉트 완료!!!</h1>"); //head, body를 안붙여도 contentType이 text/html이기 때문에 자동으로 붙음
    out.flush();
    out.close();
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}