package Delfinen.data;

/**
 * The config class handles whether or not the program is in test mode. Used for
 * ensuring that the production test file is not overwritten.
 *
 * @author Camilla
 */
public class Config
{

    // This class contains a static boolean that is used in the DataAccessorFile Class
    // to differentiate between testmode and productionmode.
    private static boolean testMode = false;

    /**
     *
     * @param mode, a boolean that sets testmode on/off
     */
    public static void setTestMode(boolean mode)
    {
        testMode = mode;
    }

    /**
     *
     * @return testMode, a boolean that represents testmode on/off
     */
    public static boolean getTestMode()
    {
        return testMode;
    }
}
