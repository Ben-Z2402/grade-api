package use_case;
import entity.Team;
import api.GradeDB;

public final class GetTeamMembersUseCase {
    private final GradeDB gradeDB;

    public GetTeamMembersUseCase(GradeDB gradeDB) { this.gradeDB = gradeDB; }

    public String[] getTeamMembers(String name) {
        return gradeDB.getMyTeam().getMembers();
    }
}
