<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body style="padding-top:20px">
        <div class="container">
            <c:url value="/login" var="loginUrl"/>
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h1 class="panel-title">Log in</h1>
                </div>
                <div class="panel-body">
                    <form class="form-horizontal" action="${loginUrl}" method="post" role="form">

                        <!-- Form messages -->
                        <c:if test="${param.error != null}">        
                            <div class="alert alert-danger">
                                Invalid username and password.
                            </div>
                        </c:if>
                        <c:if test="${param.logout != null}">       
                            <div class="alert alert-success">
                                You have been logged out.
                            </div>
                        </c:if>

                        <!-- Username + Password -->
                        <div class="form-group">
                            <label for="username" class="col-sm-2 control-label">Username</label>
                            <div class="col-sm-10">
                                <input id="username" name="username" placeholder="Username" type="text" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="password" class="col-sm-2 control-label">Password</label>
                            <div class="col-sm-10">
                                <input id="password" name="password" placeholder="Password" type="password" class="form-control" >
                            </div>
                        </div>

                        <!-- Remember me check -->
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox"> Remember me
                                    </label>
                                </div>
                            </div>
                        </div>

                        <!-- Cross Site Request Forgery protection - Token -->
                        <input type="hidden"                        
                               name="${_csrf.parameterName}"
                               value="${_csrf.token}"/>

                        <!-- Sign in button -->
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-default">Sign in</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
