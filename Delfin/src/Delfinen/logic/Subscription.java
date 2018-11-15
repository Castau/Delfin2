package Delfinen.logic;

import Delfinen.data.MembershipType;
import java.util.ArrayList;
import java.time.Year;

/**
 *
 * @author runin
 */
public class Subscription
{

    private Controller controller;
    private ArrayList arrears;
    private ArrayList<Member> Members;
    // private ArrayList<Member> memberArrears;
    // private ArrayList<MemberActive> memberActiveArrears;
    // private ArrayList<MemberCompetitive> MemberCompetitiveArrears;

    public Subscription(Controller controller)
    {
        this.controller = controller;
        arrears = new ArrayList();
        Members = new ArrayList();
        // memberArrears = new ArrayList();
        //memberActiveArrears = new ArrayList();
        //MemberCompetitiveArrears = new ArrayList();
    }

//Arraylist på member med year paid [x]
//Arraylist i kontingent med members der ikke har current year i deres years paid liste
//kontingent udregner hvor meget de skylder
//kontingent skal kende (printe?) members navn id og yearspaidliste
//    public ArrayList addMembers(ArrayList<Member> Members)
//    {
//        
//        ArrayList nonPayee = new ArrayList();
//        for (int i = 0; i < Members.size(); i++)
//        {
//            if (!Members.get(i).getYearsPaid().contains(Year.now()))
//            {
//                nonPayee.add(Members.get(i));
//            }
//        }
//        return nonPayee;
//    }
    public ArrayList calculateArrears(ArrayList<Member> Members)
    {
        Members = controller.getAllMembers();
        //Year currentYear = Year.now();
        //int currentYear = Year.now().getValue(); //also works
        String currentYear = Year.now().toString();
        //arrears.add(addMembers(Members));

        for (int i = 0; i < Members.size(); i++)
        {
            int arrearCost;

            if (!(Members.get(i).getYearsPaid().contains(Year.of(2019))) && Members.get(i).getMembershipType().equals(MembershipType.PASSIVE))
            {
                arrearCost = 500;
                arrears.add(Members.get(i) + ", ARREAR: " + arrearCost);
                continue;
            }
            if (!(Members.get(i).getYearsPaid().contains(Year.of(2019))) && Members.get(i).getMembershipType().equals(MembershipType.ACTIVE))
            {
                String birthyear = Members.get(i).getBirthyear().toString();
                int age = (Integer.parseInt(currentYear) - (Integer.parseInt(birthyear)));

                if (age <= 17)
                {
                    arrearCost = 1000;
                    arrears.add(Members.get(i) + ", ARREAR: " + arrearCost);
                    continue;
                }

                if (age > 17 && age <= 59)
                {
                    arrearCost = 1600;
                    arrears.add(Members.get(i) + ", ARREAR: " + arrearCost);
                    continue;
                }

                if (age > 60)
                {
                    arrearCost = (int) (1600 * 0.75); //25% discount
                    arrears.add(Members.get(i) + ", ARREAR: " + arrearCost);
                }
            }
        }
        return arrears;
    }

}
// while (true)
//        {
//            String sNum = getString();
//            try
//            {
//                return Integer.parseInt(sNum);
//            } catch (NumberFormatException e)
//            {
//                print("Please enter an integer! \n ");
//            }
//        }
