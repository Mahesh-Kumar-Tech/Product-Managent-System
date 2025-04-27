<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.CustomerBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Home</title>
<style>
    body {
        margin: 0;
        padding: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f0f2f5;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .container {
        background-color: #fff;
        padding:50px 50px;
        border-radius: 10px;
        box-shadow: 0 8px 16px rgba(0, 0, 0, 0.1);
        text-align: center;
    }

    .welcome-message {
        font-size: 22px;
        font-weight: bold;
        color: #333;
        margin-bottom: 50px;
    }

    a {
        text-decoration: none;
        background-color: #007bff;
        color: white;
        padding: 10px 20px;
        border-radius: 6px;
        font-size: 16px;
        transition: background-color 0.3s ease;
    }

    a:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
    <div class="container">
        <%
            CustomerBean cb = (CustomerBean) session.getAttribute("cbean");
        %>
        <div class="welcome-message">Welcome Customer: <%= cb.getcFirstName() %></div>
        <a href="viewall">View All Products</a>
    </div>
</body>
</html>
