package Delfinen.data;

import Delfinen.logic.CompetitionResult;
import Delfinen.logic.Member;
import Delfinen.logic.MemberActive;
import Delfinen.logic.MemberCompetitive;
import Delfinen.logic.TrainingSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

/**
 * @author Camilla
 */

public class ModelController {

    private DataAccessorFile dataFile;
    private Model model;
    private String filePath = "";

    /**
     * The ModelController creates a new instance of the DataFileAccessor, sets 
     * Model object to the content of the file or creates a new empty file, if no file 
     * exists. 
     */
    public ModelController() {
        dataFile = new DataAccessorFile();
        try {
            model = dataFile.readFile(filePath);
            if(model == null){
            System.out.println("model is null, file not found, creating new");
            model = new Model();
            dataFile.writeToFile(model, filePath);
        }
        } catch (Exception ex) {
            System.out.println("Exception caught, file not found, creating new");
            model = new Model();
            dataFile.writeToFile(model, filePath);
        }
    }

    /**
     * This method adds a Member object to the Model object
     * @param member, Member object
     * @throws IOException if an error in the filewriting occurs.
     */
    public void addMember(Member member) throws IOException {
        model.addMember(member);
        dataFile.writeToFile(model, filePath);
    }

    /**
     * This method adds a MemberActive object to the Model object
     * @param member, MemberActive object
     * @throws IOException if an error in the filewriting occurs.
     */
    public void addMember(MemberActive member) throws IOException {
        model.addMember(member);
        dataFile.writeToFile(model, filePath);
    }

    /**
      *This method adds a MemberCompetitive object to the Model object
     * @param member, MemberCompetitive object
     * @throws IOException if an error in the filewriting occurs.
     */
    public void addMember(MemberCompetitive member) throws IOException {
        model.addMember(member);
        dataFile.writeToFile(model, filePath);
    }

    /**
     * This method edits a Member object in the Model object
     * @param member, Member object
     * @throws IOException if an error in the filewriting occurs.
     */
    public void editMember(Member member) throws IOException {
        model.editMember(member);
        dataFile.writeToFile(model, filePath);
    }

    /**
     * This method edits a MemberActive object in the Model object
     * @param member, MemberActive object
     * @throws IOException if an error in the filewriting occurs.
     */
    public void editMemberActive(MemberActive member) throws IOException {
        model.editMemberActive(member);
        dataFile.writeToFile(model, filePath);
    }

    /**
     * This method edits a MemberCompetitive object in the Model object
     * @param member, MemberCompetitive object
     * @throws IOException if an error in the filewriting occurs.
     */
    public void editMemberCompetitive(MemberCompetitive member) throws IOException {
        model.editMemberCompetitive(member);
        dataFile.writeToFile(model, filePath);
    }

    /**
     * This method returns a Member object, based on the int ID
     * @param memberID int unique to a specific Member object
     * @return Member
     */
    public Member getMember(int memberID) {
        return model.getMember(memberID);
    }

    /**
     * This method returns a MemberActive object, based on the int ID
     * @param memberID int unique to a specific Member object
     * @return Member
     */
    public Member getMemberActive(int memberID) {
        return model.getMemberActive(memberID);
    }

    /**
     * This method returns a MemberCompetitive object, based on the int ID
     * @param memberID int unique to a specific Member object
     * @return Member
     */
    public Member getMemberCompetitive(int memberID) {
        return model.getMemberCompetitive(memberID);
    }

    /**
     * This method deletes a Member (or child of Member) object, based on the int ID
     * @param memberID int unique to a specific Member object
     * @throws IOException if an error in the filewriting occurs.
     */
    public void deleteMember(int memberID) throws IOException {
        model.deleteMember(memberID);
        dataFile.writeToFile(model, filePath);
    }

    /**
     * This method returns an ArrayList containing all MemberCompetitive objects 
     * that are saved in the Model object
     * @return ArrayList allCompetitiveMembers
     */
    public ArrayList<MemberCompetitive> getAllCompetitiveMembers() {
        ArrayList<MemberCompetitive> allCompetitiveMembers = new ArrayList();
        allCompetitiveMembers.addAll(model.getAllMembersCompetitive());
        return allCompetitiveMembers;
    }

    /**
     * This method returns an ArrayList containing all Member (and children 
     * of Member) objects that are saved in the Model object
     * @return ArrayList allMembers
     */
    public ArrayList<Member> getAllMembersInBasicMemberFormat() {
        ArrayList<Member> allMembers = new ArrayList();
        allMembers.addAll(model.getAllMembers());
        allMembers.addAll(model.getAllMembersActive());
        allMembers.addAll(model.getAllMembersCompetitive());
        return allMembers;
    }

    /**
     * This method adds a TrainingSession object in the ArrayList contained in 
     * the Training object belonging to a Member object (specified by memberID)
     * @param memberID, int unique to a specific Member object
     * @param date, Date object
     * @param diciplineType, Enum
     * @param distance, Enum
     * @param timeInSec, int representing time in seconds
     * @throws IOException if an error in the filewriting occurs.
     */
    public void addTrainingSession(int memberID, Date date, DisciplineType diciplineType, Distance distance, int timeInSec) throws IOException {
        TrainingSession training = new TrainingSession(date, diciplineType, distance, timeInSec);
        MemberCompetitive temp = model.getMemberCompetitive(memberID);
        temp.getTrainingSessions().addTrainingSession(training);
        model.editMemberCompetitive(temp);
        dataFile.writeToFile(model, filePath);

    }
    
