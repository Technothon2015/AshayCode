<%@page import="com.psl.controller.ManagemeControllerImplementation"%>
<%@page import="org.springframework.ui.Model"%>
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

   <title>Dainandini - Dashboard</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet"  href="<c:url value="/resources/css/bootstrap.min.css"/>"  >

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link rel="stylesheet"  href="<c:url value="/resources/assets/css/ie10-viewport-bug-workaround.css"/>" >

<!-- Custom styles for this template -->
<link href="<c:url value="/resources/css/dashboard.css"/>"  rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="<c:url value="/resources/assets/js/ie-emulation-modes-warning.js"/>" ></script>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"/></script>
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"/></script>


	
	<script type="text/javascript">
$(document).ready(function(){
    $('[data-toggle="popover"]').popover({
        placement : 'top'
    });
});
</script>
	  
    
</head>

<body>
<%-- <button onclick='<c:redirect url="http://10.44.206.132:8080/Dainandini_v1.0/getall?username=meetashay"></c:redirect>'></button> --%>
	<%
	
		String username=(String)session.getAttribute("userid");
	%>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Dainandini</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Cash </a></li>
					<li><a href="#">Meeting </a></li>
					<li><a href="#">Profile</a></li>
				</ul>
				<form class="navbar-form navbar-right">
					<input type="text" class="form-control" placeholder="Search...">
				</form>
			</div>
		</div>
	</nav>


	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3  col-md-2 sidebar">

				<ul class="nav nav-sidebar">
            <li class="active"><a href="#">Overview <span class="sr-only">(current)</span></a></li>
            <li><a data-toggle="modal" data-target="#myModal1" >
  				Add Event
				</a></li>
            <li>
				<a href="#" data-toggle="modal" data-target="#myModal2">My Expenses</a>
			</li>
			
			 <li>
				<a href="#" data-toggle="modal" data-target="#myModal">View Reports</a>
			</li>
          </ul>
 
			</div>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<h1 class="page-header">Dashboard</h1>


			</div>
		</div>

		<div class="col-sm-10" id="tableDiv">
			<div class="row">
				<div id="createstock">
				<h4>To Do List</h4>
    			<c:forEach var="check" items="${listcheck}">
	
					${check.checkListId} ---- ${check.username}----${check.checkListDate}
						<c:forEach var="check2" items="${check.itemlist}">
							${check2.checkItemId} ---- ${check2.description}----${check2.itemStatus}
						</c:forEach>
				</c:forEach>
				</div>

		<div id="updatestock">
			<h4>Events</h4>
    			<c:forEach var="reminder" items="${listreminder}">
	
		${reminder.eventId} ---- ${reminder.eventType}---- ${reminder.eventDescription}
	</c:forEach>
  
		</div>

		<div id="retrievestock">
			<h4>Expences</h4>
  				<c:forEach var="expense" items="${listexpense}">
	
					${expense.expenseId} ---- ${expense.expenseType}---- ${expense.expenseDescription}---- ${expense.expenseAmount}
				</c:forEach>
  
  		</div>
		
		
		
			</div>
		</div>

	</div>
	
	<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel"><h1>Remind Me</h1></h4>
      </div>
      <div class="modal-body">
        <form class="form-signin" action="remind.jsp" method="Post">
       <a href="#">
			<span class="glyphicon glyphicon-plus ">
			
			</span>
			
		<font>Add Event</font></a>
        <label for="User Name" class="sr-only">Subject Line Here</label>
        <input type="text" id="userName" class="form-control" placeholder="Subject Line Here" required autofocus><br>
		<textarea class="form-control" rows="4" cols="80" placeholder="Description">
		</textarea><br>
		<label for="date">Date:</label> 
		<input type="date" name="date" placeholder="MM/DD/YYYY" required/> 
        
		<b>Select Priority:</b>
		<INPUT TYPE="Radio" Name="Gender" Value="Male">High Priority
		<INPUT TYPE="Radio" Name="Gender" Value="Female">Low Priority
		
		<br><B>Time:</B>
		<input type="time" name="time" class="inputs time" pattern="^([0-1]?[0-9]|2[0-4]):([0-5][0-9])(:[0-5][0-9])?$" placeholder="Time Here" required>

      </form>
      </div>
      <div class="modal-footer">
      </div>
    </div>
  </div>
</div>
<!-- ------------------------------------------------------------------------------------------------------------------------------------- -->
	<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel"><h1>Enter Your Expense Here</h1></h4>
      </div>
      <div class="modal-body">
        <form class="form-signin" action="remind.jsp" method="Post">
       <a href="#">
			<span class="glyphicon glyphicon-plus ">
			
			</span>
			
		<font>Add Expense</font></a>
        <label for="User Name" class="sr-only">Enter Amount Here</label>
        <input type="number" id="expenses" class="form-control" placeholder="Enter Amount" required autofocus><br>
		<b>Description:</b>
		<textarea class="form-control" rows="4" cols="80" placeholder="Description">
		</textarea>
		<br>
		<label for="date">Date:</label> <input type="date" name="date" class="form-control" placeholder="MM/DD/YYYY" />
		
		<br>
		<b>Select Category:</b>
		
		<table>
		<col width="30%">
		<col width="30%">
		<col width="30%">
		
		<tr>
		<td><INPUT TYPE="Radio" Name="Gender" Value="Male">Food And Beverages</td>
		<td><INPUT TYPE="Radio" Name="Gender" Value="Female">Entertainment</td>
		<td><INPUT TYPE="Radio" Name="Gender" Value="Male">Travel </td><br>
		</tr>
		<tr>
		<td><INPUT TYPE="Radio" Name="Gender" Value="Female">Medical</td>
		<td><INPUT TYPE="Radio" Name="Gender" Value="Male">EMI/Investments</td>
		<td><INPUT TYPE="Radio" Name="Gender" Value="Female">Others </td><br>
		</tr>
		
		</table>
		
		
		
      </form>
      </div>
      <div class="modal-footer">
      </div>
    </div>
  </div>
</div>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"> </script>
	<script>window.jQuery || document.write('<script src="<c:url value="/resources/assets/js/vendor/jquery.min.js"/> "><\/script>')</script>
	<script src="<c:url value="/resources/js/bootstrap.min.js"/> "></script>
	<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
	<script src="<c:url value="/resources/assets/js/vendor/holder.min.js"/> "></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="<c:url value="/resources/assets/js/ie10-viewport-bug-workaround.js"/> "></script>
</body>
</html>
