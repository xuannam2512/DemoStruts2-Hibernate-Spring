<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HCMUS</title>
<style type="text/css">
</style>
<sx:head />
</head>
<body>

	<h1>University Of Science</h1>
	<center>
		<br> <br>
		<s:form action="register" method="POST">
			<s:textfield name="student.firstname" label="First Name"></s:textfield>
			<s:textfield name="student.lastname" label="Last Name"></s:textfield>
			<s:textfield name="student.cardStudent" label="Card Student"></s:textfield>
			<sx:datetimepicker name="student.birthday" label="DateOfBirth"
				displayFormat="dd-MMM-yyyy" value="%{'today'}" />
			<s:textfield name="student.username" label="User Name"></s:textfield>
			<s:password name="student.password" label="Password"></s:password>
			<s:submit value="Register"></s:submit>
		</s:form>
	</center>

</body>
</html>