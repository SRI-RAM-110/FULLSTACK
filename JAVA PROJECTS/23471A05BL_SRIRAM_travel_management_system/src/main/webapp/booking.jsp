<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Package</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

<h2>Book Travel Package</h2>

<form action="BookingServlet" method="post">

User ID:
<input type="number" name="userId" required>
<br><br>

Package ID:
<input type="number" name="packageId" required>
<br><br>

Hotel ID:
<input type="number" name="hotelId" required>
<br><br>

Travel Date:
<input type="date" name="travelDate" required>
<br><br>

Number of People:
<input type="number" name="numPeople" required>
<br><br>

Total Price:
<input type="number" step="0.01" name="totalPrice" required>
<br><br>

<input type="submit" value="Book">

</form>

<br>
<a href="dashboard.jsp">Back</a>

</body>
</html>