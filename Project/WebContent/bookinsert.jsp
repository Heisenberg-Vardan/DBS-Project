<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert</title>
</head>
<body>
<form action="insertbook" method="post">
		Book Serial Number<input type='text' name='bsn'/><br/>

		Book Name<input type='text' name='bname'/><br/>

		Book Date of Issue<input type='text' name='bdoi'/><br/>

		Book Author<input type='text' name='bauthor'/><br/>

		Book Publisher<input type='text' name='bpub'/><br/>

		Number of Copies<input type='text' name='noc'/><br/>

		<input type='submit' value='Insert'/>
</form>
</body>
</html>