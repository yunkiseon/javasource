package exam;

import java.util.List;

public class TeamEx {
    public static void main(String[] args) {
        Team team = new Team();
        team.setId(1L);
        team.setName("team1");
        
        TeamMember teamMember = new TeamMember();
        teamMember.setId(1L);
        teamMember.setName("홍길동");
        teamMember.setTeam(team);

        TeamMember teamMember2 = new TeamMember();
        teamMember2.setId(2L);
        teamMember2.setName("홍경민");
        teamMember2.setTeam(team);

        //홍길동 팀원 입장에서 팀을 조회
        System.out.println(teamMember.getTeam());
        System.out.println(teamMember.getTeam().getName());
        // 홍경민팀 정보 조회
        System.out.println(teamMember2.getTeam());

        // 팀-> 팀원조회
        // 그럴려면 팀 멤버 변수를 작성해야함.
        team.setMembers(List.of(teamMember,teamMember2));
        // System.out.println(team.getMembers());
        for (TeamMember mem : team.getMembers()) {
            System.out.printf("%s : %s\n", mem.getName(), mem.getTeam().getName());
        }
    }
    
}
