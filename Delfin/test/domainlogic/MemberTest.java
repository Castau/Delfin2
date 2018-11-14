package domainlogic;

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
}
