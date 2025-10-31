package student;

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
    // DTO(Data Transfer Object) == ~~ VO(Value Object)
    //
    // 아래의 작업들을 워낙 많이 하니까 위의 롬복사용.

    private String profID;
    private String profName;
    private String deptId;

    // 생성자
    // public ProfessorDTO() {
    // }

    // public ProfessorDTO(String profID, String profName, String deptId) {
    // this.profID = profID;
    // this.profName = profName;
    // this.deptId = deptId;
    // }

    // //getter, setter, toString
    // public String getProfID() {
    // return profID;
    // }
    // public void setProfID(String profID) {
    // this.profID = profID;
    // }
    // public String getProfName() {
    // return profName;
    // }
    // public void setProfName(String profName) {
    // this.profName = profName;
    // }
    // public String getDeptId() {
    // return deptId;
    // }
    // public void setDeptId(String deptId) {
    // this.deptId = deptId;
    // }
    // @Override
    // public String toString() {
    // return "ProfessorDTO [profID=" + profID + ", profName=" + profName + ",
    // deptId=" + deptId + "]";
    // }

}
