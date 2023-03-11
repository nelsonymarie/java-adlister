<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order Form</title>
</head>
<body>
<h1>Pizza Order Form</h1>
<form method="POST">
    <div>
        <label for="crustType">Crust Type:</label>
        <select name="crustType" id="crustType">
            <option value="thin">Thin</option>
            <option value="thick">Thick</option>
        </select>
    </div>
    <div>
        <label for="sauceType">Sauce Type:</label>
        <select name="sauceType" id="sauceType">
            <option value="tomato">Tomato</option>
            <option value="barbecue">Barbecue</option>
        </select>
    </div>
    <div>
        <label for="sizeType">Size Type:</label>
        <select name="sizeType" id="sizeType">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>
    </div>
    <div>
        <%--@declare id="toppings"--%><label for="toppings">Toppings:</label>
        <label>
            <input type="checkbox" name="toppings" value="mushrooms">
        </label>Mushrooms
        <label>
            <input type="checkbox" name="toppings" value="peppers">
        </label>Peppers
        <label>
            <input type="checkbox" name="toppings" value="onions">
        </label>Onions
    </div>
    <div>
        <label for="deliveryAddress">Delivery Address:</label>
        <input type="text" name="deliveryAddress" id="deliveryAddress">
    </div>
    <div>
        <button type="submit">Order</button>
    </div>
</form>
</body>
</html>
