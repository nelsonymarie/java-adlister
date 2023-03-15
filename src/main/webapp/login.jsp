<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<div class="container">
    <form method="POST" action="login.jsp" class="needs-validation" novalidate>
        <div class="form-group">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
            <div class="invalid-feedback">Please enter your username.</div>
        </div>
        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
            <div class="invalid-feedback">Please enter your password.</div>
        </div>
        <button type="submit">Submit</button>
    </form>
</div>
<%-- Check submitted values and redirect accordingly --%>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if(username != null && username.equals("admin") && password != null && password.equals("password")){
        session.setAttribute("username", username);
        response.sendRedirect("profile.jsp");
    } else if(username != null || password != null){
        response.sendRedirect("login.jsp");
    }
%>
</body>
</html>
