
package Delfinen.data;

/**
 * @author Camilla
 */
public class Config {
    
    private static boolean testMode = false;
    
    public static void setTestMode(boolean mode){
        testMode = mode;
    }
    
    public static boolean getTestMode(){
        return testMode;
    }
}
