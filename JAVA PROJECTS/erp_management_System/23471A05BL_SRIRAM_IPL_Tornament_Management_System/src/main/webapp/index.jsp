<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>IPL Tournament System</title>
    <style>
        body {
            font-family: Arial;
            background: linear-gradient(135deg, #667eea, #764ba2);
            padding: 50px;
            text-align: center;
        }
        h1 { color: white; font-size: 40px; }
        a {
            color: white;
            background: #667eea;
            padding: 15px 30px;
            margin: 10px;
            text-decoration: none;
            border-radius: 5px;
            font-size: 18px;
        }
        a:hover { background: #5568d3; }
    </style>
</head>
<body>
    <h1> IPL Tournament Management System</h1>
    <p style="color: white; font-size: 20px;">Student Project - Java + MySQL</p>
    <br><br>
    <a href="teams">View All Teams</a>
    <a href="addteam.jsp">Add New Team</a>
    <a href="players">View All Players</a>
</body>
</html>
