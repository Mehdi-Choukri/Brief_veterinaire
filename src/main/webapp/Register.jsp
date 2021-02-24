<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
 
<!--  <link rel="stylesheet" type="text/css" href="css/bootstrap-4.3.1-dist"> --> 
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
</head>
<body>
		
	<div class="container col-md-8 col-md-offset-2 col-x -12">
	 
		<div class="panel  panel-warning">
			<div class="panel-heading">Register</div>
			<div class="panel-body">
				<form action="saveUtilisateur.org" method="post">
					<div class="form-group">
						<label class="control-label">Nom</label>
						<input type="text" name="nom"   class="form-control" required="required"/>
						<span></span>
					</div>
					<div class="form-group">
						<label class="control-label">Prénom</label>
						<input type="text" name="prenom"   class="form-control" required="required"/>
						<span></span>
					</div>
					<div class="form-group">
						<label class="control-label">Email</label>
						<input type="email" name="email"   class="form-control" required="required"/>
						<span></span>
					</div>
					<div class="form-group">
						<label class="control-label">Password</label>
						<input type="password" id="id_Password" name="password"   class="form-control" required="required"/>
						<span id="id_confirm_pw_error" class="register_error"></span>
					</div>
					<div class="form-group">
						<label class="control-label">Confirm Password</label>
						<input type="password" id=id_ConfirmPw name="cpassword"  onkeyup="check_confirmPW()" class="form-control" required="required"/>
						<span></span>
					</div>
				 
					<div>
						<button type="submit" id="idRegisterBtn" class="btn btn-warning">Register</button>
					</div>
				</form>
		 
			 
			</div>
		
		
		</div>
	</div>
	 


</body>
<script src="main.js" >
  </script>
</html>