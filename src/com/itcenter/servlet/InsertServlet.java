package com.itcenter.servlet;

import com.itcenter.pojo.Flower;
import com.itcenter.service.FlowerService;
import com.itcenter.service.impl.FlowerServiceImpl;

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
@WebServlet(name = "InsertServlet", description = "负责添加元素的 Servlet", urlPatterns = {"/insert"})
public class InsertServlet extends HttpServlet {
    private FlowerService flowerService = new FlowerServiceImpl();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var name = request.getParameter("name");
        var price = request.getParameter("price");
        var production = request.getParameter("production");
        var flower = new Flower(name, Double.parseDouble(price), production);
        var rows = flowerService.add(flower);
        if (rows > 0) {
            response.sendRedirect("show");
        } else {
            response.sendRedirect("/");
        }
    }
}
