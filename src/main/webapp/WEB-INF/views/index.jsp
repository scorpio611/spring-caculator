<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: justin
  Date: 13/01/2019
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Personal Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form method="post" action="/calculator" id="cal">
    <table>
        <tr>
            <td><input type="number" name="firstOperand"></td>
            <td><input type="number" name="secondOperand"/></td>
        </tr>
        <tr>
            <td>Operator:
                <select name="operator">
                    <option value="+">Addition</option>
                    <option value="-">Subtraction</option>
                    <option value="*">Multiplication</option>
                    <option value="/">Division</option>
                </select>
            </td>
        </tr>
        <tr>
            <td><input type="submit" value="Calculate"/></td>
        </tr>
    </table>
</form>
<h1>Result <c:out value="${result}"/>: <c:out value="${result}"/></h1>
</body>
</html>