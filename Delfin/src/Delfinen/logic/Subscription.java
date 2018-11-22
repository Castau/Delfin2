package Delfinen.logic;

import java.util.ArrayList;
import java.time.Year;

/**
 *
 * The Subscription class handles arrears based on the Member.yearsPaid field.
 * It also works off of the Member.calculateArrear method.
 * 
 * @author runin
 *
 * 
 */
public class Subscription
{

    /**
     * Class used for handling Arrears for current year ONLY.
     *
     *
     */
    public Subscription()
    {

    }

    /**
     * See Delfinen.logic.Subscription.getArrearMembers()
     * @param arrearMembers ArrayList of members who have been determined to have an arrear.
     * 
     * @return Returns total missing money for current year.
     */
    public int getAllArrears(ArrayList<Member> arrearMembers)
    {
        int totalArrear = 0;

        for (int i = 0; i < arrearMembers.size(); i++)
        {
            totalArrear += arrearMembers.get(i).calculateArrear();
        }
        return totalArrear;
    }

    /**
     * See Delfinen.logic.Subscription.getAllArrears()
     * 
     * See modelController.getAllMembersInBasicMemberFormat()
     * 
     * @param allMembers an ArrayList of all Members
     * @return Returns ArrayList of members who have yet to pay.
     */
    public ArrayList getArrearMembers(ArrayList<Member> allMembers)
    {
        ArrayList<Member> arrearMembers = new ArrayList();

        for (int i = 0; i < allMembers.size(); i++)
        {
            if (allMembers.get(i).getYearsPaid().contains(Year.now()))
            {
            }

            if (!allMembers.get(i).getYearsPaid().contains(Year.now()))
            {
                arrearMembers.add(allMembers.get(i));
            }
        }
        return arrearMembers;
    }
}
