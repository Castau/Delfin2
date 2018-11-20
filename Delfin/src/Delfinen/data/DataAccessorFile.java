package Delfinen.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;

/**
 *
 * @author Camilla
 * 
 * DataAccessorFile is used to access file using the java.io package.
 * It also takes use of Google Gson (2.8.2) to store and load JSON data.
 */
public class DataAccessorFile
{

    private String FILENAME = "Delfin.json";
    //private JsonParser jsonParser;

    public DataAccessorFile()
    {
        //jsonParser = new JsonParser();
        if (Config.getTestMode() == true)
        {
            FILENAME = "DelfinTEST.json";
        }
    }

    public Model readFile(String filePath)
    {
        Gson gson = new Gson();
        JsonReader reader = null;
        Model model = null;
        try
        {
            reader = new JsonReader(new FileReader(filePath + FILENAME));
            model = gson.fromJson(reader, Model.class);

        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        finally
        {
            try
            {
                if (reader != null)
                {
                    reader.close();
                }
            }
            catch (IOException io)
            {
                System.out.println("Could not close fileReader " + io);
            }
        }
        return model;
    }

    public void writeToFile(Model model, String filePath)
    {
        Gson gson = new GsonBuilder().create();
        Writer writer = null;
        try
        {
            writer = new FileWriter(filePath + FILENAME);
            gson.toJson(model, writer);

        }
        catch (IOException io)
        {
            System.out.println("File not found");
        }
        finally
        {
            try
            {
                if (writer != null)
                {
                    writer.close();
                }
            }
            catch (IOException io)
            {
                System.out.println("Could not close fileWriter " + io);
            }
        }
    }

    public void setFILENAME(String FILENAME)
    {
        this.FILENAME = FILENAME;
    }

//    public Model readFile(String filePath) throws Exception {
//
//        Gson gson = new Gson();
//        JsonReader reader = new JsonReader(new FileReader(filePath + FILENAME));
//        Model model = gson.fromJson(reader, Model.class);
//        reader.close();
//        return model;
//
//    }    
//    public void writeToFile(Model model, String filePath) throws IOException  {
//        Writer writer = new FileWriter(filePath + FILENAME);
//        Gson gson = new GsonBuilder().create();
//        gson.toJson(model, writer);
//        writer.close();
//
//    }
}
