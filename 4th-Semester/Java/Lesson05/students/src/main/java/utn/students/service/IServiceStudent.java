package utn.students.service;
import utn.students.models.Students;

import java.util.List;

public interface IServiceStudent {

        public List<Students> getStudents();
        public Students searchStudentById(Integer idstudent);
        public void saveStudent(Students students);
        public void deleteStudent(Students students);

}
