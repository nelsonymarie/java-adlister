<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Ads</title>
</head>
<body>
<h1>All Ads</h1>
<table>
    <tr>
        <th>Title</th>
        <th>Description</th>
        <th>Price</th>
    </tr>
    <c:forEach var="ad" items="${ads}">
        <tr>
            <td>${ad.title}</td>
            <td>${ad.description}</td>
            <td>${ad.price}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
