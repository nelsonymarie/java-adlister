<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All Ads</title>
</head>
<body>
<h1>All Ads</h1>
<ul>
    <c:forEach var="ad" items="${ads}">
        <li>${ad.title}</li>
    </c:forEach>
</ul>
</body>
</html>
