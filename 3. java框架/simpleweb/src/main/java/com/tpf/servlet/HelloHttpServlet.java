package com.tpf.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/hello")
public class HelloHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getOutputStream().write(("经历的filter: "+
                (String) req.getParameter("filter")).getBytes("UTF-8"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String param1=req.getParameter("param1");
        String param2=req.getParameter("param2");
        String contentLength = req.getHeader("Content-Length");
        //resp.setContentType("text/html;charset=UTF-8");

        resp.getOutputStream().write("<html><h1>你好哇</h1></html>".getBytes("UTF-8"));
    }
}
