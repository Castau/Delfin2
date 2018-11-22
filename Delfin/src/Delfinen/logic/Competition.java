package Delfinen.logic;

import Delfinen.data.DisciplineType;
import Delfinen.data.Distance;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Camilla
 */
public class Competition 
{
    private ArrayList<CompetitionResult> competitionsList;

    /**
     * The Competition object creates an ArrayList the holds the CompetitionResults
     * of a specific MemberCompetitive object.
     */
    public Competition() {
        competitionsList = new ArrayList();
    }
    
    /**
     * Adds the parameter to the ArrayList of CompetitionResults competitionsList
     * @param result Competition Result in question.
     */
    public void addCompetitionResult(CompetitionResult result) {
        competitionsList.add(result);
    }
    
    /**
     * Returns the ArrayList of the CompetitionResults competitionsList
     * @return ArrayList competitionsList
     */
    public ArrayList<CompetitionResult> getCompetitionList() {
        return competitionsList;
    }

    /**
     * This method iterates through the ArrayList competitionsList an adds the 
     * CompetitionResults containing the given parameters to a temporary ArrayList.
     * This temporary ArrayList is then sorted based on the int timeInSec (see overridden
     * compareTo method in CompetitionResult). The CompetitionResult with the lowest 
     * timeInSec are now in index 0, which is then returned
     * @param disciplineType Desired DisciplineType of result
     * @param distance Desired Distance Type of result
     * @return CompetitionResult
     */
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
