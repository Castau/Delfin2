package Delfinen.logic;

import Delfinen.data.MembershipType;
import Delfinen.data.ActivityType;
import java.time.Year;

/**
 *
 * @author runin, asger og camilla
 */
public class MemberActive extends Member
{
    private ActivityType activityType;


    public MemberActive(String name, Year birthyear, MembershipType membershipType, ActivityType activityType)

    {
        super(name, birthyear, membershipType);
        this.activityType = activityType;
    }

    public ActivityType getActivityType() {
        return activityType;
    }

    
    
    
}

