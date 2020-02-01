<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Borrower Insert</title>
</head>
<body>
<form action='insertborrower' method='post'>

		Borrower Serial Number:<input type='text' name='bsn'/><br/>

		Semester:<input type='text' name='bsem'/><br/>

		Faculty/Student : <input type='text' name='btype'/><br/>

		Name :<input type='text' name='bname'/><br/>

		Phone Number :<input type='text' name='bph'/><br/>
		
		Mail ID :<input type='text' name='bmid'/><br/>

		<input type='submit' value='Insert'/>
		<br/>
		<br/>
		<br/>

<a href='borrowermenu.jsp'>Existing Borrower Click Here</a><br/>
	</form>
</body>
</html>