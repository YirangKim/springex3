<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2024-01-22
  Time: 오후 1:17
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/todo/register" method="post">
    <div>
        Title:<input type="text" name="title">
    </div>
    <div>
        DueDate: <input type="date" name="dueDate" value="2022-12-25">
    </div>
    <div>
        Writer: <input type="checkbox" name="finished">
    </div>
    <div>
        <button type="submit">Register</button>
    </div>
</form>
</body>
</html>
