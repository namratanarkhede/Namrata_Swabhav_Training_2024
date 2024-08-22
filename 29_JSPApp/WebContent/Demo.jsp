<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- out Implicit object --%>
<%
    out.println("Hello, World!");
    out.print("This is a JSP page.");
%>


<%-- request Implicit object --%>
<%
    String username = request.getParameter("username");
    out.println("Hello, " + username);
%>


<%-- response Implicit object --%>
<%
    response.setContentType("text/html");
    response.setHeader("Cache-Control", "no-cache");
    response.sendRedirect("hello.jspo");
%>

<%-- session Implicit object --%>
<%
    session.setAttribute("user", "Hrishikesh");
    String user = (String) session.getAttribute("user");
    out.println("User: " + user);
    session.invalidate(); // To end the session
%>




</body>
</html>