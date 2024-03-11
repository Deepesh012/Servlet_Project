package com.studentmanagsys.dob;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.exception.StudentNotFoundException;
import com.student_view.Student;

public class StuDaoImplementation implements StudentDao {
	Connection connection =ConnectionData.getconnection();
	
	@Override
	public boolean saveStudent(Student student) {
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO student VALUES (?,?,?,?,?,?,?)");
			ps.setInt(1, student.getRollno());
			ps.setString(2, student.getName());
			ps.setLong(3, student.getPhone());
			ps.setString(4, student.getEmail());
			ps.setInt(5, student.getAge());
			ps.setString(6, student.getAddress());
			ps.setString(7, student.getPassword());
			
			int execute = ps.executeUpdate();
			return execute>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateStudent(Student student) {
		try {
			PreparedStatement ps = connection.prepareStatement("UPDATE student SET name=?, phone=?, email=?, age=?, address=?, password=? WHERE rollno=?");
			ps.setString(1, student.getName());
            ps.setLong(2, student.getPhone());
            ps.setString(3, student.getEmail());
            ps.setInt(4, student.getAge());
            ps.setString(5, student.getAddress());
            ps.setString(6, student.getPassword());
            ps.setInt(7, student.getRollno());
            
            int execute = ps.executeUpdate();
            return execute>0;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteStudent(Student student) {
		 try {
			PreparedStatement ps = connection.prepareStatement("DELETE FROM student WHERE rollno=?");
			 ps.setInt(1, student.getRollno());

	         int execute = ps.executeUpdate();
	         return execute > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		return false;
	}

	@Override
	public Student findStudentById(int rollno) throws StudentNotFoundException {
		try {
			PreparedStatement ps = connection.prepareStatement("select * from student where rollno=?");
			ps.setInt(1, rollno);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				Student student = new Student();
				 student.setRollno(rs.getInt("rollno"));
				 student.setName(rs.getString("name"));
				 student.setPhone(rs.getLong("phone"));
				 student.setEmail(rs.getString("email"));
				 student.setAge(rs.getInt("age"));
				 student.setAddress(rs.getString("address"));
				 student.setPassword(rs.getString("password"));
				 return student;
			}
			else {
				 throw new StudentNotFoundException("Student with roll number " + rollno + " not found");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Student> findAllStudents() {
		List<Student> students = new ArrayList<>();
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM student");
			ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Student student = new Student();
                student.setRollno(rs.getInt("rollno"));
                student.setName(rs.getString("name"));
                student.setPhone(rs.getLong("phone"));
                student.setEmail(rs.getString("email"));
                student.setAge(rs.getInt("age"));
                student.setAddress(rs.getString("address"));
                student.setPassword(rs.getString("password"));
                students.add(student);
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
	}

}
