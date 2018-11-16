package domaindata;

import Delfinen.data.ActivityType;
import Delfinen.data.DisciplineType;
import Delfinen.data.MembershipType;
import Delfinen.data.Model;
import Delfinen.logic.Member;
import Delfinen.logic.MemberActive;
import Delfinen.logic.MemberCompetitive;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Camilla
 */
public class ModelTest {

    Model model;

    ArrayList<DisciplineType> disciplineList;

    Member m1;
    Member m2;
    MemberActive m3;
    MemberActive m4;
    MemberCompetitive m5;
    MemberCompetitive m6;

    public ModelTest() {
        model = new Model();

        disciplineList = new ArrayList();
        disciplineList.add(DisciplineType.CRAWL);

        m1 = new Member("Hans", Year.of(1902), MembershipType.PASSIVE);
        m2 = new Member("Karl", Year.of(2001), MembershipType.PASSIVE);
        m3 = new MemberActive("Signe", Year.of(1996), MembershipType.ACTIVE, ActivityType.BASIC);
        m4 = new MemberActive("Otto", Year.of(1997), MembershipType.ACTIVE, ActivityType.BASIC);
        m5 = new MemberCompetitive("Arne", Year.of(1999), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);
        m6 = new MemberCompetitive("Lily", Year.of(2002), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);

    }

    @Test
    public void testAddAndGetMember() {
        model.addMember(m1);
        assertEquals(m1, model.getMember(m1.getId()));

    }

    @Test
    public void testAddAndGetMemberActive() {
        model.addMember(m3);
        assertEquals(m3, model.getMemberActive(m3.getId()));

    }

    @Test
    public void testAddAndGetMemberCompetitive() {
        model.addMember(m5);
        assertEquals(m5, model.getMemberCompetitive(m5.getId()));

    }

    @Test
    public void testGetAllMembers() {
        ArrayList<Member> testMembers = new ArrayList();
        model.addMember(m1);
        model.addMember(m2);

        testMembers.add(m1);
        testMembers.add(m2);
        assertEquals(testMembers, model.getAllMembers());

    }
    @Test
    public void testEditMember() {
        // m1 before edit: Member("Hans", Year.of(1902), MembershipType.PASSIVE);
        Member me1 = new Member("ArneOtto", Year.of(1957), MembershipType.PASSIVE);
        model.addMember(m1);
        me1.setIdMember(m1.getId());
        m1.setBirthyear(Year.of(1957));
        m1.setName("ArneOtto");
        model.editMember(m1);
        model.getMember(m1.getId());
        assertEquals(me1, m1);

    }
    @Test
    public void testEditMemberActive() {
        // m3 before edit:  MemberActive("Signe", Year.of(1996), MembershipType.ACTIVE, ActivityType.BASIC);
        Member me3 = new MemberActive("ArneOtto", Year.of(1957), MembershipType.ACTIVE, ActivityType.BASIC);
        model.addMember(m3);
        me3.setIdMember(m3.getId());
        m3.setBirthyear(Year.of(1957));
        m3.setName("ArneOtto");
        model.editMember(m3);
        model.getMember(m3.getId());
        assertEquals(me3, m3);

    } 
        @Test
    public void testEditMemberCompetitive() {
        // m5 before edit: MemberCompetitive("Arne", Year.of(1999), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);
        Member me5 = new MemberCompetitive("ArneOtto", Year.of(1957), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);
        model.addMember(m5);
        me5.setIdMember(m5.getId());
        m5.setBirthyear(Year.of(1957));
        m5.setName("ArneOtto");
        model.editMember(m5);
        model.getMember(m5.getId());
        assertEquals(me5, m5);

    }

}
