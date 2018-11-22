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

    /**
     * DataAccessorFile creates a file that holds all the program data. If the 
     * Config testmode boolean is set to true, a seperate file for testing is 
     * created.
     */
    public DataAccessorFile()
    {
        if (Config.getTestMode() == true)
        {
            FILENAME = "DelfinTEST.json";
        }
    }

    /**
     * This method reads the file specified in the filePath string and returns
     * the file content as a Model object.
     * 
     * @param filePath File path (Default: empty = project folder)
     * @return Model
     */
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

    /**
     * This method takes a Model object and writes it to the file, specified by
     * the filePath and the FILENAME. If no file exists when this method is called, a new file will
     * be created.
     * 
     * @param model Model object in question. If none, new will be created.
     * @param filePath File path in question. (Default: Empty = Project folder)
     */
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

    /**
     * Sets the FILENAME
     * 
     * @param FILENAME Desired filename. (Default: "Delfin.json")
     */
    public void setFILENAME(String FILENAME)
    {
        this.FILENAME = FILENAME;
    }

}
