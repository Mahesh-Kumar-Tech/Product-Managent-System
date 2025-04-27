<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Product</title>
<style>
    * {
        box-sizing: border-box;
    }
    body {
        margin: 0;
        height: 100vh;
        font-family: Arial, sans-serif;
        background: #f0f2f5;
        display: flex;
        justify-content: center;
        align-items: center;
    }
    .form-box {
        background: #fff;
        padding: 30px 40px;
        border-radius: 15px;
        box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        width: 350px;
        text-align: center;
    }
    .form-box h2 {
        margin-bottom: 20px;
        color: #333;
    }
    .form-box label {
        display: block;
        text-align: left;
        margin-top: 10px;
        font-weight: bold;
        color: #555;
    }
    .form-box input[type="text"] {
        width: 100%;
        padding: 8px;
        margin-top: 5px;
        border: 1px solid #ccc;
        border-radius: 8px;
    }
    .form-box input[type="submit"] {
        margin-top: 20px;
        padding: 10px 20px;
        background-color: #4CAF50;
        color: white;
        border: none;
        border-radius: 8px;
        cursor: pointer;
        font-size: 16px;
        transition: background 0.3s;
    }
    .form-box input[type="submit"]:hover {
        background-color: #45a049;
    }
    .admin-info {
    margin-bottom: 15px;
    font-size: 16px;
    font-weight: bold;
}

</style>
</head>
<body>
<%
AdminBean ab = (AdminBean)session.getAttribute("abean");
ProductBean pb = (ProductBean) request.getAttribute("pbean");
%>
<div class="form-box">
    <div class="admin-info">
        Page Belongs To Admin: <%=ab.getaFullName()%>  </div>
    <form action="update" method="post">
        <input type="hidden" name="pcode" value="<%=pb.getpCode() %>">
        
        <label for="pprice">Product Price:</label>
        <input type="text" id="pprice" name="pprice" value="<%=pb.getpPrice() %>">
        
        <label for="pstock">Product Stock:</label>
        <input type="text" id="pstock" name="pstock" value="<%=pb.getpStock() %>">
        
        <input type="submit" value="Update">
    </form>
</div>
</body>
</html>
