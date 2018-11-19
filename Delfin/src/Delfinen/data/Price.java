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
    HashMap<priceType, Integer> allPrices;

    public Price()
    {
        allPrices = new HashMap();

        //Passive membership:
        allPrices.put(priceType.PASSIVE, passivePrice);
        //Active memberships:
        allPrices.put(priceType.YOUTH, youthPrice); //Between the age of 0 and 17 (including)
        allPrices.put(priceType.SENIOR, seniorPrice); //Between the age of 18 and 59 (including)
        allPrices.put(priceType.PENSIONIST, pensionistPrice); //For age 60 (including) and above
    }

    public int getPrice(priceType priceType)
    {
        return allPrices.get(priceType);
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

    public HashMap<priceType, Integer> getAllPrices() {
        return allPrices;
    }

    public void setAllPrices(HashMap<priceType, Integer> allPrices) {
        this.allPrices = allPrices;
    }
    
    public enum priceType
    {
        PASSIVE, YOUTH, SENIOR, PENSIONIST;
    }
}
