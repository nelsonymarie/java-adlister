<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
<h1>Login Form</h1>
<form method="post" action="login.jsp">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username"/><br/><br/>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password"/><br/><br/>
    <input type="submit" value="Login"/>
</form>
</body>
</html>

<c:if test="${param.username eq 'admin' and param.password eq 'password'}">
    <c:redirect url="profile.jsp"/>
</c:if>
<c:if test="${not empty param.username or not empty param.password}">
    <h2>Invalid username or password.</h2>
</c:if>
