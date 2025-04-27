<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Status</title>
<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background-color: #f8f9fa;
    }

    .success-msg {
        width: 100%;
        background-color: #d4edda;
        color: #155724;
        padding: 20px;
        text-align: center;
        font-size: 18px;
        font-weight: bold;
        border-bottom: 2px solid #c3e6cb;
        box-shadow: 0 2px 8px rgba(0,0,0,0.1);
        position: fixed;
        top: 0;
        left: 0;
        z-index: 1000;
    }
</style>

<script>
    // Redirect after 6 seconds
    setTimeout(function() {
        window.location.href = "Customer.html";
    }, 6000);
</script>
</head>
<body>
	<div class="success-msg">
	    <%
	    out.println("Customer registered Successfully...<br>Redirecting to Login page...");
	    %>
	</div>
</body>
</html>
