package pe.com.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class DTOCourse {
    private Long vfId;

    private String vfName;
    private String vfCode;
    private Date vfStartDate;
    private String vfDescription;
    private String vfType;
}
