package org.ho.chap04forwardredirectlecturesoruce.chap01.forward;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/forward")
public class ReceiveInformation extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String userId = request.getParameter("userId"); //body에 payload방식으로 담겨있다
    String password = request.getParameter("password");

    /* RequestDispatcher(요청 발송자)
    * - 현재 서블릿이 받은 요청을 다른 서블릿으로 위임(forward)하는 역할의 객체
    * - 객체 생성 시 위임할 경로 작성
    *   1) 서블릿 요청 주소
    *   2) 파일 경로
    * */

    /* 비즈니스 로직 수행과 응답 화면 생성을 분리하기 위해 다른 서블릿으로 위임
    * => 단일 책임의 원칙을 위해 하나의 기능만 수행하도록 했음 */
    RequestDispatcher rd = request.getRequestDispatcher("/print");  // 서블릿 매핑주소(/print)를 파라미터로 넣었다.

    rd.forward(request,response);
  }
}