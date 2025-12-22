package com.mycompany.chap09eljstllecturesource.el.controller;

import com.mycompany.chap09eljstllecturesource.el.model.dto.MemberDTO;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/test2")
public class TestTwoServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    MemberDTO member = new MemberDTO("최연후",35, "010-5777-1856","cyhhoo@gmail.com");

    request.setAttribute("member",member);
    RequestDispatcher rd = request.getRequestDispatcher("/views/el/testEl2.jsp");
    rd.forward(request,response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}