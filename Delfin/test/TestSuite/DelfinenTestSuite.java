package TestSuite;

import Delfinen.data.DataAccessorFileTest;
import Delfinen.data.ModelControllerTest;
import Delfinen.data.ModelTest;
import Delfinen.logic.CompetitionTest;
import Delfinen.logic.MemberActiveTest;
import Delfinen.logic.MemberCompetitiveTest;
import Delfinen.logic.MemberTest;
import Delfinen.logic.SubscriptionTest;
import Delfinen.logic.TrainingTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Rúni
 */

@RunWith(Suite.class)
@Suite.SuiteClasses(
{
    DataAccessorFileTest.class, ModelControllerTest.class, ModelTest.class, 
    MemberTest.class, MemberActiveTest.class, MemberCompetitiveTest.class, SubscriptionTest.class, 
    TrainingTest.class, CompetitionTest.class
})
public class DelfinenTestSuite
{
    
}
