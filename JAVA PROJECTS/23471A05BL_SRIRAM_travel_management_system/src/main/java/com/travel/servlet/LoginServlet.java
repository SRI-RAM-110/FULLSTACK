package com.travel.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.travel.dao.UserDAO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        UserDAO dao = new UserDAO();

        boolean status = dao.loginUser(username, password);

        if (status) {
            response.sendRedirect("dashboard.jsp");
        } else {
            response.sendRedirect("login.jsp");
        }
    }
}