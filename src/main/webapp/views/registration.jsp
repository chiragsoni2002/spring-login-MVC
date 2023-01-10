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
        <form class="form-signin" id="demo-form" action="${pageContext.request.contextPath}/admin/signup" method="post">
              <label for="inputfirstName" class="sr-only">First Name</label>
              <input type="text" id="firstName" name="firstName" class="form-control" placeholder="First Name" autofocus="" required="" ><br>
              <label for="inputlastName" class="sr-only">Last Name</label>
              <input type="text" id="lastName" name="lastName" id="lastName" class="form-control" placeholder="Last Name" required="" autofocus=""><br>
              <label for="inputEmail" class="sr-only">Email address</label>
              <input type="email" id="inputEmail" name="inputEmail" class="form-control" placeholder="Email address" required="" autofocus=""></i><br>
              <label for="inputEmail" class="sr-only">Password</label>
               <label for="inputuserName" class="sr-only">User Name</label>
              <input type="text" id="userName" name="userName" class="form-control" placeholder="User Name" autofocus="" required="" ><br>
              <input type="password" id="password" name="password" class="form-control" placeholder="Password" required="" >
              <button class="btn btn-lg btn-primary btn-block"  >Signin</button>
              
        </form>
    </div>
    <div class="col-sm">
    </div>
  </div>
</div>

</body>
</html>