package studentmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studentmanagement.models.Student;
import studentmanagement.repository.studentRepository;

import java.util.List;

@Service
public class studentMang_srv implements studenMangement_IF{
    //Dependency Injection
    @Autowired
    private studentRepository srepos;
    public studentMang_srv(studentRepository srepos){
        this.srepos = srepos;
    }
    @Override
    public List<Student> getStudents() {
        return srepos.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return srepos.save(student);
    }

    @Override
    public Student getStudent(Long id) {
        return srepos.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return srepos.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        srepos.deleteById(id);
    }
}
