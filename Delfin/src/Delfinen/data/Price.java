package Delfinen.data;

import java.util.HashMap;
import java.util.Objects;

/**
 * Stores the prices for yearly membership.
 *
 * @author runin
 *
 */
public class Price
{
    //Passive membership:

    private int passivePrice = 500;
    //Active memberships:
    private int youthPrice = 1000;
    private int seniorPrice = 1600;
    private int pensionistPrice = (int) (1600 * 0.75); //25% discount for age 60+
    HashMap<priceType, Integer> allPrices;

    /**
     * Overview of the yearly charges for membership. Takes use of a HashMap and
     * set values.
     */
    public Price()
    {
        allPrices = new HashMap();
        allPrices.put(priceType.PASSIVE, passivePrice);
        allPrices.put(priceType.YOUTH, youthPrice); //Between the age of 0 and 17 (including)
        allPrices.put(priceType.SENIOR, seniorPrice); //Between the age of 18 and 59 (including)
        allPrices.put(priceType.PENSIONIST, pensionistPrice); //For age 60 (including) and above
    }

    /**
     * Returns user arrear cost for their type.
     *
     * @param priceType The priceType is based on a users age.
     * @see Delfinen.logic.Member (calculateArrear)
     * @return Returns arrear for given PriceType as an Integer
     */
    public int getPrice(priceType priceType)
    {
        return allPrices.get(priceType);
    }

//    public int getPassivePrice()
//    {
//        return passivePrice;
//    }
//
//    public void setPassivePrice(int passivePrice)
//    {
//        this.passivePrice = passivePrice;
//    }
//
//    public int getYouthPrice()
//    {
//        return youthPrice;
//    }
//
//    public void setYouthPrice(int youthPrice)
//    {
//        this.youthPrice = youthPrice;
//    }
//
//    public int getSeniorPrice()
//    {
//        return seniorPrice;
//    }
//
//    public void setSeniorPrice(int seniorPrice)
//    {
//        this.seniorPrice = seniorPrice;
//    }
//
//    public int getPensionistPrice()
//    {
//        return pensionistPrice;
//    }
//
//    public void setPensionistPrice(int pensionistPrice)
//    {
//        this.pensionistPrice = pensionistPrice;
//    }
//
//    public HashMap<priceType, Integer> getAllPrices()
//    {
//        return allPrices;
//    }
//
//    public void setAllPrices(HashMap<priceType, Integer> allPrices)
//    {
//        this.allPrices = allPrices;
//    }
    public enum priceType
    {
        PASSIVE, YOUTH, SENIOR, PENSIONIST;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Price other = (Price) obj;
        if (this.passivePrice != other.passivePrice)
        {
            return false;
        }
        if (this.youthPrice != other.youthPrice)
        {
            return false;
        }
        if (this.seniorPrice != other.seniorPrice)
        {
            return false;
        }
        if (this.pensionistPrice != other.pensionistPrice)
        {
            return false;
        }
        if (!Objects.equals(this.allPrices, other.allPrices))
        {
            return false;
        }
        return true;
    }
}
