package Delfinen.data;

import Delfinen.logic.Member;
import Delfinen.logic.MemberActive;
import Delfinen.logic.MemberCompetitive;
import Delfinen.logic.Training;
import java.util.ArrayList;
import java.util.Objects;


/**
 * @author Camilla
 */
public class Model {

    private ArrayList<Member> members;
    private ArrayList<MemberActive> membersActive;
    private ArrayList<MemberCompetitive> membersCompetitive;
    
    private int IdCounter;
    
    public Model() {
        members = new ArrayList();
        membersActive = new ArrayList();
        membersCompetitive = new ArrayList();
        IdCounter = 1;

    }


    public void addMember(Member member) {
        member.setIdMember(IdCounter);
        IdCounter++;
        members.add(member);
    }

    public void addMember(MemberActive member) {
        member.setIdMember(IdCounter);
        IdCounter++;
        membersActive.add(member);
    }

    public void addMember(MemberCompetitive member) {
        member.setIdMember(IdCounter);
        IdCounter++;
        membersCompetitive.add(member);
    }

    public ArrayList<Member> getAllMembers() {
        return members;
    }

    public ArrayList<MemberActive> getAllMembersActive() {
        return membersActive;
    }

    public ArrayList<MemberCompetitive> getAllMembersCompetitive() {
        return membersCompetitive;
    }

    public void editMember(Member member) {
        for (int i = 0; i < members.size(); i++) {
            if (member.getId() == (members.get(i).getId())) {
                members.set(i, member);
            }
        }
    }

    public void editMemberActive(MemberActive member) {
        for (int i = 0; i < membersActive.size(); i++) {
            if (member.getId() == (membersActive.get(i).getId())) {
                membersActive.set(i, member);
            }
        }
    }

    public void editMemberCompetitive(MemberCompetitive member) {
        for (int i = 0; i < membersCompetitive.size(); i++) {
            if (member.getId() == (membersCompetitive.get(i).getId())) {
                membersCompetitive.set(i, member);
            }
        }
    }

    public Member getMember(int memberID) {
        for (int i = 0; i < members.size(); i++) {
            if (memberID == (members.get(i).getId())) {
                return members.get(i);
            }
        }
        return null;
    }

    public MemberActive getMemberActive(int memberID) {
        for (int i = 0; i < membersActive.size(); i++) {
            if (memberID == (membersActive.get(i).getId())) {
                return membersActive.get(i);
            }
        }
        return null;
    }

    public MemberCompetitive getMemberCompetitive(int memberID) {
        for (int i = 0; i < membersCompetitive.size(); i++) {
            if (memberID == (membersCompetitive.get(i).getId())) {
                return membersCompetitive.get(i);
            }
        }
        return null;
    }

    public void deleteMember(int memberID) {
        for (int i = 0; i < members.size(); i++) {
            if ((members.get(i).getId()) == memberID) {
                members.remove(members.get(i));
                return;
            }
        }
        for (int i = 0; i < membersActive.size(); i++) {
            if ((membersActive.get(i).getId()) == memberID) {
                membersActive.remove(membersActive.get(i));
                return;
            }
        }
        for (int i = 0; i < membersCompetitive.size(); i++) {
            if ((membersCompetitive.get(i).getId()) == memberID) {
                membersCompetitive.remove(membersCompetitive.get(i));
                return;
            }
        }
    }
    



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Model other = (Model) obj;
        if (this.IdCounter != other.IdCounter) {
            return false;
        }
        if (!Objects.equals(this.members, other.members)) {
            return false;
        }
        if (!Objects.equals(this.membersActive, other.membersActive)) {
            return false;
        }
        if (!Objects.equals(this.membersCompetitive, other.membersCompetitive)) {
            return false;
        }
        return true;
    }
    
   

    @Override
    public String toString() {
        return "Model{" + "members=" + members + ", membersActive=" + membersActive + ", membersCompetitive=" + membersCompetitive + ", IdCounter=" + IdCounter + '}';
    }

    
    

}
