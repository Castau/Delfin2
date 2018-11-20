package Delfinen.logic;

import Delfinen.data.MembershipType;
import static Delfinen.data.MembershipType.PASSIVE;
import java.time.Year;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author runin
 * Test class belonging to the Member class.
 * @see Member
 */
public class MemberTest
{

    ArrayList<Year> yearsPaid;
    ArrayList disciplineList;
    ArrayList<Member> Members;

    Member m1;
    MemberActive m2;
    MemberActive m3;
    MemberCompetitive m4;

    /**
     *Tests passive members
     * @see Member
     */
    public MemberTest()
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
    public void testCreateMembers()
    {
        assertNotNull(m1);
        assertEquals(1, m1.getId()); //First member's ID will be == 1, second == 2 etc.
        assertEquals("Hans", m1.getName());
        assertEquals(Year.of(1965), m1.getBirthyear());
        assertEquals(MembershipType.PASSIVE, m1.getMembershipType());

        assertNotNull(m2);
        assertEquals(2, m2.getId()); //First member's ID will be == 1, second == 2 etc.
        assertEquals("Signe", m2.getName());
        assertEquals(Year.of(1940), m2.getBirthyear());
        assertEquals(MembershipType.ACTIVE, m2.getMembershipType());
    }

//    @Test(expected = RuntimeException.class)
//    public void negativeTestCreateMember()
//    {
//        Member m = new Member("Rúni", Year.of(1994), PASSIVE);
//    }
    /**
     * Test of toString method, of class Member.
     */
    @Test
    public void testToString() //fix before export - toString unfinished
    {
        Member instance = m1;
        String expResult = "ID: 8, Name: Hans, Birthyear: 1965, Years Paid: [], MembershipType: PASSIVE";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Member.
     */
    @Test
    public void testEquals() //they got unique IDs mate
    {
        Object obj = m1;
        Member instance = new Member("Hans", Year.of(1965), MembershipType.PASSIVE);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Member.
     */
    @Test
    public void testGetId()
    {
        Member instance = m1;
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdMember method, of class Member.
     */
    @Test
    public void testSetIdMember()
    {
        int idMember = 200;
        Member instance = m1;
        instance.setIdMember(idMember);
        assertEquals(m1.getId(), idMember);
    }

    /**
     * Test of getName method, of class Member.
     */
    @Test
    public void testGetName()
    {
        Member instance = m1;
        String expResult = "Hans";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBirthyear method, of class Member.
     */
    @Test
    public void testGetBirthyear()
    {
        Member instance = m1;
        Year expResult = Year.of(1965);
        Year result = instance.getBirthyear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMembershipType method, of class Member.
     */
    @Test
    public void testGetMembershipType()
    {
        Member instance = m1;
        MembershipType expResult = PASSIVE;
        MembershipType result = instance.getMembershipType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYearsPaid method, of class Member.
     */
    @Test
    public void testGetYearsPaid()
    {
        System.out.println("   testGetYearsPaid:");
        Member instance = m1;
        System.out.println("OLD: " + instance);
        ArrayList<Year> expResult = new ArrayList();
        expResult.add(Year.of(2016));
        expResult.add(Year.of(2017));
        expResult.add(Year.of(2018));
        instance.registerPayment(Year.of(2016));
        instance.registerPayment(Year.of(2017));
        instance.registerPayment(Year.of(2018));
        System.out.println("NEW: " + instance);
        ArrayList<Year> result = instance.getYearsPaid();
        assertEquals(expResult, result);
        System.out.print(expResult + " vs ");
        System.out.println(result);
    }

    /**
     * Test of registerPayment method, of class Member.
     */
    @Test
    public void testRegisterPaymentExtended()
    {
        Year year = Year.of(2016);
        Member instance = m1;
        instance.registerPayment(year);
        assertEquals(instance.getYearsPaid().get(0), year); //added
    }

    /**
     * Test of revokePayment method, of class Member.
     */
    @Test
    public void testRevokePayment()
    {
        Year year = Year.of(2018);
        Member instance = m1;
        instance.registerPayment(Year.of(2016));
        instance.registerPayment(Year.of(2017));
        instance.registerPayment(Year.of(2018));
        boolean expResult = true;
        boolean result = instance.revokePayment(year);
        assertEquals(expResult, result);
    }

    @Test
    public void testRevokePaymentNegative()
    {
        Year year = Year.of(2018);
        Member instance = m1;
        instance.registerPayment(Year.of(2016));
        instance.registerPayment(Year.of(2017));
        //instance.registerPayment(Year.of(2018));
        boolean expResult = false;
        boolean result = instance.revokePayment(year);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalculateArrearAlreadyPaid()
    {
        Member instance = m1;
        instance.registerPayment(Year.of(2018));
        int expResult = 0;
        int result = instance.calculateArrear();
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateArrear method, of class Member.
     */
    @Test
    public void testCalculateArrearPassive()
    {
        Member instance = m1;
        System.out.println("testCalculateArrearPassive: \n" + instance);
        int expResult = 500; //Passive membership cost
        int result = instance.calculateArrear();
        assertEquals(expResult, result);

    }

}
