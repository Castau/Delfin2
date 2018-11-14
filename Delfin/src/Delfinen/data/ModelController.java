
package Delfinen.data;

import Delfinen.logic.Controller;
import Delfinen.logic.Member;
import Delfinen.logic.MemberActive;
import Delfinen.logic.MemberCompetitive;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Camilla
 */
public class ModelController {

    private DataAccessorFile dataFile;
    private Model model;
    private Controller controller;
    private String filePath = "C:\\Users\\Shevitar\\Documents\\CBS Afleveringer\\Delfinen\\FileDestination.txt";
    
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
    
    public void editMember(Member member){
        
    }
    
    //returnerer liste af alle members uanset type, som almindeligt basis medlem
    //til brug ved f.eks. kontingentberegning
    public ArrayList<Member> getAllMembersInBasicMemberFormat(){
        ArrayList<Member> allMembers = model.getAllMembers();
        allMembers.addAll(model.getAllMembersActive());
        allMembers.addAll(model.getAllMembersCompetitive());
        return allMembers;
    }
    
    
    
}
