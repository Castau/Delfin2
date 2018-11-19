package Delfinen.logic;

import java.util.ArrayList;
import java.time.Year;

/**
 *
 * @author runin
 */
public class Subscription
{

    private Controller controller;

    /**
     *Class used for handling Arrears for current year ONLY.
     * @param controller
     */
    public Subscription(Controller controller)
    {
        this.controller = controller;
    }

    /**
     *
     * @param arrearMembers
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
     *
     * @param allMembers
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
