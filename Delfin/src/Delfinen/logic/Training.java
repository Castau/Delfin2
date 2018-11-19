
package Delfinen.logic;

import java.util.ArrayList;

/**
 * @author Camilla
 */
public class Training {
    private ArrayList<TrainingSession> trainingList;

    public Training(ArrayList<TrainingSession> trainingList) {
        this.trainingList = trainingList;
    }
    
    public void addTrainingSession(TrainingSession training) {
        trainingList.add(training);
    }

    
    
}


//private int time -- in seconds? seconds + miliseconds? how precise? Are these competitors n00bs?
    //private int placement -- should this be int? 1st, 2nd, 3rd - do we want detailed knowledge, such as 4th, 5th, 6th?
    //private Date date
    
    //Runi: tag stilling til sætningen "Konkurrencesvømmerne har tilknyttet en træner." 
    //Training: ForEachDiscipline:  Result (time) & date - 
    
    
    //skal kende MemberCompetitive
    //skal kende DisciplineType
    //skal indeholde liste over trainingSessions objekter
    //skal gemmes som object på Membercompetitive