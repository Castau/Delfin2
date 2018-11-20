
package Delfinen.logic;

import Delfinen.data.DisciplineType;
import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;

/**
 * @author Camilla
 */
public class CompetitionResult implements Comparable<CompetitionResult>{
    
    private Date date;
    private DisciplineType diciplineType;
    private Distance distance;
    private int timeInSec;  //evt localTime type?
    private int placement;
    private String eventName;

    public CompetitionResult(Date date, DisciplineType diciplineType, Distance distance, int timeInSec, int placement, String eventName) {
        this.date = date;
        this.diciplineType = diciplineType;
        this.distance = distance;
        this.timeInSec = timeInSec;
        this.placement = placement;
        this.eventName = eventName;
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
        final CompetitionResult other = (CompetitionResult) obj;
        if (this.timeInSec != other.timeInSec) {
            return false;
        }
        if (this.placement != other.placement) {
            return false;
        }
        if (!Objects.equals(this.eventName, other.eventName)) {
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
    public int compareTo(CompetitionResult other) {
        return Integer.compare(timeInSec, other.timeInSec);
    }
    
    
    
    
}
