<%--
  Created by IntelliJ IDEA.
  User: Josex
  Date: 04/06/2020
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Información del entorno de trabajo</h1>
<%
    out.print("Fabricante de Java: " + System.getProperty("java.vendor"));
    out.print("<br>Url del fabricante: " + System.getProperty("java.vendor.url"));
    out.print("<br>Versión: " + System.getProperty("java.version"));
    out.print("<br>Sistema operativo: " + System.getProperty("os.name"));
    out.print("<br>Usuario: " + System.getProperty("user.name"));
%>
</body>
</body>
</html>
