package ru.pestov.alexey.plugins.spring.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.pestov.alexey.plugins.spring.service.HTMLService;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class IssueAssigneer extends HttpServlet{
    private static final Logger log = LoggerFactory.getLogger(IssueAssigneer.class);
    private String path;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html");
        resp.getWriter().write("<html><body>" + HTMLService.getHTMLCode() +"</body></html>");
    }

}