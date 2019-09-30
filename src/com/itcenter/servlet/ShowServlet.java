package com.itcenter.servlet;

import com.itcenter.dao.FlowerDao;
import com.itcenter.dao.impl.FlowerDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowServlet", description = "负责展示的 Servlet", urlPatterns = {"/show"})
public class ShowServlet extends HttpServlet {
    private static FlowerDao flowerDao = new FlowerDaoImpl();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var list = flowerDao.selAll();
        request.setAttribute("list", list);
    }
}
