
package Delfinen.logic;

import Delfinen.data.DisciplineType;
import Delfinen.data.Distance;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Camilla
 */
public class Competition //extends TrainingResults
{
    private ArrayList<CompetitionResult> competitionsList;

    public Competition() {
        competitionsList = new ArrayList();
    }
    
    public void addCompetitionResult(CompetitionResult result) {
        competitionsList.add(result);
    }
    public ArrayList<CompetitionResult> getCompetitionList() {
        return competitionsList;
    }
//                                      Skal nok slettes
//    public CompetitionResult getCompetitionRes(DisciplineType disciplineType, Distance distance) {
//        for (int i = 0; i < competitionsList.size(); i++) {
//            if (disciplineType == (competitionsList.get(i).getDiciplineType())) {
//                if (distance == (competitionsList.get(i).getDistance())) {
//                    return competitionsList.get(i);
//                }
//            }
//        }
//        return null;
//    }

    public CompetitionResult getBestCompetitionRes(DisciplineType disciplineType, Distance distance) {
        ArrayList<CompetitionResult> templist = new ArrayList();
        for (int i = 0; i < competitionsList.size(); i++) {
            if (disciplineType == (competitionsList.get(i).getDiciplineType())) {
                if (distance == (competitionsList.get(i).getDistance())) {
                    templist.add(competitionsList.get(i));
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
