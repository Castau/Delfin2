
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
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camilla
 */
public class CompetitionTest {
    
    MemberCompetitive member;
    ArrayList<DisciplineType> disciplineList;
    
    CompetitionResult c1;
    CompetitionResult c2;
    CompetitionResult c3;
    
    Date date;
    
    public CompetitionTest() {
        
        date = new GregorianCalendar(2018, Calendar.NOVEMBER, 20).getTime();
        disciplineList = new ArrayList();
        disciplineList.add(DisciplineType.BUTTERFLY);
        
        member = new MemberCompetitive("Arne", Year.of(1999), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);
        
        c1 = new CompetitionResult(date, DisciplineType.BUTTERFLY, Distance.METERS_100, 183, 17, "Lemvig Stævne");
        c2 = new CompetitionResult(date, DisciplineType.BUTTERFLY, Distance.METERS_100, 120, 6, "Skjern Stævne");
        c3 = new CompetitionResult(date, DisciplineType.BUTTERFLY, Distance.METERS_100, 167, 11, "Borup Stævne");
    }
    
    @Test
    public void testGetBestCompetition(){
        member.getCompetitionResults().addCompetitionResult(c1);
        member.getCompetitionResults().addCompetitionResult(c2);
        member.getCompetitionResults().addCompetitionResult(c3);
        
        CompetitionResult tExp = new CompetitionResult(date, DisciplineType.BUTTERFLY, Distance.METERS_100, 120, 6, "Skjern Stævne");
        CompetitionResult result = member.getCompetitionResults().getBestCompetitionRes(DisciplineType.BUTTERFLY, Distance.METERS_100);
        
        assertEquals(tExp, result);
    }

}
