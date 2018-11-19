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
    private  Controller controller;
    private final ArrayList disciplineList;
    private final ArrayList Members;

    public MemberActiveTest()
    {
     yearsPaid = new ArrayList();
        //yearsPaid.add(Year.of(2016));
        controller = new Controller();
        disciplineList = new ArrayList();
        Members = new ArrayList();
        disciplineList.add(Delfinen.data.DisciplineType.CRAWL);
        disciplineList.add(Delfinen.data.DisciplineType.BREASTSTROKE);
        
        Member m1 = new Member("Hans", Year.of(1965), MembershipType.PASSIVE);
        MemberActive m2 = new MemberActive("Signe", Year.of(1940), MembershipType.ACTIVE, Delfinen.data.ActivityType.BASIC); //age = 78 (pensionist)
        MemberActive m3 = new MemberActive("Otto", Year.of(2005), MembershipType.ACTIVE, Delfinen.data.ActivityType.BASIC); //age = 13 (youth)
        MemberCompetitive m4 = new MemberCompetitive("Arne", Year.of(1990), MembershipType.ACTIVE, Delfinen.data.ActivityType.COMPETITIVE, disciplineList); //age = 28 (senior)
        Members.add(m1);
        Members.add(m2);
        Members.add(m3);
        Members.add(m4);
    }

    @Test
    public void testCreateMemberActive() 
    {
        MemberActive m = new MemberActive("Rúni", Year.of(1994), MembershipType.ACTIVE, ActivityType.BASIC); 
        assertNotNull(m);
        assertEquals(1, m.getId());
        assertEquals("Rúni", m.getName());
        assertEquals(Year.of(1994), m.getBirthyear());
        assertEquals(MembershipType.ACTIVE, m.getMembershipType());
        assertEquals(ActivityType.BASIC, m.getActivityType());
        
        MemberActive m2 = new MemberActive("Vaskebjørn", Year.of(2016), MembershipType.ACTIVE, ActivityType.COMPETITIVE);
        assertNotNull(m2);
        assertEquals(2, m2.getId()); //First member's ID will be == 1, second == 2 etc.
        assertEquals("Vaskebjørn", m2.getName());
        assertEquals(Year.of(2016), m2.getBirthyear());
        assertEquals(ACTIVE, m2.getMembershipType());
        assertEquals(ActivityType.COMPETITIVE, m2.getActivityType());
    }
    
    @Test (expected = RuntimeException.class)
   public void negativeTestCreateMember()
   {
        //MemberActive m = new MemberActive("Rúni", Year.of(1994), MembershipType.ACTIVE, ActivityType.COMPETITIVUS);
   }
   
   @Test
    public void testCalculateArrearActiveYouth()
    {
        MemberActive instance = (MemberActive) Members.get(2);
        System.out.println("testcalculateArrearActiveYouth: \n" + instance);
        int expResult = 1000; //Active (Youth) membership cost
        int result = instance.calculateArrear();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testCalculateArrearActivePensionist()
    {
        MemberActive instance = (MemberActive) Members.get(1);
        System.out.println("testCalculateArrearActivePensionist: \n" + instance);
        int expResult = 1200; //Active (Pensionist) membership cost
        int result = instance.calculateArrear();
        assertEquals(expResult, result);
    }
}
