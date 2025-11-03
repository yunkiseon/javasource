package student2.ui;

import java.util.List;
import java.util.Scanner;

import student2.dto.DeptDTO;

public class ConsoleInfo {
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
