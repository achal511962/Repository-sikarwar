<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <div align="center">
     <h3>New/Edit Contact</h3>
     <form:from action="save" method="post" modelAttribute="contact">
	     <table cellpadding="5">
	     <form:hidden path="id" >
		     <tr>
		     <td>No</td> <td><form:input path="no"/></td>
		     </tr>
		     <tr>
		     <td>Name</td> <td><form:input path="name"/></td>
		     </tr>
		      <tr>
		     <td>Email</td> <td><form:input path="email"/></td>
		     </tr>
		      <tr>
		     <td>Address</td> <td><form:input path="address"/></td>
		     </tr>
		      <tr>
		     <td>Phone</td> <td><form:input path="phone"/></td>
		     </tr>
		     </form:hidden>
		     <tr>
		       <td colspan="2" align="center"> <input type="submit" value="save"></td>
		     </tr>
		     
	     </table>
     </form:from>
     </div>
</body>
</html>