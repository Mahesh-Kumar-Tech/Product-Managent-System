<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8" import="java.util.*,test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Bill</title>
<style>
    body {
        height: 100vh;
        margin: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        background-color: #f4f4f4;
        font-family: Arial, sans-serif;
    }
    .container {
        background: #fff;
        padding: 60px 60px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
        text-align: center;
    }
    .title {
        font-size: 24px;
        font-weight: bold;
        margin-bottom: 20px;
    }
    .bill-details {
        display: grid;
        grid-template-columns: auto auto;
        gap: 10px 30px;
        justify-content: center;
        text-align: left;
        margin-bottom: 20px;
    }
    .bill-details .label {
        font-weight: bold;
        
    }
    .buttons {
        margin-top: 20px;
        display: flex;
        justify-content: center;
        gap: 50px;
    }
    .buttons a {
        padding: 10px 20px;
        background-color: #4CAF50;
        color: white;
        text-decoration: none;
        border-radius: 5px;
        font-size: 16px;
    }
    .buttons a:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>

<%
CustomerBean cbean = (CustomerBean)session.getAttribute("cbean");
ProductBean pbean = (ProductBean)request.getAttribute("pbean");
Integer rqty = (Integer)request.getAttribute("rqty");

// Check if pbean and rqty are available
if (pbean != null && rqty != null) {
%>
<div class="container">
    <div class="title">Product Bill</div>
    <div class="bill-details">
        <div class="label">Code:</div> <div><%= pbean.getpCode() %></div>
        <div class="label">Name:</div> <div><%= pbean.getpName() %></div>
        <div class="label">Price:</div> <div>₹<%= pbean.getpPrice() %></div>
        <div class="label">Stock:</div> <div><%= pbean.getpStock() %></div>
        <div class="label">Required Qty:</div> <div><%= rqty %></div>
        <div class="label">Total Amount:</div> <div>₹<%= pbean.getpPrice() * rqty %></div>
    </div>
    <div class="buttons">
        <a href="finalBuy?pcode=<%= pbean.getpCode() %>&rqty=<%= rqty %>">Proceed Payment</a>
        <a href="buy">Back</a>
    </div>
</div>
<% } else { %>
<div class="container">
    <div class="title">Invalid product or quantity.</div>
</div>
<% } %>

</body>
</html>
