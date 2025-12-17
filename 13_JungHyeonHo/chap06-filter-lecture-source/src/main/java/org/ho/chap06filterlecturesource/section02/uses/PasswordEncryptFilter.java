package org.ho.chap06filterlecturesource.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

import java.io.IOException;

@WebFilter("/member/*")
public class PasswordEncryptFilter implements Filter {

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    HttpServletRequest request = (HttpServletRequest)servletRequest;

    /* Servlet Wrapper 상속 받은 객체를 생성 */
    RequestWrapper requestWrapper = new RequestWrapper(request);  // 생성자로 HttpServletRequest를 받음
    // 그래서 Wrawpper => 포장 해준거임
    // 그러면 암호화가 수행된다
      // =>       return encoder.encode(super.getParameter(name));

    chain.doFilter(requestWrapper,response);
  }
}
