package com.beyond.chap09eljstllecturesource.el.controller;

import com.beyond.chap09eljstllecturesource.el.model.dto.MemberDTO;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/test4")
public class TestFourServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    MemberDTO requestMember = new MemberDTO(19, "홍길동", "010-2313-2323", "hgd1111@gmail.com");
    MemberDTO sessionMember = new MemberDTO(29, "이순신", "010-9453-3157", "lss2233@gmail.com");

    /* request scope 내장 객체에 속성 추가 */
    request.setAttribute("member", requestMember);
    HttpSession session = request.getSession();
    session.setAttribute("member", sessionMember);

    RequestDispatcher rd = request.getRequestDispatcher("/views/el/testEl4.jsp");
    rd.forward(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}