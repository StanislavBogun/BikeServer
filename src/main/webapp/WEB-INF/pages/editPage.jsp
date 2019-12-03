<%--
  Created by IntelliJ IDEA.
  User: koytt
  Date: 02.12.2019
  Time: 23:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<c:url value="/edit" var="var"/>
<form action="${var}" method="POST">
    <input type="hidden" name="id" value="${parking.id}">
    <label for="title">Title</label>
    <input type="text" name="title" id="title">

    <label for="photo_id">photo_id</label>
    <input type="text" name="photo_id" id="photo_id">

    <label for="description">description</label>
    <input type="text" name="description" id="description">

    <label for="usersrating">usersrating</label>
    <input type="text" name="usersrating" id="usersrating">

    <label for="latitude">latitude</label>
    <input type="text" name="latitude" id="latitude">

    <label for="longitude">longitude</label>
    <input type="text" name="longitude" id="longitude">

    <input type="submit" value="Edit parking">
</form>
</body>
</html>
