package Delfinen.logic;

import Delfinen.data.MembershipType;
import java.time.Year;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author runin, Asger, Camilla
 */
public class Member
{

    private static int idCounter = 0;
    private int idMember;
    private String name;
    private Year birthyear;
    private MembershipType membershipType;
    private ArrayList<Year> yearsPaid;
//    private ActivityType activityType;
//    private DisciplineType disciplineType;

    //Normal member
    public Member(String name, Year birthyear, MembershipType membershipType)

    {   yearsPaid = new ArrayList();    
        ++idCounter;
        idMember = idCounter;
        this.name = name;
        this.birthyear = birthyear;
        this.membershipType = membershipType;
        yearsPaid.add(Year.now());

    }

    @Override
    public String toString()
    {
        return "Member with " + "id: " + idCounter + ", name: " + name + ", birthyear: " + birthyear + ", membershipType: " + membershipType + ", yearsPaid: " + yearsPaid;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Member other = (Member) obj;
        if (!Objects.equals(this.name, other.name))
        {
            return false;
        }
        if (!Objects.equals(this.birthyear, other.birthyear))
        {
            return false;
        }
        if (this.membershipType != other.membershipType)
        {
            return false;
        }
        if (!Objects.equals(this.yearsPaid, other.yearsPaid))
        {
            return false;
        }
        return true;
    }

    public int getId()
    {
        return idCounter;
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

    public ArrayList<Year> getYearsPaid()
    {
        return yearsPaid;
    }

    public void registerPayment(Year year)
    {
        if (yearsPaid.contains(year))
        {
            return;
        }
        yearsPaid.add(year);
    }

    public boolean revokePayment(Year year)
    {
        return yearsPaid.remove(year);
    }

}
