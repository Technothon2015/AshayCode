<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="indexpage">
    <meta name="author" content="404NameNotFound">
    <link rel="icon" href="<c:url value="/resources/../../favicon.ico"/>">

    <title>(Dainandini) - HomePage</title>

    <!-- Bootstrap core CSS -->
	<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css" />" >
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<!--     <link href="assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet"> -->
	<link rel="stylesheet" href="<c:url value="/resources/assets/css/ie10-viewport-bug-workaround.css" />">
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="<c:url value="/resources/assets/js/ie-emulation-modes-warning.js"/>"></script>
	
	

    

    <!-- Custom styles for this template -->
<!--     <link href="css/carousel.css" rel="stylesheet"> -->
    <link rel="stylesheet" href="<c:url value="/resources/css/carousel.css" />">
	
	
	
  </head>
<!-- NAVBAR
================================================== -->
  <body>
 
    <div class="navbar-wrapper">
      <div class="container">

        <nav class="navbar navbar-inverse navbar-static-top">
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand">Dainandini</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#contact">Contact</a></li>
			  </ul>
				
				<ul class = "nav navbar-nav navbar-right" style="margin-right:0.5px">
					<button style="background-color:black;" type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
  Login here
</button>
					<button style="background-color:black;" type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal1">
  Register here
</button>
				</ul>	
				
			</div>	 
          </div>
        </nav>											
		  </div>
		</div>

    <!-- Carousel
    ================================================== -->
    <div id="myCarousel" class="carousel slide" data-ride="carousel" style="min-height: 50%;max-height: 50%;">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
      </ol>
      <div class="carousel-inner" role="listbox">
        <div class="item active">
          <img class="first-slide" src="<c:url value="/resources/images/2008_todolist_lowres.jpg"/>"  alt="First slide" >
          <div class="container">
            <div class="carousel-caption">
              <h1><font color="	#00008">Dainandini</font></h1>
              <p><font color="#00008B">If you are looking for a free, cross-platform, and syncing to-do app,<br> you should try Dainandini.</font></p>
              <!--<p><a class="btn btn-lg btn-primary" href="#" role="button">Sign up today</a></p>-->
			  <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal1">
  Sign Up here
</button>
            </div>
          </div>
        </div>
        <div class="item">
          <img class="second-slide" src="<c:url value="/resources/images/2008_todolist_lowres.jpg"/>" alt="Second slide">
          <div class="container">
            <div class="carousel-caption">
              <h1><font color="#00008B">We manage your Day</font></h1>
              <p><font color="#00008B">Dainandini is a great cross-platform task management tool.<br>It supports repeating tasks, shared lists, and calendar subscription.</font></p>
              <p><a class="btn btn-lg btn-primary" href="#" role="button">Learn more</a></p>
            </div>
          </div>
        </div>
        <div class="item">
          <img class="third-slide" src="<c:url value="/resources/images/2008_todolist_lowres.jpg"/>" alt="Third slide">
          <div class="container">
            <div class="carousel-caption">
              <h1><font color="#00008B">Easy To Use Efficient To Work </font></h1>
              <p><font color="#00008B">You can organize tasks into lists and add sub-tasks, reminders,<br> and due-dates or you can just keep things simple with basic tasks.</font></p>
              <!--<p><a id="login1" class="signUp.js" href="#" role="button">Login Here</a></p>-->
			  <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
  Login here
</button>
			  
            </div>
          </div>
        </div>
      </div>



<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel"><h1>Login</h1></h4>
      </div>
      <div class="modal-body">
        <form class="form-signin" action="login.jsp" method="post">
       
        <label for="User Name" class="sr-only">Username</label>
        <input type="text" name="userName" class="form-control" placeholder="Username" required autofocus><br>
        
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" name="inputPassword" class="form-control" placeholder="Password" required><br>
        
        <button id="login1" class="btn btn-lg btn-primary btn-block" type="submit" onsubmit='Redirect()'>Sign in</button>
      </form>
      </div>
      <div class="modal-footer">
      </div>
    </div>
  </div>
</div>

