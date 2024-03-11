<%@ page import="java.util.List" %>
<%@ page import="com.studentmanagsys.dob.StudentDao" %>
<%@ page import="com.studentmanagsys.dob.StuDaoImplementation" %>
<%@ page import="com.student_view.Student" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of All Students</title>
</head>
<body>
	<h2>List of All Students</h2>
    <table border="1">
        <tr>
            <th>Roll Number</th>
            <th>Name</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Age</th>
            <th>Address</th>
            <th>Password</th>
        </tr>
        <% 
            StudentDao dao = new StuDaoImplementation();
            List<Student> students = dao.findAllStudents(); 
            for(Student student : students) {
        %>
        <tr>
            <td><%= student.getRollno() %></td>
            <td><%= student.getName() %></td>
            <td><%= student.getPhone() %></td>
            <td><%= student.getEmail() %></td>
            <td><%= student.getAge() %></td>
            <td><%= student.getAddress() %></td>
            <td><%= student.getPassword() %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>