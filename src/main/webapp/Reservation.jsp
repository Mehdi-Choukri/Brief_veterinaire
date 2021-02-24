<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container col-md-8 col-md-offset-2 col-xs-12">
 
		<div class="panel  panel-warning">
			<div class="panel-heading">Login</div>
			<div class="panel-body">
				<form action="ReservationRDV.org" method="post">
					<div class="form-group">
						<div class="alert alert-info">
					 	 L'email enregistré ici est l'email de votre inscription vous pouvez entrer un autre email pour la réservation
						</div>
					</div>
 
					<div class="form-group">
						<label class="control-label">Email</label>
						<input type="email" name="email" value="${Utilisateur.mail}"  class="form-control" required="required"/>
						<span></span>
					</div>
					<div class="form-group">
						<label class="control-label">Date de réservation</label>
						<input  type="datetime-local" id="meeting-time" name="date"   class="form-control" required="required"/>
						<span></span>
					</div>
					 
					<div>
						<button type="submit" class="btn btn-warning">Réserver</button>
					</div>
				</form>
		 
			 
			</div>
		
		
		</div>
		
	</div>
 
 

</body>
</html>