package Delfinen.data;

import java.util.HashMap;

/**
 *
 * @author runin
 */
public class Price
{
    //Yearly cost of membership
    private int passivePrice = 500;
    private int youthPrice = 1000;
    private int seniorPrice = 1600;
    private int pensionistPrice = (int) (1600 * 0.75); //25% discount for age 60+
    HashMap<String, Integer> allPrices;

    public Price()
    {
        allPrices = new HashMap();

        //Passive membership:
        allPrices.put(priceType.PASSIVE.toString(), passivePrice);
        //Active memberships:
        allPrices.put(priceType.YOUTH.toString(), youthPrice); //Between the age of 0 and 17 (including)
        allPrices.put(priceType.SENIOR.toString(), seniorPrice); //Between the age of 18 and 59 (including)
        allPrices.put(priceType.PENSIONIST.toString(), pensionistPrice); //For age 60 (including) and above
    }

    public void getPrice(priceType priceType)
    {
        allPrices.get(priceType);
    }

    public int getPassivePrice()
    {
        return passivePrice;
    }

    public void setPassivePrice(int passivePrice)
    {
        this.passivePrice = passivePrice;
    }

    public int getYouthPrice()
    {
        return youthPrice;
    }

    public void setYouthPrice(int youthPrice)
    {
        this.youthPrice = youthPrice;
    }

    public int getSeniorPrice()
    {
        return seniorPrice;
    }

    public void setSeniorPrice(int seniorPrice)
    {
        this.seniorPrice = seniorPrice;
    }

    public int getPensionistPrice()
    {
        return pensionistPrice;
    }

    public void setPensionistPrice(int pensionistPrice)
    {
        this.pensionistPrice = pensionistPrice;
    }

    public enum priceType
    {
        PASSIVE, YOUTH, SENIOR, PENSIONIST;
    }
}
