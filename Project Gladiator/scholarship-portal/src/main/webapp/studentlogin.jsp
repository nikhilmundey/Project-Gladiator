<!DOCTYPE html>
<html>
  <head>
    <title></title>
    <link rel="stylesheet" href="app/css/app.css">
    <script src="https://code.jquery.com/jquery-3.4.1.min.js" crossorigin="anonymous"></script>
    <script src="app/js/app.js"></script>

  </head>
<body>
<div class="login-page">
  <div class="form">
      <h2>Student Login</h2>

    <form class="login-form" action="studentlogin" method="post">
      <input type="text" name="studentId" placeholder="Enter Student Id" required/>
      <input type="password" name="studentPassword" placeholder="password" required/>
      <button>login</button>
      <!-- <p class="message">Not registered? <a href="#">Create an account</a></p> -->
    </form>
  </div>
</div>
</body>
</html>