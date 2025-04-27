<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,test.*"%>
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
        flex-direction: column;
        justify-content: center;
        align-items: center;
        background: #f0f2f5;
    }
    .container {
        background: #fff;
        padding: 30px 40px;
        border-radius: 10px;
        box-shadow: 0px 4px 12px rgba(0, 0, 0, 0.2);
        text-align: center;
        min-width: 350px;
    }
    .welcome {
        font-size: 24px;
        font-weight: bold;
        margin-bottom: 20px;
        color: #333;
    }
    .message {
        font-size: 18px;
        margin-bottom: 25px;
        color: #555;
    }
    .button {
        display: inline-block;
        margin: 10px;
        padding: 10px 20px;
        font-size: 16px;
        text-decoration: none;
        background-color: #4CAF50;
        color: white;
        border-radius: 5px;
        transition: background-color 0.3s ease;
    }
    .button:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>

<div class="container">
<%
CustomerBean cbean = (CustomerBean)session.getAttribute("cbean");
String msg = (String)request.getAttribute("msg");
if(cbean != null){
%>
    <div class="welcome">Welcome To: <%= cbean.getcFirstName() %></div>
<%
}
if(msg != null) {
%>
    <div class="message"><%= msg %></div>
<%
}
%>

    <a href="viewall" class="button">View All Products</a>
    <a href="logout" class="button">Logout</a>
</div>

</body>
</html>
