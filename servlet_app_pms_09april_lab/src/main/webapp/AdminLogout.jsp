<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout Successful</title>
<style>
  body {
    margin: 0; /* Remove default body margin */
    font-family: sans-serif;
  }

  .logout-container {
    background-color: #f9f9f9;
    padding: 20px;
    text-align: center;
    border-bottom: 1px solid #ddd;
    position: fixed; /* Stick to the top */
    top: 0;
    left: 0;
    width: 100%;
    z-index: 1000; /* Ensure it's on top of other content */
  }

  .logout-message {
    color: green;
    font-size: 1.2em;
    margin-bottom: 0; /* Adjust spacing */
  }

  .content-below {
    padding-top: 60px; /* Add padding to avoid overlap with the fixed header */
  }
</style>
</head>
<body>
  <div class="logout-container">
    <p class="logout-message">
      <%
      session.removeAttribute("abean");
      session.removeAttribute("aList");
      session.invalidate();
      out.println("Admin LoggedOut Successfully....");
      %>
    </p>
  </div>

  <div class="content-below">
    <%@include file="home.html" %>
  </div>
</body>
</html>