<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel"><h1>Register Here</h1></h4>
      </div>
      <div class="modal-body">
        <form class="form-signin" action="signup.jsp" method="post" >
        
		<label for="userName" class="sr-only">User Name</label>
        <input type="text" name="userName" class="form-control" placeholder="Username" required autofocus><br>
		
		<label for="firstName" class="sr-only">First Name</label>
        <input type="text" name="firstName" class="form-control" placeholder="First Name" required autofocus><br>
        
		<label for="lastName" class="sr-only">Last Name</label>
        <input type="text" name="lastName" class="form-control" placeholder="Last Name" required autofocus><br>
        
		<label for="inputPassword" class="sr-only">Password</label>
        <input type="password" name="inputPassword" class="form-control" placeholder="Password" required><br>
		
		<label for="confirmPassword" class="sr-only">Confirm Password</label>
        <input type="password" name="confirmPassword" class="form-control" placeholder="Re-Enter Password" required><br>
        
		<label for="inputEmail" class="sr-only">Email</label>
        <input type="email" name="inputEmail" class="form-control" placeholder="email" required autofocus><br>
		
		<label for="Mobile Number" class="sr-only">Mobile Number</label>
        <input type="text" name="mobileNumber" class="form-control" placeholder="Mobile Number" required autofocus><br>
		
        <button id="login1" class="btn btn-lg btn-primary btn-block" type="submit" onsubmit="registration.jsp">Sign Up</button>
      
	  </form>
      
	  </div>
      <div class="modal-footer">
      </div>
    </div>
  </div>
</div>


      <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div><!-- /.carousel -->


 
    <div class="container marketing">

      <!-- Three columns of text below the carousel -->
      <div class="row">
        <div class="col-lg-4">
          <img class="img-circle" src="<c:url value="/resources/images/logo.jpg"/>"  alt="Generic placeholder image" width="140" height="140">
          <h2>Set Reminders for your Important Work</h2>
          <p><a class="btn btn-default" href="#reminder_details" role="button">Read More &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="<c:url value="/resources/images/expense logo.png"/>"  alt="Generic placeholder image" width="140" height="140">
          <h2>Manage your daily expenses</h2>
          <p><a class="btn btn-default" href="#expense_details" role="button">Read More &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="<c:url value="/resources/images/event logo.png"/>" alt="Generic placeholder image" width="140" height="140">
          <h2>Create and Manage your Events</h2>
          <p><a class="btn btn-default" href="#event_details" role="button">Read More &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->


      <!-- START THE FEATURETTES -->

      <hr class="featurette-divider">

      <div class="row featurette" id = "reminder_details">
        <div class="col-md-7">
          <h2 class="featurette-heading">Set Reminders <span class="text-muted"></span></h2>
          <p class="lead">Keep track of everything you need to do in one place. You can set reminders for your important tasks so that you dont miss out on anything. You can set location based reminders for your work or home. Your reminder will even help you get things done.</p>
        </div>
        <div class="col-md-5">
          <img class="featurette-image img-responsive center-block" src="<c:url value="/resources/images/reminder_500.png"/>" >
        </div>
      </div>

      <hr class="featurette-divider">

      <div class="row featurette" id="expense_details">
        <div class="col-md-7 col-md-push-5">
          <h2 class="featurette-heading">Expense Manger.<span class="text-muted">Get help for keeping track of your money.</span></h2>
          <p class="lead">You can manage day to day expeses. Know where have you spent your money. Get detailed reports of your expenses with categories and track them with date-time. </p>
        </div>
        <div class="col-md-5 col-md-pull-7">
          <img class="featurette-image img-responsive center-block" src="<c:url value="/resources/images/expense_500.png"/>"  alt="Generic placeholder image">
        </div>
      </div>

      <hr class="featurette-divider">

      <div class="row featurette" id = "event_details">
        <div class="col-md-7">
          <h2 class="featurette-heading">Event Management.<span class="text-muted">Create New Event for your convenience</span></h2>
          <p class="lead">You can create new events like party, conference, outings etc. and you can keep track of these events</p>
        </div>
        <div class="col-md-5">
          <img class="featurette-image img-responsive center-block" src="<c:url value="/resources/images/events_500.jpg"/>"  alt="Generic placeholder image">
        </div>
      </div>
		<!-- Button trigger modal -->

      <hr class="featurette-divider">
		
		
      <!-- /END THE FEATURETTES -->


      <!-- FOOTER -->
      <footer>
        <p class="pull-right"><a href="#">Back to top</a></p>
        <p>&copy; 2016 404 #NameNotFound , &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
      </footer>

    </div><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="<c:url value= "/resources/assets/js/vendor/jquery.min.js"/> "> <\/script>')</script>
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>" ></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="<c:url value="/resources/assets/js/vendor/holder.min.js"/> "></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="<c:url value="/resources/assets/js/ie10-viewport-bug-workaround.js"/>" ></script>
	
  </body>
</html>
