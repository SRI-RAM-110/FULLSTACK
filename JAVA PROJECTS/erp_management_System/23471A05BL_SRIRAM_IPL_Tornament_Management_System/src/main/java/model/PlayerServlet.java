package model;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;

@WebServlet("/players")
public class PlayerServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        ArrayList<Player> playerList = new ArrayList<>();
        
        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM players");
            
            while (rs.next()) {
                int id = rs.getInt("player_id");
                String name = rs.getString("player_name");
                int teamId = rs.getInt("team_id");
                String role = rs.getString("role");
                
                Player player = new Player(id, name, teamId, role);
                playerList.add(player);
            }
            
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        request.setAttribute("players", playerList);
        request.getRequestDispatcher("players.jsp").forward(request, response);
    }
}