    /**
     * This method adds a CompetitionResult object in the ArrayList contained in 
//   * the Competition object belonging to a Member object (specified by memberID)
     * @param memberID int unique to a specific Member object
     * @param date, Date object
     * @param diciplineType, Enum
     * @param distance, Enum
     * @param timeInSec, int representing time in seconds
     * @param placement, int representing placement 
     * @param eventName, name of event
     * @throws IOException if an error in the filewriting occurs.
     */
    public void addCompetitionResult(int memberID, Date date, DisciplineType diciplineType,
                                     Distance distance, int timeInSec, int placement, String eventName) throws IOException {
        CompetitionResult result = new CompetitionResult(date, diciplineType, distance, timeInSec, placement, eventName);
        MemberCompetitive temp = model.getMemberCompetitive(memberID);
        temp.getCompetitionResults().addCompetitionResult(result);
        model.editMemberCompetitive(temp);
        dataFile.writeToFile(model, filePath);

    }

    /**
     * This method looks at each MemberCompetitve object saved in the Model object
     * and calls the getBestTraining(disciplineType, distance) for each MemberCompetitve 
     * object, returning the TrainingSession, specified by the given enums, whit the 
     * lowest timeInSec.
     * MemberCompetitve objects who return that TrainingSession object are added to
     * a temporary ArrayList, sortList.
     * Using the java.util.Comparator compare method, the sortList is sorted by each
     * MemberCompetitive objects lowest timeInSec. Then up to 5 MemberCompetitive 
     * objects are added to the final ArrayList in the sorted order
     * @param disciplineType, Enum
     * @param distance, Enum
     * @param members, ArrayList of all MemberCompetitive objects saved in the Model object
     * @return top5, sorted ArrayList containing up to 5 MemberCompetitive objects
     */
    public ArrayList<MemberCompetitive> getTop5Training(DisciplineType disciplineType, Distance distance, ArrayList<MemberCompetitive> members) {
        ArrayList<MemberCompetitive> sortList = new ArrayList();
        ArrayList<MemberCompetitive> temp = members;
        for (int i = 0; i < temp.size(); i++) {
            if((temp.get(i).getTrainingSessions().getBestTraining(disciplineType, distance)) != null){
                sortList.add(temp.get(i));
            }
        }
        sortList.sort(new Comparator<MemberCompetitive>() {
            @Override
            public int compare(MemberCompetitive o1, MemberCompetitive o2) {
                int o1Time = o1.getTrainingSessions().getBestTraining(disciplineType, distance).getTimeInSec();
                int o2Time = o2.getTrainingSessions().getBestTraining(disciplineType, distance).getTimeInSec();
                
                if(o1Time > o2Time){
                    return 1;
                } else if (o1Time < o2Time){
                    return -1;
                } else{
                    return 0;
                }                        
            }
        });
        
        ArrayList<MemberCompetitive> top5 = new ArrayList();
        for(int i = 0; i < sortList.size(); i++){
            if(i >= 5){
                break;
            }
            top5.add(sortList.get(i));
        }
        
       return top5;
    }
    
    /**
     * This method looks at each MemberCompetitve object saved in the Model object
     * and calls the getBestCompetitionRes(disciplineType, distance) for each MemberCompetitve 
     * object, returning the CompetitionResult, specified by the given enums, whit the 
     * lowest timeInSec.
     * MemberCompetitve objects who return that CompetitionResult object are added to
     * a temporary ArrayList, sortList.
     * Using the java.util.Comparator compare method, the sortList is sorted by each
     * MemberCompetitive objects lowest timeInSec. Then up to 5 MemberCompetitive 
     * objects are added to the final ArrayList in the sorted order
     * @param disciplineType, Enum
     * @param distance, Enum
     * @param members, ArrayList of all MemberCompetitive objects saved in the Model object
     * @return top5, sorted ArrayList containing up to 5 MemberCompetitive objects
     */
    public ArrayList<MemberCompetitive> getTop5Competition(DisciplineType disciplineType, Distance distance, ArrayList<MemberCompetitive> members) {
        ArrayList<MemberCompetitive> sortList = new ArrayList();
        ArrayList<MemberCompetitive> temp = members;
        for (int i = 0; i < temp.size(); i++) {
            if((temp.get(i).getCompetitionResults().getBestCompetitionRes(disciplineType, distance)) != null){
                sortList.add(temp.get(i));
            }
        }
        sortList.sort(new Comparator<MemberCompetitive>() {
            @Override
            public int compare(MemberCompetitive o1, MemberCompetitive o2) {
                int o1Time = o1.getCompetitionResults().getBestCompetitionRes(disciplineType, distance).getTimeInSec();
                int o2Time = o2.getCompetitionResults().getBestCompetitionRes(disciplineType, distance).getTimeInSec();
                
                if(o1Time > o2Time){
                    return 1;
                } else if (o1Time < o2Time){
                    return -1;
                } else{
                    return 0;
                }                        
            }
        });
        
        ArrayList<MemberCompetitive> top5 = new ArrayList();
        for(int i = 0; i < sortList.size(); i++){ 
            if(i >= 5)
            {
                break;
            }
            top5.add(sortList.get(i));
        }
        
        return top5;
    }

}
