package Delfinen.data;

/**
 *
 * @author Camilla
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;



public class DataAccessorFile {

    private String FILENAME = "Delfin.json";
    private JsonParser jsonParser;

    public DataAccessorFile() {
        jsonParser = new JsonParser();
    }

    public Model readFile(String filePath) throws Exception {

        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader(filePath + FILENAME));
        Model model = gson.fromJson(reader, Model.class);
        reader.close();
        return model;

    }

    public void writeToFile(Model model, String filePath) throws IOException {
        Writer writer = new FileWriter(filePath + FILENAME);
        Gson gson = new GsonBuilder().create();
        gson.toJson(model, writer);
        writer.close();

    }
}
