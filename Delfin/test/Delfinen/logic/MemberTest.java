package Delfinen.logic;

import Delfinen.data.DataAccessorFile;
import Delfinen.data.MembershipType;
import static Delfinen.data.MembershipType.PASSIVE;
import java.time.Year;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author runin
 */
public class MemberTest
{

    ArrayList<Year> yearsPaid;
    ArrayList disciplineList;
    ArrayList<Member> Members;
    private Controller controller;

    public MemberTest()
    {
        yearsPaid = new ArrayList();
        //yearsPaid.add(Year.of(2016));
        controller = new Controller();
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
    }

    @Test
    public void testCreateMembers()
    {
        Member m1 = new Member("Rúni", Year.of(1994), PASSIVE);
        assertNotNull(m1);
        assertEquals(7, m1.getId()); //First member's ID will be == 1, second == 2 etc.
        assertEquals("Rúni", m1.getName());
        assertEquals(Year.of(1994), m1.getBirthyear());
        assertEquals(PASSIVE, m1.getMembershipType());

        Member m2 = new Member("Vaskebjørn", Year.of(2016), PASSIVE);
        assertNotNull(m2);
        assertEquals(8, m2.getId()); //First member's ID will be == 1, second == 2 etc.
        assertEquals("Vaskebjørn", m2.getName());
        assertEquals(Year.of(2016), m2.getBirthyear());
        assertEquals(PASSIVE, m2.getMembershipType());
    }

    @Test(expected = RuntimeException.class)
    public void negativeTestCreateMember()
    {
        Member m = new Member("Rúni", Year.of(1994), PASSIVE);
    }

    /**
     * Test of toString method, of class Member.
     */
    @Test
    public void testToString()
    {
        Member instance = Members.get(0);
        String expResult = "ID: 38, Name: Hans, Birthyear: 1965, Years Paid: [], MembershipType: PASSIVE";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Member.
     */
    @Test
    public void testEquals()
    {
        Object obj = Members.get(0);
        Member instance = new Member("Hans", Year.of(1965), MembershipType.PASSIVE);
        instance.setIdMember(Members.get(0).getId()); //FIX
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Member.
     */
    @Test
    public void testGetId() //UNFINISHED. WHERE IS THE ID (14? 33?) FROM?
    {
        Member instance = Members.get(0);
        int expResult = 32; //what
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
        Member instance = Members.get(0);
        instance.setIdMember(idMember);
        assertEquals(Members.get(0).getId(), idMember);
    }

    /**
     * Test of getName method, of class Member.
     */
    @Test
    public void testGetName()
    {
        Member instance = Members.get(0);
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
        Member instance = Members.get(0);
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
        Member instance = Members.get(0);
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
        Member instance = Members.get(0);
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
        Member instance = Members.get(0);
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
        Member instance = Members.get(0);
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
        Member instance = Members.get(0);
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
        Member instance = Members.get(0);
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
        Member instance = Members.get(0);
        System.out.println("testCalculateArrearPassive: " + instance);
        int expResult = 500; //Passive membership cost
        int result = instance.calculateArrear();
        assertEquals(expResult, result);

    }

    @Test
    public void testCalculateArrearActiveYouth()
    {
        Member instance = Members.get(3);
        System.out.println("testcalculateArrearActiveYouth: " + instance);
        int expResult = 1000; //Active (Youth) membership cost
        int result = instance.calculateArrear();
        assertEquals(expResult, result);
    }

    @Test
    public void testCalculateArrearActiveSenior()
    {
        Member instance = Members.get(4);
        System.out.println("testCalculateArrearActiveSenior: " + instance);
        int expResult = 1600; //Active (Senior) membership cost
        int result = instance.calculateArrear();
        assertEquals(expResult, result);
    }

    @Test
    public void testCalculateArrearActivePensionist()
    {
        Member instance = Members.get(2);
        System.out.println("testCalculateArrearActivePensionist: " + instance);
        int expResult = 1200; //Active (Pensionist) membership cost
        int result = instance.calculateArrear();
        assertEquals(expResult, result);
    }
}
