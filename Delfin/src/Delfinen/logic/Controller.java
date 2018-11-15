package Delfinen.logic;

import Delfinen.data.ActivityType;
import Delfinen.data.DisciplineType;
import Delfinen.data.MembershipType;
import Delfinen.data.ModelController;
import UI.UI;
import java.time.Year;
import java.util.ArrayList;
import java.io.IOException;

/**
 *
 * @author runin, Asger, Camilla
 */
public class Controller {

    private UI ui;
    private ModelController modelController;

    public Controller() {
        modelController = new ModelController(this);
        ui = new UI();
    }

    public ModelController getModelController() {
        return modelController;
    }

    //Manager
    public void createMember(String name, Year birthyear, MembershipType membershipType)
    {
        System.out.println("Contact?");
        Member m = new Member(name, birthyear, membershipType);
        System.out.println(m);
        try
        {
            modelController.addMember(m);
        }
        catch (IOException i)
        {
            System.out.println("Unable to write to file using the given file path");
        }
    }

    public void createMemberActive(String name, Year birthyear, MembershipType membershipType, ActivityType activityType)
    {
        MemberActive m = new MemberActive(name, birthyear, membershipType, activityType);
        System.out.println(m);
        try
        {
            modelController.addMember(m);
        }
        catch (IOException i)
        {
            System.out.println("Unable to write to file using the given file path");
        }
    }

    public void createMemberCompetitive(String name, Year birthyear, MembershipType membershipType, ActivityType activityType, ArrayList<DisciplineType> disciplineList)
    {
        MemberCompetitive m = new MemberCompetitive(name, birthyear, membershipType, activityType, disciplineList);
        System.out.println(m);
        try
        {
            modelController.addMember(m);
        }
        catch (IOException i)
        {
            System.out.println("Unable to write to file using the given file path");
        }
    }

    public void editMember() {
//        modelController.editMember(member);
//        modelController.editMemberActive(member);
//        modelController.editMemberCompetitive(member);
    }

    public void getMember(String Username) {
//        modelController.getMember(Username);
//        modelController.getMemberActive(Username);
//        modelController.getMemberCompetitive(Username);

    }

    public Member getMember(int id) {
        if (modelController.getMember(id) != null)
        {
            return modelController.getMember(id);
        }
        if (modelController.getMemberActive(id) != null)
        {
            return modelController.getMemberActive(id);
        }
        return modelController.getMemberCompetitive(id);
    }

    public void deleteMember(int MemberID) {
//        modelController.deleteMember(MemberID);

    }


    public ArrayList<Member> getAllMembers() {
       return modelController.getAllMembersInBasicMemberFormat();

    }

    //Cashier
    public void registerPayment() {
        //Tied to member
    }

    public void getArrears() {

    }

    //Trainer
    public void getTopFive() {

    }

    public void createCompetition() {

    }

    public void editCompetition() {

    }

    public void deleteCompetition() {

    }

}
