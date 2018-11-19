package Delfinen.logic;

import Delfinen.data.ActivityType;
import Delfinen.data.DisciplineType;
import Delfinen.data.MembershipType;
import java.time.Year;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author runi, asger og camilla
 */
public class MemberCompetitiveTest
{

    ArrayList<DisciplineType> disciplineList;
    ArrayList<Year> yearsPaid;
    ArrayList<Member> Members = new ArrayList<>();
    private Controller controller;

    public MemberCompetitiveTest()
    {
        
        yearsPaid = new ArrayList();
        //yearsPaid.add(Year.of(2016));
        controller = new Controller();
        disciplineList = new ArrayList();
       // Members = new ArrayList();
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
    public void testCreateMembersCompetitive()
    {
        MemberCompetitive m1 = new MemberCompetitive("Karl", Year.of(1994), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);
        MemberCompetitive m2 = new MemberCompetitive("Johnny", Year.of(1992), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);

        assertNotNull(m1);
        assertEquals(1, m1.getId());
        assertEquals("Karl", m1.getName());
        assertEquals(Year.of(1994), m1.getBirthyear());
        assertEquals(MembershipType.ACTIVE, m1.getMembershipType());
        assertEquals(ActivityType.COMPETITIVE, m1.getActivityType());
        assertEquals(disciplineList, m1.getDisciplineTypes());

        assertNotNull(m2);
        assertEquals(2, m2.getId());
        assertEquals("Johnny", m2.getName());
        assertEquals(Year.of(1992), m2.getBirthyear());
        assertEquals(MembershipType.ACTIVE, m2.getMembershipType());
        assertEquals(ActivityType.COMPETITIVE, m2.getActivityType());
        assertEquals(disciplineList, m2.getDisciplineTypes());
    }

    @Test(expected = RuntimeException.class)
    public void negativeTestCreateMember()
    {
        //MemberActive member = new MemberActive("Rúni", Year.of(1994), MembershipType.ACTIVE, ActivityType.COMPETITIVUS,disciplineList);
    }

    @Test
    public void testCalculateArrearActiveSenior()
    {
        Member instance = Members.get(3);
        System.out.println("testCalculateArrearActiveSenior: \n" + instance);
        int expResult = 1600; //Active (Senior) membership cost
        int result = instance.calculateArrear();
        assertEquals(expResult, result);
    }

}
