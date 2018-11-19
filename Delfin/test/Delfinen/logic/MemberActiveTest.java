package Delfinen.logic;

import Delfinen.data.ActivityType;
import Delfinen.data.MembershipType;
import static Delfinen.data.MembershipType.ACTIVE;
import org.junit.Test;
import java.time.Year;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 *
 * @author runin
 */
public class MemberActiveTest
{

    ArrayList<Year> yearsPaid;
    private final ArrayList disciplineList;
    private final ArrayList Members;
    Member m1;
    MemberActive m2;
    MemberActive m3;
    MemberCompetitive m4;

    public MemberActiveTest()
    {
        yearsPaid = new ArrayList();
        disciplineList = new ArrayList();
        Members = new ArrayList();
        disciplineList.add(Delfinen.data.DisciplineType.CRAWL);
        disciplineList.add(Delfinen.data.DisciplineType.BREASTSTROKE);

        m1 = new Member("Hans", Year.of(1965), MembershipType.PASSIVE);
        m1.setIdMember(1);
        m2 = new MemberActive("Signe", Year.of(1940), MembershipType.ACTIVE, Delfinen.data.ActivityType.BASIC); //age = 78 (pensionist)
        m2.setIdMember(2);
        m3 = new MemberActive("Otto", Year.of(2005), MembershipType.ACTIVE, Delfinen.data.ActivityType.BASIC); //age = 13 (youth)
        m3.setIdMember(3);
        m4 = new MemberCompetitive("Arne", Year.of(1990), MembershipType.ACTIVE, Delfinen.data.ActivityType.COMPETITIVE, disciplineList); //age = 28 (senior)
        m4.setIdMember(4);
        Members.add(m1);
        Members.add(m2);
        Members.add(m3);
        Members.add(m4);
    }

    @Test
    public void testCreateMemberActive()
    {
        assertNotNull(m2);
        assertEquals(2, m2.getId());
        assertEquals("Signe", m2.getName());
        assertEquals(Year.of(1940), m2.getBirthyear());
        assertEquals(MembershipType.ACTIVE, m2.getMembershipType());
        assertEquals(ActivityType.BASIC, m2.getActivityType());

        assertNotNull(m3);
        assertEquals(3, m3.getId()); //First member's ID will be == 1, second == 2 etc.
        assertEquals("Otto", m3.getName());
        assertEquals(Year.of(2005), m3.getBirthyear());
        assertEquals(ACTIVE, m3.getMembershipType());
        assertEquals(ActivityType.BASIC, m3.getActivityType());
    }

//    @Test (expected = RuntimeException.class)
//   public void negativeTestCreateMember()
//   {
//        //MemberActive m = new MemberActive("Rúni", Year.of(1994), MembershipType.ACTIVE, ActivityType.COMPETITIVUS);
//   }
    @Test
    public void testCalculateArrearActiveYouth()
    {
        MemberActive instance = m3;
        System.out.println("testcalculateArrearActiveYouth: \n" + instance);
        int expResult = 1000; //Active (Youth) membership cost
        int result = instance.calculateArrear();
        assertEquals(expResult, result);
    }

    @Test
    public void testCalculateArrearActivePensionist()
    {
        MemberActive instance = m2;
        System.out.println("testCalculateArrearActivePensionist: \n" + instance);
        int expResult = 1200; //Active (Pensionist) membership cost
        int result = instance.calculateArrear();
        assertEquals(expResult, result);
    }
}
