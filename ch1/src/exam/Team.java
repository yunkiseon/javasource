package exam;
import java.util.ArrayList;
import java.util.List;

public class Team {
    
    private Long id;
    
    private String name;
    
    
    private List<TeamMember> members = new ArrayList<>();
    

    @Override
    public String toString() {
        return "Team [id=" + id + ", name=" + name + "]";
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<TeamMember> getMembers() {
        return members;
    }

    public void setMembers(List<TeamMember> members) {
        this.members = members;
    }

}
