
package Delfinen.logic;

import java.util.ArrayList;

/**
 * @author Camilla
 */
public class Competition //extends TrainingResults
{
    private ArrayList<CompetitionResult> competitionsList;

    public Competition(ArrayList<CompetitionResult> competitionsList) {
        this.competitionsList = competitionsList;
    }
    
    public void addCompetitionResult(CompetitionResult result) {
        competitionsList.add(result);
    }
    
    
}



//Runi:
    //Competition: ForEachMember: CompetitionName (Stævne),  Result (placement), Time. (Date is not mentioned. Include?)
    
    //skal gemmes som object på MemberCompetitive
    //har liste af CompettitionResult objekter