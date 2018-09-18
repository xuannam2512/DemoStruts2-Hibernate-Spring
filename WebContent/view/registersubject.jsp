<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Subject</title>

<style type="text/css">
	
</style>
</head>
<body>
	<s:include value="/view/header.jsp"></s:include>
	
	<div class="container">
		<div class = "listChoose">
			<table>
				<thead>
					<tr>
						<td>check</td>
						<td>Name</td>
						<td>Teacher</td>
					</tr>
				</thead>
			</table>
		</div>
		
		<div class = "listSubject">
			<table>
				<thead>
					<tr>
						<td>check</td>
						<td>Name</td>
						<td>Teacher</td>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="subjects">
						<tr>
						<s:set var = "fullname" value="teacherId.firstname + ' ' + teacherId.lastname"></s:set>
							<td><s:checkbox></s:checkbox></td>
							<td><s:property value="name"/></td>
							<td><s:property value="fullname"/></td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
		</div>
		
		
	</div>
</body>
</html>