package Delfinen.data;

import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author runin
 */
public class Price
{
    //Yearly cost of membership
    //Passive membership:
    private int passivePrice = 500; 
    //Active memberships:
    private int youthPrice = 1000;
    private int seniorPrice = 1600;
    private int pensionistPrice = (int) (1600 * 0.75); //25% discount for age 60+
    HashMap<priceType, Integer> allPrices;

    public Price()
    {
        allPrices = new HashMap();
        allPrices.put(priceType.PASSIVE, passivePrice);
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.passivePrice;
        hash = 89 * hash + this.youthPrice;
        hash = 89 * hash + this.seniorPrice;
        hash = 89 * hash + this.pensionistPrice;
        hash = 89 * hash + Objects.hashCode(this.allPrices);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Price other = (Price) obj;
        if (this.passivePrice != other.passivePrice) {
            return false;
        }
        if (this.youthPrice != other.youthPrice) {
            return false;
        }
        if (this.seniorPrice != other.seniorPrice) {
            return false;
        }
        if (this.pensionistPrice != other.pensionistPrice) {
            return false;
        }
        if (!Objects.equals(this.allPrices, other.allPrices)) {
            return false;
        }
        return true;
    }
    
    
}
