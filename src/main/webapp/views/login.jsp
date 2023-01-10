<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
<body>


<div class="container">
  <div class="row">
    <div class="col-sm">    
    </div>
    <div class="col-sm"  style="margin-top: 100px;">
	  <form class="form-signin" action="${pageContext.request.contextPath}/admin/process-login" method="post" modelAttribute="userData">
     

      <div class="form-label-group">
        <input type="text" id="inputEmail" class="form-control" placeholder="User Name" name="username" required="" autofocus="">
        <label for="inputUserName">User Name</label>
      </div>

      <div class="form-label-group">
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" name="password" required="">
        <label for="inputPassword">Password</label>
      </div>
		
     
     
      <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
   
    </form>
  </div>
    <div class="col-sm">
    </div>
  </div>
</div>