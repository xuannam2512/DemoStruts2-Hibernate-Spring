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
body {
	margin: 0 auto;
	padding: 0 auto;
	background-color: #cccccc;
	display: grid;
	grid-template-columns: 25% 50% 25%;
}

.registerBox {
	margin-top: 100px;
	text-align: center;
	background-color: #2F4F4F;
	padding: 10%;
}

.logo {
	height: 200px;
	width: 250px;
	text-align: center;
	border: 0px;
}

.tfRegister {
	width: 300px;
	border: 0px;
	height: 25px;	
}

.btnRegister {
	margin-top: 15px;
	border: 0px;
	width: 76%;
	text-align: center;
	height: 25px;
	font-size: 15px;
	font-weight: bold;
}
</style>
<sx:head />
</head>
<body>
	<div></div>

	<div class="registerBox">
		<img class="logo" alt=""
			src="https://portal2.hcmus.edu.vn/Styles/profi/images/logo186x150.png">
		<h1 style="text-align: center; color: #C6E2FF;">Sign Up</h1>
		
		<center>
		<br>
		<s:form action="register" method="POST">
			<s:textfield name="student.firstname" label="First Name" cssClass="tfRegister"></s:textfield>
			<s:textfield name="student.lastname" label="Last Name" cssClass="tfRegister"></s:textfield>
			<s:textfield name="student.cardStudent" label="Card Student" cssClass="tfRegister"></s:textfield>
			<sx:datetimepicker name="student.birthday" label="DateOfBirth"
				displayFormat="dd-MMM-yyyy" value="%{'today'}" cssClass="tfRegister"/>
			<s:textfield name="student.username" label="User Name" cssClass="tfRegister"></s:textfield>
			<s:password name="student.password" label="Password" cssClass="tfRegister"></s:password>
			<s:submit value="Register" cssClass="btnRegister"></s:submit>
		</s:form>
	</center>
	</div>

</body>
</html>