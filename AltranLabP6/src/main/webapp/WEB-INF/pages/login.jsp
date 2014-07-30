<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
        
        <title>Login</title>
    </head>
    <body>
        <div class="container">
            <h1>Login</h1>
                <c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>
 
		<form name='loginForm'
		  action="<c:url value='../j_spring_security_check' />" method='POST'>
                  <div class="form">
                    <div class="form-group">  
		  User:<br/>
                  <input type='text' name='username' value=''>
                    </div>
                      <div class="form-group">
			Password:<br/>
			<input type='password' name='password' />
                        </div>
			<div class="form-group"><input name="submit" type="submit"
					value="submit" />
                        </div>
 
		  <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
                  </div>
		</form>
        </div>
    </body>
</html>
