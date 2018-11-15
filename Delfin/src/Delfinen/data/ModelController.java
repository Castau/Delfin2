
package Delfinen.data;

import Delfinen.logic.Controller;
import Delfinen.logic.Member;
import Delfinen.logic.MemberActive;
import Delfinen.logic.MemberCompetitive;
import java.io.IOException;
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
        model.editMember(member);
        dataFile.writeToFile(model, filePath);
    }
    
    public void editMemberCompetitive(MemberCompetitive member) throws IOException{
        model.editMember(member);
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
    
    public ArrayList<Member> getMember(String memberName){
        return model.getMember(memberName);
    }
    
    public ArrayList<MemberActive> getMemberActive(String memberName){
        return model.getMemberActive(memberName);
    }
    
    public ArrayList<MemberCompetitive> getMemberCompetitive(String memberName){
      return model.getMemberCompetitive(memberName);
    }
    
    public void deleteMember (int memberID) throws IOException{
        model.deleteMember(memberID);
        dataFile.writeToFile(model, filePath);
    }
    
    public ArrayList<Member> getAllMembersInBasicMemberFormat(){
        ArrayList<Member> allMembers = model.getAllMembers();
        allMembers.addAll(model.getAllMembersActive());
        allMembers.addAll(model.getAllMembersCompetitive());
        return allMembers;
    }
    
    
    
}
