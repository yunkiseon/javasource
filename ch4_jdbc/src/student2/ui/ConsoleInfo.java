package student2.ui;

import java.util.List;
import java.util.Scanner;

import student2.dto.DeptDTO;
import student2.dto.ProfessorDTO;
import student2.dto.StudentDTO;

public class ConsoleInfo {

    // 새 학생 정보 입력 받기
    public StudentDTO insertStudent(Scanner sc) {
        System.out.println("학생 번호 >> ");
        String stuId = sc.nextLine();
        System.out.println("학생 이름 >> ");
        String name = sc.nextLine();
        System.out.println("키 >> ");
        Double height = Double.parseDouble(sc.nextLine());
        System.out.println("학과코드 >> ");
        String deptId = sc.nextLine();
        return new StudentDTO(stuId, name, height, deptId);
    }

    public StudentDTO updateStudent(Scanner sc) {

        System.out.println("학생 번호 >>");
        String stuID = sc.nextLine();
        System.out.println("바뀐 키 >> ");
        Double height = Double.parseDouble(sc.nextLine());

        StudentDTO sDto = new StudentDTO();
        sDto.setStudentId(stuID);
        sDto.setHeight(height);

        return sDto; // 이렇게 하거나 StudentDTO 에서 2개짜리 생성자 만들기도 가능
    }

    public String deleteStudent(Scanner sc) {
        System.out.println("학생 번호 >>");

        String stuId = sc.nextLine();

        return stuId;
    }

    public String getDepteStudent(Scanner sc) {
        System.out.println("학과 번호 >>");
        String deptId = sc.nextLine();
        return deptId;

    }

    public String getStudentID(Scanner sc) {
        System.out.println("학생 번호");
        String stuId = sc.nextLine();
        return stuId;

    }

    public void printStudent(StudentDTO dto) {
        System.out.printf("%s\t%s\t%.2f\t%s", dto.getStudentId(), dto.getName(), dto.getHeight(), dto.getDeptId());

    }

    public void printAllStudent(List<StudentDTO> list) {
        for (StudentDTO dto : list) {
            System.out.printf("%s\t%s\t%.2f\t%s", dto.getStudentId(), dto.getName(), dto.getHeight(), dto.getDeptId());
        }
    }

    // 새 교수 정보 받기
    public ProfessorDTO insertProfessor(Scanner sc) {
        System.out.println("아이디 입력 >> ");
        String profId = sc.nextLine();
        System.out.println("이름 >> ");
        String name = sc.nextLine();
        System.out.println("학과코드 >> ");
        String deptId = sc.nextLine();
        return new ProfessorDTO(profId, name, deptId);
    }

    public ProfessorDTO updateProfessor(Scanner sc) {
        System.out.println("=====수정할 교수 정보=====");
        System.out.println("교수번호 >>");
        String profId = sc.nextLine();
        System.out.println("변경할 학과코드 >> ");
        String deptId = sc.nextLine();

        ProfessorDTO professorDTO = new ProfessorDTO();
        professorDTO.setProfID(profId);
        professorDTO.setDeptId(deptId);

        return professorDTO;
    }

    public String deleteProfessor(Scanner sc) {
        System.out.println("=====삭제할 교수 정보=====");
        System.out.println("교수번호 >>");

        String profId = sc.nextLine();

        return profId;

    }

    public String selectProfessor(Scanner sc) {
        // 특정 전체 교수 조회
        System.out.println("=====교수조회=====");
        System.out.println("교수번호 >>");

        String profId = sc.nextLine();

        return profId;

    }

    public void prinProfessor(ProfessorDTO dto) {
        System.out.println("교수번호 : " + dto.getProfID());
        System.out.println("교수명 : " + dto.getProfName());
        System.out.println("학과번호 : " + dto.getDeptId());
    }

    // 학과 수정

    // 학과 삭제
    public String getDeptId(Scanner sc) {
        System.out.println("\n----- 학과 정보 입력-----");
        System.out.print("학과번호");
        String deptId = sc.nextLine();

        return deptId;
    }

    // 학과 생성
    public DeptDTO setDept(Scanner sc) {
        System.out.println("\n----- 학과 정보 입력-----");
        // System.out.print("학과 코드 >> ");
        // String deptId = sc.nextLine();
        // System.out.println("학과명 >> ");
        // String deptName = sc.nextLine();
        // return new DeptDTO(deptId, deptName); 아래와 동일

        DeptDTO dto = new DeptDTO();
        System.out.print("학과코드 >> ");
        dto.setDeptId(sc.nextLine());
        System.out.print("학과명 >> ");
        dto.setDeptName(sc.nextLine());
        return dto;

    }

    // 개별학과
    public String getDeptName(Scanner sc) {
        System.out.print("학과명 >>");
        String deptName = sc.nextLine();
        return deptName;
    }

    public void print(DeptDTO deptDTO) {
        System.out.println("\n----- 학과 정보-----");
        System.out.println("학과번호\t학과명");
        System.out.println("---------------------------");
        System.out.println(deptDTO.getDeptId() + "\t");
        System.out.println(deptDTO.getDeptName());
    }

    // 전체학과
    public void printAll(List<DeptDTO> list) {
        System.out.println("\n----- 전체 학과 정보-----");
        System.out.println("학과번호\t학과명");
        System.out.println("---------------------------");
        for (DeptDTO deptDTO : list) {
            System.out.println(deptDTO.getDeptId() + "\t");
            System.out.println(deptDTO.getDeptName());
        }
    }
}
