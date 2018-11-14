package Delfinen.data;

import Delfinen.logic.Member;
import Delfinen.logic.MemberActive;
import Delfinen.logic.MemberCompetitive;
import java.util.ArrayList;
import java.util.Objects;

/**
 * @author Camilla
 */
public class Model {

    public Model() {

    }

    ArrayList<Member> members = new ArrayList();
    ArrayList<MemberActive> membersActive = new ArrayList();
    ArrayList<MemberCompetitive> membersCompetitive = new ArrayList();

    public void addMember(Member member) {
        members.add(member);
    }

    public void addMember(MemberActive member) {
        membersActive.add(member);
    }

    public void addMember(MemberCompetitive member) {
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

    public ArrayList<Member> getMember(String memberName) {
        ArrayList<Member> membersByName = new ArrayList();
        for (int i = 0; i < members.size(); i++) {
            if (memberName.equals(members.get(i).getName())) {
                membersByName.add(members.get(i));
            }
        }
        return membersByName;
    }

    public ArrayList<MemberActive> getMemberActive(String memberName) {
        ArrayList<MemberActive> membersActiveByName = new ArrayList();
        for (int i = 0; i < membersActive.size(); i++) {
            if (memberName.equals(membersActive.get(i).getName())) {
                membersActiveByName.add(membersActive.get(i));
            }
        }
        return membersActiveByName;
    }

    public ArrayList<MemberCompetitive> getMemberCompetitive(String memberName) {
        ArrayList<MemberCompetitive> membersCompetitiveByName = new ArrayList();
        for (int i = 0; i < membersCompetitive.size(); i++) {
            if (memberName.equals(membersCompetitive.get(i).getName())) {
                membersCompetitiveByName.add(membersCompetitive.get(i));
            }
        }
        return membersCompetitiveByName;
    }

    public void deleteMember(int memberID) {
        for (int i = 0; i < members.size(); i++) {
            if (memberID == (members.get(i).getId())) {
                members.remove(members.get(i));
                return;
            }
        }
        for (int i = 0; i < membersActive.size(); i++) {
            if (memberID == (membersActive.get(i).getId())) {
                membersActive.remove(membersActive.get(i));
                return;
            }
        }
        for (int i = 0; i < membersCompetitive.size(); i++) {
            if (memberID == (membersCompetitive.get(i).getId())) {
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

}
