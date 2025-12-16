package com.mins.chap03responselecturesource.section03.exception;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/* 커스텀 에러 페이지 */
@WebServlet(value="/showErrorPage")
public class ExceptionHandler extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     {
       Enumeration<String> attrs = req.getAttributeNames();
       while(attrs.hasMoreElements()) {
         String attr = attrs.nextElement();
         System.out.println(attr + " : " + req.getAttribute(attr));
       }

       int statusCode = (int)req.getAttribute("jakarta.servlet.error.status_code");
       String message = /*(String)req.getAttribute("jakarta.servlet.error.message");*/ "어차피 입금하셔야합니다";
       String servletName = (String)req.getAttribute("jakarta.servlet.error.servlet_name");

       if (statusCode == 404) message = " 페이지를 못찾아";
       else if (statusCode == 500) {
         message = " 500 에러는 개발자의 잘못!!!(근데 개발자가 여러분)";
       }

       StringBuilder sb = new StringBuilder();
       sb.append("<html>")
           .append("<head>")
           .append("<title>응답페이지</title>")
           .append("</head>")
           .append("<body><h1>")
           .append(statusCode)
           .append("</h1><h2>")
           .append(message)
           .append("</h2><h3>")
           .append(servletName)
           .append("</h3></body>")
           .append("</html>");

       resp.setContentType("text/html");
       PrintWriter printWriter = resp.getWriter();
       printWriter.println(sb);
       printWriter.flush();
       printWriter.close();
    }
  }
}
