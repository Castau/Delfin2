package Delfinen.logic;

import Delfinen.data.MembershipType;
import java.time.Year;
import java.util.Objects;

/**
 *
 * @author runin, Asger, Camilla
 */
public class Member
{
    private static int id = 0;
    private String name;
    private Year birthyear;
    private MembershipType membershipType;
//    private ActivityType activityType;
//    private DisciplineType disciplineType;

    //Normal member

    public Member(String name, Year birthyear, MembershipType membershipType)

    {
        ++id;
        this.name = name;
        this.birthyear = birthyear;
        this.membershipType = membershipType;
        
    }

    @Override
    public String toString() {
        return "Member with " + "id: " + id + ", name: " + name + ", birthyear: " + birthyear + ", membershipType: " + membershipType;
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
        final Member other = (Member) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.birthyear != other.birthyear) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.membershipType != other.membershipType) {
            return false;
        }
        return true;
    }

    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public Year getBirthyear() 
    {
        return birthyear;
    }

    public MembershipType getMembershipType() 
    {
        return membershipType;
    }
    
    
}
