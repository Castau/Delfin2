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
    public void createMember(String name, Year birthyear, MembershipType membershipType) throws IOException {
        System.out.println("Contact?");
        Member m = new Member(name, birthyear, membershipType);
        System.out.println(m);
        modelController.addMember(m);
    }

    public void createMemberActive(String name, Year birthyear, MembershipType membershipType, ActivityType activityType) throws IOException {
        MemberActive m = new MemberActive(name, birthyear, membershipType, activityType);
        System.out.println(m);
        modelController.addMember(m);
    }

    public void createMemberCompetitive(String name, Year birthyear, MembershipType membershipType, ActivityType activityType, ArrayList<DisciplineType> disciplineList) throws IOException {
        MemberCompetitive m = new MemberCompetitive(name, birthyear, membershipType, activityType, disciplineList);
        System.out.println(m);
        modelController.addMember(m);
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

    public void getMember(int id) {
//        modelController.getMember(0);
//        modelController.getMemberActive(0);
//        modelController.getMemberCompetitive(0);
    }

    public void deleteMember(int MemberID) {
//        modelController.deleteMember(MemberID);

    }

    public void getAllMembers() {
//        modelController.getAllMembersInBasicMemberFormat();
    }

    //Cashier
    public void registerPayment() {

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
