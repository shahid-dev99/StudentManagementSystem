package studentmanagement.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "Students")
public class Student extends BaseModel{
    @Column(name = "First_name", nullable = false)
    private String firstName;
    @Column(name = "Last_name", nullable = true)
    private String lastName;
    @Column(name = "Email", nullable = true)
    private String email;
    @Column(name = "Phone_no", nullable = true)
    private int phoneNo;
}
