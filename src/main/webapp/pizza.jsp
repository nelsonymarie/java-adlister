
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Pie</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/pizza-order" method="post">
    <label for="pizzaCrust">Choose a Crust:</label>
    <select name="pizzaCrust" id="pizzaCrust">
        <option value="thin">Thin</option>
        <option value="pan">Pan</option>
    </select>
    <br>
    <label for="pizzaSauceType">Choose a Sauce:</label>
    <select name="pizzaSauceType" id="pizzaSauceType">
        <option value="Marinara">Marinara</option>
        <option value="Buffalo">Buffalo</option>
        <option value="Alfredo">BBQ</option>
    </select>
    <br>
    <label for="pizzaSize">Choose a Size:</label>
    <select name="pizzaSize" id="pizzaSize">
        <option value="medium">Medium</option>
        <option value="large">Large</option>
        <option value="small">Xlarge</option>

    </select>
    <br>
    <input type="checkbox" name="toppings" value="pepperoni">
    <label>Pepperoni</label><br>
    <input type="checkbox" name="toppings" value="sausage">
    <label>Spinach</label><br>
    <input type="checkbox" name="toppings" value="cheese">
    <label>Cheese</label>
    <br>
    <label for="Address">Delivery Address</label>
    <input type="text" id="Address" name="Address" required size="80">
    <input type="submit" value="Submit">
</form>

</body>
</html>