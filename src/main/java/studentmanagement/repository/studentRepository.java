package studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studentmanagement.models.Student;

//@Repository annonaton is not needed as it included SimpleJPARepository
public interface studentRepository extends JpaRepository<Student,Long> {

}
