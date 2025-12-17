package org.ho.chap03responselecturesource.section03.exception;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

// 현재는 show404error에서만 메시지를 설정한거다. 전체 404에서 에러메시지를 설정하고 싶다면 xml로 가야한다.
@WebServlet(value = "/show500error")
public class Show500Error extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.sendError(500,"개발자는 개발 똑바로하라옹~");
  }
}
