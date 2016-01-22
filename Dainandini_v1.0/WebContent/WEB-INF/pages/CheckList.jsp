<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Check List</title>
</head>
<body>

<b>Check List</b><br><br>
	
	<c:forEach var="check" items="${list}">
	
		${check.checkListId} ---- ${check.username}----${check.checkListDate}<c:forEach var="check2" items="${check.itemlist}">
	
		${check2.checkItemId} ---- ${check2.description}----${check2.itemStatus}

	</c:forEach>
	</c:forEach>

</body>
</html>