package domainlogic;

import Delfinen.data.ActivityType;
import Delfinen.data.DisciplineType;
import Delfinen.logic.Member;
import Delfinen.data.ActivityType;
import Delfinen.data.DisciplineType;
import Delfinen.logic.MemberActive;
import Delfinen.logic.MemberCompetitive;
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

    public MemberCompetitiveTest()
    {
        disciplineList = new ArrayList();
        yearsPaid = new ArrayList();
        disciplineList.add(DisciplineType.CRAWL);
        disciplineList.add(DisciplineType.BREASTSTROKE);
        yearsPaid.add(Year.of(2016));
    }

    @Test
    public void testCreateMemberCompetitive()
    {
        MemberCompetitive member = new MemberCompetitive("Karl", Year.of(1994), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);

        assertNotNull(member);
        assertEquals(1, member.getId());
        assertEquals("Karl", member.getName());
        assertEquals(Year.of(1994), member.getBirthyear());
        assertEquals(MembershipType.ACTIVE, member.getMembershipType());
        assertEquals(ActivityType.COMPETITIVE, member.getActivityType());
        assertEquals(disciplineList, member.getDisciplineTypes());

    }

    @Test(expected = RuntimeException.class)
    public void negativeTestCreateMember() {
        //MemberActive member = new MemberActive("Rúni", Year.of(1994), MembershipType.ACTIVE, ActivityType.COMPETITIVUS,disciplineList);
    }

}
