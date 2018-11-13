
package Delfinen.data;

/**
 *
 * @author runin, camilla og asger
 */
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;



//class not done at all, just early work on filewriter and reader
// FIX EXCEPTIONS 
public class DataAccessorFile  {
    private String FILENAME = "Delfin.txt";
    
    public void readFile(String filePath) throws Exception {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath + FILENAME));
            String line;
            while((line = reader.readLine()) != null){
               // DO SOMETHING
            }
        } catch (IOException ex) {
            throw new Exception(ex);
        }
    }
    
    public void writeToFile(String toWrite, String filePath) throws IOException {
        String fileContent = "";
        File textFileOut = new File(filePath + FILENAME);
        BufferedWriter out = new BufferedWriter(new FileWriter(textFileOut, true));
        if (!(textFileOut == null)) {
            BufferedReader in = new BufferedReader(new FileReader(textFileOut));
            Scanner scanner = new Scanner(in);
            while (scanner.hasNextLine()) {
                fileContent = fileContent + scanner.nextLine();
            }
            in.close();
        }
        out.write(toWrite);
        out.newLine();
        out.close();
    }
}

