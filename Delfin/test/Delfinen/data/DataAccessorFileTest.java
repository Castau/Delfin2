package Delfinen.data;

import Delfinen.logic.Member;
import Delfinen.logic.MemberActive;
import Delfinen.logic.MemberCompetitive;
import com.google.gson.Gson;
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
public class DataAccessorFileTest {

    private Model model;
    private DataAccessorFile data;
    private String filePath = "";
    private String testjson = "";

    public DataAccessorFileTest() {
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
        Gson gson = new Gson();
        testjson = gson.toJson(model);
    }

    @Test
    public void testModelToFile() throws IOException {
        String out = "";
        String exp = testjson;
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
        System.out.println(model);
        System.out.println(data.readFile(filePath));
        assertEquals(model, data.readFile(filePath));
    }

}
