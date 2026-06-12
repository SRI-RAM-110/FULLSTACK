package com.travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.travel.model.User;

public class UserDAO {

    Connection con = DBConnection.getConnection();

    public boolean registerUser(User user) {

        boolean status = false;

        try {

            String query =
            "INSERT INTO users(username,password,email,full_name,phone,address,role) VALUES(?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getFullName());
            ps.setString(5, user.getPhone());
            ps.setString(6, user.getAddress());
            ps.setString(7, user.getRole());

            int row = ps.executeUpdate();

            if (row > 0) {
                status = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    public boolean loginUser(String username, String password) {

        boolean status = false;

        try {

            String query =
            "SELECT * FROM users WHERE username=? AND password=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                status = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}