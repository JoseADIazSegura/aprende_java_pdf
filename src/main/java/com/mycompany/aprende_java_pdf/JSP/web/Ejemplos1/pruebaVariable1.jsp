<%--
  Created by IntelliJ IDEA.
  User: Josex
  Date: 04/06/2020
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    for (int i = 1; i < 7; i++)
        out.println("<h" + (7-i) + ">"+ i + "</h" + (7-i) + ">");
%>
</body>
</body>
</html>
