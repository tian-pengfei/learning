package com.tpf.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName="ServletFilter",urlPatterns="/hello")
public class ParamerFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String param=request.getParameter("param");

        if(param.equals("block")){
            return;
        }
        String filter=request.getParameter("filter");
        if(filter==null)
            request.setAttribute("filter","ParamerFilter");
        else
            request.setAttribute("filter",filter+"-->ParamerFilter");
        chain.doFilter(request,response);

    }

    @Override
    public void destroy() {

    }
}
