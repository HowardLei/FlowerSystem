package com.itcenter.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * InsertServlet class
 *
 * @author apple
 * @date 2019/9/30
 */
@WebServlet(name = "InsertServlet", description = "负责添加元素的 Servlet", urlPatterns = {"/insertFlower"})
public class InsertServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
