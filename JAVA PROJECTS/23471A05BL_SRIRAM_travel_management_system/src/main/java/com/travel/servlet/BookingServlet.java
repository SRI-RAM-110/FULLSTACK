package com.travel.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.travel.dao.BookingDAO;
import com.travel.model.Booking;

@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        Booking booking = new Booking();

        booking.setUserId(Integer.parseInt(request.getParameter("userId")));
        booking.setPackageId(Integer.parseInt(request.getParameter("packageId")));
        booking.setHotelId(Integer.parseInt(request.getParameter("hotelId")));
        booking.setTravelDate(request.getParameter("travelDate"));
        booking.setNumPeople(Integer.parseInt(request.getParameter("numPeople")));
        booking.setTotalPrice(Double.parseDouble(request.getParameter("totalPrice")));
        booking.setStatus("pending");

        BookingDAO dao = new BookingDAO();

        if (dao.addBooking(booking)) {
            response.sendRedirect("dashboard.jsp");
        } else {
            response.sendRedirect("booking.jsp");
        }
    }
}