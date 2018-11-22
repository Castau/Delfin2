package Delfinen.data;

import Delfinen.logic.Member;
import Delfinen.logic.MemberActive;
import Delfinen.logic.MemberCompetitive;
import java.util.ArrayList;
import java.util.Objects;

/**
 * The Model class handles different Member Types and handles member IDs.
 * (Unique identifiers)
 *
 * @author Camilla
 */
public class Model
{

    private ArrayList<Member> members;
    private ArrayList<MemberActive> membersActive;
    private ArrayList<MemberCompetitive> membersCompetitive;

    private int IdCounter;

    /**
     * The Model creates a new ArrayList for the three different Member objects,
     * and sets the IdCounter that hands out unique ID's to Member objects, to
     * 1. The Model object contains all the info of all the Member objects. The
     * contents of this class are saved in a file by the ModelController and
     * DataAccessor objects
     */
    public Model()
    {
        members = new ArrayList();
        membersActive = new ArrayList();
        membersCompetitive = new ArrayList();
        IdCounter = 1;

    }

    /**
     * This method assigns a unique ID to the Member object and adds the Member
     * object to the ArrayList of Member objects.
     *
     * @param member, Member object
     */
    public void addMember(Member member)
    {
        member.setIdMember(IdCounter);
        IdCounter++;
        members.add(member);
    }

    /**
     * This method assigns a unique ID to the Member object and adds the Member
     * object to the ArrayList of MemberActive objects.
     *
     * @param member, MemberActive object
     */
    public void addMember(MemberActive member)
    {
        member.setIdMember(IdCounter);
        IdCounter++;
        membersActive.add(member);
    }

    /**
     * This method assigns a unique ID to the Member object and adds the Member
     * object to the ArrayList of MemberCompetitive objects.
     *
     * @param member, MemberCompetitive object
     */
    public void addMember(MemberCompetitive member)
    {
        member.setIdMember(IdCounter);
        IdCounter++;
        membersCompetitive.add(member);
    }

    /**
     *
     * @return ArrayList of all Member objects
     */
    public ArrayList<Member> getAllMembers()
    {
        return members;
    }

    /**
     *
     * @return ArrayList of all MemberActive objects
     */
    public ArrayList<MemberActive> getAllMembersActive()
    {
        return membersActive;
    }

    /**
     *
     * @return ArrayList of all MemberCompetitive objects
     */
    public ArrayList<MemberCompetitive> getAllMembersCompetitive()
    {
        return membersCompetitive;
    }

    /**
     * This method takes a (temporary) Member object and compares the unique Id
     * of that Member object to the unique ID's of the Member objects in the
     * three ArrayLists in the Model object.
     *
     * If an ID match is found in the ArrayList containing the same Member type
     * as the parameter, the Member oject in the Arraylist is overwritten with
     * the parameter.
     *
     * If an ID match is found in either of the ArrayLists containing different
     * Member object types than the parameter, the Member object in the
     * ArrayList is removed and the parameter object is added to the same
     * ArrayList.
     *
     * @param member, Member object
     */
    public void editMember(Member member)
    {
        for (int i = 0; i < members.size(); i++)
        {
            if (member.getId() == (members.get(i).getId()))
            {
                members.set(i, member);
                return;
            }
        }
        for (int i = 0; i < membersActive.size(); i++)
        {
            if (member.getId() == (membersActive.get(i).getId()))
            {
                membersActive.remove(i);
                members.add(member);
                return;
            }
        }
        for (int i = 0; i < membersCompetitive.size(); i++)
        {
            if (member.getId() == (membersCompetitive.get(i).getId()))
            {
                membersCompetitive.remove(i);
                members.add(member);
                return;
            }
        }
    }

    /**
     * This method takes a (temporary) MemberActive object and compares the
     * unique Id of that MemberActive object to the unique ID's of the Member
     * objects in the three ArrayLists in the Model object.
     *
     * If an ID match is found in the ArrayList containing the same Member type
     * as the parameter, the Member oject in the Arraylist is overwritten with
     * the parameter.
     *
     * If an ID match is found in either of the ArrayLists containing different
     * Member object types than the parameter, the Member object in the
     * ArrayList is removed and the parameter object is added to the same
     * ArrayList.
     *
     * @param member, MemberActive object
     */
    public void editMemberActive(MemberActive member)
    {
        for (int i = 0; i < members.size(); i++)
        {
            if (member.getId() == (members.get(i).getId()))
            {
                members.remove(i);
                membersActive.add(member);
                return;
            }
        }
        for (int i = 0; i < membersActive.size(); i++)
        {
            if (member.getId() == (membersActive.get(i).getId()))
            {
                membersActive.set(i, member);
                return;
            }
        }
        for (int i = 0; i < membersCompetitive.size(); i++)
        {
            if (member.getId() == (membersCompetitive.get(i).getId()))
            {
                membersCompetitive.remove(i);
                membersActive.add(member);
            }
        }
    }

