package Delfinen.data;

import Delfinen.logic.Member;
import com.google.gson.Gson;

/**
 * @author Camilla
 */
public class JsonParser {

    //BLIVER PT IKKE BRUGT, SKAL FORMENTLIG SLETTES - VENT TIL VI ER VED VEJS ENDE OG VED MED SIKKERHED OM VI SKAL BRUGE DEN
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

