<%@page pageEncoding="UTF-8"%>
<%@ page import="com.model.Application" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
</head>
<body>
    <table border = 1>
    <tr>
        <th>ID</th>
        <th>ФИО</th>
        <th>Email</th>
        <th>Курс</th>
        <th>Онлайн</th>
    </tr>

    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.fullName}</td>
            <td>${item.email}</td>
            <td>${item.course}</td>
            <td>${item.isOnline}</td>
        </tr>
    </c:forEach>
    </table>
</body>
</html>
