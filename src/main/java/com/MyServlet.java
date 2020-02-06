package com;

import com.db.DB;
import com.model.Application;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/boo")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter out = resp.getWriter();
//        out.print("<h1>MyServlet Welcome!</h1>");
        req.setAttribute("text", "The best language is: ");
        req.setAttribute("name", "JAVA");
        boolean result = true;
        
        if (result)
            req.getRequestDispatcher("success.jsp").forward(req, resp);
        req.getRequestDispatcher("fail.jsp").forward(req, resp);
        req.getRequestDispatcher("new.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Application application = new Application();
        application.setFullName(req.getParameter("fio"));

        DB db = new DB();
        boolean result = db.addApplication(application);
        if (result)
        System.out.println();
        System.out.println(req.getParameter("profile"));
    }
}


class Customer{
    String fio;
    String profile;
}
