<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<%
	String message = (String) request.getAttribute("message");
	if(message!=null){%>
	<jsp:include page = "error.jsp"></jsp:include>
	<p style="color: red"><%=message %> </p>
	<%}
%>
	<h2>Student Registration Form</h2>
    <form action="register" method="post">
    
    	<label for="rollno">Roll Number:</label><br>
        <input type="text" id="rollno" name="rollno" required><br><br>
        
        <label for="name">Name:</label><br>
        <input type="text" id="name" name="name" required><br><br>

        <label for="phone">Phone:</label><br>
        <input type="text" id="phone" name="phone" required><br><br>

        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email" required><br><br>

		<label for="age">Age:</label><br>
        <input id="age" name="age" required></input><br><br>       

        <label for="address">Address:</label><br>
        <textarea id="address" name="address" required></textarea><br><br>

        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password" required><br><br>

        <input type="submit" value="Register">
    </form>
	
</body>
</html>