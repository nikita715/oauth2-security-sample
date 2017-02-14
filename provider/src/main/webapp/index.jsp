<%--
  Created by IntelliJ IDEA.
  User: nikge
  Date: 11.02.2017
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>Get tokens</h3>
    <form method="post" action="${pageContext.request.contextPath}/oauth/token">
        <input type="hidden" name="grant_type" value="password">
        <label for="get-token__username">Username</label>
        <input id="get-token__username" name="username" type="text" value="nikita">
        <label for="get-token__password">Password</label>
        <input id="get-token__password" name="password" type="password" value="123">
        <input type="submit">
    </form>
    <h3>Get new access token</h3>
    <form method="post" action="${pageContext.request.contextPath}/oauth/token">
        <input type="hidden" name="grant_type" value="refresh_token">
        <label for="refresh-token_token">Refresh token</label>
        <input id="refresh-token_token" name="refresh_token" type="text">
        <input type="submit">
    </form>
    <h3>Get users</h3>
    <form method="get" action="${pageContext.request.contextPath}/user/1">
        <label for="get-user__access-token">Access token</label>
        <input id="get-user__access-token" name="access_token" type="text">
        <input type="submit">
    </form>
</body>
</html>
