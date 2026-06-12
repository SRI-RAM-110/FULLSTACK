<%@ page import="java.util.ArrayList" %>
<%@ page import="com.travel.dao.HotelDAO" %>
<%@ page import="com.travel.model.Hotel" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hotels</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

<h2>Available Hotels</h2>

<table border="1">

<tr>
    <th>ID</th>
    <th>Hotel Name</th>
    <th>Location</th>
    <th>Rating</th>
    <th>Price/Night</th>
</tr>

<%
HotelDAO dao = new HotelDAO();
ArrayList<Hotel> list = dao.getAllHotels();

for(Hotel h : list){
%>

<tr>
    <td><%= h.getHotelId() %></td>
    <td><%= h.getHotelName() %></td>
    <td><%= h.getLocation() %></td>
    <td><%= h.getRating() %></td>
    <td><%= h.getPricePerNight() %></td>
</tr>

<%
}
%>

</table>

<br>
<a href="dashboard.jsp">Back</a>

</body>
</html>