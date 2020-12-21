<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
</head>
<body>
<h1> this is home page</h1>
8181700799
<%
  String name = (String)request.getAttribute("name");
  int id = (Integer)request.getAttribute("id");
 // List<>= (List<String>)request.getAttribute("f");
 
%>
<h1>name is <%=name %></h1>
<h1>Id is <%=id %></h1>


</body>
</html>