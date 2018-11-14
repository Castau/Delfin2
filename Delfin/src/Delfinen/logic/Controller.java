package Delfinen.logic;

import Delfinen.data.ActivityType;
import static Delfinen.data.ActivityType.COMPETITIVE;
import Delfinen.data.DisciplineType;
import Delfinen.data.MembershipType;
import static Delfinen.data.MembershipType.ACTIVE;
import static Delfinen.data.MembershipType.PASSIVE;
import Delfinen.data.ModelController;
import UI.UI;
import java.time.Year;
import java.util.ArrayList;
import static Delfinen.data.ActivityType.BASIC;
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
    }

    public void getMember(String Username) {

    }

    public void getMember(int id) {
//        modelController.getMember(0);
//        modelController.getMemberActive(0);
//        modelController.getMemberCompetitive(0);
    }

    public void deleteMember() {

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
