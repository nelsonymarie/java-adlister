<html>
<head>
    <title>Profile Page</title>
</head>
<body>
<h1>Welcome, <%= session.getAttribute("user") %>!</h1>
<p>This is your profile page.</p>
<a href="logout">Logout</a>
</body>
</html>
