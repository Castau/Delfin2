
package Delfinen.logic;


import Delfinen.data.DisciplineType;
import java.time.LocalTime;
import java.util.Objects;

/**
 * @author Camilla
 */
public class TrainingSession implements Comparable<TrainingSession>{

    private LocalTime date;
    private DisciplineType diciplineType;
    private Distance distance;
    private int timeInSec;  //evt localTime type?

    public TrainingSession(LocalTime date, DisciplineType diciplineType, Distance distance, int timeInSec) {
        this.date = date;
        this.diciplineType = diciplineType;
        this.distance = distance;
        this.timeInSec = timeInSec;
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