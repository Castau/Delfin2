package domainlogic;

import Delfinen.data.ActivityType;
import Delfinen.logic.MemberActive;
import Delfinen.data.MembershipType;
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
        MemberActive m = new MemberActive("Rúni", Year.of(1994), MembershipType.ACTIVE, ActivityType.BASIC); 
        assertNotNull(m);
        assertEquals(1, m.getId());
        assertEquals("Rúni", m.getName());
        assertEquals(Year.of(1994), m.getBirthyear());
        assertEquals(MembershipType.ACTIVE, m.getMembershipType());
        assertEquals(ActivityType.BASIC, m.getActivityType());
    }
    
    @Test (expected = RuntimeException.class)
   public void negativeTestCreateMember()
   {
        MemberActive m = new MemberActive("Rúni", Year.of(1994), MembershipType.ACTIVE, ActivityType.COMPETITIVUS);
   }
}
