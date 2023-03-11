<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Pick a Color</title>
</head>
<body>
<h1>Pick a Color</h1>
<form method="post" action="${pageContext.request.contextPath}/pickcolor">
    <label>Enter your favorite color:</label>
    <label>
        <input type="text" name="color" />
    </label>
    <br/><br/>
    <input type="submit" value="Submit" />
</form>
</body>
</html>
