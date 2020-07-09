package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Meng Xin
 * @Date 2020/7/9 20:55
 */
@WebServlet("/Set-Cookie")
public class SetCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.setHeader("Set-Cookie", "today=2020-7-9");
        Cookie cookie = new Cookie("today", "2020-070-09");
        
        resp.addCookie(cookie);

        resp.setContentType("text/html; charset=utf-8");
        resp.getWriter().println("成功种下cookie");
    }
}
