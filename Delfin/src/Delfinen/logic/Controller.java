package Delfinen.logic;

import Delfinen.data.ActivityType;
import Delfinen.data.DisciplineType;
import Delfinen.data.MembershipType;
import Delfinen.data.ModelController;
import java.time.Year;
import java.util.ArrayList;
import java.io.IOException;

/**
 *
 * @author Rúni, Asger, Camilla
 */
public class Controller
{


    private ModelController modelController;
    private Subscription subscription;

    public Controller()
    {
        modelController = new ModelController(this);
        subscription = new Subscription(this);

    }

    public ModelController getModelController()
    {
        return modelController;
    }

    //Manager
    public void createMember(String name, Year birthyear, MembershipType membershipType)
    {
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
        } catch (IOException i)
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
        } catch (IOException i)
        {
            System.out.println("Unable to write to file using the given file path");
        }
    }

    public Member createTempMember(int id, String name, Year birthyear, MembershipType membershipType)
    {
        Member m = new Member(name, birthyear, membershipType);
        m.setIdMember(id);
        System.out.println(m);
        return m;
    }

    public MemberActive createTempMemberActive(int id, String name, Year birthyear, MembershipType membershipType, ActivityType activityType)
    {
        MemberActive m = new MemberActive(name, birthyear, membershipType, activityType);
        m.setIdMember(id);
        System.out.println(m);
        return m;
    }

    public MemberCompetitive createTempMemberCompetitive(int id, String name, Year birthyear, MembershipType membershipType, ActivityType activityType, ArrayList<DisciplineType> disciplineList)
    {
        MemberCompetitive m = new MemberCompetitive(name, birthyear, membershipType, activityType, disciplineList);
        m.setIdMember(id);
        System.out.println(m);
        return m;
    }
    
    public void editMember(Member member) {
        try
        {
            modelController.editMember(member);
        }
        catch (IOException i)
        {
            System.out.println("Unable to write to file using the given file path");
        }
    }
    
    public void editMember(MemberActive member) {
        try
        {
        modelController.editMemberActive(member);
        }
        catch (IOException i)
        {
            System.out.println("Unable to write to file using the given file path");
        }
    }
    
    public void editMember(MemberCompetitive member) {
        try
        {
            modelController.editMemberCompetitive(member);
        }
        catch (IOException i)
        {
            System.out.println("Unable to write to file using the given file path");
        }
    }

    public void getMember(String Username)
    {
//        modelController.getMember(Username);
//        modelController.getMemberActive(Username);
//        modelController.getMemberCompetitive(Username);

    }

    public Member getMember(int id)
    {
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

    public void deleteMember(int MemberID)
    {
        try
        {
        modelController.deleteMember(MemberID);
        }
        catch (IOException ix)
        {
            System.out.println("Stuff didn't work");
        }
    }

    public ArrayList<Member> getAllMembers()
    {
        return modelController.getAllMembersInBasicMemberFormat();

    }
    
    public ArrayList<MemberCompetitive> getAllCompetitiveMembers()
    {
        return modelController.getAllCompetitiveMembers();
    }

    //Cashier
    public void registerPayment(int memberID, Year year)
    {
        getMember(memberID).registerPayment(year);
    }

    public void revokePayment(int memberID, Year year)
    {
        getMember(memberID).revokePayment(year);

    }
    
    public void getMemberArrear(int memberID) //Single user based on ID. ONLY RETURNS ARREAR, NOT USER INFO.    
	
   {
        getMember(memberID).calculateArrear();
	
   }

    public ArrayList getAllArrears() //all users
    {
        return subscription.calculateArrears(getAllMembers());
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
