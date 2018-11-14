package Delfinen.logic;

import Delfinen.data.ModelController;
import UI.UI;

/**
 *
 * @author runin, Asger, Camilla
 */
public class Controller
{

    private UI ui;
    private ModelController modelController;

    public Controller()
    {
        modelController = new ModelController(this);
        ui = new UI();
    }
    //Manager
    
    public void createMember()
    {
        
    }
    
    public void editMember()
    {
        
    }

    public void getMember(String Username)
    {
        
    }
    
    public void getMember(int id)
    {
        
    }
    
    public void deleteMember()
    {
        
    }
    
    public void getAllMembers()
    {
        
        
    }
    
    //Cashier
    
    public void registerPayment()
    {
        
    }
    
    public void getArrears()
    {
        
    }
        
    
    //Trainer
    
    public void getTopFive()
    {
        
    }
    
    public void createCompetition()
    {
        
    }
    
    public void editCompetition()
    {
        
    }
    
    public void deleteCompetition()
    {
        
    }
    
}
