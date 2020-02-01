<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Owner Insert</title>
</head>
<body>
<form action='insertowner' method='post'>

		Owner Serial Number:<input type='text' name='osn'/><br/>

		Student/Faculty:<input type='text' name='otype'/><br/>

		Semester:<input type='text' name='osem'/><br/>

		Department:<input type='text' name='odept'/><br/>

        Name <input type='text' name='oname'/><br/>

		Phone Number :<input type='text' name='oph'/><br/>

		Mail ID :<input type='text' name='omail'/><br/>

		<input type='submit' value='Insert'/>
		<br/>
		<br/>
<a href='ownermenu.jsp'>Existing Owner Click Here</a><br/>

	</form>
</body>
</html>