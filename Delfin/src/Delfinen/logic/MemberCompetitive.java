package Delfinen.logic;

import Delfinen.data.DisciplineType;
import Delfinen.data.MembershipType;
import Delfinen.data.ActivityType;
import java.time.Year;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author runin, camilla og asger
 */
public class MemberCompetitive extends MemberActive
{

    private ArrayList<DisciplineType> disciplineTypes;

    // ArrayList<DisciplineType> disciplineList laves evt. i GUI
    public MemberCompetitive(String name, Year birthyear, MembershipType membershipType,
            ActivityType activityType, ArrayList<DisciplineType> disciplineList)
    {
        super(name, birthyear, membershipType, activityType);
        disciplineTypes = disciplineList;
    }

    public ArrayList<DisciplineType> getDisciplineTypes()
    {
        return disciplineTypes;
    }

    /*
    .toString() override not necessary in this sub class. However, a secondary 
    .toString() method specific to this subclass is necessary for special use 
    in certain situations in the GUI class. 
    Attention: DO NOT DELETE OR MODIFY THE FOLLOWING CODE!!
    */
    public String toStringCompetitionVersion() {
        return "ID: " + super.getId() + ", Name: " + super.getName() + ", Birthyear: " + super.getBirthyear() 
                + ", Activity type: " + super.getActivityType() + ", Disciplines: " + disciplineTypes;
    }
        
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)){
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!super.equals(obj)){
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MemberCompetitive other = (MemberCompetitive) obj;
        if (!Objects.equals(this.disciplineTypes, other.disciplineTypes)) {
            return false;
        }
        return true;
    }
    
}
