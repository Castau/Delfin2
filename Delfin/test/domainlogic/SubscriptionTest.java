package domainlogic;

import Delfinen.data.ActivityType;
import Delfinen.data.DisciplineType;
import Delfinen.logic.Member;
import Delfinen.logic.MemberActive;
import Delfinen.logic.MemberCompetitive;
import Delfinen.data.MembershipType;
import static Delfinen.data.MembershipType.PASSIVE;
import Delfinen.logic.Controller;
import Delfinen.logic.Subscription;
import java.time.Year;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author runin
 */
public class SubscriptionTest
{
    private Controller controller;
    ArrayList yearsPaid;
    ArrayList disciplineList;
    ArrayList<Member> Members;
    private Member a; //String name, Year birthyear, MembershipType membershipType, ArrayList yearsPaid
    private MemberActive b; //String name, Year birthyear, MembershipType membershipType, ArrayList yearsPaid, ActivityType activityType
    private MemberCompetitive c; //String name, Year birthyear, MembershipType membershipType, ArrayList yearsPaid, ActivityType activityType, ArrayList<DisciplineType> disciplineList

    public SubscriptionTest()
    {
        controller = new Controller();
        yearsPaid = new ArrayList();
        disciplineList = new ArrayList();
        Members = new ArrayList();
        disciplineList.add(DisciplineType.CRAWL);
        disciplineList.add(DisciplineType.BREASTSTROKE);
    }

    @Before
    public void setUp()
    {
        Member m1 = new Member("Hans", Year.of(1902), MembershipType.PASSIVE);
        Member m2 = new Member("Karl", Year.of(2001), MembershipType.PASSIVE);
        MemberActive m3 = new MemberActive("Signe", Year.of(1996), MembershipType.ACTIVE, ActivityType.BASIC);
        MemberActive m4 = new MemberActive("Otto", Year.of(1997), MembershipType.ACTIVE, ActivityType.BASIC);
        MemberCompetitive m5 = new MemberCompetitive("Arne", Year.of(1999), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);
        MemberCompetitive m6 = new MemberCompetitive("Lily", Year.of(2002), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);
        Members.add(m1);
        Members.add(m2);
        Members.add(m3);
        Members.add(m4);
        Members.add(m5);
        Members.add(m6);
//        a = new Member("Rúni", Year.of(1994), PASSIVE);
//        b = new MemberActive("Camilla", Year.of(1990), MembershipType.ACTIVE, ActivityType.BASIC);
//        c = new MemberCompetitive("Asger", Year.of(1997), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);
//        Members.add(a);
//        Members.add(b);
//        Members.add(c);
    }

//    @Test
//    public void testAddMembers()
//    {
//        System.out.println("addMembers");
//        //a.registerPayment(Year.of(2018));
//        
//        //Subscription instance = new Subscription();
//        //System.out.println(instance.addMembers(Members));
//    }
    @Test
    public void testPaymentMember()
    {
        assertTrue(a.getYearsPaid().isEmpty());

        a.registerPayment(Year.of(2016));
        a.registerPayment(Year.of(2017));
        assertEquals(2, a.getYearsPaid().size());
        assertEquals(Year.of(2016), a.getYearsPaid().get(0));

        a.revokePayment(Year.of(2016));
        assertEquals(1, a.getYearsPaid().size());
        assertEquals(Year.of(2017), a.getYearsPaid().get(0));

        boolean res = a.revokePayment(Year.of(2016));
        assertFalse(res);

        a.revokePayment(Year.of(2017));
        assertTrue(a.getYearsPaid().isEmpty());
    }

    @Test
    public void testCalculateArrears()
    {
        
        ArrayList expResult = new ArrayList();
        System.out.println("calculateArrears1");
        Subscription instance = new Subscription(controller);
        expResult.add(a);
        expResult.add(b);
        expResult.add(c);
        expResult = instance.calculateArrears(Members);
        
        ArrayList result = instance.calculateArrears(controller.getAllMembers());
        assertNotNull(expResult);
        assertNotNull(result);
        System.out.println(expResult + "\n" + result);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testCalculateArrearsNoPayment()
    {
        System.out.println("calculateArrears2");
        a.registerPayment(Year.of(2017));
        b.registerPayment(Year.of(2017));
        c.registerPayment(Year.of(2017));
        Subscription sub = new Subscription(controller);

        ArrayList expResult = null;
        ArrayList result = sub.calculateArrears(Members);

        assertEquals(expResult, result);
        
    }

    @Test
    public void testCalculateArrearsOnePayment()
    {
        System.out.println("calculateArrears3");
        a.registerPayment(Year.of(2017));
        b.registerPayment(Year.of(2017));
        c.registerPayment(Year.of(2017));
        a.registerPayment(Year.of(2018));
        c.registerPayment(Year.of(2018));
        //Subscription sub = new Subscription();

        ArrayList expResult = null;
        //ArrayList result = sub.calculateArrears(Members);

        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testEquals()
    {
        Member aa = new Member("Rúni", Year.of(1994), PASSIVE);
        assertEquals(aa, a);
    }

}
