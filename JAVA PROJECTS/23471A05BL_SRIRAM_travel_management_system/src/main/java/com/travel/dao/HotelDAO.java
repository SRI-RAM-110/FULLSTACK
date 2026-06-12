package com.travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.travel.model.Hotel;

public class HotelDAO {

    Connection con = DBConnection.getConnection();

    public ArrayList<Hotel> getAllHotels() {

        ArrayList<Hotel> list = new ArrayList<>();

        try {

            String query = "SELECT * FROM hotels";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Hotel h = new Hotel();

                h.setHotelId(rs.getInt("hotel_id"));
                h.setHotelName(rs.getString("hotel_name"));
                h.setLocation(rs.getString("location"));
                h.setRating(rs.getDouble("rating"));
                h.setPricePerNight(rs.getDouble("price_per_night"));
                h.setDescription(rs.getString("description"));
                h.setImageUrl(rs.getString("image_url"));

                list.add(h);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}