package studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import studentmanagement.models.Student;
import studentmanagement.repository.studentRepository;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementApplication.class, args);
    }

    @Autowired
    private studentRepository repository;
    @Override
    public void run(String... args) throws Exception {
//        Student st1 = new Student();
//        st1.setFirstName("Shahid");
//        st1.setLastName("Hussain");
//        st1.setEmail("shahid.123@gmail.com");
//        st1.setPhoneNo(9872334);
//        repository.save(st1);
//
//        Student st2 = new Student();
//        st2.setFirstName("Tellu");
//        st2.setLastName("Beta");
//        st2.setEmail("Tellu.123@gmail.com");
//        st2.setPhoneNo(9872143);
//        repository.save(st2);

    }
}
