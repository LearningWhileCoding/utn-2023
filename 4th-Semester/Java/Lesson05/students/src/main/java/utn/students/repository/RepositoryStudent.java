package utn.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utn.students.models.Students;

public interface RepositoryStudent extends JpaRepository<Students, Integer>{
}
