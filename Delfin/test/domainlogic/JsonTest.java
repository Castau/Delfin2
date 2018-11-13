
package domainlogic;

import Delfinen.data.JsonParser;
import Delfinen.logic.Member;
import Delfinen.logic.MembershipType;
import java.time.Year;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camilla
 */
public class JsonTest {
    JsonParser jsonParser;
    public JsonTest() {
        jsonParser = new JsonParser();
        
    }
    @Test
    public void memberToJsonTest(){

        Member member = new Member("Hans", Year.of(1902), MembershipType.PASSIVE);
        String exp = "{\"id\":4,\"name\":\"Hans\",\"birthyear\":1902,\"membershipType\":\"PASSIVE\"}";
        assertEquals(exp, jsonParser.memberToJSON(member));
        

//        Member member = new Member(4, "Hans", 1902, MembershipType.PASSIVE);
//        String exp = "{\"id\":4,\"name\":\"Hans\",\"birthyear\":1902,\"membershipType\":\"PASSIVE\"}";
//        assertEquals(exp, jsonParser.memberToJSON(member));
        
        
        System.out.println(jsonParser.memberToJSON(member));
    }
    
    @Test
    public void JsonToMemberTest(){
        String json = "{\"id\":4,\"name\":\"Hans\",\"birthyear\":1902,\"membershipType\":\"PASSIVE\"}";

        Member memberExp = new Member("Hans", Year.of(1902), MembershipType.PASSIVE);

        assertEquals(memberExp, jsonParser.JsonToMember(json));
        
//        String json = "{\"id\":4,\"name\":\"Hans\",\"birthyear\":1902,\"membershipType\":\"PASSIVE\"}";
//        System.out.println(jsonParser.JsonToMember(json));
    }

// {"id":4,"name":"Hans","birthyear":1902,"membershipType":"PASSIVE"}

}
