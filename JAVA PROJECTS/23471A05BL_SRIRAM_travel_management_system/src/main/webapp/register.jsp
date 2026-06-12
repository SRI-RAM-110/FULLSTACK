<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

<h2>User Registration</h2>

<form action="RegisterServlet" method="post">

FullName:
<input type="text" name="fullName" required>
<br><br>

Username:
<input type="text" name="username" required>
<br><br>

Email:
<input type="email" name="email" required>
<br><br>

Phone:
<input type="text" name="phone">
<br><br>

Address:
<input type="text" name="address">
<br><br>

Password:
<input type="password" name="password" required>
<br><br>

<input type="submit" value="Register">

</form>

<br>

<a href="login.jsp">Already have an account? Login</a>

</body>
</html>