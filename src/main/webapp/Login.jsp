<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css" integrity="sha512-HK5fgLBL+xu6dm/Ii3z4xhlSUyZgTT9tuc/hSrtw6uzJOvgRr2a9jyxxT1ely+B+xFAmJKVSTbpM/CuL7qxO8w==" crossorigin="anonymous" />
<title>Login</title>
</head>
 
<body>
 <div class="container col-md-8 col-md-offset-2 col-xs-12">
 
		<div class="panel  panel-warning">
			<div class="panel-heading">Login</div>
			<div class="panel-body">
				<form action="loginUtilisateur.org" method="post">
 
					<div class="form-group">
						<label class="control-label">Email</label>
						<input type="email" name="email"   class="form-control" required="required"/>
						<span></span>
					</div>
					<div class="form-group">
						<label class="control-label">Password</label>
						<input type="password" name="password"   class="form-control" required="required"/>
						<span></span>
					</div>
					 
					<div>
						<button type="submit" class="btn btn-warning">Register</button>
					</div>
				</form>
		 
			 
			</div>
		
		
		</div>
		
	</div>
 

</body>
</html>