<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"
    import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
<style>
    body {
        margin: 0;
        padding: 0;
        height: 100vh;
        font-family: Arial, sans-serif;
        display: flex;
        justify-content: center;
        align-items: center;
        background-color: #f5f5f5;
    }

    .container {
        text-align: center;
        background-color: #ffffff;
        padding: 30px 50px;
        border-radius: 12px;
        box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
        border: 2px solid #ff8800; /* Orange border */
    }

    h2 {
        margin: 10px 0;
        color: #333;
    }

    .link-group {
        margin-top: 20px;
    }

    .link-group a {
        text-decoration: none;
        color: white;
        background-color: #007BFF;
        padding: 10px 18px;
        margin: 0 10px;
        border-radius: 6px;
        font-weight: bold;
        border: 1px solid #0056b3;
    }

    .link-group a:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
<%
AdminBean ab = (AdminBean)session.getAttribute("abean");
String msg = (String)request.getAttribute("msg");
%>
<div class="container">
    <h2>Welcome : <%= ab.getaFullName() %></h2>
    <h2><%= msg %></h2>
    <div class="link-group">
        <a href="product.html">Add Product</a>
        <a href="view">View All Products</a>
        <a href="logout">Logout</a>
    </div>
</div>
</body>
</html>
