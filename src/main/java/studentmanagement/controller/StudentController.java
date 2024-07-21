package studentmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import studentmanagement.models.Student;
import studentmanagement.service.studentMang_srv;

@Controller
public class StudentController {
    @Autowired
    private studentMang_srv service;

    public StudentController(studentMang_srv service) {
        this.service = service;
    }

    //handler method for list of students
    @GetMapping("/students")
    public String getAllStudent(Model model){
        model.addAttribute("students",service.getStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        //empty student to hold student form data
        Student st =  new Student();
        model.addAttribute("student",st);
        return "create_student";

    }
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        service.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String update_handler_form(@PathVariable Long id,Model model){
        Student student = service.getStudent(id);
        model.addAttribute("student",student);
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String save_editedStudent(@PathVariable Long id,
                                     @ModelAttribute("student") Student student,
                                     Model model){
        Student existing = service.getStudent(id);
        existing.setFirstName(student.getFirstName());
        existing.setLastName(student.getLastName());
        existing.setPhoneNo(student.getPhoneNo());
        existing.setEmail(student.getEmail());
        service.saveStudent(existing);
        return "redirect:/students";

    }
    @GetMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable Long id,Model model){
        service.deleteStudent(id);
        return "redirect:/students";
    }

}
