package Delfinen.logic;

import Delfinen.data.DisciplineType;
import Delfinen.data.MembershipType;
import Delfinen.data.ActivityType;
import java.time.Year;
import java.util.ArrayList;

/**
 *
 * @author runin, camilla og asger
 */
public class MemberCompetitive extends MemberActive
{

    private ArrayList<DisciplineType> disciplineTypes;

    // ArrayList<DisciplineType> disciplineList laves evt. i GUI
    public MemberCompetitive(String name, Year birthyear, MembershipType membershipType, 
                             ActivityType activityType, ArrayList<DisciplineType> disciplineList)
    {
        super(name, birthyear, membershipType, activityType);
        disciplineTypes = disciplineList;
    }

    public ArrayList<DisciplineType> getDisciplineTypes() {
        return disciplineTypes;
    }
    
}
