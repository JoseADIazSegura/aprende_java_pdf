<%--
  Created by IntelliJ IDEA.
  User: Josex
  Date: 04/06/2020
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Ejemplo de tabla</h1>
<table border="2">
    <tr>
        <td>Número</td><td>Cuadrado</td>
    </tr>
<%
    for(int i = 0; i < 10; i++) {
        out.println("<tr>");
        out.println("<td>" + i + "</td>");
        out.println("<td>");
        out.println(i * i);
        out.println("</td></tr>");
    }
%>
</table>
</body>
</html>
