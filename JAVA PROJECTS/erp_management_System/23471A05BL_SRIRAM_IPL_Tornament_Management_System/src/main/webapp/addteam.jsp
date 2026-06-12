<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add New Team</title>
    <style>
        body {
            font-family: Arial;
            background: linear-gradient(135deg, #667eea, #764ba2);
            padding: 50px;
        }
        .form-container {
            background: white;
            padding: 40px;
            max-width: 400px;
            margin: 0 auto;
            border-radius: 10px;
        }
        h1 { color: #667eea; text-align: center; }
        input {
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            border: 1px solid #ddd;
            border-radius: 5px;
            font-size: 16px;
        }
        button {
            width: 100%;
            padding: 15px;
            background: #667eea;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 18px;
            cursor: pointer;
        }
        button:hover { background: #5568d3; }
        a {
            color: white;
            text-decoration: none;
            display: block;
            margin-top: 20px;
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h1>➕ Add New Team</h1>
        <form action="addteam" method="post">
            <input type="text" name="teamName" 
                   placeholder="Team Name (e.g., Chennai Super Kings)" required>
            <input type="text" name="shortName" 
                   placeholder="Short Name (e.g., CSK)" required>
            <button type="submit">Add Team</button>
        </form>
        <a href="index.jsp">← Back to Home</a>
    </div>
</body>
</html>
