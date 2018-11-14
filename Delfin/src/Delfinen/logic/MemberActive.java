package Delfinen.logic;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MemberActive other = (MemberActive) obj;
        if (this.activityType != other.activityType) {
            return false;
        }
        return true;
    }

    
    
    
}

