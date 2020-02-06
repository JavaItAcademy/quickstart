package com;

import com.db.DB;
import com.model.Application;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/application")
public class ApplicationServlet extends HttpServlet {
    private static DB db = new DB();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("applicationNew.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Application application = new Application();
        application.setFullName(req.getParameter("fullName"));
        application.setCourse(req.getParameter("course"));
        application.setEmail(req.getParameter("email"));
        application.setIsOnline("true".equals(req.getParameter("isOnline")));

        boolean result = db.addApplication(application);

        req.setAttribute("result", result ? "Application created successfully" : "Application failed to create");

        req.getRequestDispatcher("result.jsp").forward(req,resp);
    }
}
