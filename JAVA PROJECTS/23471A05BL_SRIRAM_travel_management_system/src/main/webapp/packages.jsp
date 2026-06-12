<%@ page import="java.util.ArrayList" %>
<%@ page import="com.travel.dao.PackageDAO" %>
<%@ page import="com.travel.model.Package" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Packages</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

<h2>Available Travel Packages</h2>

<table border="1">

<tr>
    <th>ID</th>
    <th>Package Name</th>
    <th>Destination</th>
    <th>Duration</th>
    <th>Price</th>
</tr>

<%
PackageDAO dao = new PackageDAO();
ArrayList<Package> list = dao.getAllPackages();

for(Package p : list){
%>

<tr>
    <td><%= p.getPackageId() %></td>
    <td><%= p.getPackageName() %></td>
    <td><%= p.getDestination() %></td>
    <td><%= p.getDurationDays() %></td>
    <td><%= p.getPrice() %></td>
</tr>

<%
}
%>

</table>

<br>
<a href="dashboard.jsp">Back</a>

</body>
</html>