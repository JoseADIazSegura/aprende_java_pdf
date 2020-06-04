<%--
  Created by IntelliJ IDEA.
  User: Josex
  Date: 04/06/2020
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%-- index.jsp (proyecto GatosConClase) --%>
<%@page import="daw1.Gato"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="estilos.css" />
</head>
<body>
<h1>Gatos con clase</h1>
<hr>
<%
    Gato g1 = new Gato("Pepe", "gato.jpg");
    Gato g2 = new Gato("Garfield", "garfield.jpg");
    Gato g3 = new Gato("Tom", "tom.png");
    out.println(g1);
    out.println(g2);
    out.println(g3);
    out.println(g1.maulla());
    out.println(g2.come("sardinas"));
%>
</body>
</html>
