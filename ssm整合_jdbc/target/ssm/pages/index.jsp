<%--
  Created by IntelliJ IDEA.
  User: lsm
  Date: 2020/11/11
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/demo/updata">
    id:<input type="text" name="id"><br/>
    name:<input type="text" name="name"><br/>
    <input type="submit" value="提交">
</form>

<form action="<%=request.getContextPath()%>/demo/insert">
    id:<input type="text" name="id"><br/>
    name:<input type="text" name="name"><br/>
    <input type="submit" value="添加">
</form>

</body>
</html>
