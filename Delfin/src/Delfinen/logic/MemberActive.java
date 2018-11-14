package Delfinen.logic;

import java.time.Year;
import java.util.ArrayList;

/**
 *
 * @author runin, asger og camilla
 */
public class MemberActive extends Member
{

    private ActivityType activityType;

    public MemberActive(String name, Year birthyear, MembershipType membershipType, ArrayList yearsPaid, ActivityType activityType)

    {
        super(name, birthyear, membershipType, yearsPaid);
        this.activityType = activityType;
    }

    public ActivityType getActivityType()
    {
        return activityType;
    }
}
