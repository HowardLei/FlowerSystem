<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019/9/30
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>花卉编号</th>
            <th>花卉</th>
            <th>花卉</th>
            <th>花卉</th>
        </tr>
        <c:forEach items="${list}" var="flower">
            <tr>
                <td>${flower.}</td>
                <td>${flower.}</td>
                <td>${flower.}</td>
                <td>${flower.}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
