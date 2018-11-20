package Delfinen.logic;

import Delfinen.data.MembershipType;
import Delfinen.data.Price;
import java.time.Year;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author runin, Asger, Camilla
 * Class for a standard member with basic (passive) membership.
 */
public class Member
{
    private int idMember;
    private String name;
    private Year birthyear;
    private MembershipType membershipType;
    private ArrayList<Year> yearsPaid = new ArrayList();
    private Price price = new Price();

    /**
     * Member with a passive membership
     *
     * @param name Members name
     * @param birthyear Members Birthyear
     * @param membershipType Members MembershipType
     *
     */
    public Member(String name, Year birthyear, MembershipType membershipType)

    {
        this.name = name;
        this.birthyear = birthyear;
        this.membershipType = membershipType;
    }

//    @Override
//    public String toString()
//    {
//        return "ID: " + idMember + ", Name: " + name + ", Birthyear: " + birthyear + ", Years Paid: " + yearsPaid + ", MembershipType: " + membershipType;
//    }
    @Override
    public String toString()
    {
        return "Member{" + "idMember:" + idMember + ", name=" + name + ", birthyear=" + birthyear + ", membershipType=" + membershipType + ", yearsPaid=" + yearsPaid + ", price=" + price + '}';
    }

    public String toStringNameID()
    {
        return "ID: " + idMember + ", Name: " + name + ", Years Paid: " + yearsPaid;
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
        if (this.idMember != other.idMember)
        {
            return false;
        }
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
        if (!Objects.equals(this.price, other.price))
        {
            return false;
        }
        return true;
    }

    public int getId()
    {
        return idMember;
    }

    public void setIdMember(int idMember)
    {
        this.idMember = idMember;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Year getBirthyear()
    {
        return birthyear;
    }

    public void setBirthyear(Year birthyear)
    {
        this.birthyear = birthyear;
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

    /**
     * CurrentYear-Birthyear = age.
     *
     * @return Returns the users age.
     */
    public int getAge()
    {
        return (Integer.parseInt(Year.now().toString()) - (Integer.parseInt(this.getBirthyear().toString())));
    }

    /**
     *
     * @return Returns prices for all types of members (including sub-classes)
     *
     */
    public int calculateArrear() //Calculates and returns user arrear. DOES NOT RETURN USER INFO!!
    {
        if ((this.getYearsPaid().contains(Year.now()))) //If this member has already paid for the current year
        {
            return 0;
        }
        if (this.getMembershipType().equals(MembershipType.PASSIVE)) //If user is on passive membership subscription
        {
            return price.getPrice(Price.priceType.PASSIVE);
        }

        int age = this.getAge();

        if (this.getMembershipType().equals(MembershipType.ACTIVE)) //If user is on active membership subscription
        {

            if (age <= 17)
            {
                return price.getPrice(Price.priceType.YOUTH); //Returns value based on age (0)-17 (inclusive)

            }

            if (age > 17 && age <= 59)
            {
                return price.getPrice(Price.priceType.SENIOR); //Returns value based on age 18-59 (inclusive)
            }

            if (age >= 60)
            {
                return price.getPrice(Price.priceType.PENSIONIST); //Returns value based on age 60+ (inclusive)
            }
        }
        return 0; //Required value. 0 in arrears.
    }

}
