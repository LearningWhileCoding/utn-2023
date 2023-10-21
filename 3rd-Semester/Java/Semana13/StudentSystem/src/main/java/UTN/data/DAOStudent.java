package UTN.data;

import UTN.domain.Student;
import static UTN.connection.MysqlConnection.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOStudent {
    // Class methods
    public List<Student> getStudents(){

        List<Student> students = new ArrayList<>();
        PreparedStatement ps; // Send the query
        ResultSet rs; // Get the result
        Connection con = getConnection();
        String sql = "SELECT * FROM students ORDER BY idstudents";
        try{
            ps= con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                var student = new Student();
                student.setIdStudent(rs.getInt("idstudents"));
                student.setName(rs.getString("name"));
                student.setLastname(rs.getString("lastname"));
                student.setPhone(rs.getString("phone"));
                student.setEmail(rs.getString("email"));
                students.add(student);
            }
        } catch (Exception e){
            System.out.println("An error occurred while getting the data " + e.getMessage());
        }
        finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("An error occurred while closing the connection " + e.getMessage());
            }
        }
        return students;
    }

    public boolean searchStudentById(Student student){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "SELECT * FROM students WHERE idstudents=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, student.getIdStudent());
            rs = ps.executeQuery();
            if (rs.next()){
                student.setName(rs.getString("name"));
                student.setLastname(rs.getString("lastname"));
                student.setPhone(rs.getString("phone"));
                student.setEmail(rs.getString("email"));
                return true;
            }
        }catch (Exception e){
            System.out.println("An error occurred while searching the student: " + e.getMessage());
        }
        finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("An error occurred while closing the connection: " + e.getMessage());
            }

        }
        return  false;
    }

    public boolean addStudent(Student student){
        PreparedStatement ps;
        Connection connection = getConnection();
        String sql = "INSERT INTO students (name, lastname, phone, email) VALUES (?, ?, ?, ?)";
        try{
            ps = connection.prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setString(2, student.getLastname());
            ps.setString(3, student.getPhone());
            ps.setString(4, student.getEmail());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("An error occurred while adding the student: " + e.getMessage());
        }
        finally {
            try {
                connection.close();
            }catch (Exception e){
                System.out.println("An error occurred while closing the connection: " + e.getMessage());
            }
        }
        return  false;
    }

    public boolean updateStudent(Student student){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "UPDATE students SET name=?, lastname=?, phone=?, email=? WHERE idstudents=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setString(2, student.getLastname());
            ps.setString(3, student.getPhone());
            ps.setString(4, student.getEmail());
            ps.setInt(5, student.getIdStudent());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("An error occurred while updating the student: " + e.getMessage());
        }
        finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("An error occurred while closing the connection: " + e.getMessage());
            }
        }
        return  false;
    }

    public boolean deleteStudent(Student student){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "DELETE FROM students WHERE idstudents=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,student.getIdStudent());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("An error occurred while deleting the student: " + e.getMessage());
        }finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("An error occurred while closing the connection: " + e.getMessage());
            }
        }
        return false;
    }

    // End of Class Methods

    public static void main(String[] args) {
        var daoStudent = new DAOStudent();
        /*
        // Search by ID
        var student = new Student(1);
        System.out.println("Before search: " + student);
        var found = daoStudent.searchStudentById(student);
        if(found)
            System.out.println("Student found: " + student);
        else System.out.println("Can't find the student:" + student.getIdStudent());
        */
        /*
        // Add student
        var newStudent = new Student("Fry", "Philip", "+1865452145", "fryp@gmail.com");
        var added = daoStudent.addStudent(newStudent);
        if(added)
            System.out.println("Student added: " + newStudent);
        else
            System.out.println("There wan't any student added " + newStudent);
        /*
        // Update Student
        var updatedStudent = new Student(1,"Wilson", "Jhonson", "077770544", "wilsonj@gmail.com");
        var updated = daoStudent.updateStudent(updatedStudent);
        if(updated)
            System.out.println("Updated Student: " + updatedStudent);
        else
            System.out.println("There wasnt any update" + updatedStudent);
        */

        // Delete Student
        var student = new Student(3);
        var deleted = daoStudent.deleteStudent(student);
        if (deleted)
            System.out.println("Student deleted");
        else
            System.out.println("The student was not deleted.");
        // Get Students
        System.out.println("················································································································································································································");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tStudents list");
        System.out.println("················································································································································································································");
        List<Student> students = daoStudent.getStudents();
        students.forEach(System.out::println);
        System.out.println("················································································································································································································");
    }
}