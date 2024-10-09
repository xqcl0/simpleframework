package com.imooc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description:
 * @author: Yanghui
 * @create: 2024-10-09 18:15
 **/
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = "简易框架";
        req.setAttribute("name", name);
        req.getRequestDispatcher("WEB-INF/jsp/hello.jsp").forward(req, resp);
    }
}
