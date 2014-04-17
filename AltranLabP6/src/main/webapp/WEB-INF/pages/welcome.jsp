<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Latest compiled and minified JavaScript -->
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Altran Lab - Spring!</title>
        
    </head>
    <body style="padding-top:20px">
        <div class="navbar navbar-default" role="navigation">
            <div class="container">
              <div class="navbar-header">
                  <a class="navbar-brand" href="welcome">Altran Lab - Spring</a>
              </div>
              <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                  <li class="active"><a href="welcome">Home</a></li>
                  <li><a href="userslist">User list</a></li>
                </ul>
                <!--<ul class="nav navbar-nav navbar-right">
                  <li></li>
                </ul>-->
              </div><!--/.nav-collapse -->
            </div>
        </div>

        <div class="container">
            <div class="jumbotron">
                <h1>Welcome to Altran Lab - Spring!</h1>
                <p clas="lead">${message}</p>
            </div>
        </div>
    </body>
</html>
