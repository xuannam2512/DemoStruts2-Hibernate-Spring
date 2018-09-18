<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HCMUS PORTAL</title>
<style type="text/css">

body {
	margin: 0 auto;
	padding: 0 auto;
	background-color: #eaeaea;
}

#loginBox {
	border: 1px;
	border-color: black;
	background-color: #2F4F4F;
	height: 520px;
}

.logo {
	height: 200px;
	width: 250px;
}

#btnLogin {
	margin-top: 5px;
	margin-bottom: 15px;
	width: 40%;
	border: 0px;
	background-color: #C6E2FF;
	height: 25px;
	font-size: 17px;
	font-weight: bold;
	width: 99%;
	color: #423b3b;
}

#btnLogin:hover {
	background-color: #3F93AA;	
}

.container {
	display: grid;
	grid-template-columns: 25% 50% 25%;
	padding: 10px;
	height: 100%;
	width: 100%;
}

h1 {
	text-align: center;
	font-size: 50px;
}

#lbUsername, #lbPassword {
	width: 200px;
	font-size: 20px;
	color: #C6E2FF;
}

#tfUsername, #tfPassword {
	width: 300px;
	margin-top: 5px;
	margin-bottom: 15px;
	height: 25px;
	border: 0px;
}

#aRegister {
	text-decoration: none;
	color: black;
	border: 1px;
	border-color: black;
	padding-top: 3px;
	padding-bottom: 3px;
	padding-left: 20px;
	padding-right: 20px;
	background-color: #C6E2FF;
	margin-left: 210px;
}

.btnRegister {
	margin-top: 10px;
	height: 20px;
	font-size: 13px;
	border: 0px;
	margin-left: 180px;
	width: 20%;
}

#error {
	float: left;
	color: red;
}


</style>
</head>
<body>
	<br>
	<h1>HCMUS PORTAL</h1>
	<div class="container">
		<div></div>
		
		<center id="loginBox">
			<br> <br> <img class="logo" alt=""
				src="https://portal2.hcmus.edu.vn/Styles/profi/images/logo186x150.png">
			<br> <br>
			<s:set name="error" value="message"/>
			<s:if test="%{#error != ''}">
				<s:property value="message"/>
			</s:if>
			<s:form action="login" method="POST">
				<s:label id = "lbUsername" value="Username"></s:label>
				<s:textfield name="username" id = "tfUsername"></s:textfield>
				<s:label id = "lbPassword" value="Password"></s:label>
				<s:password name="password" id="tfPassword"></s:password>
				<s:submit id="btnLogin" value="Login"></s:submit>
			</s:form>
			
			<s:a href="/ManageStudent/register.jsp" id="aRegister">Register</s:a>									

		</center>

	</div>

</body>
</html>