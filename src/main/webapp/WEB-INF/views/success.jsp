<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success page</title>
</head>
<body>
<h1> Thankyou for logging in</h1>
<hr>
<h1> ${Header}</h1>
<p> ${Desc }</p>

<p> yourr name is ${user.fname }</p>
<p> your email is ${user.mail }</p>
<p> your password is ${user.password  }</p>

</body>
</html>