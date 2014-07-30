<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>

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
            <sec:authorize access="isAuthenticated()">
                <div style=" float: right">
                    <form action="../j_spring_security_logout" method="post" id="logoutForm">
                        <input type="hidden" name="${_csrf.parameterName}"
                               value="${_csrf.token}" />
                        <input type="submit" value="Logout"/>
                    </form>
                </div>
            </sec:authorize>
            <h1>Users</h1>
            <c:forEach items="${users}" var="user">
                <div class="lead">#${user.id} - <a href="/AltranLabP6/users/${user.username}/">${user.name}</a> 
                    <sec:authorize access="hasRole('ROLE_ADMIN')">
                        - <a href="/AltranLabP6/users/delete/${user.username}/">delete</a>
                    </sec:authorize>
                </div>
            </c:forEach> 
            <div>
                <sec:authorize access="hasRole('ROLE_ADMIN')">
                    <a href="/AltranLabP6/users/new">new user</a>
                </sec:authorize>
            </div>
        </div>
    </body>
</html>
