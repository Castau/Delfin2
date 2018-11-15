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

//
//    public void addMember(Member member) {
//        members.add(member);
//    }
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
    public void testGetAllMembers(){
        ArrayList<Member> testMembers = new ArrayList();
        model.addMember(m1);
        model.addMember(m2);
        
        testMembers.add(m1);
        testMembers.add(m2);
        assertEquals(testMembers,model.getAllMembers());
        
        
    }

}
