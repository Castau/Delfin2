
package domaindata;

import Delfinen.data.DataAccessorFile;
import Delfinen.data.Model;
import Delfinen.data.ActivityType;
import Delfinen.data.DisciplineType;
import Delfinen.logic.Member;
import Delfinen.logic.MemberActive;
import Delfinen.logic.MemberCompetitive;
import Delfinen.data.MembershipType;
import java.io.IOException;
import java.time.Year;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Camilla
 */
public class DataAccessorTest {
    private Model model;
    private DataAccessorFile data;
    private String filePath = "";
    
    public DataAccessorTest() {
        data = new DataAccessorFile();
    }
    
    @Before
    public void setUp() {
        model = new Model();
        ArrayList<DisciplineType> disciplineList = new ArrayList();
        disciplineList.add(DisciplineType.CRAWL);
        disciplineList.add(DisciplineType.BACKSTROKE);
        Member m1 = new Member("Hans", Year.of(1902), MembershipType.PASSIVE);
        Member m2 = new Member("Karl", Year.of(2001), MembershipType.PASSIVE);
        MemberActive m3 = new MemberActive("Signe", Year.of(1996), MembershipType.ACTIVE, ActivityType.BASIC);
        MemberActive m4 = new MemberActive("Otto", Year.of(1997), MembershipType.ACTIVE, ActivityType.BASIC);
        MemberCompetitive m5 = new MemberCompetitive("Arne", Year.of(1999), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);
        MemberCompetitive m6 = new MemberCompetitive("Lily", Year.of(2002), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);
        model.addMember(m1);
        model.addMember(m2);
        model.addMember(m3);
        model.addMember(m4);
        model.addMember(m5);
        model.addMember(m6);   
    }
    
    @Test
    public void testModelToFile() throws IOException{
        data.writeToFile(model, filePath);
        
    }
    
    @Test
    public void testFileToModel() throws Exception{
        assertEquals(model, data.readFile(filePath));
    }




}
