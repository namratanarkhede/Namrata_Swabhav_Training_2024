<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ include file="LogIn.html" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP App</title>
</head>
<body>
<h1> This is my jsp demo</h1>

<%-- Scriptlet Tag --%>
<%
//to write java code for dynamic wed page
java.util.Date date = new java.util.Date();
out.print(date);
%>

<%-- Expression Tag --%>
<b><%=new java.util.Date() %>
</b>


<%-- Declaration Tag --%>
<%! 
String message = "Namrata Narkhede";
%>
</br>
<h1>
<%= message %>
</h1>

</body>
</html>