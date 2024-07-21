package studentmanagement.service;

import studentmanagement.models.Student;

import java.util.List;

public interface studenMangement_IF {
    List<Student> getStudents();
    Student saveStudent(Student student);
    Student getStudent(Long id);
    Student updateStudent(Student student);
     void deleteStudent(Long id);
}
