package com.my.chap09eljstllecturesource.el.controller;

import com.my.chap09eljstllecturesource.el.model.dto.MemberDTO;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/test2")
public class TestTwoServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    MemberDTO member = new MemberDTO("시게오", 14, "010-1234-1234", "mob.kageyama@naver.com");

    request.setAttribute("member", member);

    RequestDispatcher rd = request.getRequestDispatcher("/views/el/testEl2.jsp");
    rd.forward(request, response);

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}