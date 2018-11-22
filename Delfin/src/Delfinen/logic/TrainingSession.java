
package Delfinen.logic;


import Delfinen.data.Distance;
import Delfinen.data.DisciplineType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;


/**
 * The TrainingSession class keeps track of the values of a specific Training Session. 
 * 
 * @author Camilla
 */
public class TrainingSession implements Comparable<TrainingSession>{

    private Date date;
    private DisciplineType diciplineType;
    private Distance distance;
    private int timeInSec;  

    /**
     * TrainingSession holds info of a specific TrainingSession and belongs
     * to an ArrayList of TrainingSession in the Training object. 
     * @param date, java.util.Date object of TrainingSession
     * @param diciplineType, enum
     * @param distance, enum
     * @param timeInSec, int time of TrainingSession in seconds
     */
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
        return "TrainingSession: " + "Date: " + dateString + ", DiciplineType: " + diciplineType + ", Distance: " + distance + ", Time: " + timeInSec;
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
