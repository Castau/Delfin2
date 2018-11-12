package Delfinen.logic;

import java.util.ArrayList;

/**
 *
 * @author runin
 */
public class MemberCompetitive extends MemberActive
{

    private ArrayList <DisciplineType> disciplineTypes;

    // ArrayList<DisciplineType> disciplineList laves evt. i GUI
    public MemberCompetitive(int id, String name, int birthyear, MembershipType membershipType, 
                             ActivityType activityType, ArrayList<DisciplineType> disciplineList)
    {
        super(id, name, birthyear, membershipType, activityType);
        // forloop er ikke nødvendigt, vi kan bare sætte listerne lig hinanden
        disciplineTypes = disciplineList;
    }
}
