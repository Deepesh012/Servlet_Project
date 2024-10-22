package com.studentmanagsys.dob;

import java.io.IOException;

import com.student_view.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class UserController extends HttpServlet {
	private StudentDao dao = new StuDaoImplementation();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 int rollno = Integer.parseInt(req.getParameter("rollno"));
	     String name = req.getParameter("name");
	     long phone = Long.parseLong(req.getParameter("phone"));
	     String email = req.getParameter("email");
	     int age = Integer.parseInt(req.getParameter("age"));
	     String address = req.getParameter("address");
	     String password = req.getParameter("password");

	     Student student = new Student(rollno, name, phone, email, age, address, password);

	        String message = null;
	        boolean saveStudent = dao.saveStudent(student);
			if (saveStudent) {
			    resp.sendRedirect("Welcome.jsp");
			} else {
			    message = "Data not saved";
			}

	        if (message != null) {
	            req.setAttribute("message", message);
	            req.getRequestDispatcher("Register.jsp").forward(req, resp);
	        }
	}

}
