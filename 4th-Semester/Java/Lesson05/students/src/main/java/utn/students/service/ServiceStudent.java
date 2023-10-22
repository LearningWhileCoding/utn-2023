package utn.students.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.students.models.Students;
import utn.students.repository.RepositoryStudent;

import java.util.List;

@Service
public class ServiceStudent implements IServiceStudent{
    @Autowired
    private RepositoryStudent repositoryStudent;

    @Override
    public List<Students> getStudents() {
        List<Students> students = repositoryStudent.findAll();
        return students;
    }

    @Override
    public Students searchStudentById(Integer idstudent) {
        Students students = repositoryStudent.findById(idstudent).orElse(null);
        return students;
    }

    @Override
    public void saveStudent(Students students) {
        repositoryStudent.save(students);
    }

    @Override
    public void deleteStudent(Students students) {
        repositoryStudent.delete(students);
    }

}
