<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Registrationservlet" method="get">
        <table style="with: 50%">
        <tr>
                <td>User_id</td>
                <td><input type="text" name="user_id"/></td>
            </tr>
            <tr>
                <td>Full Name</td>
                <td><input type="text" name="fullname"/></td>
            </tr>
            <tr>
                <td>Username</td>
                <td><input type="text" name="userName"/></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="pass"/></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><input type="text" name="address"/></td>
            </tr>
            <tr>
                <td>Age</td>
                <td><input type="text" name="age"/></td>
            </tr>
            <tr>
                <td>Qualification</td>
                <td><input type="text" name="qual"/></td>
            </tr>
            <tr>
                <td>Percentage</td>
                <td><input type="text" name="percent"/></td>
            </tr>
            <tr>
                <td>Year Passed</td>
                <td><input type="text" name="yop"/></td>
            </tr>
        </table>
        <input type="submit" value="register"/>
    </form>
</body>
</html>