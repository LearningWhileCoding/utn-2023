package utn.students.service;
import utn.students.models.Student;

import java.util.List;

public interface IServiceStudent {

        public List<Student> getStudents();
        public Student searchStudentById(Integer idstudent);
        public void saveStudent(Student student);
        public void deleteStudent(Student student);

}
