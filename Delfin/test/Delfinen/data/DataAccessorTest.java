package Delfinen.data;

import Delfinen.data.DataAccessorFile;
import Delfinen.data.Model;
import Delfinen.data.ActivityType;
import Delfinen.data.DisciplineType;
import Delfinen.logic.Member;
import Delfinen.logic.MemberActive;
import Delfinen.logic.MemberCompetitive;
import Delfinen.data.MembershipType;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Year;
import java.util.ArrayList;
import org.junit.Before;
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
        Config.setTestMode(false);
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
    public void testModelToFile() throws IOException {
        String out = "";
        String exp = "{\"members\":[{\"idMember\":1,\"name\":\"Hans\",\"birthyear\":{\"year\":1902},\"membershipType\":\"PASSIVE\",\"yearsPaid\":[],\"price\":{\"passivePrice\":500,\"youthPrice\":1000,\"seniorPrice\":1600,\"pensionistPrice\":1200,\"allPrices\":{\"PASSIVE\":500,\"SENIOR\":1600,\"YOUTH\":1000,\"PENSIONIST\":1200}}},{\"idMember\":2,\"name\":\"Karl\",\"birthyear\":{\"year\":2001},\"membershipType\":\"PASSIVE\",\"yearsPaid\":[],\"price\":{\"passivePrice\":500,\"youthPrice\":1000,\"seniorPrice\":1600,\"pensionistPrice\":1200,\"allPrices\":{\"PASSIVE\":500,\"SENIOR\":1600,\"YOUTH\":1000,\"PENSIONIST\":1200}}}],\"membersActive\":[{\"activityType\":\"BASIC\",\"idMember\":3,\"name\":\"Signe\",\"birthyear\":{\"year\":1996},\"membershipType\":\"ACTIVE\",\"yearsPaid\":[],\"price\":{\"passivePrice\":500,\"youthPrice\":1000,\"seniorPrice\":1600,\"pensionistPrice\":1200,\"allPrices\":{\"PASSIVE\":500,\"SENIOR\":1600,\"YOUTH\":1000,\"PENSIONIST\":1200}}},{\"activityType\":\"BASIC\",\"idMember\":4,\"name\":\"Otto\",\"birthyear\":{\"year\":1997},\"membershipType\":\"ACTIVE\",\"yearsPaid\":[],\"price\":{\"passivePrice\":500,\"youthPrice\":1000,\"seniorPrice\":1600,\"pensionistPrice\":1200,\"allPrices\":{\"PASSIVE\":500,\"SENIOR\":1600,\"YOUTH\":1000,\"PENSIONIST\":1200}}}],\"membersCompetitive\":[{\"disciplineTypes\":[\"CRAWL\",\"BACKSTROKE\"],\"activityType\":\"COMPETITIVE\",\"idMember\":5,\"name\":\"Arne\",\"birthyear\":{\"year\":1999},\"membershipType\":\"ACTIVE\",\"yearsPaid\":[],\"price\":{\"passivePrice\":500,\"youthPrice\":1000,\"seniorPrice\":1600,\"pensionistPrice\":1200,\"allPrices\":{\"PASSIVE\":500,\"SENIOR\":1600,\"YOUTH\":1000,\"PENSIONIST\":1200}}},{\"disciplineTypes\":[\"CRAWL\",\"BACKSTROKE\"],\"activityType\":\"COMPETITIVE\",\"idMember\":6,\"name\":\"Lily\",\"birthyear\":{\"year\":2002},\"membershipType\":\"ACTIVE\",\"yearsPaid\":[],\"price\":{\"passivePrice\":500,\"youthPrice\":1000,\"seniorPrice\":1600,\"pensionistPrice\":1200,\"allPrices\":{\"PASSIVE\":500,\"SENIOR\":1600,\"YOUTH\":1000,\"PENSIONIST\":1200}}}],\"IdCounter\":7}";
        data.writeToFile(model, filePath);

        FileReader in = new FileReader("Delfin.json");
        BufferedReader br = new BufferedReader(in);

        String line;
        while ((line = br.readLine()) != null) {
            out = out + line;
        }
        in.close();
        assertEquals(exp, out);
    }

    @Test
    public void testFileToModel() throws Exception {
        assertEquals(model, data.readFile(filePath));
    }

}
