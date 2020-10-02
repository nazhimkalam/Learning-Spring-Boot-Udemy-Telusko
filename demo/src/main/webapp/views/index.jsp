<%@ page language="java" contentType="text/html; ISO-8859-1 charset=UTF-8" pageEncoding="UTF-8"  %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    Welcome to Telusko

    <form action="addAlien" method="post">
        Enter ID : <input type="text" name="aid"><br>
        Enter name : <input type="text" name="aname"><br>
        <input type="submit">
    </form>
    <hr>
    <form action="getAlien" method="get">
        Enter your id : <input type="text" name="aid"><br>
        <input type="submit">
    </form>
</body>
</html>