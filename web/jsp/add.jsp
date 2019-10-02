<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2019/9/30
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>添加花卉</title>
</head>

<body>
    <form action="../insert" method="post">
        <table>
            <caption>添加花卉</caption>
            <tbody>
                <tr>
                    <th>花卉名称</th>
                    <td><input type="text" name="name" /></td>
                </tr>
                <tr>
                    <th>花卉价值</th>
                    <td><input type="text" name="price" /></td>
                </tr>
                <tr>
                    <th>花卉场地</th>
                    <td><input type="text" name="production" /></td>
                </tr>
            </tbody>
        </table>
        <input type="submit" value="提交" />
    </form>
</body>

</html>