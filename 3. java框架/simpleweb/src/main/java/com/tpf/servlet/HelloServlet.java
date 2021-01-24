package com.tpf.servlet;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

public class HelloServlet implements Servlet {

    String myParam=null;
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("加载了");

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String contextParam=(String)req.getServletContext().getAttribute("contextParam");
        res.getWriter().write("contextParam is  "+contextParam);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}


