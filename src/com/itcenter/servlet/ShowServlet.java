package com.itcenter.servlet;

import com.itcenter.service.FlowerService;
import com.itcenter.service.impl.FlowerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ShowServlet class
 *
 * @author apple
 * @date 2019/9/30
 */
@WebServlet(name = "ShowServlet", description = "负责展示的 Servlet", urlPatterns = {"/show"})
public class ShowServlet extends HttpServlet {
    private static FlowerService flowerService = new FlowerServiceImpl();
    private static final String UTF_8_ENCODING = "utf-8";
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding(UTF_8_ENCODING);
        response.setCharacterEncoding(UTF_8_ENCODING);
        var list = flowerService.show();
        request.setAttribute("list", list);
        request.getRequestDispatcher("jsp/show.jsp").forward(request, response);
    }
}