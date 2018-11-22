package Delfinen.logic;

import Delfinen.data.ActivityType;
import Delfinen.data.DisciplineType;
import Delfinen.data.Distance;
import Delfinen.data.MembershipType;
import Delfinen.data.ModelController;
import java.time.Year;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author Rúni, Asger, Camilla
 *
 * The controller class takes use of the ModelController and Subscription class
 * to create, save, change and delete values and objects.
 */
public class Controller
{

    private ModelController modelController;
    private Subscription subscription;

    public Controller()
    {
        modelController = new ModelController();
        subscription = new Subscription();
    }

    public ModelController getModelController()
    {
        return modelController;
    }

    //Manager
    /**
     * Manager: Creates a new passive Member
     *
     * @see Member
     * @param name Member Name
     * @param birthyear Member Birthyear
     * @param membershipType Member MembershipType.
     */
    public void createMember(String name, Year birthyear, MembershipType membershipType)
    {
        Member m = new Member(name, birthyear, membershipType);
        System.out.println(m);
        try
        {
            modelController.addMember(m);
        } catch (IOException i)
        {
            System.out.println("Unable to write to file using the given file path");
        }
    }

    /**
     * Manager: Creates a new active member.
     *
     * @see MemberActive
     * @param name Member Name
     * @param birthyear Member Birthyear
     * @param membershipType Member MembershipType
     * @param activityType Member ActivityType
     */
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

    /**
     * Manager: Creates a new (active) competitive Member.
     *
     * @see MemberCompetitive
     * @param name Member Name
     * @param birthyear Member Birthyear
     * @param membershipType Member MembershipType
     * @param activityType Member ActivityType
     * @param disciplineList Member DisciplineList
     */
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

    /**
     * Manager: Edits a passive member's information
     *
     * @param member Member in question
     */
    public void editMember(Member member)
    {
        try
        {
            modelController.editMember(member);
        } catch (IOException i)
        {
            System.out.println("Unable to write to file using the given file path");
        }
    }

    /**
     * Manager: Edits a (active) member's information.
     *
     * @param member Member in question
     */
    public void editMember(MemberActive member)
    {
        try
        {
            modelController.editMemberActive(member);
        } catch (IOException i)
        {
            System.out.println("Unable to write to file using the given file path");
        }
    }

    /**
     * Manager: Edits a (competitive) member's information.
     *
     * @param member Member in question
     */
    public void editMember(MemberCompetitive member)
    {
        System.out.println("editmember competitive" + member);
        try
        {
            modelController.editMemberCompetitive(member);
        } catch (IOException i)
        {
            System.out.println("Unable to write to file using the given file path");
        }
    }

    /**
     * Manager: Returns a member based on their ID.
     *
     * @param id Members ID
     * @return Returns a certain member based on unique identifier.
     */
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

    /**
     * Manager: Deletes a member based on their unique identifier.
     *
     * @param MemberID Members ID
     */
    public void deleteMember(int MemberID)
    {
        try
        {
            modelController.deleteMember(MemberID);
        } catch (IOException ix)
        {
            System.out.println("Stuff didn't work");
        }
    }

    /**
     * Manager/Cashier:
     *
     * @return Returns all members in a basic format. Used for other methods.
     */
    public ArrayList<Member> getAllMembers()
    {
        return modelController.getAllMembersInBasicMemberFormat();
    }

    /**
     * Manager/Trainer:
     *
     * @return Returns all Competitive Members. Used for other methods.
     */
    public ArrayList<MemberCompetitive> getAllCompetitiveMembers()
    {
        return modelController.getAllCompetitiveMembers();
    }

    //Cashier
    /**
     * Cashier:
     *
     * @param memberID This Members ID.
     * @param year Registers a payment for a single user for a given year.
     */
    public void registerPayment(int memberID, Year year)
    {
        Member temp = getMember(memberID);
        temp.registerPayment(year);
        editMember(temp);
    }

    /**
     * Cashier:
     *
     * @param memberID This Members ID.
     * @param year Removes a single users given payment (in case of chargeback,
     * etc)
     */
    public void revokePayment(int memberID, Year year)
    {
        Member temp = getMember(memberID);
        temp.revokePayment(year);
        editMember(temp);
    }

    /**
     * Cashier:
     *
     * @return Returns all members with outstanding arrears.
     */
    public ArrayList<Member> getAllArrearMembers() //Returns all members who has not paid
    {
        return subscription.getArrearMembers(getAllMembers());
    }

    /**
     * Cashier:
     *
     * @param memberID Members ID
     * @return Returns a single users arrear (if any)
     */
    public int getArrearSingleMember(int memberID) //Single user based on ID. ONLY RETURNS ARREAR, NOT USER INFO.    
    {
        return getMember(memberID).calculateArrear();
    }

    /**
     * Cashier:
     *
     * @return Returns all outstanding arrears as one integer.
     */
    public int getArrearsAllMembers() //Returns all members with arrears as an integer
    {
        return subscription.getAllArrears(getAllArrearMembers());
    }

    //Trainer
    /**
     * Trainer: Adds training session (Result)
     *
     * @param memberID Members ID
     * @param date Date Date of the training session
     * @param diciplineType Members DisciplineType
     * @param distance Training result distance completed
     * @param timeInSec Training result time completed
     */
    public void addTrainingSession(int memberID, Date date, DisciplineType diciplineType, Distance distance, int timeInSec)
    {
        try
        {
            modelController.addTrainingSession(memberID, date, diciplineType, distance, timeInSec);
        }
        catch (IOException ix)
        {
            System.out.println("Could not add training to chosen member (ID may be invalid)");
        }
    }

    /**
     * Trainer: Adds competition result
     *
     * @param memberID Members ID
     * @param date Date of the competition
     * @param diciplineType Discipline type of the member/competition
     * @param distance Result distance
     * @param timeInSec Result time (completion)
     * @param placement Result placement
     * @param eventName Name of the competition
     */
    public void addCompetitionResult(int memberID, Date date, DisciplineType diciplineType, Distance distance, int timeInSec, int placement, String eventName)
    {
        try
        {
            modelController.addCompetitionResult(memberID, date, diciplineType, distance, timeInSec, placement, eventName);
        } 
        catch (IOException ex)
        {
            System.out.println("Could not add competition result to chosen member (ID may be invalid)");
        }
    }

    public ArrayList<MemberCompetitive> getTopFiveTraining(DisciplineType disciplineType, Distance distance, ArrayList<MemberCompetitive> members)
    {
       return modelController.getTop5Training(disciplineType, distance, members);

    }

    public ArrayList<MemberCompetitive> getTopFiveCompetition(DisciplineType disciplineType, Distance distance, ArrayList<MemberCompetitive> members)
    {
        return modelController.getTop5Competition(disciplineType, distance, members);
    }
}
