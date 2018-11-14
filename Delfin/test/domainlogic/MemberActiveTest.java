package domainlogic;

import Delfinen.logic.ActivityType;
import Delfinen.logic.MemberActive;
import Delfinen.logic.MembershipType;
import org.junit.Test;
import java.time.Year;
import static org.junit.Assert.*;


/**
 *
 * @author Shevitar
 */
public class MemberActiveTest
{
    //Arrange
    //Act
    //Assert

    

    @Test
    public void testCreateMemberActive() //int id, String name, year birthyear, MembershipType membershipType, ActivityType activityType
    {
        MemberActive m = new MemberActive("Rúni", Year.of(1994), MembershipType.ACTIVE, ActivityType.NORMAL); 
        assertNotNull(m);
        assertEquals(1, m.getId());
        assertEquals("Rúni", m.getName());
        assertEquals(Year.of(1994), m.getBirthyear());
        assertEquals(MembershipType.ACTIVE, m.getMembershipType());
        assertEquals(ActivityType.NORMAL, m.getActivityType());
    }
    
    @Test (expected = RuntimeException.class)
   public void negativeTestCreateMember()
   {
        //MemberActive m = new MemberActive("Rúni", Year.of(1994), MembershipType.ACTIVE, ActivityType.COMPETITIVUS);
   }
}
