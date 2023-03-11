<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Guessing Game</title>
</head>
<body>
<form action="guess" method="post">
    <label for="guess">Guess a number between 1 and 3:</label>
    <input type="number" id="guess" name="guess" min="1" max="3">
    <input type="submit" value="Submit">
</form>
</body>
</html>
