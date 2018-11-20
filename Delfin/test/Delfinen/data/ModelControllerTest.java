
package Delfinen.data;

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
        
        m1.getTrainingSessions().addTrainingSession(t1);
        m2.getTrainingSessions().addTrainingSession(t2);
        m3.getTrainingSessions().addTrainingSession(t3);
        m4.getTrainingSessions().addTrainingSession(t4);
        m5.getTrainingSessions().addTrainingSession(t5);
        m6.getTrainingSessions().addTrainingSession(t6);
        
        members.add(m1);
        members.add(m2);
        members.add(m3);
        members.add(m4);
        members.add(m5);
        members.add(m6);
        
    }
    
    @Test
    public void TestGetTop5(){
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
