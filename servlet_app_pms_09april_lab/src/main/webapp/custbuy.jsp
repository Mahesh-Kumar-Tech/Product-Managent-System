<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,test.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Buy Product</title>

<style>
    /* Reset */
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    body {
        min-height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        background: linear-gradient(135deg, #dbe6f6, #c5796d);
        font-family: 'Poppins', sans-serif;
    }

    .container {
        background: #ffffff;
        padding: 40px 50px;
        border-radius: 15px;
        box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
        width: 90%;
        max-width: 500px;
    }

    h1 {
        font-size: 26px;
        margin-bottom: 20px;
        text-align: center;
        color: #333333;
    }

    .page-belongs {
        font-size: 18px;
        text-align: center;
        margin-bottom: 20px;
        color: #333;
    }

    .product-info {
        margin-bottom: 25px;
    }

    .product-info div {
        margin: 10px 0;
        font-size: 16px;
        color: #555;
        display: flex;
    }

    .product-info div strong {
        width: 140px;
        flex-shrink: 0;
    }

    form {
        margin-top: 20px;
    }

    .form-group {
        display: flex;
        align-items: center;
        margin-bottom: 20px;
    }

    label {
        width: 140px;
        font-size: 16px;
        color: #333;
        margin-right: 10px;
    }

    input[type="text"] {
        flex: 1;
        padding: 12px 15px;
        border: 1px solid #ccc;
        border-radius: 8px;
        font-size: 16px;
    }

    input[type="submit"] {
        width: 100%;
        padding: 12px;
        background-color: #3399ff;
        color: white;
        font-size: 18px;
        border: none;
        border-radius: 8px;
        cursor: pointer;
        transition: background-color 0.3s;
    }

    input[type="submit"]:hover {
        background-color: #287dc4;
    }
</style>

</head>
<body>

<%
ProductBean pb = (ProductBean) request.getAttribute("pbean");
CustomerBean cb = (CustomerBean) session.getAttribute("cbean");
%>

<div class="container">
    <h1>Buy Product</h1>

    <!-- Page belongs to line (centered) -->
    <div class="page-belongs">
        Page Belongs to: <%= cb.getcFirstName() %>
    </div>

    <div class="product-info">
        <div><strong>Customer:</strong> <span><%= cb.getcFirstName() %></span></div>
        <div><strong>Code:</strong> <span><%= pb.getpCode() %></span></div>
        <div><strong>Name:</strong> <span><%= pb.getpName() %></span></div>
        <div><strong>Price:</strong> <span>₹<%= pb.getpPrice() %></span></div>
        <div><strong>Stock:</strong> <span><%= pb.getpStock() %></span></div>
    </div>

    <form action="addq" method="post">
        <input type="hidden" name="pcode" value="<%= pb.getpCode() %>">

        <div class="form-group">
            <label for="qty">Required Quantity:</label>
            <input type="text" name="qty" id="qty" required>
        </div>

        <input type="submit" value="Buy Product">
    </form>
</div>

</body>
</html>
