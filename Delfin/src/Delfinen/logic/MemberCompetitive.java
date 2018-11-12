package Delfinen.logic;

import java.util.ArrayList;

/**
 *
 * @author runin
 */
public class MemberCompetitive extends MemberActive
{

    private ArrayList <DisciplineType> disciplineType = new ArrayList();

    public MemberCompetitive(int id, String name, int birthyear, MembershipType membershipType, ActivityType activityType, ArrayList disciplineList)
    {
        super(id, name, birthyear, membershipType, activityType);
        for (int i = 0; i < disciplineList.size(); i++)
        {
            //disciplineType.add(disciplineList.get(i));
        }
    }
}
