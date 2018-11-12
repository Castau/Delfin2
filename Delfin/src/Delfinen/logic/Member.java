package Delfinen.logic;

/**
 *
 * @author runin, Asger, Camilla
 */
public class Member
{
    private int id;
    private String name;
    private int birthyear;
    private MembershipType membershipType;
//    private ActivityType activityType;
//    private DisciplineType disciplineType;

    //Normal member
    public Member(int id, String name, int birthyear, MembershipType membershipType)
    {
        this.id = id;
        this.name = name;
        this.birthyear = birthyear;
        this.membershipType = membershipType;
    }

}
