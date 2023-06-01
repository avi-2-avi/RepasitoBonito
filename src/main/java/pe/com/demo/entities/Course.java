package pe.com.demo.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name= "vf_courses")
@Data
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vfId;

    private String vfName;
    private String vfCode;
    private Date vfStartDate;
    private String vfDescription;
    private String vfType;

    public Course(String vfName, String vfCode, Date vfStartDate, String vfDescription, String vfType) {
        this.vfName = vfName;
        this.vfCode = vfCode;
        this.vfStartDate = vfStartDate;
        this.vfDescription = vfDescription;
        this.vfType = vfType;
    }
}
