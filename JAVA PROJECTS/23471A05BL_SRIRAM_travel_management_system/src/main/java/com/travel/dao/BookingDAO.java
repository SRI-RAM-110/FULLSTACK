package com.travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.travel.model.Booking;

public class BookingDAO {

    Connection con = DBConnection.getConnection();

    public boolean addBooking(Booking booking) {

        boolean status = false;

        try {

            String query =
            "INSERT INTO bookings(user_id,package_id,hotel_id,travel_date,num_people,total_price,status) VALUES(?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, booking.getUserId());
            ps.setInt(2, booking.getPackageId());
            ps.setInt(3, booking.getHotelId());
            ps.setString(4, booking.getTravelDate());
            ps.setInt(5, booking.getNumPeople());
            ps.setDouble(6, booking.getTotalPrice());
            ps.setString(7, booking.getStatus());

            int row = ps.executeUpdate();

            if (row > 0) {
                status = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}