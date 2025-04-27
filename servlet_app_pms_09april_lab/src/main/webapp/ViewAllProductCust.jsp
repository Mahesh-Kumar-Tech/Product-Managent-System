<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f8;
        padding: 20px;
        text-align: center;
    }

    table {
        margin: 0 auto;
        border-collapse: collapse;
        width: 80%;
        background-color: #fff;
        border: 2px solid #444; /* updated border color */
        border-radius: 10px;
        overflow: hidden;
        box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
    }

    th, td {
        padding: 12px 15px;
        border: 1px solid #ccc;
        text-align: center;
    }

    th {
        background: linear-gradient(to right, #3366cc, #3399ff); /* new gradient background */
        color: white;
        font-size: 16px;
    }

    tr:nth-child(even) {
        background-color: #f9f9f9;
    }

    .btn-container {
        margin-top: 20px;
    }

    .btn {
        text-decoration: none;
        padding: 10px 20px;
        background-color: #3399ff;
        color: white;
        border-radius: 8px;
        margin: 0 10px;
        font-weight: bold;
        border: none;
        box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);
    }

    .btn:hover {
        background-color: #287dc4;
    }

    .action-links a {
        margin: 0 5px;
        text-decoration: none;
        color: #0066cc;
        font-weight: bold;
    }

    .action-links a:hover {
        text-decoration: underline;
    }

</style>


</head>
<body>

<%
    AdminBean ab = (AdminBean) session.getAttribute("abean");
    ArrayList<ProductBean> aL = (ArrayList<ProductBean>) session.getAttribute("aList");
%>

<% if (aL == null || aL.isEmpty()) { %>
    <div>No Product Available...</div>
<% } else { %>
    <table>
        <tr>
            <th>Product Code</th>
            <th>Product Name</th>
            <th>Product Price</th>
            <th>Product Stock</th>
            <th>Action</th>
        </tr>
        <% for (ProductBean pb : aL) { %>
        <tr>
            <td><%= pb.getpCode() %></td>
            <td><%= pb.getpName() %></td>
            <td><%= pb.getpPrice() %></td>
            <td><%= pb.getpStock() %></td>
            <td class="action-links">
                <a href="buy?pcode=<%= pb.getpCode() %>">Buy</a>
            </td>
        </tr>
        <% } %>
    </table>
<% } %>

<div class="btn-container">
    <a href="custlogout" class="btn">Logout</a>
</div>

</body>
</html>
