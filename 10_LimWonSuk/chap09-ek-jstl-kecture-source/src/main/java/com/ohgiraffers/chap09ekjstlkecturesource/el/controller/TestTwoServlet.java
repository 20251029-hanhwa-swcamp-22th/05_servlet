package com.ohgiraffers.chap09ekjstlkecturesource.el.controller;

import com.ohgiraffers.chap09ekjstlkecturesource.el.model.dto.MemberDTO;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/test2")
public class TestTwoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MemberDTO member =
                new MemberDTO("임동현", 35, "010-9031-1339","herolim1998@gmail.com");

        request.setAttribute("member", member);

        RequestDispatcher rd
                = request.getRequestDispatcher("/views/el/testEl2.jsp");

        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}