<%--
  Created by IntelliJ IDEA.
  User: lsm
  Date: 2020/11/11
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${findAll}" var="account">
    <tr>
        <th>${account.id}</th>
        <th>${account.name}</th>
        <th><a href="<%=request.getContextPath()%>/demo/delete/?id=${account.id}">删除</a></th>
        <th><a href="<%=request.getContextPath()%>/pages/index.jsp">修改或添加</a></th>
    </tr>
        </c:forEach>
</table>
</body>
</html>
