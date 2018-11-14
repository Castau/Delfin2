package domainlogic;

import Delfinen.data.ActivityType;
import Delfinen.data.DisciplineType;
import Delfinen.logic.Member;
import Delfinen.logic.MemberActive;
import Delfinen.logic.MemberCompetitive;
import Delfinen.data.MembershipType;
import static Delfinen.data.MembershipType.PASSIVE;
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

    ArrayList yearsPaid;
    ArrayList disciplineList;
    ArrayList<Member> Members = null;
    private Member a; //String name, Year birthyear, MembershipType membershipType, ArrayList yearsPaid
    private MemberActive b; //String name, Year birthyear, MembershipType membershipType, ArrayList yearsPaid, ActivityType activityType
    private MemberCompetitive c; //String name, Year birthyear, MembershipType membershipType, ArrayList yearsPaid, ActivityType activityType, ArrayList<DisciplineType> disciplineList

    public SubscriptionTest()
    {
        disciplineList = new ArrayList();
        yearsPaid = new ArrayList();
        disciplineList.add(DisciplineType.CRAWL);
        disciplineList.add(DisciplineType.BREASTSTROKE);

    }

    @Before
    public void setUp()
    {
        a = new Member("Rúni", Year.of(1994), PASSIVE);
        b = new MemberActive("Camilla", Year.of(1990), MembershipType.ACTIVE, ActivityType.BASIC);
        c = new MemberCompetitive("Asger", Year.of(1997), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);
        Members = new ArrayList<>();
        Members.add(a);
        Members.add(b);
        Members.add(c);

    }

    @Test
    public void testAddMembers()
    {
        System.out.println("addMembers");
        //a.registerPayment(Year.of(2018));
        
        Subscription instance = new Subscription();
        System.out.println(instance.addMembers(Members));
    }

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
    public void testCalculateArrearsNoPayment()
    {
        System.out.println("calculateArrears");
        a.registerPayment(Year.of(2017));
        b.registerPayment(Year.of(2017));
        c.registerPayment(Year.of(2017));
        Subscription sub = new Subscription();

        ArrayList expResult = null;
        ArrayList result = sub.calculateArrears(Members);

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalculateArrearsOnePayment()
    {
        System.out.println("calculateArrears");
        a.registerPayment(Year.of(2017));
        b.registerPayment(Year.of(2017));
        c.registerPayment(Year.of(2017));
        a.registerPayment(Year.of(2018));
        c.registerPayment(Year.of(2018));
        Subscription sub = new Subscription();

        ArrayList expResult = null;
        ArrayList result = sub.calculateArrears(Members);

        assertEquals(expResult, result);
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
