
package Delfinen.data;

import Delfinen.logic.CompetitionResult;
import Delfinen.logic.Controller;
import Delfinen.logic.MemberCompetitive;
import Delfinen.logic.TrainingSession;
import java.io.IOException;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Camilla
 */
public class ModelControllerTest {
    
    Controller controller;
    ModelController modelController;
    Date date;
    ArrayList<DisciplineType> disciplineList;
    ArrayList<MemberCompetitive> members;
    
    MemberCompetitive m1;
    MemberCompetitive m2;
    MemberCompetitive m3;
    MemberCompetitive m4;
    MemberCompetitive m5;
    MemberCompetitive m6;
    
    TrainingSession t1;
    TrainingSession t2;
    TrainingSession t3;
    TrainingSession t4;
    TrainingSession t5;
    TrainingSession t6;
    
    CompetitionResult c1;
    CompetitionResult c2;
    CompetitionResult c3;
    CompetitionResult c4;
    CompetitionResult c5;
    CompetitionResult c6;
    
    
    public ModelControllerTest() throws IOException {
        controller = new Controller();
        modelController = new ModelController(controller);
        
        date = new GregorianCalendar(2018, Calendar.NOVEMBER, 20).getTime();
        disciplineList = new ArrayList();
        disciplineList.add(DisciplineType.BUTTERFLY);
        
        members = new ArrayList();
        
        m1 = new MemberCompetitive("Arne", Year.of(1987), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);
        m2 = new MemberCompetitive("Hans", Year.of(1998), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);
        m3 = new MemberCompetitive("Otto", Year.of(1929), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);
        m4 = new MemberCompetitive("Igor", Year.of(1968), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);
        m5 = new MemberCompetitive("Anna", Year.of(2005), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);
        m6 = new MemberCompetitive("Else", Year.of(1679), MembershipType.ACTIVE, ActivityType.COMPETITIVE, disciplineList);
        
        t1 = new TrainingSession(date, DisciplineType.BUTTERFLY, Distance.METERS_100, 181); //5
        t2 = new TrainingSession(date, DisciplineType.BUTTERFLY, Distance.METERS_100, 120); //1
        t3 = new TrainingSession(date, DisciplineType.BUTTERFLY, Distance.METERS_100, 165); //3
        t4 = new TrainingSession(date, DisciplineType.BUTTERFLY, Distance.METERS_100, 183); //6 - ikke med
        t5 = new TrainingSession(date, DisciplineType.BUTTERFLY, Distance.METERS_100, 121); //2
        t6 = new TrainingSession(date, DisciplineType.BUTTERFLY, Distance.METERS_100, 167); //4
        
        c1 = new CompetitionResult(date, DisciplineType.BUTTERFLY, Distance.METERS_100, 181, 43, "Skjærn Stævne"); //5
        c2 = new CompetitionResult(date, DisciplineType.BUTTERFLY, Distance.METERS_100, 120, 5, "Borup Stævne"); //1
        c3 = new CompetitionResult(date, DisciplineType.BUTTERFLY, Distance.METERS_100, 165, 19, "Aars Stævne"); //3
        c4 = new CompetitionResult(date, DisciplineType.BUTTERFLY, Distance.METERS_100, 183, 51, "Københavns Stævne"); //6 - ikke med
        c5 = new CompetitionResult(date, DisciplineType.BUTTERFLY, Distance.METERS_100, 121, 8, "Lemvig Stævne"); //2
        c6 = new CompetitionResult(date, DisciplineType.BUTTERFLY, Distance.METERS_100, 167, 26, "Odden Stævne"); //4
        
        m1.getTrainingSessions().addTrainingSession(t1);
        m2.getTrainingSessions().addTrainingSession(t2);
        m3.getTrainingSessions().addTrainingSession(t3);
        m4.getTrainingSessions().addTrainingSession(t4);
        m5.getTrainingSessions().addTrainingSession(t5);
        m6.getTrainingSessions().addTrainingSession(t6);
        
        m1.getCompetitionResults().addCompetitionResult(c1);
        m2.getCompetitionResults().addCompetitionResult(c2);
        m3.getCompetitionResults().addCompetitionResult(c3);
        m4.getCompetitionResults().addCompetitionResult(c4);
        m5.getCompetitionResults().addCompetitionResult(c5);
        m6.getCompetitionResults().addCompetitionResult(c6);
        
        members.add(m1);
        members.add(m2);
        members.add(m3);
        members.add(m4);
        members.add(m5);
        members.add(m6);
        
    }
    
    @Test
    public void TestGetTop5Training(){
        ArrayList<MemberCompetitive> exp = new ArrayList();
        exp.add(m2);
        exp.add(m5);
        exp.add(m3);
        exp.add(m6);
        exp.add(m1);

        ArrayList<MemberCompetitive> result = modelController.getTop5Training(DisciplineType.BUTTERFLY, Distance.METERS_100, members);
        
        assertEquals(exp, result);  
    }
    
    @Test
    public void TestGetTop5Competition(){
        ArrayList<MemberCompetitive> exp = new ArrayList();
        exp.add(m2);
        exp.add(m5);
        exp.add(m3);
        exp.add(m6);
        exp.add(m1);

        ArrayList<MemberCompetitive> result = modelController.getTop5Training(DisciplineType.BUTTERFLY, Distance.METERS_100, members);
        
        assertEquals(exp, result);  
    }

}
