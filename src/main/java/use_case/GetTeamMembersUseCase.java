package use_case;
import api.GradeDB;

public final class GetTeamMembersUseCase {
    private final GradeDB gradeDB;

    public GetTeamMembersUseCase(GradeDB gradeDB) { this.gradeDB = gradeDB; }

    public String[] getTeamMembers() {
        return gradeDB.getMyTeam().getMembers();
    }
}
