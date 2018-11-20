package Delfinen.logic;

import Delfinen.data.MembershipType;
import Delfinen.data.ModelController;
import java.time.Year;
import java.util.ArrayList;

public class TestMain
{

    public static void main(String[] args)
    {
        Controller c = new Controller();
        ModelController modelController = new ModelController(c);
//        System.out.println("Expected null and got:");
//        System.out.println(modelController.getMemberCompetitive(10));
        ArrayList<Year> yearsPaid;
        ArrayList disciplineList;
        ArrayList<Member> Members;
        Controller controller = new Controller();

        yearsPaid = new ArrayList();
        //yearsPaid.add(Year.of(2016));
        disciplineList = new ArrayList();
        Members = new ArrayList();
        disciplineList.add(Delfinen.data.DisciplineType.CRAWL);
        disciplineList.add(Delfinen.data.DisciplineType.BREASTSTROKE);
        Member m1 = new Member("Hans", Year.of(1965), MembershipType.PASSIVE);
        Member m2 = new Member("Karl", Year.of(2001), MembershipType.PASSIVE);
        MemberActive m3 = new MemberActive("Signe", Year.of(1940), MembershipType.ACTIVE, Delfinen.data.ActivityType.BASIC); //age = 78 (pensionist)
        MemberActive m4 = new MemberActive("Otto", Year.of(2005), MembershipType.ACTIVE, Delfinen.data.ActivityType.BASIC); //age = 13 (youth)
        MemberCompetitive m5 = new MemberCompetitive("Arne", Year.of(1990), MembershipType.ACTIVE, Delfinen.data.ActivityType.COMPETITIVE, disciplineList); //age = 28 (senior)
        MemberCompetitive m6 = new MemberCompetitive("Lily", Year.of(2002), MembershipType.ACTIVE, Delfinen.data.ActivityType.COMPETITIVE, disciplineList);
        Members.add(m1);
        Members.add(m2);
        Members.add(m3);
        Members.add(m4);
        Members.add(m5);
        Members.add(m6);

        Member instance = Members.get(4);
        int expResult = 5; //wat
        int result = instance.getId();
        if (expResult == (result))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        };
    }
}
