<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="${ad.title}" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">
    <h1>${ad.title}</h1>

    <div class="row">
        <div class="col-md-8">
            <p>${ad.description}</p>
        </div>
    </div>
</div>

</body>
</html>
