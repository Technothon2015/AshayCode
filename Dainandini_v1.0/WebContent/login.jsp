<html>
<head>

</head>

<body>
<%@ page import ="java.sql.*" %>
<%
    String userid = request.getParameter("userName");    
    String pwd = request.getParameter("inputPassword");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo",
            "root", "root");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from user where username='" + userid + "' and password='" + pwd + "'");
    if (rs.next()) {
        session.setAttribute("userid", userid);
 		RequestDispatcher r=request.getRequestDispatcher("dashboard.jsp");
        response.sendRedirect("dashboard.jsp");
    } else {
    	%>
    	<script type="text/javascript">alert("invalid credential");</script>
    	<%
    	response.sendRedirect("index.jsp");
    }
%>
</body>
</html>