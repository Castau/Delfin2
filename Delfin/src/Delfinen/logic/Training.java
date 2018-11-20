package Delfinen.logic;

import Delfinen.data.DisciplineType;
import Delfinen.data.Distance;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Camilla
 */
public class Training {

    private ArrayList<TrainingSession> trainingList;

    public Training() {
        trainingList = new ArrayList();
    }

    public void addTrainingSession(TrainingSession training) {
        trainingList.add(training);
    }

    public ArrayList<TrainingSession> getTrainingList() {
        return trainingList;
    }
//                                   Skal nok slettes
//    public TrainingSession getTraining(DisciplineType disciplineType, Distance distance) {
//        for (int i = 0; i < trainingList.size(); i++) {
//            if (disciplineType == (trainingList.get(i).getDiciplineType())) {
//                if (distance == (trainingList.get(i).getDistance())) {
//                    return trainingList.get(i);
//                }
//            }
//        }
//        return null;
//    }

    public TrainingSession getBestTraining(DisciplineType disciplineType, Distance distance) {
        ArrayList<TrainingSession> templist = new ArrayList();
        for (int i = 0; i < trainingList.size(); i++) {
            if (disciplineType == (trainingList.get(i).getDiciplineType())) {
                if (distance == (trainingList.get(i).getDistance())) {
                    templist.add(trainingList.get(i));
                }
            }
        }
        Collections.sort(templist);
        if (templist.size() > 0) {
            return templist.get(0);
        }
        return null;
    }

}

