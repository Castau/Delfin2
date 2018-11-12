package Delfinen.logic;

/**
 *
 * @author runin
 */
public class MemberActive extends Member
{

    private ActivityType activityType;

    public MemberActive(int id, String name, int birthyear, MembershipType membershipType, ActivityType activityType)
    {
        super(id, name, birthyear, membershipType);
        this.activityType = activityType;
    }
}