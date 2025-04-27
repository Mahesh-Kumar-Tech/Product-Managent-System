<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"
    import ="test.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        background-color: #e9f1f7;
    }

    .container {
        text-align: center;
        background: linear-gradient(to right, #aee6ff, #76baff); /* softened blue gradient */
        padding: 30px 50px;
        border-radius: 12px;
        min-height: 200px;
        box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
    }

    .welcome-message {
        background-color: #d1ecf1;
        color: #0c5460;
        padding: 10px 15px;
        border-radius: 8px;
        font-size: 20px;
        margin-bottom: 20px;
    }

    a {
        display: inline-block;
        margin: 10px;
        padding: 10px 20px;
        text-decoration: none;
        background-color: #0056b3; /* darker blue for better contrast */
        color: white;
        border-radius: 8px;
    }

    a:hover {
        background-color: #004099;
    }
</style>
</head>
<body>
    <div class="container">
        <%
            AdminBean ab = (AdminBean) session.getAttribute("abean");
        %>
        <div class="welcome-message">Welcome User: <%= ab.getaFullName() %></div>
        <a href="product.html">Add Product</a>
        <a href="view">View All Products</a>
        <a href="logout">Logout</a>
    </div>
</body>
</html>
