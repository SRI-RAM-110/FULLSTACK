package com.travel.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.travel.dao.UserDAO;
import com.travel.model.User;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public RegisterServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String fullName = request.getParameter("fullName");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String password = request.getParameter("password");

        User user = new User();

        user.setFullName(fullName);
        user.setUsername(username);
        user.setEmail(email);
        user.setPhone(phone);
        user.setAddress(address);
        user.setPassword(password);
        user.setRole("customer");

        UserDAO dao = new UserDAO();

        boolean status = dao.registerUser(user);

        if (status) {
            response.sendRedirect("login.jsp");
        } else {
            response.sendRedirect("register.jsp");
        }
    }
}