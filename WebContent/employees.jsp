<%@ page contentType = "text/html; charset = UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	List Employees
	<table>
		<thead>
			<tr>
				<td>id</td>
				<td>first name</td>
				<td>last name</td>
			</tr>
		</thead>
		
		<tbody>
			<s:iterator value = "listEmployee">	
               <tr>
                  <td><s:property value = "id"/></td>
                  <td><s:property value = "firstName"/></td>
                  <td><s:property value = "lastName"/></td>
                 </tr>
            </s:iterator>
		</tbody>
	</table>
</body>
</html>