/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delfinen.logic;

import java.time.Year;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rúni
 */
public class SubscriptionTest
{

    private Controller controller;
    Subscription sub;
    ArrayList yearsPaid;
    ArrayList disciplineList;
    ArrayList<Member> Members;
    Member m1;
    MemberActive m2;
    MemberActive m3;
    MemberCompetitive m4;

    public SubscriptionTest()
    {
        controller = new Controller();
        sub = new Subscription(controller);
        yearsPaid = new ArrayList();
        disciplineList = new ArrayList();
        Members = new ArrayList();
        disciplineList.add(Delfinen.data.DisciplineType.CRAWL);
        disciplineList.add(Delfinen.data.DisciplineType.BREASTSTROKE);

        m1 = new Member("Hans", Year.of(1965), Delfinen.data.MembershipType.PASSIVE);
        m1.setIdMember(1);
        m2 = new MemberActive("Signe", Year.of(1940), Delfinen.data.MembershipType.ACTIVE, Delfinen.data.ActivityType.BASIC); //age = 78 (pensionist)
        m2.setIdMember(2);
        m3 = new MemberActive("Otto", Year.of(2005), Delfinen.data.MembershipType.ACTIVE, Delfinen.data.ActivityType.BASIC); //age = 13 (youth)
        m3.setIdMember(3);
        m4 = new MemberCompetitive("Arne", Year.of(1990), Delfinen.data.MembershipType.ACTIVE, Delfinen.data.ActivityType.COMPETITIVE, disciplineList); //age = 28 (senior)
        m4.setIdMember(4);
        Members.add(m1);
        Members.add(m2);
        Members.add(m3);
        Members.add(m4);
    }

    @Test
    public void testPaymentMember()
    {
        assertTrue(m1.getYearsPaid().isEmpty());

        m1.registerPayment(Year.of(2016));
        m1.registerPayment(Year.of(2017));
        assertEquals(2, m1.getYearsPaid().size());
        assertEquals(Year.of(2016), m1.getYearsPaid().get(0));

        m1.revokePayment(Year.of(2016));
        assertEquals(1, m1.getYearsPaid().size());
        assertEquals(Year.of(2017), m1.getYearsPaid().get(0));

        boolean res = m1.revokePayment(Year.of(2016));
        assertFalse(res);

        m1.revokePayment(Year.of(2017));
        assertTrue(m1.getYearsPaid().isEmpty());
    }

    /**
     * Test of getAllArrears method, of class Subscription.
     */
    @Test
    public void testGetAllArrears()
    {
        ArrayList<Member> arrearMembers = Members;
        Subscription instance = sub;
        int expResult = 4300; // Passive (500) + Pensionist (1200) + Youth (1000) + Senior (1600)
        int result = instance.getAllArrears(arrearMembers);
        System.out.println("testGetAllArrears: \n" + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAllArrearsSomePaid()
    {
        m1.registerPayment(Year.of(2018));
        m2.registerPayment(Year.of(2018));
        ArrayList<Member> arrearMembers = Members;
        Subscription instance = sub;
        int expResult = 2600; //  Youth (1000) + Senior (1600)
        int result = instance.getAllArrears(arrearMembers);
        System.out.println("testGetAllArrearsSomePaid: \n" + result);
        assertEquals(expResult, result);
    }

    /**
     * Test of getArrearMembers method, of class Subscription.
     */
    @Test
    public void testGetArrearMembers()
    {
        ArrayList<Member> fakeMembers = new ArrayList(Members);
        ArrayList<Member> allMembers = new ArrayList(Members);

        Subscription instance = sub;
        ArrayList expResult = fakeMembers;
        ArrayList result = instance.getArrearMembers(allMembers);
        System.out.println("testGetArrearMembers \n" + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetArrearMembersSomePaid()
    {
        ArrayList<Member> allMembers = new ArrayList(Members);
        ArrayList<Member> fakeMembers = new ArrayList(Members);

        fakeMembers.get(0).registerPayment(Year.of(2018));
        fakeMembers.get(1).registerPayment(Year.of(2018));
        Members.get(0).registerPayment(Year.of(2018));
        Members.get(1).registerPayment(Year.of(2018));

        Subscription instance = sub;
        ArrayList expResult = instance.getArrearMembers(fakeMembers);
        ArrayList result = instance.getArrearMembers(allMembers);
        System.out.println("testGetArrearMembersSomePaid \n" + expResult + "\n" + result);
        assertEquals(expResult, result);
    }

}
