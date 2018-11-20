
package Delfinen.logic;

import Delfinen.data.ActivityType;
import Delfinen.data.DisciplineType;
import Delfinen.data.Distance;
import Delfinen.data.MembershipType;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camilla
 */
public class TrainingTest {
    
    MemberCompetitive member;
    ArrayList<DisciplineType> disciplineList;
    
    TrainingSession t1;
    TrainingSession t2;
    TrainingSession t3;
    
    Date date;

    public TrainingTest() {
        
        date = new GregorianCalendar(2018, Calendar.NOVEMBER, 20).getTime();
        disciplineList = new ArrayList();
        disciplineList.add(DisciplineType.BUTTERFLY);
        
        member = new MemberCompetitive("Arne", Year.of(1999), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);
        
        t1 = new TrainingSession(date, DisciplineType.BUTTERFLY, Distance.METERS_100, 183);
        t2 = new TrainingSession(date, DisciplineType.BUTTERFLY, Distance.METERS_100, 120);
        t3 = new TrainingSession(date, DisciplineType.BUTTERFLY, Distance.METERS_100, 167);
    }
    
    @Test
    public void testGetBestTraining(){
        member.getTrainingSessions().addTrainingSession(t1);
        member.getTrainingSessions().addTrainingSession(t2);
        member.getTrainingSessions().addTrainingSession(t3);
        
        TrainingSession tExp = new TrainingSession(date, DisciplineType.BUTTERFLY, Distance.METERS_100, 120);
        TrainingSession result = member.getTrainingSessions().getBestTraining(DisciplineType.BUTTERFLY,Distance.METERS_100);
        
        assertEquals(tExp, result);
    }

    
    

}
