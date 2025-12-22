package com.my.chap09eljstllecturesource.el.controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/test1")
public class TestOneServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("name", "길동홍");
    request.setAttribute("age", "15");
    request.setAttribute("phone", "010-1234-5678");

    List<String> items = new ArrayList<>();
    items.add("핸드폰");
    items.add("숟가락");
    items.add("동전");

    request.setAttribute("items", items);

    RequestDispatcher rd = request.getRequestDispatcher("/views/el/testEl1.jsp");

    rd.forward(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}