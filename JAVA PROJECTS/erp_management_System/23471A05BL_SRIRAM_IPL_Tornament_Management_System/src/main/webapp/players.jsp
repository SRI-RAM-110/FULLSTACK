<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Player" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Players</title>
    <style>
        body { font-family: Arial; background: #f5f5f5; padding: 30px; }
        h1 { color: #667eea; }
        table {
            width: 100%;
            background: white;
            border-radius: 10px;
            overflow: hidden;
        }
        th { background: #667eea; color: white; padding: 15px; }
        td { padding: 12px; border-bottom: 1px solid #ddd; }
        a { color: #667eea; text-decoration: none; }
    </style>
</head>
<body>
    <h1> All IPL Players</h1>
    <a href="index.jsp">← Back to Home</a>
    <br><br>
    <table>
        <tr>
            <th>Player ID</th>
            <th>Player Name</th>
            <th>Team ID</th>
            <th>Role</th>
        </tr>
        <% 
        ArrayList<Player> players = (ArrayList<Player>) request.getAttribute("players");
        for (Player player : players) {
        %>
        <tr>
            <td><%= player.getPlayerId() %></td>
            <td><%= player.getPlayerName() %></td>
            <td><%= player.getTeamId() %></td>
            <td><%= player.getRole() %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>
