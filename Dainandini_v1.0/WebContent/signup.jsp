
<%@page import="com.psl.controller.ManagemeControllerImplementation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<%@ page language="java"%>
	<%@ page import="java.sql.*"%>
	<%@ page import="java.sql.DriverManager.*"%>
	<%@page import="com.psl.bean.User"%>

	<%
		String m = null, mn = null;
		String uname = request.getParameter("userName");
		String fname = request.getParameter("firstName");
		String lname = request.getParameter("lastName");
		String pwd = request.getParameter("inputPassword");
		String confirmpwd = request.getParameter("confirmPassword");
		String email = request.getParameter("inputEmail");
		String mobile = request.getParameter("mobileNumber");

		User u = new User();
		u.setUsername(uname);
		u.setFirstName(fname);
		u.setLastName(lname);
		u.setPassword(pwd);
		u.setEmail(email);
		u.setMobileNo(mobile);

		ManagemeControllerImplementation controller = new ManagemeControllerImplementation();
		controller.registerUser(u);

		response.sendRedirect("dashboard.html");
	%>


</body>
</html>