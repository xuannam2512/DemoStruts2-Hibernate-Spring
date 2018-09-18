<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HCMUS - DashBoard</title>

<style type="text/css">
body {
	margin: 0 auto;
	padding: 0 auto;
	background-color: #cccccc;
}

.box {
	display: grid;
	grid-template-columns: 60% 40%;
	padding-left: 3%;
	padding-right: 3%;
	width: 100%;
}

.featureBox {
	border: 2px;
	background-color: white;
	border-color: black;
	padding: 2%;
	display: grid;
	grid-template-columns: 20% 20% 20% 20% 20%;
}

.resultRegister {
	height: 150px;
	width: 150px;
	border: 2px;
	border-color: black;
	text-align: center;
	margin-left: 20px;
}

.registerSubject {
	height: 150px;
	width: 150px;
	border: 2px;
	border-color: black;
	text-align: center;
	margin-left: 10px;
}

.profileBox {
	margin-left: 2%;
	margin-right: 3%;
	background-color: white;
	border: 1px;
	border-color: black;
	padding: 2%;
}

.registerSubject:hover {
	background-color: gray;
}

.resultRegister:hover {
	background-color: gray;
}

#textUsername {
	display: inline-block;
}
</style>
</head>
<body>
	<s:include value="/view/header.jsp"></s:include>
	<s:set var = "fullname" value="student.firstname + ' ' + student.lastname"></s:set>

	<h1 style="padding-left: 35px;">DASHBOARD</h1>
	<div class="box">
		<div class="featureBox">
			<div class="registerSubject">

				<s:url action="registerSubject" var="registerSubject"></s:url>
				<a style="text-decoration: none; color: black;"
					href="<s:property value="#registerSubject" />"> <img alt=""
					src="http://icons.iconarchive.com/icons/custom-icon-design/flatastic-3/128/folder-add-icon.png">
					DK Hoc Phan
				</a>
			</div>
			<div class="resultRegister">

				<s:url action="registerSubject" var="resultRegister"></s:url>
				<a style="text-decoration: none; color: black;"
					href="<s:property value="#resultRegister" />"> <img alt=""
					src="http://icons.iconarchive.com/icons/custom-icon-design/flatastic-3/128/folder-add-icon.png">
					KQ Dang Ky
				</a>
			</div>
		</div>
		<div class="profileBox">
			<h3 style="text-align: center;">My Profile</h3>
			
			<p><b>User Name: </b> <s:property value="student.username" /></p>
			<p><b>Full Name: </b><s:property value="fullname"/></p>			
			<p><b>Student Card:</b> <s:text name="student.cardStudent"></s:text></p>												

		</div>
	</div>

</body>
</html>