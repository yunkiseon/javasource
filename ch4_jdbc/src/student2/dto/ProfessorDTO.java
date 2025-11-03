package student2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProfessorDTO {

    private String profID;
    private String profName;
    private String deptId;

}
