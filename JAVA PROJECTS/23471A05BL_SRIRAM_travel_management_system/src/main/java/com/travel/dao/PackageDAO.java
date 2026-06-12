package com.travel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.travel.model.Package;

public class PackageDAO {

    Connection con = DBConnection.getConnection();

    public ArrayList<Package> getAllPackages() {

        ArrayList<Package> list = new ArrayList<>();

        try {

            String query = "SELECT * FROM packages";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Package p = new Package();

                p.setPackageId(rs.getInt("package_id"));
                p.setPackageName(rs.getString("package_name"));
                p.setDestination(rs.getString("destination"));
                p.setDurationDays(rs.getInt("duration_days"));
                p.setDescription(rs.getString("description"));
                p.setPrice(rs.getDouble("price"));
                p.setImageUrl(rs.getString("image_url"));

                list.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}