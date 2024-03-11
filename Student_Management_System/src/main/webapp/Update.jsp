<%@ page import="com.studentmanagsys.dob.StudentDao" %>
<%@ page import="com.studentmanagsys.dob.StuDaoImplementation" %>
<%@ page import="com.student_view.Student" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student By Roll Number</title>
</head>
<body>
	 <h2>Update Student By Roll Number</h2>
    <form action="updateStudent" method="post">
        <label for="rollno">Enter Roll Number:</label><br>
        <input type="text" id="rollno" name="rollno" required><br><br>
        <label for="name">Name:</label><br>
        <input type="text" id="name" name="name" required><br><br>
        <label for="phone">Phone:</label><br>
        <input type="text" id="phone" name="phone" required><br><br>
        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email" required><br><br>
        <label for="age">Age:</label><br>
        <input type="text" id="age" name="age" required><br><br>
        <label for="address">Address:</label><br>
        <input type="text" id="address" name="address" required><br><br>
        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password" required><br><br>
        <input type="submit" value="Update">
    </form>

    <%-- Display success or error message --%>
    <% 
        String message = (String) request.getAttribute("message"); 
        if (message != null) { 
    %>
        <p><%= message %></p>
    <% } %>
	
</body>
</html>