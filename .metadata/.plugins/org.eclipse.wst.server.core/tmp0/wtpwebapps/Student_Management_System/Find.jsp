<%@ page import="com.studentmanagsys.dob.StudentDao" %>
<%@ page import="com.studentmanagsys.dob.StuDaoImplementation" %>
<%@ page import="com.student_view.Student" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Student By Roll Number</title>
</head>
<body>
	<h2>Find Student By Roll Number</h2>
    <form action="" method="get">
        <label for="rollno">Enter Roll Number:</label><br>
        <input type="text" id="rollno" name="rollno" required><br><br>
        <input type="submit" value="Find">
    </form>

    <%-- Display student information if found --%>
    	<% 
    String rollnoParam = request.getParameter("rollno");
    if (rollnoParam != null && !rollnoParam.isEmpty()) {
        int rollno = Integer.parseInt(rollnoParam);
        StudentDao dao = new StuDaoImplementation();
        Student student = dao.findStudentById(rollno); 
        if (student != null) { 
%>
    <h3>Student Details:</h3>
    <p>Roll Number: <%= student.getRollno() %></p>
    <p>Name: <%= student.getName() %></p>
    <p>Phone: <%= student.getPhone() %></p>
    <p>Email: <%= student.getEmail() %></p>
    <p>Age: <%= student.getAge() %></p>
    <p>Address: <%= student.getAddress() %></p>
<% 
        } else {
            // Handle case where student is not found
            out.println("Student not found.");
        }
    } else {
        // Handle case where roll number parameter is not provided
        out.println("Roll number parameter is missing.");
    }
%>
    	
    <%-- Display error message if student is not found --%>
    <% 
        String errorMessage = (String) request.getAttribute("errorMessage"); 
        if (errorMessage != null) { 
    %>
        <p style="color: red;"><%= errorMessage %></p>
    <% } %>

</body>
</html>