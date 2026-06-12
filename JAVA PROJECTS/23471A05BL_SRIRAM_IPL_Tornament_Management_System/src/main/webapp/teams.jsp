<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Team" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Teams</title>
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
        tr:hover { background: #f0f0f0; }
        a { color: #667eea; padding: 5px 10px; text-decoration: none; }
    </style>
</head>
<body>
    <h1> All IPL Teams</h1>
    <a href="index.jsp">← Back to Home</a>
    <br><br>
    <table>
        <tr>
            <th>Team ID</th>
            <th>Team Name</th>
            <th>Short Name</th>
        </tr>
        <% 
        ArrayList<Team> teams = (ArrayList<Team>) request.getAttribute("teams");
        for (Team team : teams) {
        %>
        <tr>
            <td><%= team.getTeamId() %></td>
            <td><%= team.getTeamName() %></td>
            <td><%= team.getShortName() %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>
