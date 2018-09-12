<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HCMUS</title>
<style type="text/css">
</style>
</head>
<body>

	<h1>University Of Science</h1>
	<center>
		<br> <br>
		<s:form action="login" method="POST">
			<s:textfield name="username" label="Username"></s:textfield>
			<s:password name="password" label="Password"></s:password>
			<s:submit value="Login"></s:submit>
		</s:form>
		<s:a href="/ManageStudent/register.jsp">Register</s:a>
	</center>

</body>
</html>