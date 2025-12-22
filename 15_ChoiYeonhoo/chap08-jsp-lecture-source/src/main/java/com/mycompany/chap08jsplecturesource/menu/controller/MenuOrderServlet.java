package com.mycompany.chap08jsplecturesource.menu.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/menu/order")
public class MenuOrderServlet extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    /* 1. 요청에 대한 처리(전달 받은 값 추출, 검증)
    * */
    req.setCharacterEncoding("UTF-8");

    String menuName = req.getParameter("menuName");
    int amount = Integer.parseInt(req.getParameter("amount"));

    /* 2. 비즈니스 로직 처리 (원래는 Service 이동 후 CRUD 작업을 하는 형식 )*/

    int orderPrice = 0;

    switch (menuName){
      case "햄버거" :
        orderPrice = 6000 * amount;
        break;
      case "짜장면":
        orderPrice = 7000 * amount;
        break;
      case "짬뽕" :
        orderPrice = 8000 * amount;
        break;
      case "순대국"  :
        orderPrice = 9000 * amount;
        break;
    }
    /* 3. request 내장 객체를 이용해
    * 현재 Servlet + 위임 받는 JSP에서 사용할 수 있는 값 추가
    * -> 값(상태) 유지 범위 : 현재 Servlet + 위임 받는 JSP
    * */

    req.setAttribute("orderPrice", orderPrice);

    /* 4. 응답 페이지 생성 후 응답
    * - PrintWriter를 이용하여
    *   직접 문자열로 html 코드를 작성, 출력하는 것은 힘들다.
    * - html 코드 작성에 용이한 JSP로 요청을 위임(forward)하여,
    *   대신 응답 페이지를 만들어 출력하게 함
    * */

    // 요청 발송자 객체 생성 (요청 주소 또는 jsp 파일 경로)
    RequestDispatcher rd = req.getRequestDispatcher("/jsp/response.jsp");
    rd.forward(req,resp);

  }
}
