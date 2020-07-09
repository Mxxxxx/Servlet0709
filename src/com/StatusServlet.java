package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Meng Xin
 * @Date 2020/7/9 18:36
 */

//关联新办法
@WebServlet("/status")
public class StatusServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.setStatus(200);
        //resp.setContentType("text/plain;charset=utf-8");
        //resp.getWriter().write("你好");
        //resp.sendError(404, "随便写的");

//        resp.setContentType("text/html; charset=utf-8");
//        resp.getWriter().println("<h1>你好</h1>");

        resp.setStatus(301);
        resp.setHeader("Location","https://www.baidu.com/");

    }
}
