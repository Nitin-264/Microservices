<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Landing Page</title>
</head>
<body>
	<h1 style='color:red; text-align: center;'>
		FIRST JSP PAGE
	</h1>
	
	<%-- Scripting elements --%>
	<%
		pageContext.forward("second.jsp");
	%>
	
	<h1 style='color:green; text-align: center;'>
		FOOTER OF JSP PAGE
	</h1>
</body>
</html>