package org.ho.chap09eljstllecturesource.el.controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import org.ho.chap09eljstllecturesource.el.model.dto.MemberDTO;

import java.io.IOException;

@WebServlet("/test2")
public class TestTwoServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    MemberDTO member =
        new MemberDTO(
            "정현호",
            26,
            "010-9355-7972",
            "gusgh075@gmail.com");

    request.setAttribute("member",member);

    RequestDispatcher rd
        = request.getRequestDispatcher("/views/el/testEl2.jsp");
    rd.forward(request,response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}