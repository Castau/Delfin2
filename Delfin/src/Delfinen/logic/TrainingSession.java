
package Delfinen.logic;


import Delfinen.data.Distance;
import Delfinen.data.DisciplineType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Camilla
 */
public class TrainingSession implements Comparable<TrainingSession>{

    private Date date;
    private DisciplineType diciplineType;
    private Distance distance;
    private int timeInSec;  //evt localTime type?

    public TrainingSession(Date date, DisciplineType diciplineType, Distance distance, int timeInSec) {
        this.date = date;
        this.diciplineType = diciplineType;
        this.distance = distance;
        this.timeInSec = timeInSec;
    }

    @Override
    public String toString()
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = format.format(date);
        try
        {
            return "TrainingSession: " + "Date: " + format.parse(dateString) + ", DiciplineType: " + diciplineType + ", Distance: " + distance + ", Time: " + timeInSec;
        } catch (ParseException ex)
        {
            System.out.println("Date parsing failed");
        }
        return ".toString() method failed";
    }

    public Date getDate() {
        return date;
    }

    public DisciplineType getDiciplineType() {
        return diciplineType;
    }

    public Distance getDistance() {
        return distance;
    }

    public int getTimeInSec() {
        return timeInSec;
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
        final TrainingSession other = (TrainingSession) obj;
        if (this.timeInSec != other.timeInSec) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (this.diciplineType != other.diciplineType) {
            return false;
        }
        if (this.distance != other.distance) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(TrainingSession other) {
       return Integer.compare(timeInSec, other.timeInSec);
    }

}
