
package Delfinen.data;

import Delfinen.logic.CompetitionResult;
import Delfinen.logic.Controller;
import Delfinen.logic.Distance;
import Delfinen.logic.Member;
import Delfinen.logic.MemberActive;
import Delfinen.logic.MemberCompetitive;
import Delfinen.logic.TrainingSession;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * @author Camilla
 */
public class ModelController {

    private DataAccessorFile dataFile;
    private Model model;
    private Controller controller;
    private String filePath = "";
    
    public ModelController(Controller controller) {
        this.controller = controller;
        dataFile = new DataAccessorFile();
        try {
            model = dataFile.readFile(filePath);
        } catch (Exception ex) {
            System.out.println("File not found, creating new");
            model = new Model();
        }
    }
    
    public void addMember(Member member) throws IOException{
        model.addMember(member);
        dataFile.writeToFile(model, filePath);
    }
    
    public void addMember(MemberActive member) throws IOException{
        model.addMember(member);
        dataFile.writeToFile(model, filePath);
    }
    
    public void addMember(MemberCompetitive member) throws IOException{
        model.addMember(member);
        dataFile.writeToFile(model, filePath);
    }
    
    public void editMember(Member member) throws IOException{
        model.editMember(member);
        dataFile.writeToFile(model, filePath);
    }
    
    public void editMemberActive(MemberActive member) throws IOException{
        model.editMemberActive(member);
        dataFile.writeToFile(model, filePath);
    }
    
    public void editMemberCompetitive(MemberCompetitive member) throws IOException{
        model.editMemberCompetitive(member);
        dataFile.writeToFile(model, filePath);
    }
    
    public Member getMember(int memberID){
        return model.getMember(memberID);
    }
    
    public Member getMemberActive(int memberID){
        return model.getMemberActive(memberID);
    }
    
    public Member getMemberCompetitive(int memberID){
        return model.getMemberCompetitive(memberID);
    }
    
    public void deleteMember (int memberID) throws IOException{
        model.deleteMember(memberID);
        dataFile.writeToFile(model, filePath);
    }
    
    public ArrayList<MemberCompetitive> getAllCompetitiveMembers()
    {
        ArrayList<MemberCompetitive> allCompetitiveMembers = new ArrayList();
        allCompetitiveMembers.addAll(model.getAllMembersCompetitive());
        return allCompetitiveMembers;
    }
    
    public ArrayList<Member> getAllMembersInBasicMemberFormat(){
        ArrayList<Member> allMembers = new ArrayList();
        allMembers.addAll(model.getAllMembers());
        allMembers.addAll(model.getAllMembersActive());
        allMembers.addAll(model.getAllMembersCompetitive());
        return allMembers;
    }
    
    
    
    public void addTrainingSession(int memberID, LocalTime date, DisciplineType diciplineType, Distance distance, int timeInSec) throws IOException{
        TrainingSession training = new TrainingSession(date, diciplineType, distance, timeInSec);
        MemberCompetitive temp = model.getMemberCompetitive(memberID);
        temp.getTrainingSessions().addTrainingSession(training);
        model.editMemberCompetitive(temp);
        dataFile.writeToFile(model, filePath);
        
    }
    
    public void addCompetitionResult(int memberID, LocalTime date, DisciplineType diciplineType, 
                                     Distance distance, int timeInSec, int placement, String eventName) throws IOException{
        CompetitionResult result = new CompetitionResult(date, diciplineType, distance, timeInSec, placement, eventName);
        MemberCompetitive temp = model.getMemberCompetitive(memberID);
        temp.getCompetitionResults().addCompetitionResult(result);
        model.editMemberCompetitive(temp);
        dataFile.writeToFile(model, filePath);
        
    }
    
    
}
