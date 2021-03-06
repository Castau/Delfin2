package Delfinen.logic;

import Delfinen.data.Distance;
import Delfinen.data.DisciplineType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * CompetitionResult holds info of a specific CompetitionResult and belongs to
 * an ArrayList of CompetitionResults in the Competition object.
 *
 * @author Camilla
 */
public class CompetitionResult implements Comparable<CompetitionResult>
{

    private Date date;
    private DisciplineType diciplineType;
    private Distance distance;
    private int timeInSec;
    private int placement;
    private String eventName;

    /**
     * CompetitionResult holds info of a specific CompetitionResult and belongs
     * to an ArrayList of CompetitionResults in the Competition object.
     *
     * @param date, java.util.Date object of CompetitionResults
     * @param diciplineType, enum
     * @param distance, enum
     * @param timeInSec, int time of CompetitionResults in seconds
     * @param placement, int representing placememnt
     * @param eventName, String name og event
     */
    public CompetitionResult(Date date, DisciplineType diciplineType, Distance distance, int timeInSec, int placement, String eventName)
    {
        this.date = date;
        this.diciplineType = diciplineType;
        this.distance = distance;
        this.timeInSec = timeInSec;
        this.placement = placement;
        this.eventName = eventName;
    }

    @Override
    public String toString()
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = format.format(date);
        return "Competition: " + eventName + ", Placement: " + placement + ", Date: " + dateString + ", DiciplineType: " + diciplineType + ", Distance: " + distance + ", Time: " + timeInSec;
    }

    public Date getDate()
    {
        return date;
    }

    public DisciplineType getDiciplineType()
    {
        return diciplineType;
    }

    public Distance getDistance()
    {
        return distance;
    }

    public int getTimeInSec()
    {
        return timeInSec;
    }

    public int getPlacement()
    {
        return placement;
    }

    public String getEventName()
    {
        return eventName;
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
        final CompetitionResult other = (CompetitionResult) obj;
        if (this.timeInSec != other.timeInSec)
        {
            return false;
        }
        if (this.placement != other.placement)
        {
            return false;
        }
        if (!Objects.equals(this.eventName, other.eventName))
        {
            return false;
        }
        if (!Objects.equals(this.date, other.date))
        {
            return false;
        }
        if (this.diciplineType != other.diciplineType)
        {
            return false;
        }
        if (this.distance != other.distance)
        {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(CompetitionResult other)
    {
        return Integer.compare(timeInSec, other.timeInSec);
    }

}