    /**
     * This method takes a (temporary) MemberCompetitive object and compares the
     * unique Id of that MemberCompetitive object to the unique ID's of the
     * Member objects in the three ArrayLists in the Model object.
     *
     * If an ID match is found in the ArrayList containing the same Member type
     * as the parameter, the Member oject in the Arraylist is overwritten with
     * the parameter.
     *
     * If an ID match is found in either of the ArrayLists containing different
     * Member object types than the parameter, the Member object in the
     * ArrayList is removed and the parameter object is added to the same
     * ArrayList.
     *
     * @param member, MemberCompetitive object
     */
    public void editMemberCompetitive(MemberCompetitive member)
    {
        for (int i = 0; i < members.size(); i++)
        {
            if (member.getId() == (members.get(i).getId()))
            {
                members.remove(i);
                membersCompetitive.add(member);
                return;
            }
        }
        for (int i = 0; i < membersActive.size(); i++)
        {
            if (member.getId() == (membersActive.get(i).getId()))
            {
                membersActive.remove(i);
                membersCompetitive.add(member);
                return;
            }
        }
        for (int i = 0; i < membersCompetitive.size(); i++)
        {
            if (member.getId() == (membersCompetitive.get(i).getId()))
            {
                membersCompetitive.set(i, member);
                return;
            }
        }
    }

    /**
     * This method iterates through the ArrayList of Member objects and returns
     * the Member object who matches the parameter
     *
     * @param memberID, unique ID
     * @return Member
     */
    public Member getMember(int memberID)
    {
        for (int i = 0; i < members.size(); i++)
        {
            if (memberID == (members.get(i).getId()))
            {
                return members.get(i);
            }
        }
        return null;
    }

    /**
     * This method iterates through the ArrayList of MemberActive objects and
     * returns the MemberActive object who matches the parameter
     *
     * @param memberID, unique ID
     * @return MemberActive
     */
    public MemberActive getMemberActive(int memberID)
    {
        for (int i = 0; i < membersActive.size(); i++)
        {
            if (memberID == (membersActive.get(i).getId()))
            {
                return membersActive.get(i);
            }
        }
        return null;
    }

    /**
     * This method iterates through the ArrayList of MemberCompetitive objects
     * and returns the MemberCompetitive object who matches the parameter
     *
     * @param memberID, unique ID
     * @return MemberCompetitive
     */
    public MemberCompetitive getMemberCompetitive(int memberID)
    {
        for (int i = 0; i < membersCompetitive.size(); i++)
        {
            if (memberID == (membersCompetitive.get(i).getId()))
            {
                return membersCompetitive.get(i);
            }
        }
        return null;
    }

    /**
     * This method iterates through the ArrayList of Member, MemberActive, and
     * MemberCompetitive objects and returns deletes the Member (or child)
     * object who matches the parameter
     *
     * @param memberID, unique ID
     *
     */
    public void deleteMember(int memberID)
    {
        for (int i = 0; i < members.size(); i++)
        {
            if ((members.get(i).getId()) == memberID)
            {
                members.remove(members.get(i));
                return;
            }
        }
        for (int i = 0; i < membersActive.size(); i++)
        {
            if ((membersActive.get(i).getId()) == memberID)
            {
                membersActive.remove(membersActive.get(i));
                return;
            }
        }
        for (int i = 0; i < membersCompetitive.size(); i++)
        {
            if ((membersCompetitive.get(i).getId()) == memberID)
            {
                membersCompetitive.remove(membersCompetitive.get(i));
                return;
            }
        }
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Model other = (Model) obj;
        if (this.IdCounter != other.IdCounter)
        {
            return false;
        }
        if (!Objects.equals(this.members, other.members))
        {
            return false;
        }
        if (!Objects.equals(this.membersActive, other.membersActive))
        {
            return false;
        }
        if (!Objects.equals(this.membersCompetitive, other.membersCompetitive))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Model{" + "members=" + members + ", membersActive=" + membersActive + ", membersCompetitive=" + membersCompetitive + ", IdCounter=" + IdCounter + '}';
    }
}
