/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delfinen.logic;

import Delfinen.data.ActivityType;
import Delfinen.data.DisciplineType;
import Delfinen.data.MembershipType;
import Delfinen.data.ModelController;
import java.time.Year;
import java.util.ArrayList;
import java.io.IOException;

public class TestMain 
{
    public static void main(String[] args) 
    {
        Controller c = new Controller();
        ModelController modelController = new ModelController(c);
        System.out.println("Expected null and got:");
        System.out.println(modelController.getMemberCompetitive(10));
    }
}
