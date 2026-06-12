<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

<h2>Travel Management System - Login</h2>

<form action="LoginServlet" method="post">

Username:
<input type="text" name="username" required>
<br><br>

Password:
<input type="password" name="password" required>
<br><br>

<input type="submit" value="Login">

</form>

<br>

<a href="register.jsp">New User? Register Here</a>

</body>
</html>