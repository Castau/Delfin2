package Delfinen.logic;

import Delfinen.data.JsonParser;
import Delfinen.logic.Member;
import Delfinen.data.MembershipType;
import java.time.Year;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camilla
 */
public class JsonTest
{

    JsonParser jsonParser;
    ArrayList<Year> yearsPaid;

    public JsonTest()
    {
        jsonParser = new JsonParser();
        yearsPaid = new ArrayList();
    }

    @Test
    public void memberToJsonTest()
    {
        yearsPaid.add(Year.of(2017));
        Member member = new Member("Hans", Year.of(1902), MembershipType.PASSIVE);
        String exp = "{\"name\":\"Hans\",\"birthyear\":{\"year\":1902},\"membershipType\":\"PASSIVE\",\"yearsPaid\":[{\"year\":2017}]}";
        assertEquals(exp, jsonParser.memberToJSON(member));

//        Member member = new Member(4, "Hans", 1902, MembershipType.PASSIVE);
//        String exp = "{\"id\":4,\"name\":\"Hans\",\"birthyear\":1902,\"membershipType\":\"PASSIVE\"}";
//        assertEquals(exp, jsonParser.memberToJSON(member));
        // System.out.println(jsonParser.memberToJSON(member));
    }

    @Test
    public void JsonToMemberTest()
    {
        yearsPaid.add(Year.of(2016));
        Member memberExp = new Member("Hans", Year.of(1902), MembershipType.PASSIVE);
        //System.out.println(memberExp);
        //String json = "{\"id\":4,\"name\":\"Hans\",\"birthyear\":1902,\"membershipType\":\"PASSIVE\"}";
        String json = "{\"name\":\"Hans\",\"birthyear\":{\"year\":1902},\"membershipType\":\"PASSIVE\",\"yearsPaid\":[{\"year\":2016}]}";
        //System.out.println(jsonParser.JsonToMember(json));

        assertEquals(memberExp, jsonParser.JsonToMember(json));

//        String json = "{\"id\":4,\"name\":\"Hans\",\"birthyear\":1902,\"membershipType\":\"PASSIVE\"}";
//        System.out.println(jsonParser.JsonToMember(json));
    }

// {"id":4,"name":"Hans","birthyear":1902,"membershipType":"PASSIVE"}
}
