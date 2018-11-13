package Delfinen.logic;

import java.time.Year;

/**
 *
 * @author runin, asger og camilla
 */
public class MemberActive extends Member
{
    private ActivityType activityType;

    public MemberActive(int id, String name, Year birthyear, MembershipType membershipType, ActivityType activityType)
    {
        super(id, name, birthyear, membershipType);
        this.activityType = activityType;
    }

    public ActivityType getActivityType()
    {
        return activityType;
    }
    
    
}
