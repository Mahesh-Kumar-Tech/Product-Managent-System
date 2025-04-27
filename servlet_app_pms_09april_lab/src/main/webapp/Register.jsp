<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Status</title>
<style>
    .success-msg {
        color: green;
        font-weight: bold;
        font-size: 18px;
        margin: 20px;
        background-color: #e6ffe6;
        padding: 15px;
        border: 1px solid #66cc66;
        border-radius: 5px;
        text-align: center;
    }
</style>
<script>
    // Redirect after 3 seconds
    setTimeout(function() {
        window.location.href = "home.html";
    }, 6000);
</script>
</head>
<body>
	<div class="success-msg">
	    <%
	    out.println("User registered Successfully...");
	    %>
	    <br>Redirecting to home...
	</div>
</body>
</html>
