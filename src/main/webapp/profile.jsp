<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Profile</title>
</head>
<body>
<h1>Welcome, <%= session.getAttribute("username") %>!</h1>
<p>This is your profile page.</p>
</body>
</html>
