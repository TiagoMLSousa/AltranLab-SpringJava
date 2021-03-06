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
        
        <title>User</title>
    </head>
    <body>
        <div class="container">
            <h1>New User</h1>
            <form:form modelAttribute="user" action="add">
                <div class="form">
                    <div class="form-group">
                        <form:label path="name">Name</form:label>
                        <form:input path="name" cssClass="form-control" /> 
                    </div>
                    <div class="form-group">
                        <form:label path="emailaddress">Email</form:label>
                        <form:input path="emailaddress" cssClass="form-control" />
                    </div>
                    <div class="form-group">
                        <form:label path="username">Username</form:label>
                        <form:input path="username" cssClass="form-control" /> 
                    </div>
                    <div class="form-group">
                        <form:label path="password">Password</form:label>
                        <form:input path="password" cssClass="form-control" /> 
                    </div>
                    <input type="submit" value="Submit"/>
                </div>
                <a href="/AltranLabP6/users/">back</a>
            </form:form>
        </div>
    </body>
</html>
