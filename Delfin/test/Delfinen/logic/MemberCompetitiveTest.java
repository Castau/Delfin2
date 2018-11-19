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
    ArrayList<Member> Members;
    Member m1;
    MemberActive m2;
    MemberActive m3;
    MemberCompetitive m4;

    public MemberCompetitiveTest()
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
    public void testCreateMembersCompetitive()
    {
        MemberCompetitive m5 = new MemberCompetitive("Johnny", Year.of(1992), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);
        m5.setIdMember(5);

        assertNotNull(m4);
        assertEquals(4, m4.getId());
        assertEquals("Arne", m4.getName());
        assertEquals(Year.of(1990), m4.getBirthyear());
        assertEquals(MembershipType.ACTIVE, m4.getMembershipType());
        assertEquals(ActivityType.COMPETITIVE, m4.getActivityType());
        assertEquals(disciplineList, m4.getDisciplineTypes());

        assertNotNull(m5);
        assertEquals(5, m5.getId());
        assertEquals("Johnny", m5.getName());
        assertEquals(Year.of(1992), m5.getBirthyear());
        assertEquals(MembershipType.ACTIVE, m5.getMembershipType());
        assertEquals(ActivityType.COMPETITIVE, m5.getActivityType());
        assertEquals(disciplineList, m5.getDisciplineTypes());

    }

//    @Test(expected = RuntimeException.class)
//    public void negativeTestCreateMember()
//    {
//        //MemberActive member = new MemberActive("Rúni", Year.of(1994), MembershipType.ACTIVE, ActivityType.COMPETITIVUS,disciplineList);
//    }
    @Test
    public void testCalculateArrearActiveSenior()
    {
        Member instance = m4;
        System.out.println("testCalculateArrearActiveSenior: \n" + instance);
        int expResult = 1600; //Active (Senior) membership cost
        int result = instance.calculateArrear();
        assertEquals(expResult, result);
    }

}
