package Delfinen.logic;

import Delfinen.data.MembershipType;
import Delfinen.logic.Member;
import static Delfinen.data.MembershipType.PASSIVE;
import java.time.Year;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author runin
 */
public class MemberTest
{
    ArrayList<Year> yearsPaid;
    
    public MemberTest()
    {
        yearsPaid = new ArrayList();
        yearsPaid.add(Year.of(2016));
    }
    
   @Test
   public void testCreateMember() 
   {
        //Arrange data + act on constructor
        Member m = new Member("Rúni", Year.of(1994), PASSIVE); 
        //Assert
        assertNotNull(m);
        assertEquals(1, m.getId()); //First member's ID will be == 1, second == 2 etc.
        assertEquals("Rúni", m.getName());
        assertEquals(Year.of(1994), m.getBirthyear());
        assertEquals(PASSIVE, m.getMembershipType());
   }
   
   @Test
   public void testSecondCreateMember() //Usually testCreatePassiveSeniorMember
   {
        //Arrange data + act on constructor
        Member m = new Member("Vaskebjørn", Year.of(2016), PASSIVE);
        //Assert
        assertNotNull(m);
        assertEquals(2, m.getId()); //First member's ID will be == 1, second == 2 etc.
        assertEquals("Vaskebjørn", m.getName());
        assertEquals(Year.of(2016), m.getBirthyear());
        assertEquals(PASSIVE, m.getMembershipType());
   }
   
   @Test (expected = RuntimeException.class)
   public void negativeTestCreateMember()
   {
        //Member m = new Member("Rúni", Year.of(1994), FALSEENUM);
   }
   
   /**
     * Test of toString method, of class Member.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        Member instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Member.
     */
    @Test
    public void testEquals()
    {
        System.out.println("equals");
        Object obj = null;
        Member instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Member.
     */
    @Test
    public void testGetId()
    {
        System.out.println("getId");
        Member instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdMember method, of class Member.
     */
    @Test
    public void testSetIdMember()
    {
        System.out.println("setIdMember");
        int idMember = 0;
        Member instance = null;
        instance.setIdMember(idMember);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Member.
     */
    @Test
    public void testGetName()
    {
        System.out.println("getName");
        Member instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBirthyear method, of class Member.
     */
    @Test
    public void testGetBirthyear()
    {
        System.out.println("getBirthyear");
        Member instance = null;
        Year expResult = null;
        Year result = instance.getBirthyear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMembershipType method, of class Member.
     */
    @Test
    public void testGetMembershipType()
    {
        System.out.println("getMembershipType");
        Member instance = null;
        MembershipType expResult = null;
        MembershipType result = instance.getMembershipType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYearsPaid method, of class Member.
     */
    @Test
    public void testGetYearsPaid()
    {
        System.out.println("getYearsPaid");
        Member instance = null;
        ArrayList<Year> expResult = null;
        ArrayList<Year> result = instance.getYearsPaid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerPayment method, of class Member.
     */
    @Test
    public void testRegisterPayment()
    {
        System.out.println("registerPayment");
        Year year = null;
        Member instance = null;
        instance.registerPayment(year);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of revokePayment method, of class Member.
     */
    @Test
    public void testRevokePayment()
    {
        System.out.println("revokePayment");
        Year year = null;
        Member instance = null;
        boolean expResult = false;
        boolean result = instance.revokePayment(year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateArrear method, of class Member.
     */
    @Test
    public void testCalculateArrear()
    {
        System.out.println("calculateArrear");
        Member instance = null;
        int expResult = 0;
        //int result = instance.calculateArrear();
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
