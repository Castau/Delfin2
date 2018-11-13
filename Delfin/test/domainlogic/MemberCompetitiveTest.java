/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domainlogic;

import Delfinen.logic.ActivityType;
import Delfinen.logic.MemberCompetetive;
import Delfinen.logic.MembershipType;
import java.time.Year;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shevitar
 */
public class MemberCompetitiveTest {
    
    public void testCreateMemberCompetetive() //int id, String name, year birthyear, MembershipType membershipType, ActivityType activityType
    {
        MemberCompetetive m = new MemberCompetetive(1, "Rúni", Year.of(1994), MembershipType.ACTIVE, ActivityType.NORMAL); 
        assertNotNull(m);
        assertEquals(1, m.getId());
        assertEquals("Rúni", m.getName());
        assertEquals(Year.of(1994), m.getBirthyear());
        assertEquals(MembershipType.ACTIVE, m.getMembershipType());
        assertEquals(ActivityType.NORMAL, m.getActivityType());
    }
    
}
