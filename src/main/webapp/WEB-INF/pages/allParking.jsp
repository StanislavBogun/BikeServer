<%--
  Created by IntelliJ IDEA.
  User: koytt
  Date: 01.12.2019
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Parking</title>
</head>
<body>
<h2><p>All Parking</p></h2>

<table>
    <tr>
        <th>id</th>
        <th>title</th>
        <th>photo_id</th>
        <th>description</th>
        <th>users_rating</th>
        <th>lat</th>
        <th>long</th>
    </tr>
    <c:forEach var="parking" items="${parkingList}">
        <tr>
            <td>${parking.id}</td>
            <td>${parking.title}</td>
            <td>${parking.photoId}</td>
            <td>${parking.description}</td>
            <td>${parking.usersRating}</td>
            <td>${parking.latitude}</td>
            <td>${parking.longitude}</td>
            <td>
                <a href="/edit/${parking.id}">edit</a>
                <a href="/delete/${parking.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h2>Add</h2>
<c:url value="/add" var="add"/>
<a href="${add}">Add new parking</a>
</body>

</html>
