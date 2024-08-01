<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <h1>Calculator</h1>
    <form action="/calculator/calculate" method="post">
        Operand 1: <input type="text" name="operand1"/><br/>
        Operand 2: <input type="text" name="operand2"/><br/>
        Operation:
        <select name="operation">
            <option value="add">Add</option>
            <option value="subtract">Subtract</option>
            <option value="multiply">Multiply</option>
            <option value="divide">Divide</option>
        </select><br/>
        <input type="submit" value="Calculate"/>
    </form>
</body>
</html>
