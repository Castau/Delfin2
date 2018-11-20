package Delfinen.logic;

import Delfinen.data.DisciplineType;
import Delfinen.data.MembershipType;
import Delfinen.data.ActivityType;
import java.time.Year;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Class related to competetive members who partake in competitions and has their training results saved. (if any)
 * @author runin, camilla og asger
 */
public class MemberCompetitive extends MemberActive
{

    private Training trainingSessions;
    private Competition competitionResults;
    private ArrayList<DisciplineType> disciplineTypes;
    // ArrayList<DisciplineType> disciplineList laves evt. i GUI

    /**
     * Member with an active membership, who also competes.
     *
     * @see MemberActive
     * @param name Members name
     * @param birthyear Members Birthyear
     * @param membershipType Members MembershipType
     * @param activityType Members ActivityType
     * @param disciplineList Members Disciplines they compete in
     */
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

    public Training getTrainingSessions()
    {
        return trainingSessions;
    }

    public Competition getCompetitionResults()
    {
        return competitionResults;
    }

    /**
     * This secondary .toString() method specific to this subclass is necessary
     * for special use in certain situations in the GUI class. * Attention: DO
     * NOT DELETE OR MODIFY THE FOLLOWING CODE!!
     *
     * @return Returns a specific toString of a MemberCompetitive - used for GUI handling of competitions.
     */
    public String toStringCompetitionVersion()
    {
        return "ID: " + super.getId() + ", Name: " + super.getName() + ", Birthyear: " + super.getBirthyear()
                + ", Activity type: " + super.getActivityType() + ", Disciplines: " + disciplineTypes;
    }

    @Override
    public String toString()
    {
        return "MemberCompetitive{" + super.toString() + "disciplineTypes=" + disciplineTypes + '}';
    }

    @Override
    public boolean equals(Object obj)
    {
        if (!super.equals(obj))
        {
            return false;
        }
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
        final MemberCompetitive other = (MemberCompetitive) obj;
        if (!Objects.equals(this.disciplineTypes, other.disciplineTypes))
        {
            return false;
        }
        return true;
    }

}
