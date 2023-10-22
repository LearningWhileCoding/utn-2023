package utn.students.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.students.models.Student;
import utn.students.repository.RepositoryStudent;

import java.util.List;

@Service
public class ServiceStudent implements IServiceStudent{
    @Autowired
    private RepositoryStudent repositoryStudent;

    @Override
    public List<Student> getStudents() {
        List<Student> students = repositoryStudent.findAll();
        return students;
    }

    @Override
    public Student searchStudentById(Integer idstudent) {
        Student student = repositoryStudent.findById(idstudent).orElse(null);
        return student;
    }

    @Override
    public void saveStudent(Student student) {
        repositoryStudent.save(student);
    }

    @Override
    public void deleteStudent(Student student) {
        repositoryStudent.delete(student);
    }
}
