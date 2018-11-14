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

/**
 *
 * @author runin, Asger, Camilla
 */
public class Controller
{

    private UI ui;
    private ModelController modelController;

    public Controller()
    {
        modelController = new ModelController(this);
        ui = new UI();
    }
    
    public ModelController getModelController(){
        return modelController;
    }
    
    //Manager
    
    public void createMember(String name, Year birthyear, MembershipType membershipType)
    {
        System.out.println("Contact?");
        Member m = new Member(name, birthyear, membershipType);
        System.out.println(m);
    }
    
    public void createMemberActive(String name, Year birthyear, MembershipType membershipType, ActivityType activityType)
    {
        MemberActive m = new MemberActive(name, birthyear, membershipType, activityType);
        System.out.println(m);
    }
    
    public void createMemberCompetitive(String name, Year birthyear, MembershipType membershipType, ActivityType activityType, ArrayList<DisciplineType> disciplineList)
    {
        MemberCompetitive m = new MemberCompetitive(name, birthyear, membershipType, activityType, disciplineList);
        System.out.println(m);
    }
    
    public void editMember()
    {
        
    }

    public void getMember(String Username)
    {
        
    }
    
    public void getMember(int id)
    {
        
    }
    
    public void deleteMember()
    {
        
    }
    
    public void getAllMembers()
    {
        
        
    }
    
    //Cashier
    
    public void registerPayment()
    {
        
    }
    
    public void getArrears()
    {
        
    }
        
    
    //Trainer
    
    public void getTopFive()
    {
        
    }
    
    public void createCompetition()
    {
        
    }
    
    public void editCompetition()
    {
        
    }
    
    public void deleteCompetition()
    {
        
    }
    
}
