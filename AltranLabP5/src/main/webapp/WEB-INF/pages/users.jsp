<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
        
        <title>Users</title>
    </head>
    <body>
        <div class="container">
            <h1>Users</h1>
            <c:forEach items="${users}" var="user">
                <div class="lead">#${user.id} - <a href="/AltranLabP4/users/${user.username}">${user.name}</a></div>
            </c:forEach> 
                <div>
                    <a href="/AltranLabP4/users/new">new user</a>
                </div>
        </div>
    </body>
</html>
