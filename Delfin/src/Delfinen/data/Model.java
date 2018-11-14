
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
    
    public void addMember(Member member){
        members.add(member);
    }
    
    public void addMember(MemberActive member){
        membersActive.add(member);
    }
    
    public void addMember(MemberCompetitive member){
        membersCompetitive.add(member);
    }
    
    public ArrayList<Member> getAllMembers(){
        return members;
    }
    
    public ArrayList<MemberActive> getAllMembersActive(){
        return membersActive;
    }
    
    public ArrayList<MemberCompetitive> getAllMembersCompetitive(){
        return membersCompetitive;
    }
    
    public void editMember(Member member){
        for (int i = 0; i < members.size(); i++) {
            if(member.getId() == (members.get(i).getId())){
                members.set(i, member);               
            }          
        }
    }
    
    public Member getMember(int memberID){
        for (int i = 0; i < members.size(); i++) {
            if(memberID == (members.get(i).getId())){
                return members.get(i);            
            }
        }
        return null;
    }
    
    public Member getMemberActive(int memberID){
        for (int i = 0; i < membersActive.size(); i++) {
            if(memberID == (membersActive.get(i).getId())){
                return membersActive.get(i);            
            }
        }
        return null;
    }
    
    public Member getMemberCompetitive(int memberID){
        for (int i = 0; i < membersCompetitive.size(); i++) {
            if(memberID == (membersCompetitive.get(i).getId())){
                return membersCompetitive.get(i);            
            }
        }
        return null;
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
