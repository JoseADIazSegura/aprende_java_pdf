<%--
  Created by IntelliJ IDEA.
  User: Josex
  Date: 04/06/2020
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>
Me gusta mucho comer
<% out.print(request.getParameter("cadenaIntro"));%>
</body>
</html>
