package Delfinen.data;

import Delfinen.logic.Member;
import com.google.gson.Gson;

/**
 * @author Camilla
 */
public class JsonParser {

    private Gson gson;

    public JsonParser() {
        gson = new Gson();
    }

    public String memberToJSON(Member member) {
        return gson.toJson(member);

    }

    public Member JsonToMember(String jsonString) {
        return gson.fromJson(jsonString, Member.class);

    }
}

