<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>
<h1>${Header}</h1>
<p> ${Desc }</p>
<form action="processform" method="post" >
       <label for= "fname">FirstName:</label><br>
       <input type = "text" id = "fname" name = "fname"><br>
       
        <label for= "fname">mail id:</label><br>
       <input type = "text" id = "mail" name = "mail"><br>
       
        <label for= "fname">Password:</label><br>
       <input type = "text" id = "password" name = "password"><br>
       
       <input type ="submit" value ="submit">
       
       </form>
</body>
</html>