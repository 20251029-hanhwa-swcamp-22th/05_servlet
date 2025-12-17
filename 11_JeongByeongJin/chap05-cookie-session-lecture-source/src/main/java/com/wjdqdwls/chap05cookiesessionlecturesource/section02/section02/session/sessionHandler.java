package com.wjdqdwls.chap05cookiesessionlecturesource.section02.section02.session;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/session")
public class sessionHandler extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    /* Session
     * - 클라이언트가 최초로 서버에 요청을 보낼 때 생성되는 객체
     * - 서버에서 해당 객체를 관리를 하고
     * - 생성된 Session 객체의 ID 를 클라이언트에게 전달(쿠키 이용)
     * - 이후 요청 시 클라이언트가 쿠키(Session ID)를 같이 받아와
     *   서버에 Session ID가 일치하는 Session 객체가 있는지 확인
     *   -> 있으면 해당 객체를 반환해서 활용
     *      -> 이떄, 반환 받은 객체에 값이 세팅되어 있다면 활용 가능
     *         == 상태 유지
     *
     *   -> 없으면 새 Session 객체를 생성해서 반환
     * */

    HttpSession session = request.getSession();

    System.out.println("session id : = " + session.getId());

    // 세션 유지 시간 지정(기본 값 30분 유지)
    session.setMaxInactiveInterval(60 * 10); // 초 단위

    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");

    /* 세션 객체에 값을 속성을 추가
    * -> 겉운 클라이언트가 다음에 요청하는 경우
    *    해당 세션에 담긴 값을 얻어서 사용할 수 있다!
    * */
    session.setAttribute("firstName", firstName);
    session.setAttribute("lastName", lastName);

    response.sendRedirect("/session-redirect");
  }
}


