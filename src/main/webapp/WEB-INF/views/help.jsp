<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Help Page</title>
</head>
<body>
<%
//String name = (String)request.getAttribute("name");
//int id = (Integer)request.getAttribute("id");

%>
<h1> this is help page</h1>
<h1> name is <%--<%=name %> --%>  ${name }</h1>
<h2> id is <%--<%=id %> --%> ${id }</h2>

<hr>

<h1>${marks }</h1>



</body>
</html>