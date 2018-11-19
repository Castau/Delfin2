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

    public Subscription(Controller controller)
    {
        this.controller = controller;
    }

    public int getAllArrears(ArrayList<Member> arrearMembers) //Returns missing money
    {
        int totalArrear = 0;

        for (int i = 0; i < arrearMembers.size(); i++)
        {
            totalArrear += arrearMembers.get(i).calculateArrear();
        }
        return totalArrear;
    }

    public ArrayList getArrearMembers(ArrayList<Member> allMembers) //Returns who needs to pay
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
