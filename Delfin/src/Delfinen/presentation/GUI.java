package Delfinen.presentation;

import Delfinen.data.ActivityType;
import Delfinen.data.MembershipType;
import Delfinen.logic.Controller;
import java.time.Year;
import Delfinen.data.DisciplineType;
import Delfinen.data.Distance;
import Delfinen.logic.Member;
import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author shevitar
 */
public class GUI extends javax.swing.JFrame
{

    private Controller c;
    private String filePath = "";
    //The field below is only used as a temporary placeholder for the id of the member that is chosen in the EditMember-screen / DeleteMember-screen
    int idMember = 0;
    
    public GUI()
    {
        initComponents();
        c = new Controller();
        //Putting Radio Buttons into groups
        //Create member button group
        this.buttonGroupCreateMemberPassiveActive.add(RadioButtonNewMemberActive);
        this.buttonGroupCreateMemberPassiveActive.add(RadioButtonNewMemberPassive);
        this.buttonGroupCreateMemberActivityType.add(RadioButtonNewMemberBasic);
        this.buttonGroupCreateMemberActivityType.add(RadioButtonNewMemberCompetitive);
        //Edit member button group
        this.buttonGroupEditMemberPassiveActive.add(RadioButtonEditMemberActive);
        this.buttonGroupEditMemberPassiveActive.add(RadioButtonEditMemberPassive);
        this.buttonGroupEditMemberActivityType.add(RadioButtonEditMemberBasic);
        this.buttonGroupEditMemberActivityType.add(RadioButtonEditMemberCompetitive);
        //Add training button groups
        this.buttonGroupAddTrainingDisciplineTypes.add(RadioButtonAddTrainingBackstroke);
        this.buttonGroupAddTrainingDisciplineTypes.add(RadioButtonAddTrainingBreaststroke);
        this.buttonGroupAddTrainingDisciplineTypes.add(RadioButtonAddTrainingButterfly);
        this.buttonGroupAddTrainingDisciplineTypes.add(RadioButtonAddTrainingCrawl);
        
        this.buttonGroupAddTrainingDistance.add(RadioButtonAddTrainingDistance100);
        this.buttonGroupAddTrainingDistance.add(RadioButtonAddTrainingDistance200);
        this.buttonGroupAddTrainingDistance.add(RadioButtonAddTrainingDistance400);
        //Add competition result button groups
        this.buttonGroupAddCompetitionResultDisciplineTypes.add(RadioButtonAddCompetitionResultBackstroke);
        this.buttonGroupAddCompetitionResultDisciplineTypes.add(RadioButtonAddCompetitionResultBreaststroke);
        this.buttonGroupAddCompetitionResultDisciplineTypes.add(RadioButtonAddCompetitionResultButterfly);
        this.buttonGroupAddCompetitionResultDisciplineTypes.add(RadioButtonAddCompetitionResultCrawl);
        
        this.buttonGroupAddCompetitionResultDistance.add(RadioButtonAddCompetitionResultDistance100);
        this.buttonGroupAddCompetitionResultDistance.add(RadioButtonAddCompetitionResultDistance200);
        this.buttonGroupAddCompetitionResultDistance.add(RadioButtonAddCompetitionResultDistance400);
        //View top five button groups
        this.buttonGroupTopFiveDiscipline.add(RadioButtonTopFiveBackstroke);
        this.buttonGroupTopFiveDiscipline.add(RadioButtonTopFiveBreaststroke);
        this.buttonGroupTopFiveDiscipline.add(RadioButtonTopFiveButterfly);
        this.buttonGroupTopFiveDiscipline.add(RadioButtonTopFiveCrawl);
        
        this.buttonGroupTopFiveDistance.add(RadioButtonTopFiveDistance100);
        this.buttonGroupTopFiveDistance.add(RadioButtonTopFiveDistance200);
        this.buttonGroupTopFiveDistance.add(RadioButtonTopFiveDistance400);
        //Making panels invisible
        PanelLoggedInAsManager.setVisible(false);
        PanelCreateNewMember.setVisible(false);
        PanelEditMemberChooseMember.setVisible(false);
        PanelEditMember.setVisible(false);
        PanelDeleteMember.setVisible(false);
        PanelViewMembers.setVisible(false);
        PanelLoggedInAsCashier.setVisible(false);
        PanelRegisterPayment.setVisible(false);
        PanelRevokePayment.setVisible(false);
        PanelSingleMemberArrear.setVisible(false);
        PanelShowAllArrears.setVisible(false);
        PanelLoggedInAsTrainer.setVisible(false);
        PanelAddTraining.setVisible(false);
        PanelAddCompetitionResult.setVisible(false);
        PanelViewTopFive.setVisible(false);
        //Pre-disabling Radio Buttons
        this.RadioButtonNewMemberBasic.setEnabled(false);
        this.RadioButtonNewMemberCompetitive.setEnabled(false);
        this.RadioButtonNewMemberBackstroke.setEnabled(false);
        this.RadioButtonNewMemberBreaststroke.setEnabled(false);
        this.RadioButtonNewMemberButterfly.setEnabled(false);
        this.RadioButtonNewMemberCrawl.setEnabled(false);
        
        this.RadioButtonEditMemberBasic.setEnabled(false);
        this.RadioButtonEditMemberCompetitive.setEnabled(false);
        this.RadioButtonEditMemberBackstroke.setEnabled(false);
        this.RadioButtonEditMemberBreaststroke.setEnabled(false);
        this.RadioButtonEditMemberButterfly.setEnabled(false);
        this.RadioButtonEditMemberCrawl.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroupCreateMemberPassiveActive = new javax.swing.ButtonGroup();
        buttonGroupCreateMemberActivityType = new javax.swing.ButtonGroup();
        buttonGroupEditMemberPassiveActive = new javax.swing.ButtonGroup();
        buttonGroupEditMemberActivityType = new javax.swing.ButtonGroup();
        buttonGroupAddTrainingDisciplineTypes = new javax.swing.ButtonGroup();
        buttonGroupAddTrainingDistance = new javax.swing.ButtonGroup();
        buttonGroupAddCompetitionResultDisciplineTypes = new javax.swing.ButtonGroup();
        buttonGroupAddCompetitionResultDistance = new javax.swing.ButtonGroup();
        buttonGroupTopFiveDiscipline = new javax.swing.ButtonGroup();
        buttonGroupTopFiveDistance = new javax.swing.ButtonGroup();
        PanelLoginScreen = new javax.swing.JPanel();
        PanelLoginScreenHeader = new javax.swing.JPanel();
        LabelLoginScreenHome = new javax.swing.JLabel();
        LabelLoginScreenHeader = new java.awt.Label();
        ButtonLoginAsManager = new javax.swing.JButton();
        ButtonLoginAsCashier = new javax.swing.JButton();
        ButtonLoginAsTrainer = new javax.swing.JButton();
        PanelLoggedInAsManager = new javax.swing.JPanel();
        PanelLoggedInAsManagerScreenHeader = new javax.swing.JPanel();
        LabeManagerScreenHome = new javax.swing.JLabel();
        LabeManagerScreenHeader = new java.awt.Label();
        ButtonCreateNewMember = new javax.swing.JButton();
        ButtonEditMember = new javax.swing.JButton();
        ButtonDeleteMember = new javax.swing.JButton();
        ButtonViewMembers = new javax.swing.JButton();
        ButtonBackToMainMenu = new javax.swing.JButton();
        PanelCreateNewMember = new javax.swing.JPanel();
        PanelCreateNewMemberHeader = new javax.swing.JPanel();
        LabelCreateNewMemberHome = new javax.swing.JLabel();
        LabelCreateNewMemberHeader = new java.awt.Label();
        LabelCreateNewMemberLogAsManager = new java.awt.Label();
        ButtonCancelCreateNewMember = new javax.swing.JButton();
        LabelNewMemberName = new javax.swing.JLabel();
        LabelNewMemberBirthYear = new javax.swing.JLabel();
        TextFieldNewMemberName = new javax.swing.JTextField();
        TextFieldNewMemberBirthYear = new javax.swing.JTextField();
        LabelBirthYearFormat = new javax.swing.JLabel();
        RadioButtonNewMemberPassive = new javax.swing.JRadioButton();
        RadioButtonNewMemberActive = new javax.swing.JRadioButton();
        LabelNewMemberMembershipType = new javax.swing.JLabel();
        LabelNewMemberActivityType = new javax.swing.JLabel();
        RadioButtonNewMemberBasic = new javax.swing.JRadioButton();
        RadioButtonNewMemberCompetitive = new javax.swing.JRadioButton();
        LabelNewMemberDisciplineType = new javax.swing.JLabel();
        RadioButtonNewMemberButterfly = new javax.swing.JRadioButton();
        RadioButtonNewMemberCrawl = new javax.swing.JRadioButton();
        RadioButtonNewMemberBackstroke = new javax.swing.JRadioButton();
        RadioButtonNewMemberBreaststroke = new javax.swing.JRadioButton();
        ButtonNewMemberCreateMember = new javax.swing.JButton();
        PanelEditMemberChooseMember = new javax.swing.JPanel();
        PanelEditMemberHeaderChoose = new javax.swing.JPanel();
        LabelEditMemberHomeChoose = new javax.swing.JLabel();
        LabelEditMemberHeaderChoose = new java.awt.Label();
        LabelEditMemberLogAsManagerChoose = new java.awt.Label();
        LabelEditMemberChooseMember = new javax.swing.JLabel();
        ButtonCancelEditMemberChoose = new javax.swing.JButton();
        ButtonOKChooseMemberToEdit = new javax.swing.JButton();
        ComboBoxChooseMemberToEdit = new javax.swing.JComboBox<>();
        PanelEditMember = new javax.swing.JPanel();
        PanelEditMemberHeader = new javax.swing.JPanel();
        LabelEditMemberHome = new javax.swing.JLabel();
        LabelEditMemberHeader = new java.awt.Label();
        LabelEditMemberLogAsManager = new java.awt.Label();
        LabelNewMemberName1 = new javax.swing.JLabel();
        LabelNewMemberBirthYear1 = new javax.swing.JLabel();
        ButtonCancelEditMember = new javax.swing.JButton();
        TextFieldEditMemberName = new javax.swing.JTextField();
        TextFieldEditMemberBirthYear = new javax.swing.JTextField();
        LabelBirthYearFormatEditMember = new javax.swing.JLabel();
        RadioButtonEditMemberPassive = new javax.swing.JRadioButton();
        RadioButtonEditMemberActive = new javax.swing.JRadioButton();
        LabelEditMemberMembershipType = new javax.swing.JLabel();
        LabelEditMemberActivityType = new javax.swing.JLabel();
        RadioButtonEditMemberBasic = new javax.swing.JRadioButton();
        RadioButtonEditMemberCompetitive = new javax.swing.JRadioButton();
        LabelEditMemberDisciplineType = new javax.swing.JLabel();
        RadioButtonEditMemberButterfly = new javax.swing.JRadioButton();
        RadioButtonEditMemberCrawl = new javax.swing.JRadioButton();
        RadioButtonEditMemberBackstroke = new javax.swing.JRadioButton();
        RadioButtonEditMemberBreaststroke = new javax.swing.JRadioButton();
        ButtonEditMemberConfirmEditChosenMember = new javax.swing.JButton();
        PanelDeleteMember = new javax.swing.JPanel();
        PanelDeleteMemberHeader = new javax.swing.JPanel();
        LabelDeleteMemberHome = new javax.swing.JLabel();
        LabelDeleteMemberHeader = new java.awt.Label();
        LabelDeleteMemberLogAsManager = new java.awt.Label();
        LabelDeleteMemberChooseMember = new javax.swing.JLabel();
        ButtonCancelDeleteMember = new javax.swing.JButton();
        ButtonOKChooseMemberToDelete = new javax.swing.JButton();
        ComboBoxChooseMemberToDelete = new javax.swing.JComboBox<>();
        PanelViewMembers = new javax.swing.JPanel();
        PanelViewMembersHeader = new javax.swing.JPanel();
        LabelViewMembersHome = new javax.swing.JLabel();
        LabelViewMembersHeader = new java.awt.Label();
        LabelViewMembersLogAsManager = new java.awt.Label();
        LabelViewMembersAllMembers = new javax.swing.JLabel();
        ButtonBackFromViewAllMembers = new javax.swing.JButton();
        textAreaAllMembers = new java.awt.TextArea();
        ButtonViewAllMembersAll = new javax.swing.JButton();
        ButtonViewAllMembersCompetitionMode = new javax.swing.JButton();
        PanelLoggedInAsCashier = new javax.swing.JPanel();
        PanelLoggedInAsCashierScreenHeader = new javax.swing.JPanel();
        LabelCashierScreenHome = new javax.swing.JLabel();
        LabelCashierScreenHeader = new java.awt.Label();
        ButtonRegisterPayment = new javax.swing.JButton();
        ButtonRevokePayment = new javax.swing.JButton();
        ButtonCheckMembersArrear = new javax.swing.JButton();
        ButtonAllArrears = new javax.swing.JButton();
        ButtonBackToMainMenuFromCashier = new javax.swing.JButton();
        PanelRegisterPayment = new javax.swing.JPanel();
        PanelRegisterPaymentHeader = new javax.swing.JPanel();
        LabelRegisterPaymentHome = new javax.swing.JLabel();
        LabelRegisterPaymentHeader = new java.awt.Label();
        LabelRegisterPaymentLogAsCashier = new java.awt.Label();
        LabelRegisterPaymentAllMembersIDName = new javax.swing.JLabel();
        ButtonBackFromRegisterPayment = new javax.swing.JButton();
        textAreaRegisterPaymentMemberList = new java.awt.TextArea();
        TextFieldRegisterPaymentID = new javax.swing.JTextField();
        LabelRegisterPaymentInsertID = new javax.swing.JLabel();
        LabelRegisterPaymentPaymentYear = new javax.swing.JLabel();
        TextFieldRegisterPaymentPaymentYear = new javax.swing.JTextField();
        LabelRegisterPaymentYearFormat = new javax.swing.JLabel();
        ButtonRegisterPaymentRegisterPayment = new javax.swing.JButton();
        PanelRevokePayment = new javax.swing.JPanel();
        PanelRevokePaymentHeader = new javax.swing.JPanel();
        LabelRevokePaymentHome = new javax.swing.JLabel();
        LabelRevokePaymentHeader = new java.awt.Label();
        LabelRevokePaymentLogAsCashier = new java.awt.Label();
        LabelRevokePaymentAllMembersIDName = new javax.swing.JLabel();
        ButtonBackFromRevokePayment = new javax.swing.JButton();
        textAreaRevokePaymentMemberList = new java.awt.TextArea();
        TextFieldRevokePaymentID = new javax.swing.JTextField();
        LabelRevokePaymentInsertID = new javax.swing.JLabel();
        LabelRevokePaymentPaymentYear = new javax.swing.JLabel();
        TextFieldRevokePaymentPaymentYear = new javax.swing.JTextField();
        LabelRevokePaymentYearFormat = new javax.swing.JLabel();
        ButtonRevokePaymentRevokePayment = new javax.swing.JButton();
        PanelSingleMemberArrear = new javax.swing.JPanel();
        PanelSingleMemberArrearHeader = new javax.swing.JPanel();
        LabelSingleMemberArrearHome = new javax.swing.JLabel();
        LabelSingleMemberArrearHeader = new java.awt.Label();
        LabelSingleMemberArrearLogAsCashier = new java.awt.Label();
        LabelSingleMemberArrearAllMembersIDName = new javax.swing.JLabel();
        ButtonBackFromSingleMemberArrear = new javax.swing.JButton();
        textAreaSingleMemberArrearMemberList = new java.awt.TextArea();
        TextFieldSingleMemberArrearID = new javax.swing.JTextField();
        LabelSingleMemberArrearInsertID = new javax.swing.JLabel();
        LabelSingleMemberArrearCurrentArrear = new javax.swing.JLabel();
        TextFieldSingleMemberArrearCurrentArrear = new javax.swing.JTextField();
        ButtonSingleMemberArrearShowArrear = new javax.swing.JButton();
        PanelShowAllArrears = new javax.swing.JPanel();
        PanelShowAllArrearsHeader = new javax.swing.JPanel();
        LabelShowAllArrearsHome = new javax.swing.JLabel();
        LabelShowAllArrearsHeader = new java.awt.Label();
        LabelShowAllArrearsLogAsCashier = new java.awt.Label();
        LabelShowAllArrearsAllArrears = new javax.swing.JLabel();
        ButtonBackFromShowAllArrears = new javax.swing.JButton();
        TextFieldTotalAmountArrears = new javax.swing.JTextField();
        LabelShowAllArrearsTotalAmount = new javax.swing.JLabel();
        textAreaShowAllArrearsMemberList = new java.awt.TextArea();
        LabelShowAllArrearsAllArrearMembers = new javax.swing.JLabel();
        PanelLoggedInAsTrainer = new javax.swing.JPanel();
        PanelLoggedInAsTrainerScreenHeader = new javax.swing.JPanel();
        LabelTrainerScreenHome = new javax.swing.JLabel();
        LabelTrainerScreenHeader = new java.awt.Label();
        ButtonAddTraining = new javax.swing.JButton();
        ButtonAddCompetitionResult = new javax.swing.JButton();
        ButtonSeeTopFive = new javax.swing.JButton();
        ButtonBackToMainMenuFromTrainer = new javax.swing.JButton();
        PanelAddTraining = new javax.swing.JPanel();
        PanelAddTrainingHeader = new javax.swing.JPanel();
        LabelAddTrainingHome = new javax.swing.JLabel();
        LabelAddTrainingHeader = new java.awt.Label();
        LabelAddTrainingLogAsTrainer = new java.awt.Label();
        LabelAddTrainingAllMembersIDName = new javax.swing.JLabel();
        ButtonBackFromAddTraining = new javax.swing.JButton();
        textAreaAddTrainingMemberList = new java.awt.TextArea();
        TextFieldAddTrainingID = new javax.swing.JTextField();
        LabelAddTrainingInsertID = new javax.swing.JLabel();
        LabelAddTrainingTrainingDate = new javax.swing.JLabel();
        TextFieldAddTrainingTrainingYear = new javax.swing.JTextField();
        ButtonAddTrainigAddTraining = new javax.swing.JButton();
        ComboBoxAddTrainingMonths = new javax.swing.JComboBox<>();
        TextFieldAddTrainingDateDay = new javax.swing.JTextField();
        LabelAddTrainingDisciplineType = new javax.swing.JLabel();
        RadioButtonAddTrainingButterfly = new javax.swing.JRadioButton();
        RadioButtonAddTrainingCrawl = new javax.swing.JRadioButton();
        RadioButtonAddTrainingBackstroke = new javax.swing.JRadioButton();
        RadioButtonAddTrainingBreaststroke = new javax.swing.JRadioButton();
        LabelAddTrainingDistance = new javax.swing.JLabel();
        RadioButtonAddTrainingDistance100 = new javax.swing.JRadioButton();
        RadioButtonAddTrainingDistance200 = new javax.swing.JRadioButton();
        RadioButtonAddTrainingDistance400 = new javax.swing.JRadioButton();
        LabelAddTrainingTrainingTime = new javax.swing.JLabel();
        TextFieldAddTrainingTrainingTime = new javax.swing.JTextField();
        PanelAddCompetitionResult = new javax.swing.JPanel();
        PanelAddCompetitionResultHeader = new javax.swing.JPanel();
        LabelAddCompetitionResultHome = new javax.swing.JLabel();
        LabelAddCompetitionResultHeader = new java.awt.Label();
        LabelAddCompetitionResultLogAsTrainer = new java.awt.Label();
        LabelAddCompetitionResultAllMembersIDName = new javax.swing.JLabel();
        ButtonBackFromAddCompetitionResult = new javax.swing.JButton();
        textAreaAddCompetitionResultMemberList = new java.awt.TextArea();
        TextFieldAddCompetitionResultID = new javax.swing.JTextField();
        LabelAddCompetitionResultInsertID = new javax.swing.JLabel();
        LabelAddCompetitionResultCompetitionDate = new javax.swing.JLabel();
        TextFieldAddCompetitionResultCompetitionYear = new javax.swing.JTextField();
        ButtonAddCompetitionResultAddCompetitionResult = new javax.swing.JButton();
        ComboBoxAddCompetitionResultMonths = new javax.swing.JComboBox<>();
        TextFieldAddCompetitionResultDateDay = new javax.swing.JTextField();
        LabelAddCompetitionResultDisciplineType = new javax.swing.JLabel();
        RadioButtonAddCompetitionResultButterfly = new javax.swing.JRadioButton();
        RadioButtonAddCompetitionResultCrawl = new javax.swing.JRadioButton();
        RadioButtonAddCompetitionResultBackstroke = new javax.swing.JRadioButton();
        RadioButtonAddCompetitionResultBreaststroke = new javax.swing.JRadioButton();
        LabelAddCompetitionResultDistance = new javax.swing.JLabel();
        RadioButtonAddCompetitionResultDistance100 = new javax.swing.JRadioButton();
        RadioButtonAddCompetitionResultDistance200 = new javax.swing.JRadioButton();
        RadioButtonAddCompetitionResultDistance400 = new javax.swing.JRadioButton();
        LabelAddCompetitionResultCompetitionTime = new javax.swing.JLabel();
        TextFieldAddCompetitionResultCompetitionTime = new javax.swing.JTextField();
        LabelAddCompetitionResultPlacement = new javax.swing.JLabel();
        LabelAddCompetitionResultEventName = new javax.swing.JLabel();
        TextFieldAddCompetitionResultPlacement = new javax.swing.JTextField();
        TextFieldAddCompetitionResultEventName = new javax.swing.JTextField();
        PanelViewTopFive = new javax.swing.JPanel();
        PanelViewTopFiveHeader = new javax.swing.JPanel();
        LabelViewTopFiveHome = new javax.swing.JLabel();
        LabelViewTopFiveHeader = new java.awt.Label();
        LabelViewTopFiveLogAsTrainer = new java.awt.Label();
        LabelViewTopFiveTopFiveMembers = new javax.swing.JLabel();
        ButtonBackFromViewTopFive = new javax.swing.JButton();
        textAreaViewTopFive = new java.awt.TextArea();
        ButtonViewTopFiveTraining = new javax.swing.JButton();
        ButtonViewTopFiveCompetition = new javax.swing.JButton();
        RadioButtonTopFiveBackstroke = new javax.swing.JRadioButton();
        RadioButtonTopFiveBreaststroke = new javax.swing.JRadioButton();
        LabelTopFiveDisciplineType = new javax.swing.JLabel();
        RadioButtonTopFiveButterfly = new javax.swing.JRadioButton();
        RadioButtonTopFiveCrawl = new javax.swing.JRadioButton();
        LabelTopFiveDistance = new javax.swing.JLabel();
        RadioButtonTopFiveDistance100 = new javax.swing.JRadioButton();
        RadioButtonTopFiveDistance200 = new javax.swing.JRadioButton();
        RadioButtonTopFiveDistance400 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DELPHI");

        PanelLoginScreen.setPreferredSize(new java.awt.Dimension(858, 457));

        PanelLoginScreenHeader.setBackground(new java.awt.Color(153, 153, 255));
        PanelLoginScreenHeader.setPreferredSize(new java.awt.Dimension(770, 96));

        LabelLoginScreenHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Home_50px.png"))); // NOI18N

        LabelLoginScreenHeader.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        LabelLoginScreenHeader.setForeground(new java.awt.Color(255, 255, 255));
        LabelLoginScreenHeader.setText("Login");

        javax.swing.GroupLayout PanelLoginScreenHeaderLayout = new javax.swing.GroupLayout(PanelLoginScreenHeader);
        PanelLoginScreenHeader.setLayout(PanelLoginScreenHeaderLayout);
        PanelLoginScreenHeaderLayout.setHorizontalGroup(
            PanelLoginScreenHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginScreenHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelLoginScreenHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelLoginScreenHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(719, Short.MAX_VALUE))
        );
        PanelLoginScreenHeaderLayout.setVerticalGroup(
            PanelLoginScreenHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginScreenHeaderLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(PanelLoginScreenHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginScreenHeaderLayout.createSequentialGroup()
                        .addComponent(LabelLoginScreenHome)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginScreenHeaderLayout.createSequentialGroup()
                        .addComponent(LabelLoginScreenHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );

        ButtonLoginAsManager.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        ButtonLoginAsManager.setText("Manager");
        ButtonLoginAsManager.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonLoginAsManagerActionPerformed(evt);
            }
        });

        ButtonLoginAsCashier.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        ButtonLoginAsCashier.setText("Cashier");
        ButtonLoginAsCashier.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonLoginAsCashierActionPerformed(evt);
            }
        });

        ButtonLoginAsTrainer.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        ButtonLoginAsTrainer.setText("Trainer");
        ButtonLoginAsTrainer.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonLoginAsTrainerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLoginScreenLayout = new javax.swing.GroupLayout(PanelLoginScreen);
        PanelLoginScreen.setLayout(PanelLoginScreenLayout);
        PanelLoginScreenLayout.setHorizontalGroup(
            PanelLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLoginScreenHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginScreenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonLoginAsTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonLoginAsCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonLoginAsManager))
                .addGap(379, 379, 379))
        );
        PanelLoginScreenLayout.setVerticalGroup(
            PanelLoginScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginScreenLayout.createSequentialGroup()
                .addComponent(PanelLoginScreenHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(ButtonLoginAsManager)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonLoginAsCashier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonLoginAsTrainer)
                .addGap(0, 177, Short.MAX_VALUE))
        );

        PanelLoggedInAsManager.setPreferredSize(new java.awt.Dimension(858, 457));

        PanelLoggedInAsManagerScreenHeader.setBackground(new java.awt.Color(153, 153, 255));

        LabeManagerScreenHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Home_50px.png"))); // NOI18N

        LabeManagerScreenHeader.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        LabeManagerScreenHeader.setForeground(new java.awt.Color(255, 255, 255));
        LabeManagerScreenHeader.setText("Logged in as Manager");

        javax.swing.GroupLayout PanelLoggedInAsManagerScreenHeaderLayout = new javax.swing.GroupLayout(PanelLoggedInAsManagerScreenHeader);
        PanelLoggedInAsManagerScreenHeader.setLayout(PanelLoggedInAsManagerScreenHeaderLayout);
        PanelLoggedInAsManagerScreenHeaderLayout.setHorizontalGroup(
            PanelLoggedInAsManagerScreenHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoggedInAsManagerScreenHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabeManagerScreenHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabeManagerScreenHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLoggedInAsManagerScreenHeaderLayout.setVerticalGroup(
            PanelLoggedInAsManagerScreenHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoggedInAsManagerScreenHeaderLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(PanelLoggedInAsManagerScreenHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoggedInAsManagerScreenHeaderLayout.createSequentialGroup()
                        .addComponent(LabeManagerScreenHome)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoggedInAsManagerScreenHeaderLayout.createSequentialGroup()
                        .addComponent(LabeManagerScreenHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );

        ButtonCreateNewMember.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        ButtonCreateNewMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Add_User_Group_Man_Man_26px.png"))); // NOI18N
        ButtonCreateNewMember.setText("New member   ");
        ButtonCreateNewMember.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonCreateNewMemberActionPerformed(evt);
            }
        });

        ButtonEditMember.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        ButtonEditMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Edit_26px.png"))); // NOI18N
        ButtonEditMember.setText("Edit member    ");
        ButtonEditMember.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonEditMemberActionPerformed(evt);
            }
        });

        ButtonDeleteMember.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        ButtonDeleteMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Remove_User_Group_Man_Man_26px.png"))); // NOI18N
        ButtonDeleteMember.setText("Delete member ");
        ButtonDeleteMember.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonDeleteMemberActionPerformed(evt);
            }
        });

        ButtonViewMembers.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        ButtonViewMembers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_User_Groups_26px.png"))); // NOI18N
        ButtonViewMembers.setText("View members ");
        ButtonViewMembers.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonViewMembersActionPerformed(evt);
            }
        });

        ButtonBackToMainMenu.setFont(new java.awt.Font("Iskoola Pota", 0, 12)); // NOI18N
        ButtonBackToMainMenu.setText("BACK TO MAIN MENU");
        ButtonBackToMainMenu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonBackToMainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLoggedInAsManagerLayout = new javax.swing.GroupLayout(PanelLoggedInAsManager);
        PanelLoggedInAsManager.setLayout(PanelLoggedInAsManagerLayout);
        PanelLoggedInAsManagerLayout.setHorizontalGroup(
            PanelLoggedInAsManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoggedInAsManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonBackToMainMenu)
                .addContainerGap(685, Short.MAX_VALUE))
            .addComponent(PanelLoggedInAsManagerScreenHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoggedInAsManagerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelLoggedInAsManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonCreateNewMember, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonViewMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDeleteMember)
                    .addComponent(ButtonEditMember, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(327, 327, 327))
        );
        PanelLoggedInAsManagerLayout.setVerticalGroup(
            PanelLoggedInAsManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoggedInAsManagerLayout.createSequentialGroup()
                .addComponent(PanelLoggedInAsManagerScreenHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(ButtonCreateNewMember)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonEditMember)
                .addGap(11, 11, 11)
                .addComponent(ButtonDeleteMember)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonViewMembers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(ButtonBackToMainMenu)
                .addContainerGap())
        );

        PanelCreateNewMember.setPreferredSize(new java.awt.Dimension(858, 457));

        PanelCreateNewMemberHeader.setBackground(new java.awt.Color(153, 153, 255));
        PanelCreateNewMemberHeader.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelCreateNewMemberHeader.setPreferredSize(new java.awt.Dimension(770, 96));

        LabelCreateNewMemberHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Add_User_Group_Man_Man_50px.png"))); // NOI18N

        LabelCreateNewMemberHeader.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        LabelCreateNewMemberHeader.setForeground(new java.awt.Color(255, 255, 255));
        LabelCreateNewMemberHeader.setText("New member");

        LabelCreateNewMemberLogAsManager.setFont(new java.awt.Font("Kartika", 1, 12)); // NOI18N
        LabelCreateNewMemberLogAsManager.setForeground(new java.awt.Color(0, 0, 0));
        LabelCreateNewMemberLogAsManager.setText("Logged in as Manager");

        javax.swing.GroupLayout PanelCreateNewMemberHeaderLayout = new javax.swing.GroupLayout(PanelCreateNewMemberHeader);
        PanelCreateNewMemberHeader.setLayout(PanelCreateNewMemberHeaderLayout);
        PanelCreateNewMemberHeaderLayout.setHorizontalGroup(
            PanelCreateNewMemberHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateNewMemberHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelCreateNewMemberHome)
                .addGroup(PanelCreateNewMemberHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCreateNewMemberHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelCreateNewMemberHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCreateNewMemberHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelCreateNewMemberLogAsManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        PanelCreateNewMemberHeaderLayout.setVerticalGroup(
            PanelCreateNewMemberHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateNewMemberHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCreateNewMemberHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCreateNewMemberHeaderLayout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(PanelCreateNewMemberHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCreateNewMemberHeaderLayout.createSequentialGroup()
                                .addComponent(LabelCreateNewMemberHome)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCreateNewMemberHeaderLayout.createSequentialGroup()
                                .addComponent(LabelCreateNewMemberHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(PanelCreateNewMemberHeaderLayout.createSequentialGroup()
                        .addComponent(LabelCreateNewMemberLogAsManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        ButtonCancelCreateNewMember.setFont(new java.awt.Font("Iskoola Pota", 0, 12)); // NOI18N
        ButtonCancelCreateNewMember.setText("CANCEL");
        ButtonCancelCreateNewMember.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonCancelCreateNewMemberActionPerformed(evt);
            }
        });

        LabelNewMemberName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNewMemberName.setText("Name:");

        LabelNewMemberBirthYear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNewMemberBirthYear.setText("Birth year:");

        TextFieldNewMemberName.setText("Enter name here");

        TextFieldNewMemberBirthYear.setText("Enter year here");

        LabelBirthYearFormat.setText("(YYYY)");

        RadioButtonNewMemberPassive.setText("Passive");
        RadioButtonNewMemberPassive.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RadioButtonNewMemberPassiveActionPerformed(evt);
            }
        });

        RadioButtonNewMemberActive.setText("Active");
        RadioButtonNewMemberActive.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RadioButtonNewMemberActiveActionPerformed(evt);
            }
        });

        LabelNewMemberMembershipType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNewMemberMembershipType.setText("Membership type:");

        LabelNewMemberActivityType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNewMemberActivityType.setText("Activity type:");

        RadioButtonNewMemberBasic.setText("Basic");
        RadioButtonNewMemberBasic.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RadioButtonNewMemberBasicActionPerformed(evt);
            }
        });

        RadioButtonNewMemberCompetitive.setText("Competitive");
        RadioButtonNewMemberCompetitive.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RadioButtonNewMemberCompetitiveActionPerformed(evt);
            }
        });

        LabelNewMemberDisciplineType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNewMemberDisciplineType.setText("Discipline type:");

        RadioButtonNewMemberButterfly.setText("Butterfly");

        RadioButtonNewMemberCrawl.setText("Crawl");

        RadioButtonNewMemberBackstroke.setText("Backstroke");

        RadioButtonNewMemberBreaststroke.setText("Breaststroke");

        ButtonNewMemberCreateMember.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        ButtonNewMemberCreateMember.setText("Create member");
        ButtonNewMemberCreateMember.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonNewMemberCreateMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCreateNewMemberLayout = new javax.swing.GroupLayout(PanelCreateNewMember);
        PanelCreateNewMember.setLayout(PanelCreateNewMemberLayout);
        PanelCreateNewMemberLayout.setHorizontalGroup(
            PanelCreateNewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateNewMemberLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(PanelCreateNewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelNewMemberBirthYear)
                    .addComponent(LabelNewMemberName)
                    .addComponent(LabelNewMemberMembershipType)
                    .addComponent(LabelNewMemberActivityType))
                .addGroup(PanelCreateNewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCreateNewMemberLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(TextFieldNewMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCreateNewMemberLayout.createSequentialGroup()
                        .addGroup(PanelCreateNewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelCreateNewMemberLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(PanelCreateNewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelCreateNewMemberLayout.createSequentialGroup()
                                        .addGroup(PanelCreateNewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextFieldNewMemberBirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(RadioButtonNewMemberBasic)
                                            .addComponent(RadioButtonNewMemberCompetitive))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE))
                                    .addGroup(PanelCreateNewMemberLayout.createSequentialGroup()
                                        .addGroup(PanelCreateNewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RadioButtonNewMemberActive)
                                            .addComponent(RadioButtonNewMemberPassive))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LabelNewMemberDisciplineType))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelCreateNewMemberLayout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(LabelBirthYearFormat)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(75, 75, 75)
                        .addGroup(PanelCreateNewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RadioButtonNewMemberCrawl)
                            .addComponent(RadioButtonNewMemberBreaststroke)
                            .addComponent(RadioButtonNewMemberButterfly)
                            .addComponent(RadioButtonNewMemberBackstroke))
                        .addGap(122, 122, 122))))
            .addGroup(PanelCreateNewMemberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonCancelCreateNewMember)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonNewMemberCreateMember)
                .addGap(18, 18, 18))
            .addComponent(PanelCreateNewMemberHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
        );
        PanelCreateNewMemberLayout.setVerticalGroup(
            PanelCreateNewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateNewMemberLayout.createSequentialGroup()
                .addComponent(PanelCreateNewMemberHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(PanelCreateNewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNewMemberName)
                    .addComponent(TextFieldNewMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCreateNewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldNewMemberBirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBirthYearFormat)
                    .addComponent(LabelNewMemberBirthYear))
                .addGroup(PanelCreateNewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCreateNewMemberLayout.createSequentialGroup()
                        .addGroup(PanelCreateNewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCreateNewMemberLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(LabelNewMemberMembershipType))
                            .addGroup(PanelCreateNewMemberLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(LabelNewMemberDisciplineType)))
                        .addGap(65, 65, 65)
                        .addComponent(LabelNewMemberActivityType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelCreateNewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonCancelCreateNewMember)
                            .addComponent(ButtonNewMemberCreateMember))
                        .addContainerGap())
                    .addGroup(PanelCreateNewMemberLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(PanelCreateNewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RadioButtonNewMemberButterfly)
                            .addComponent(RadioButtonNewMemberPassive))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelCreateNewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RadioButtonNewMemberActive)
                            .addComponent(RadioButtonNewMemberBackstroke))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioButtonNewMemberBreaststroke)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelCreateNewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RadioButtonNewMemberCrawl)
                            .addComponent(RadioButtonNewMemberBasic))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioButtonNewMemberCompetitive)
                        .addGap(33, 171, Short.MAX_VALUE))))
        );

        PanelEditMemberChooseMember.setPreferredSize(new java.awt.Dimension(858, 457));

        PanelEditMemberHeaderChoose.setBackground(new java.awt.Color(153, 153, 255));
        PanelEditMemberHeaderChoose.setPreferredSize(new java.awt.Dimension(770, 96));

        LabelEditMemberHomeChoose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Edit_50px.png"))); // NOI18N

        LabelEditMemberHeaderChoose.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        LabelEditMemberHeaderChoose.setForeground(new java.awt.Color(255, 255, 255));
        LabelEditMemberHeaderChoose.setText("Edit member");

        LabelEditMemberLogAsManagerChoose.setFont(new java.awt.Font("Kartika", 1, 12)); // NOI18N
        LabelEditMemberLogAsManagerChoose.setForeground(new java.awt.Color(0, 0, 0));
        LabelEditMemberLogAsManagerChoose.setText("Logged in as Manager");

        javax.swing.GroupLayout PanelEditMemberHeaderChooseLayout = new javax.swing.GroupLayout(PanelEditMemberHeaderChoose);
        PanelEditMemberHeaderChoose.setLayout(PanelEditMemberHeaderChooseLayout);
        PanelEditMemberHeaderChooseLayout.setHorizontalGroup(
            PanelEditMemberHeaderChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditMemberHeaderChooseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelEditMemberHomeChoose)
                .addGroup(PanelEditMemberHeaderChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditMemberHeaderChooseLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelEditMemberHeaderChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(641, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEditMemberHeaderChooseLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelEditMemberLogAsManagerChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        PanelEditMemberHeaderChooseLayout.setVerticalGroup(
            PanelEditMemberHeaderChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditMemberHeaderChooseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEditMemberHeaderChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditMemberHeaderChooseLayout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(PanelEditMemberHeaderChooseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEditMemberHeaderChooseLayout.createSequentialGroup()
                                .addComponent(LabelEditMemberHomeChoose)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEditMemberHeaderChooseLayout.createSequentialGroup()
                                .addComponent(LabelEditMemberHeaderChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(PanelEditMemberHeaderChooseLayout.createSequentialGroup()
                        .addComponent(LabelEditMemberLogAsManagerChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        LabelEditMemberChooseMember.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelEditMemberChooseMember.setText("Choose member");

        ButtonCancelEditMemberChoose.setFont(new java.awt.Font("Iskoola Pota", 0, 12)); // NOI18N
        ButtonCancelEditMemberChoose.setText("CANCEL");
        ButtonCancelEditMemberChoose.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonCancelEditMemberChooseActionPerformed(evt);
            }
        });

        ButtonOKChooseMemberToEdit.setText("OK");
        ButtonOKChooseMemberToEdit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonOKChooseMemberToEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelEditMemberChooseMemberLayout = new javax.swing.GroupLayout(PanelEditMemberChooseMember);
        PanelEditMemberChooseMember.setLayout(PanelEditMemberChooseMemberLayout);
        PanelEditMemberChooseMemberLayout.setHorizontalGroup(
            PanelEditMemberChooseMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelEditMemberHeaderChoose, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
            .addGroup(PanelEditMemberChooseMemberLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PanelEditMemberChooseMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonCancelEditMemberChoose)
                    .addGroup(PanelEditMemberChooseMemberLayout.createSequentialGroup()
                        .addComponent(ComboBoxChooseMemberToEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(ButtonOKChooseMemberToEdit))
                    .addComponent(LabelEditMemberChooseMember))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelEditMemberChooseMemberLayout.setVerticalGroup(
            PanelEditMemberChooseMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditMemberChooseMemberLayout.createSequentialGroup()
                .addComponent(PanelEditMemberHeaderChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelEditMemberChooseMember)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEditMemberChooseMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonOKChooseMemberToEdit)
                    .addComponent(ComboBoxChooseMemberToEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addComponent(ButtonCancelEditMemberChoose)
                .addContainerGap())
        );

        PanelEditMember.setPreferredSize(new java.awt.Dimension(858, 457));

        PanelEditMemberHeader.setBackground(new java.awt.Color(153, 153, 255));
        PanelEditMemberHeader.setPreferredSize(new java.awt.Dimension(770, 96));

        LabelEditMemberHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Edit_50px.png"))); // NOI18N

        LabelEditMemberHeader.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        LabelEditMemberHeader.setForeground(new java.awt.Color(255, 255, 255));
        LabelEditMemberHeader.setText("Edit member");

        LabelEditMemberLogAsManager.setFont(new java.awt.Font("Kartika", 1, 12)); // NOI18N
        LabelEditMemberLogAsManager.setForeground(new java.awt.Color(0, 0, 0));
        LabelEditMemberLogAsManager.setText("Logged in as Manager");

        javax.swing.GroupLayout PanelEditMemberHeaderLayout = new javax.swing.GroupLayout(PanelEditMemberHeader);
        PanelEditMemberHeader.setLayout(PanelEditMemberHeaderLayout);
        PanelEditMemberHeaderLayout.setHorizontalGroup(
            PanelEditMemberHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditMemberHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelEditMemberHome)
                .addGroup(PanelEditMemberHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditMemberHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelEditMemberHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(641, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEditMemberHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelEditMemberLogAsManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        PanelEditMemberHeaderLayout.setVerticalGroup(
            PanelEditMemberHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditMemberHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEditMemberHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditMemberHeaderLayout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(PanelEditMemberHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEditMemberHeaderLayout.createSequentialGroup()
                                .addComponent(LabelEditMemberHome)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEditMemberHeaderLayout.createSequentialGroup()
                                .addComponent(LabelEditMemberHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(PanelEditMemberHeaderLayout.createSequentialGroup()
                        .addComponent(LabelEditMemberLogAsManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        LabelNewMemberName1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNewMemberName1.setText("Name:");

        LabelNewMemberBirthYear1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelNewMemberBirthYear1.setText("Birth year:");

        ButtonCancelEditMember.setFont(new java.awt.Font("Iskoola Pota", 0, 12)); // NOI18N
        ButtonCancelEditMember.setText("CANCEL");
        ButtonCancelEditMember.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonCancelEditMemberActionPerformed(evt);
            }
        });

        TextFieldEditMemberName.setText("Enter name here");

        TextFieldEditMemberBirthYear.setText("Enter year here");

        LabelBirthYearFormatEditMember.setText("(YYYY)");

        RadioButtonEditMemberPassive.setText("Passive");
        RadioButtonEditMemberPassive.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RadioButtonEditMemberPassiveActionPerformed(evt);
            }
        });

        RadioButtonEditMemberActive.setText("Active");
        RadioButtonEditMemberActive.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RadioButtonEditMemberActiveActionPerformed(evt);
            }
        });

        LabelEditMemberMembershipType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelEditMemberMembershipType.setText("Membership type:");

        LabelEditMemberActivityType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelEditMemberActivityType.setText("Activity type:");

        RadioButtonEditMemberBasic.setText("Basic");
        RadioButtonEditMemberBasic.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RadioButtonEditMemberBasicActionPerformed(evt);
            }
        });

        RadioButtonEditMemberCompetitive.setText("Competitive");
        RadioButtonEditMemberCompetitive.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RadioButtonEditMemberCompetitiveActionPerformed(evt);
            }
        });

        LabelEditMemberDisciplineType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelEditMemberDisciplineType.setText("Discipline type:");

        RadioButtonEditMemberButterfly.setText("Butterfly");

        RadioButtonEditMemberCrawl.setText("Crawl");

        RadioButtonEditMemberBackstroke.setText("Backstroke");

        RadioButtonEditMemberBreaststroke.setText("Breaststroke");

        ButtonEditMemberConfirmEditChosenMember.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        ButtonEditMemberConfirmEditChosenMember.setText("Confirm edit");
        ButtonEditMemberConfirmEditChosenMember.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonEditMemberConfirmEditChosenMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelEditMemberLayout = new javax.swing.GroupLayout(PanelEditMember);
        PanelEditMember.setLayout(PanelEditMemberLayout);
        PanelEditMemberLayout.setHorizontalGroup(
            PanelEditMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelEditMemberHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(PanelEditMemberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEditMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditMemberLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(PanelEditMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelNewMemberBirthYear1)
                            .addComponent(LabelNewMemberName1)
                            .addComponent(LabelEditMemberMembershipType)
                            .addComponent(LabelEditMemberActivityType))
                        .addGroup(PanelEditMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelEditMemberLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(PanelEditMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextFieldEditMemberBirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RadioButtonEditMemberBasic)
                                    .addComponent(RadioButtonEditMemberCompetitive)
                                    .addComponent(TextFieldEditMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelEditMemberLayout.createSequentialGroup()
                                        .addGroup(PanelEditMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RadioButtonEditMemberActive)
                                            .addComponent(RadioButtonEditMemberPassive))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LabelEditMemberDisciplineType))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelEditMemberLayout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(LabelBirthYearFormatEditMember)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(75, 75, 75)
                        .addGroup(PanelEditMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RadioButtonEditMemberCrawl)
                            .addComponent(RadioButtonEditMemberBreaststroke)
                            .addComponent(RadioButtonEditMemberButterfly)
                            .addComponent(RadioButtonEditMemberBackstroke))
                        .addGap(104, 104, 104))
                    .addGroup(PanelEditMemberLayout.createSequentialGroup()
                        .addComponent(ButtonCancelEditMember)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonEditMemberConfirmEditChosenMember)))
                .addContainerGap())
        );
        PanelEditMemberLayout.setVerticalGroup(
            PanelEditMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditMemberLayout.createSequentialGroup()
                .addComponent(PanelEditMemberHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(PanelEditMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNewMemberName1)
                    .addComponent(TextFieldEditMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEditMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldEditMemberBirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBirthYearFormatEditMember)
                    .addComponent(LabelNewMemberBirthYear1))
                .addGroup(PanelEditMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditMemberLayout.createSequentialGroup()
                        .addGroup(PanelEditMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEditMemberLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(LabelEditMemberMembershipType))
                            .addGroup(PanelEditMemberLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(LabelEditMemberDisciplineType)))
                        .addGap(65, 65, 65)
                        .addComponent(LabelEditMemberActivityType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelEditMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonCancelEditMember)
                            .addComponent(ButtonEditMemberConfirmEditChosenMember)))
                    .addGroup(PanelEditMemberLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(PanelEditMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RadioButtonEditMemberButterfly)
                            .addComponent(RadioButtonEditMemberPassive))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelEditMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RadioButtonEditMemberActive)
                            .addComponent(RadioButtonEditMemberBackstroke))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioButtonEditMemberBreaststroke)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelEditMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RadioButtonEditMemberCrawl)
                            .addComponent(RadioButtonEditMemberBasic))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioButtonEditMemberCompetitive)
                        .addGap(75, 75, 75)))
                .addContainerGap())
        );

        PanelDeleteMember.setPreferredSize(new java.awt.Dimension(858, 457));

        PanelDeleteMemberHeader.setBackground(new java.awt.Color(153, 153, 255));
        PanelDeleteMemberHeader.setPreferredSize(new java.awt.Dimension(770, 96));

        LabelDeleteMemberHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Remove_User_Group_Man_Man_50px.png"))); // NOI18N

        LabelDeleteMemberHeader.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        LabelDeleteMemberHeader.setForeground(new java.awt.Color(255, 255, 255));
        LabelDeleteMemberHeader.setText("Delete member");

        LabelDeleteMemberLogAsManager.setFont(new java.awt.Font("Kartika", 1, 12)); // NOI18N
        LabelDeleteMemberLogAsManager.setForeground(new java.awt.Color(0, 0, 0));
        LabelDeleteMemberLogAsManager.setText("Logged in as Manager");

        javax.swing.GroupLayout PanelDeleteMemberHeaderLayout = new javax.swing.GroupLayout(PanelDeleteMemberHeader);
        PanelDeleteMemberHeader.setLayout(PanelDeleteMemberHeaderLayout);
        PanelDeleteMemberHeaderLayout.setHorizontalGroup(
            PanelDeleteMemberHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeleteMemberHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelDeleteMemberHome)
                .addGroup(PanelDeleteMemberHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeleteMemberHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelDeleteMemberHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(615, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeleteMemberHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelDeleteMemberLogAsManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        PanelDeleteMemberHeaderLayout.setVerticalGroup(
            PanelDeleteMemberHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeleteMemberHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDeleteMemberHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeleteMemberHeaderLayout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(PanelDeleteMemberHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeleteMemberHeaderLayout.createSequentialGroup()
                                .addComponent(LabelDeleteMemberHome)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeleteMemberHeaderLayout.createSequentialGroup()
                                .addComponent(LabelDeleteMemberHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(PanelDeleteMemberHeaderLayout.createSequentialGroup()
                        .addComponent(LabelDeleteMemberLogAsManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        LabelDeleteMemberChooseMember.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelDeleteMemberChooseMember.setText("Choose member");

        ButtonCancelDeleteMember.setFont(new java.awt.Font("Iskoola Pota", 0, 12)); // NOI18N
        ButtonCancelDeleteMember.setText("CANCEL");
        ButtonCancelDeleteMember.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonCancelDeleteMemberActionPerformed(evt);
            }
        });

        ButtonOKChooseMemberToDelete.setText("DELETE");
        ButtonOKChooseMemberToDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonOKChooseMemberToDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDeleteMemberLayout = new javax.swing.GroupLayout(PanelDeleteMember);
        PanelDeleteMember.setLayout(PanelDeleteMemberLayout);
        PanelDeleteMemberLayout.setHorizontalGroup(
            PanelDeleteMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDeleteMemberHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(PanelDeleteMemberLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PanelDeleteMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonCancelDeleteMember)
                    .addGroup(PanelDeleteMemberLayout.createSequentialGroup()
                        .addComponent(ComboBoxChooseMemberToDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(ButtonOKChooseMemberToDelete))
                    .addComponent(LabelDeleteMemberChooseMember))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        PanelDeleteMemberLayout.setVerticalGroup(
            PanelDeleteMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeleteMemberLayout.createSequentialGroup()
                .addComponent(PanelDeleteMemberHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelDeleteMemberChooseMember)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDeleteMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxChooseMemberToDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonOKChooseMemberToDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addComponent(ButtonCancelDeleteMember)
                .addContainerGap())
        );

        PanelViewMembers.setPreferredSize(new java.awt.Dimension(858, 457));

        PanelViewMembersHeader.setBackground(new java.awt.Color(153, 153, 255));
        PanelViewMembersHeader.setPreferredSize(new java.awt.Dimension(770, 96));

        LabelViewMembersHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_User_Groups_50px.png"))); // NOI18N

        LabelViewMembersHeader.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        LabelViewMembersHeader.setForeground(new java.awt.Color(255, 255, 255));
        LabelViewMembersHeader.setText("View members");

        LabelViewMembersLogAsManager.setFont(new java.awt.Font("Kartika", 1, 12)); // NOI18N
        LabelViewMembersLogAsManager.setForeground(new java.awt.Color(0, 0, 0));
        LabelViewMembersLogAsManager.setText("Logged in as Manager");

        javax.swing.GroupLayout PanelViewMembersHeaderLayout = new javax.swing.GroupLayout(PanelViewMembersHeader);
        PanelViewMembersHeader.setLayout(PanelViewMembersHeaderLayout);
        PanelViewMembersHeaderLayout.setHorizontalGroup(
            PanelViewMembersHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewMembersHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelViewMembersHome)
                .addGroup(PanelViewMembersHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelViewMembersHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelViewMembersHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(628, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelViewMembersHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelViewMembersLogAsManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        PanelViewMembersHeaderLayout.setVerticalGroup(
            PanelViewMembersHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewMembersHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelViewMembersHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelViewMembersHeaderLayout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(PanelViewMembersHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelViewMembersHeaderLayout.createSequentialGroup()
                                .addComponent(LabelViewMembersHome)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelViewMembersHeaderLayout.createSequentialGroup()
                                .addComponent(LabelViewMembersHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(PanelViewMembersHeaderLayout.createSequentialGroup()
                        .addComponent(LabelViewMembersLogAsManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        LabelViewMembersAllMembers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelViewMembersAllMembers.setText("All members");

        ButtonBackFromViewAllMembers.setFont(new java.awt.Font("Iskoola Pota", 0, 12)); // NOI18N
        ButtonBackFromViewAllMembers.setText("BACK");
        ButtonBackFromViewAllMembers.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonBackFromViewAllMembersActionPerformed(evt);
            }
        });

        textAreaAllMembers.setEditable(false);

        ButtonViewAllMembersAll.setText("All");
        ButtonViewAllMembersAll.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonViewAllMembersAllActionPerformed(evt);
            }
        });

        ButtonViewAllMembersCompetitionMode.setText("Only competitive");
        ButtonViewAllMembersCompetitionMode.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonViewAllMembersCompetitionModeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelViewMembersLayout = new javax.swing.GroupLayout(PanelViewMembers);
        PanelViewMembers.setLayout(PanelViewMembersLayout);
        PanelViewMembersLayout.setHorizontalGroup(
            PanelViewMembersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelViewMembersHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(PanelViewMembersLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PanelViewMembersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelViewMembersLayout.createSequentialGroup()
                        .addComponent(LabelViewMembersAllMembers)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelViewMembersLayout.createSequentialGroup()
                        .addComponent(ButtonBackFromViewAllMembers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonViewAllMembersAll)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonViewAllMembersCompetitionMode)
                        .addGap(43, 43, 43))))
            .addGroup(PanelViewMembersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textAreaAllMembers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelViewMembersLayout.setVerticalGroup(
            PanelViewMembersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewMembersLayout.createSequentialGroup()
                .addComponent(PanelViewMembersHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelViewMembersAllMembers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textAreaAllMembers, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelViewMembersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonBackFromViewAllMembers)
                    .addComponent(ButtonViewAllMembersAll)
                    .addComponent(ButtonViewAllMembersCompetitionMode))
                .addContainerGap())
        );

        PanelLoggedInAsCashier.setPreferredSize(new java.awt.Dimension(858, 457));

        PanelLoggedInAsCashierScreenHeader.setBackground(new java.awt.Color(153, 153, 255));
        PanelLoggedInAsCashierScreenHeader.setPreferredSize(new java.awt.Dimension(770, 96));

        LabelCashierScreenHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Cash_Counter_50px.png"))); // NOI18N

        LabelCashierScreenHeader.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        LabelCashierScreenHeader.setForeground(new java.awt.Color(255, 255, 255));
        LabelCashierScreenHeader.setText("Logged in as Cashier");

        javax.swing.GroupLayout PanelLoggedInAsCashierScreenHeaderLayout = new javax.swing.GroupLayout(PanelLoggedInAsCashierScreenHeader);
        PanelLoggedInAsCashierScreenHeader.setLayout(PanelLoggedInAsCashierScreenHeaderLayout);
        PanelLoggedInAsCashierScreenHeaderLayout.setHorizontalGroup(
            PanelLoggedInAsCashierScreenHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoggedInAsCashierScreenHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelCashierScreenHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelCashierScreenHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(524, Short.MAX_VALUE))
        );
        PanelLoggedInAsCashierScreenHeaderLayout.setVerticalGroup(
            PanelLoggedInAsCashierScreenHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoggedInAsCashierScreenHeaderLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(PanelLoggedInAsCashierScreenHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoggedInAsCashierScreenHeaderLayout.createSequentialGroup()
                        .addComponent(LabelCashierScreenHome)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoggedInAsCashierScreenHeaderLayout.createSequentialGroup()
                        .addComponent(LabelCashierScreenHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );

        ButtonRegisterPayment.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        ButtonRegisterPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Request_Money_26px.png"))); // NOI18N
        ButtonRegisterPayment.setText("Register payment    ");
        ButtonRegisterPayment.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonRegisterPaymentActionPerformed(evt);
            }
        });

        ButtonRevokePayment.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        ButtonRevokePayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Delete_Document_26px.png"))); // NOI18N
        ButtonRevokePayment.setText("Revoke payment     ");
        ButtonRevokePayment.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonRevokePaymentActionPerformed(evt);
            }
        });

        ButtonCheckMembersArrear.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        ButtonCheckMembersArrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Payment_History_26px_1.png"))); // NOI18N
        ButtonCheckMembersArrear.setText("Check member's arrear");
        ButtonCheckMembersArrear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonCheckMembersArrearActionPerformed(evt);
            }
        });

        ButtonAllArrears.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        ButtonAllArrears.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Stocks_26px.png"))); // NOI18N
        ButtonAllArrears.setText("Show all arrears    ");
        ButtonAllArrears.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonAllArrearsActionPerformed(evt);
            }
        });

        ButtonBackToMainMenuFromCashier.setFont(new java.awt.Font("Iskoola Pota", 0, 12)); // NOI18N
        ButtonBackToMainMenuFromCashier.setText("BACK TO MAIN MENU");
        ButtonBackToMainMenuFromCashier.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonBackToMainMenuFromCashierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLoggedInAsCashierLayout = new javax.swing.GroupLayout(PanelLoggedInAsCashier);
        PanelLoggedInAsCashier.setLayout(PanelLoggedInAsCashierLayout);
        PanelLoggedInAsCashierLayout.setHorizontalGroup(
            PanelLoggedInAsCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLoggedInAsCashierScreenHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
            .addGroup(PanelLoggedInAsCashierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonBackToMainMenuFromCashier)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoggedInAsCashierLayout.createSequentialGroup()
                .addContainerGap(294, Short.MAX_VALUE)
                .addGroup(PanelLoggedInAsCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonCheckMembersArrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonRegisterPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonAllArrears, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonRevokePayment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(333, 333, 333))
        );
        PanelLoggedInAsCashierLayout.setVerticalGroup(
            PanelLoggedInAsCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoggedInAsCashierLayout.createSequentialGroup()
                .addComponent(PanelLoggedInAsCashierScreenHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(ButtonRegisterPayment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonRevokePayment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonCheckMembersArrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonAllArrears)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(ButtonBackToMainMenuFromCashier)
                .addContainerGap())
        );

        PanelRegisterPayment.setPreferredSize(new java.awt.Dimension(858, 457));

        PanelRegisterPaymentHeader.setBackground(new java.awt.Color(153, 153, 255));
        PanelRegisterPaymentHeader.setPreferredSize(new java.awt.Dimension(770, 96));

        LabelRegisterPaymentHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Request_Money_50px.png"))); // NOI18N

        LabelRegisterPaymentHeader.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        LabelRegisterPaymentHeader.setForeground(new java.awt.Color(255, 255, 255));
        LabelRegisterPaymentHeader.setText("Register payment");

        LabelRegisterPaymentLogAsCashier.setFont(new java.awt.Font("Kartika", 1, 12)); // NOI18N
        LabelRegisterPaymentLogAsCashier.setForeground(new java.awt.Color(0, 0, 0));
        LabelRegisterPaymentLogAsCashier.setText("Logged in as Cashier");

        javax.swing.GroupLayout PanelRegisterPaymentHeaderLayout = new javax.swing.GroupLayout(PanelRegisterPaymentHeader);
        PanelRegisterPaymentHeader.setLayout(PanelRegisterPaymentHeaderLayout);
        PanelRegisterPaymentHeaderLayout.setHorizontalGroup(
            PanelRegisterPaymentHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegisterPaymentHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelRegisterPaymentHome)
                .addGroup(PanelRegisterPaymentHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegisterPaymentHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelRegisterPaymentHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(576, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegisterPaymentHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelRegisterPaymentLogAsCashier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        PanelRegisterPaymentHeaderLayout.setVerticalGroup(
            PanelRegisterPaymentHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegisterPaymentHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelRegisterPaymentHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegisterPaymentHeaderLayout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(PanelRegisterPaymentHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegisterPaymentHeaderLayout.createSequentialGroup()
                                .addComponent(LabelRegisterPaymentHome)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegisterPaymentHeaderLayout.createSequentialGroup()
                                .addComponent(LabelRegisterPaymentHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(PanelRegisterPaymentHeaderLayout.createSequentialGroup()
                        .addComponent(LabelRegisterPaymentLogAsCashier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        LabelRegisterPaymentAllMembersIDName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelRegisterPaymentAllMembersIDName.setText("All members");

        ButtonBackFromRegisterPayment.setFont(new java.awt.Font("Iskoola Pota", 0, 12)); // NOI18N
        ButtonBackFromRegisterPayment.setText("BACK");
        ButtonBackFromRegisterPayment.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonBackFromRegisterPaymentActionPerformed(evt);
            }
        });

        textAreaRegisterPaymentMemberList.setEditable(false);

        TextFieldRegisterPaymentID.setText("ID");

        LabelRegisterPaymentInsertID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelRegisterPaymentInsertID.setText("ID");

        LabelRegisterPaymentPaymentYear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelRegisterPaymentPaymentYear.setText("Payment year");

        TextFieldRegisterPaymentPaymentYear.setText("(YYYY)");

        LabelRegisterPaymentYearFormat.setText("(YYYY)");

        ButtonRegisterPaymentRegisterPayment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonRegisterPaymentRegisterPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Add_20px.png"))); // NOI18N
        ButtonRegisterPaymentRegisterPayment.setText("Register payment   ");
        ButtonRegisterPaymentRegisterPayment.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonRegisterPaymentRegisterPaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelRegisterPaymentLayout = new javax.swing.GroupLayout(PanelRegisterPayment);
        PanelRegisterPayment.setLayout(PanelRegisterPaymentLayout);
        PanelRegisterPaymentLayout.setHorizontalGroup(
            PanelRegisterPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegisterPaymentHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
            .addGroup(PanelRegisterPaymentLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(ButtonBackFromRegisterPayment)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegisterPaymentLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PanelRegisterPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelRegisterPaymentInsertID)
                    .addComponent(TextFieldRegisterPaymentID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelRegisterPaymentPaymentYear)
                    .addGroup(PanelRegisterPaymentLayout.createSequentialGroup()
                        .addComponent(TextFieldRegisterPaymentPaymentYear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(LabelRegisterPaymentYearFormat))
                    .addComponent(ButtonRegisterPaymentRegisterPayment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelRegisterPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelRegisterPaymentAllMembersIDName)
                    .addComponent(textAreaRegisterPaymentMemberList, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
        PanelRegisterPaymentLayout.setVerticalGroup(
            PanelRegisterPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegisterPaymentLayout.createSequentialGroup()
                .addComponent(PanelRegisterPaymentHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelRegisterPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelRegisterPaymentAllMembersIDName)
                    .addComponent(LabelRegisterPaymentInsertID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRegisterPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegisterPaymentLayout.createSequentialGroup()
                        .addComponent(textAreaRegisterPaymentMemberList, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonBackFromRegisterPayment))
                    .addGroup(PanelRegisterPaymentLayout.createSequentialGroup()
                        .addComponent(TextFieldRegisterPaymentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabelRegisterPaymentPaymentYear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelRegisterPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldRegisterPaymentPaymentYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelRegisterPaymentYearFormat))
                        .addGap(30, 30, 30)
                        .addComponent(ButtonRegisterPaymentRegisterPayment)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        PanelRevokePayment.setPreferredSize(new java.awt.Dimension(858, 457));

        PanelRevokePaymentHeader.setBackground(new java.awt.Color(153, 153, 255));
        PanelRevokePaymentHeader.setPreferredSize(new java.awt.Dimension(770, 96));

        LabelRevokePaymentHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Delete_Document_50px.png"))); // NOI18N

        LabelRevokePaymentHeader.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        LabelRevokePaymentHeader.setForeground(new java.awt.Color(255, 255, 255));
        LabelRevokePaymentHeader.setText("Revoke payment");

        LabelRevokePaymentLogAsCashier.setFont(new java.awt.Font("Kartika", 1, 12)); // NOI18N
        LabelRevokePaymentLogAsCashier.setForeground(new java.awt.Color(0, 0, 0));
        LabelRevokePaymentLogAsCashier.setText("Logged in as Cashier");

        javax.swing.GroupLayout PanelRevokePaymentHeaderLayout = new javax.swing.GroupLayout(PanelRevokePaymentHeader);
        PanelRevokePaymentHeader.setLayout(PanelRevokePaymentHeaderLayout);
        PanelRevokePaymentHeaderLayout.setHorizontalGroup(
            PanelRevokePaymentHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRevokePaymentHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelRevokePaymentHome)
                .addGroup(PanelRevokePaymentHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRevokePaymentHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelRevokePaymentHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(602, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRevokePaymentHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelRevokePaymentLogAsCashier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        PanelRevokePaymentHeaderLayout.setVerticalGroup(
            PanelRevokePaymentHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRevokePaymentHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelRevokePaymentHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRevokePaymentHeaderLayout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(PanelRevokePaymentHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRevokePaymentHeaderLayout.createSequentialGroup()
                                .addComponent(LabelRevokePaymentHome)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRevokePaymentHeaderLayout.createSequentialGroup()
                                .addComponent(LabelRevokePaymentHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(PanelRevokePaymentHeaderLayout.createSequentialGroup()
                        .addComponent(LabelRevokePaymentLogAsCashier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        LabelRevokePaymentAllMembersIDName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelRevokePaymentAllMembersIDName.setText("All members");

        ButtonBackFromRevokePayment.setFont(new java.awt.Font("Iskoola Pota", 0, 12)); // NOI18N
        ButtonBackFromRevokePayment.setText("BACK");
        ButtonBackFromRevokePayment.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonBackFromRevokePaymentActionPerformed(evt);
            }
        });

        textAreaRevokePaymentMemberList.setEditable(false);

        TextFieldRevokePaymentID.setText("ID");

        LabelRevokePaymentInsertID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelRevokePaymentInsertID.setText("ID");

        LabelRevokePaymentPaymentYear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelRevokePaymentPaymentYear.setText("Payment year");

        TextFieldRevokePaymentPaymentYear.setText("(YYYY)");

        LabelRevokePaymentYearFormat.setText("(YYYY)");

        ButtonRevokePaymentRevokePayment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonRevokePaymentRevokePayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Minus_20px.png"))); // NOI18N
        ButtonRevokePaymentRevokePayment.setText("Revoke payment   ");
        ButtonRevokePaymentRevokePayment.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonRevokePaymentRevokePaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelRevokePaymentLayout = new javax.swing.GroupLayout(PanelRevokePayment);
        PanelRevokePayment.setLayout(PanelRevokePaymentLayout);
        PanelRevokePaymentLayout.setHorizontalGroup(
            PanelRevokePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRevokePaymentHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
            .addGroup(PanelRevokePaymentLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(ButtonBackFromRevokePayment)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRevokePaymentLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PanelRevokePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelRevokePaymentInsertID)
                    .addComponent(TextFieldRevokePaymentID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelRevokePaymentPaymentYear)
                    .addGroup(PanelRevokePaymentLayout.createSequentialGroup()
                        .addComponent(TextFieldRevokePaymentPaymentYear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(LabelRevokePaymentYearFormat))
                    .addComponent(ButtonRevokePaymentRevokePayment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelRevokePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelRevokePaymentAllMembersIDName)
                    .addComponent(textAreaRevokePaymentMemberList, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
        PanelRevokePaymentLayout.setVerticalGroup(
            PanelRevokePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRevokePaymentLayout.createSequentialGroup()
                .addComponent(PanelRevokePaymentHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelRevokePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelRevokePaymentAllMembersIDName)
                    .addComponent(LabelRevokePaymentInsertID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRevokePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRevokePaymentLayout.createSequentialGroup()
                        .addComponent(textAreaRevokePaymentMemberList, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonBackFromRevokePayment))
                    .addGroup(PanelRevokePaymentLayout.createSequentialGroup()
                        .addComponent(TextFieldRevokePaymentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabelRevokePaymentPaymentYear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelRevokePaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldRevokePaymentPaymentYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelRevokePaymentYearFormat))
                        .addGap(30, 30, 30)
                        .addComponent(ButtonRevokePaymentRevokePayment)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        PanelSingleMemberArrear.setPreferredSize(new java.awt.Dimension(858, 457));

        PanelSingleMemberArrearHeader.setBackground(new java.awt.Color(153, 153, 255));
        PanelSingleMemberArrearHeader.setPreferredSize(new java.awt.Dimension(770, 96));

        LabelSingleMemberArrearHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Payment_History_50px.png"))); // NOI18N

        LabelSingleMemberArrearHeader.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        LabelSingleMemberArrearHeader.setForeground(new java.awt.Color(255, 255, 255));
        LabelSingleMemberArrearHeader.setText("Single member arrear");

        LabelSingleMemberArrearLogAsCashier.setFont(new java.awt.Font("Kartika", 1, 12)); // NOI18N
        LabelSingleMemberArrearLogAsCashier.setForeground(new java.awt.Color(0, 0, 0));
        LabelSingleMemberArrearLogAsCashier.setText("Logged in as Cashier");

        javax.swing.GroupLayout PanelSingleMemberArrearHeaderLayout = new javax.swing.GroupLayout(PanelSingleMemberArrearHeader);
        PanelSingleMemberArrearHeader.setLayout(PanelSingleMemberArrearHeaderLayout);
        PanelSingleMemberArrearHeaderLayout.setHorizontalGroup(
            PanelSingleMemberArrearHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSingleMemberArrearHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelSingleMemberArrearHome)
                .addGroup(PanelSingleMemberArrearHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSingleMemberArrearHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelSingleMemberArrearHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(524, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSingleMemberArrearHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelSingleMemberArrearLogAsCashier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        PanelSingleMemberArrearHeaderLayout.setVerticalGroup(
            PanelSingleMemberArrearHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSingleMemberArrearHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelSingleMemberArrearHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSingleMemberArrearHeaderLayout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(PanelSingleMemberArrearHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSingleMemberArrearHeaderLayout.createSequentialGroup()
                                .addComponent(LabelSingleMemberArrearHome)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSingleMemberArrearHeaderLayout.createSequentialGroup()
                                .addComponent(LabelSingleMemberArrearHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(PanelSingleMemberArrearHeaderLayout.createSequentialGroup()
                        .addComponent(LabelSingleMemberArrearLogAsCashier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        LabelSingleMemberArrearAllMembersIDName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelSingleMemberArrearAllMembersIDName.setText("All members");

        ButtonBackFromSingleMemberArrear.setFont(new java.awt.Font("Iskoola Pota", 0, 12)); // NOI18N
        ButtonBackFromSingleMemberArrear.setText("BACK");
        ButtonBackFromSingleMemberArrear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonBackFromSingleMemberArrearActionPerformed(evt);
            }
        });

        textAreaSingleMemberArrearMemberList.setEditable(false);

        TextFieldSingleMemberArrearID.setText("ID");

        LabelSingleMemberArrearInsertID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelSingleMemberArrearInsertID.setText("ID");

        LabelSingleMemberArrearCurrentArrear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelSingleMemberArrearCurrentArrear.setText("Current arrear");

        TextFieldSingleMemberArrearCurrentArrear.setEditable(false);
        TextFieldSingleMemberArrearCurrentArrear.setText("€");

        ButtonSingleMemberArrearShowArrear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonSingleMemberArrearShowArrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Stack_of_Money_20px.png"))); // NOI18N
        ButtonSingleMemberArrearShowArrear.setText("Show arrear   ");
        ButtonSingleMemberArrearShowArrear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonSingleMemberArrearShowArrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelSingleMemberArrearLayout = new javax.swing.GroupLayout(PanelSingleMemberArrear);
        PanelSingleMemberArrear.setLayout(PanelSingleMemberArrearLayout);
        PanelSingleMemberArrearLayout.setHorizontalGroup(
            PanelSingleMemberArrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelSingleMemberArrearHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
            .addGroup(PanelSingleMemberArrearLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(ButtonBackFromSingleMemberArrear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSingleMemberArrearLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PanelSingleMemberArrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelSingleMemberArrearInsertID)
                    .addComponent(TextFieldSingleMemberArrearID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSingleMemberArrearCurrentArrear)
                    .addComponent(TextFieldSingleMemberArrearCurrentArrear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSingleMemberArrearShowArrear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelSingleMemberArrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelSingleMemberArrearAllMembersIDName)
                    .addComponent(textAreaSingleMemberArrearMemberList, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
        PanelSingleMemberArrearLayout.setVerticalGroup(
            PanelSingleMemberArrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSingleMemberArrearLayout.createSequentialGroup()
                .addComponent(PanelSingleMemberArrearHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelSingleMemberArrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSingleMemberArrearAllMembersIDName)
                    .addComponent(LabelSingleMemberArrearInsertID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelSingleMemberArrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSingleMemberArrearLayout.createSequentialGroup()
                        .addComponent(textAreaSingleMemberArrearMemberList, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonBackFromSingleMemberArrear))
                    .addGroup(PanelSingleMemberArrearLayout.createSequentialGroup()
                        .addComponent(TextFieldSingleMemberArrearID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabelSingleMemberArrearCurrentArrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextFieldSingleMemberArrearCurrentArrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(ButtonSingleMemberArrearShowArrear)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        PanelShowAllArrears.setPreferredSize(new java.awt.Dimension(858, 457));

        PanelShowAllArrearsHeader.setBackground(new java.awt.Color(153, 153, 255));
        PanelShowAllArrearsHeader.setPreferredSize(new java.awt.Dimension(770, 96));

        LabelShowAllArrearsHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Stocks_50px.png"))); // NOI18N

        LabelShowAllArrearsHeader.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        LabelShowAllArrearsHeader.setForeground(new java.awt.Color(255, 255, 255));
        LabelShowAllArrearsHeader.setText("All arrears");

        LabelShowAllArrearsLogAsCashier.setFont(new java.awt.Font("Kartika", 1, 12)); // NOI18N
        LabelShowAllArrearsLogAsCashier.setForeground(new java.awt.Color(0, 0, 0));
        LabelShowAllArrearsLogAsCashier.setText("Logged in as Cashier");

        javax.swing.GroupLayout PanelShowAllArrearsHeaderLayout = new javax.swing.GroupLayout(PanelShowAllArrearsHeader);
        PanelShowAllArrearsHeader.setLayout(PanelShowAllArrearsHeaderLayout);
        PanelShowAllArrearsHeaderLayout.setHorizontalGroup(
            PanelShowAllArrearsHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelShowAllArrearsHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelShowAllArrearsHome)
                .addGroup(PanelShowAllArrearsHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelShowAllArrearsHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelShowAllArrearsHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(641, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelShowAllArrearsHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelShowAllArrearsLogAsCashier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        PanelShowAllArrearsHeaderLayout.setVerticalGroup(
            PanelShowAllArrearsHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelShowAllArrearsHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelShowAllArrearsHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelShowAllArrearsHeaderLayout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(PanelShowAllArrearsHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelShowAllArrearsHeaderLayout.createSequentialGroup()
                                .addComponent(LabelShowAllArrearsHome)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelShowAllArrearsHeaderLayout.createSequentialGroup()
                                .addComponent(LabelShowAllArrearsHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(PanelShowAllArrearsHeaderLayout.createSequentialGroup()
                        .addComponent(LabelShowAllArrearsLogAsCashier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        LabelShowAllArrearsAllArrears.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelShowAllArrearsAllArrears.setText("All arrears");

        ButtonBackFromShowAllArrears.setFont(new java.awt.Font("Iskoola Pota", 0, 12)); // NOI18N
        ButtonBackFromShowAllArrears.setText("BACK");
        ButtonBackFromShowAllArrears.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonBackFromShowAllArrearsActionPerformed(evt);
            }
        });

        TextFieldTotalAmountArrears.setEditable(false);
        TextFieldTotalAmountArrears.setText("Total");

        LabelShowAllArrearsTotalAmount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelShowAllArrearsTotalAmount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Money_24px.png"))); // NOI18N
        LabelShowAllArrearsTotalAmount.setText("Total amount");

        textAreaShowAllArrearsMemberList.setEditable(false);

        LabelShowAllArrearsAllArrearMembers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelShowAllArrearsAllArrearMembers.setText("All members in arrear");

        javax.swing.GroupLayout PanelShowAllArrearsLayout = new javax.swing.GroupLayout(PanelShowAllArrears);
        PanelShowAllArrears.setLayout(PanelShowAllArrearsLayout);
        PanelShowAllArrearsLayout.setHorizontalGroup(
            PanelShowAllArrearsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelShowAllArrearsHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(PanelShowAllArrearsLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PanelShowAllArrearsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonBackFromShowAllArrears)
                    .addComponent(LabelShowAllArrearsAllArrears)
                    .addComponent(LabelShowAllArrearsTotalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextFieldTotalAmountArrears))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelShowAllArrearsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textAreaShowAllArrearsMemberList, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelShowAllArrearsAllArrearMembers))
                .addGap(84, 84, 84))
        );
        PanelShowAllArrearsLayout.setVerticalGroup(
            PanelShowAllArrearsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelShowAllArrearsLayout.createSequentialGroup()
                .addComponent(PanelShowAllArrearsHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelShowAllArrearsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelShowAllArrearsAllArrears)
                    .addComponent(LabelShowAllArrearsAllArrearMembers))
                .addGap(23, 23, 23)
                .addGroup(PanelShowAllArrearsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelShowAllArrearsLayout.createSequentialGroup()
                        .addComponent(LabelShowAllArrearsTotalAmount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldTotalAmountArrears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonBackFromShowAllArrears))
                    .addComponent(textAreaShowAllArrearsMemberList, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                .addContainerGap())
        );

        PanelLoggedInAsTrainer.setPreferredSize(new java.awt.Dimension(858, 457));

        PanelLoggedInAsTrainerScreenHeader.setBackground(new java.awt.Color(153, 153, 255));

        LabelTrainerScreenHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Home_50px.png"))); // NOI18N

        LabelTrainerScreenHeader.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        LabelTrainerScreenHeader.setForeground(new java.awt.Color(255, 255, 255));
        LabelTrainerScreenHeader.setText("Logged in as Trainer");

        javax.swing.GroupLayout PanelLoggedInAsTrainerScreenHeaderLayout = new javax.swing.GroupLayout(PanelLoggedInAsTrainerScreenHeader);
        PanelLoggedInAsTrainerScreenHeader.setLayout(PanelLoggedInAsTrainerScreenHeaderLayout);
        PanelLoggedInAsTrainerScreenHeaderLayout.setHorizontalGroup(
            PanelLoggedInAsTrainerScreenHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoggedInAsTrainerScreenHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTrainerScreenHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelTrainerScreenHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLoggedInAsTrainerScreenHeaderLayout.setVerticalGroup(
            PanelLoggedInAsTrainerScreenHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoggedInAsTrainerScreenHeaderLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(PanelLoggedInAsTrainerScreenHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoggedInAsTrainerScreenHeaderLayout.createSequentialGroup()
                        .addComponent(LabelTrainerScreenHome)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoggedInAsTrainerScreenHeaderLayout.createSequentialGroup()
                        .addComponent(LabelTrainerScreenHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );

        ButtonAddTraining.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        ButtonAddTraining.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Add_List_26px.png"))); // NOI18N
        ButtonAddTraining.setText("Add training  ");
        ButtonAddTraining.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonAddTrainingActionPerformed(evt);
            }
        });

        ButtonAddCompetitionResult.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        ButtonAddCompetitionResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Trophy_26px_1.png"))); // NOI18N
        ButtonAddCompetitionResult.setText("Add competition results");
        ButtonAddCompetitionResult.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonAddCompetitionResultActionPerformed(evt);
            }
        });

        ButtonSeeTopFive.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        ButtonSeeTopFive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Leaderboard_26px.png"))); // NOI18N
        ButtonSeeTopFive.setText("View top 5    ");
        ButtonSeeTopFive.setActionCommand("View top 5");
        ButtonSeeTopFive.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonSeeTopFiveActionPerformed(evt);
            }
        });

        ButtonBackToMainMenuFromTrainer.setFont(new java.awt.Font("Iskoola Pota", 0, 12)); // NOI18N
        ButtonBackToMainMenuFromTrainer.setText("BACK TO MAIN MENU");
        ButtonBackToMainMenuFromTrainer.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonBackToMainMenuFromTrainerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLoggedInAsTrainerLayout = new javax.swing.GroupLayout(PanelLoggedInAsTrainer);
        PanelLoggedInAsTrainer.setLayout(PanelLoggedInAsTrainerLayout);
        PanelLoggedInAsTrainerLayout.setHorizontalGroup(
            PanelLoggedInAsTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoggedInAsTrainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonBackToMainMenuFromTrainer)
                .addContainerGap(685, Short.MAX_VALUE))
            .addComponent(PanelLoggedInAsTrainerScreenHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelLoggedInAsTrainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelLoggedInAsTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonSeeTopFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonAddCompetitionResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonAddTraining, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLoggedInAsTrainerLayout.setVerticalGroup(
            PanelLoggedInAsTrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoggedInAsTrainerLayout.createSequentialGroup()
                .addComponent(PanelLoggedInAsTrainerScreenHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(ButtonAddTraining)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonAddCompetitionResult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonSeeTopFive)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(ButtonBackToMainMenuFromTrainer)
                .addContainerGap())
        );

        PanelAddTraining.setPreferredSize(new java.awt.Dimension(858, 457));

        PanelAddTrainingHeader.setBackground(new java.awt.Color(153, 153, 255));
        PanelAddTrainingHeader.setPreferredSize(new java.awt.Dimension(770, 96));

        LabelAddTrainingHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Add_List_50px.png"))); // NOI18N

        LabelAddTrainingHeader.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        LabelAddTrainingHeader.setForeground(new java.awt.Color(255, 255, 255));
        LabelAddTrainingHeader.setText("Add training");

        LabelAddTrainingLogAsTrainer.setFont(new java.awt.Font("Kartika", 1, 12)); // NOI18N
        LabelAddTrainingLogAsTrainer.setForeground(new java.awt.Color(0, 0, 0));
        LabelAddTrainingLogAsTrainer.setText("Logged in as Trainer");

        javax.swing.GroupLayout PanelAddTrainingHeaderLayout = new javax.swing.GroupLayout(PanelAddTrainingHeader);
        PanelAddTrainingHeader.setLayout(PanelAddTrainingHeaderLayout);
        PanelAddTrainingHeaderLayout.setHorizontalGroup(
            PanelAddTrainingHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddTrainingHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelAddTrainingHome)
                .addGroup(PanelAddTrainingHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAddTrainingHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelAddTrainingHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(628, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAddTrainingHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelAddTrainingLogAsTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        PanelAddTrainingHeaderLayout.setVerticalGroup(
            PanelAddTrainingHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddTrainingHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAddTrainingHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAddTrainingHeaderLayout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(PanelAddTrainingHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAddTrainingHeaderLayout.createSequentialGroup()
                                .addComponent(LabelAddTrainingHome)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAddTrainingHeaderLayout.createSequentialGroup()
                                .addComponent(LabelAddTrainingHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(PanelAddTrainingHeaderLayout.createSequentialGroup()
                        .addComponent(LabelAddTrainingLogAsTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        LabelAddTrainingAllMembersIDName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelAddTrainingAllMembersIDName.setText("All members");

        ButtonBackFromAddTraining.setFont(new java.awt.Font("Iskoola Pota", 0, 12)); // NOI18N
        ButtonBackFromAddTraining.setText("BACK");
        ButtonBackFromAddTraining.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonBackFromAddTrainingActionPerformed(evt);
            }
        });

        textAreaAddTrainingMemberList.setEditable(false);

        TextFieldAddTrainingID.setText("ID");

        LabelAddTrainingInsertID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelAddTrainingInsertID.setText("ID");

        LabelAddTrainingTrainingDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelAddTrainingTrainingDate.setText("Training date");

        TextFieldAddTrainingTrainingYear.setText("(YYYY)");

        ButtonAddTrainigAddTraining.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonAddTrainigAddTraining.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Add_20px.png"))); // NOI18N
        ButtonAddTrainigAddTraining.setText("Add training   ");
        ButtonAddTrainigAddTraining.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonAddTrainigAddTrainingActionPerformed(evt);
            }
        });

        ComboBoxAddTrainingMonths.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" }));

        TextFieldAddTrainingDateDay.setText("(DD)");

        LabelAddTrainingDisciplineType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelAddTrainingDisciplineType.setText("Discipline type:");

        RadioButtonAddTrainingButterfly.setText("Butterfly");

        RadioButtonAddTrainingCrawl.setText("Crawl");

        RadioButtonAddTrainingBackstroke.setText("Backstroke");

        RadioButtonAddTrainingBreaststroke.setText("Breaststroke");

        LabelAddTrainingDistance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelAddTrainingDistance.setText("Distance:");

        RadioButtonAddTrainingDistance100.setText("100 m");

        RadioButtonAddTrainingDistance200.setText("200 m");

        RadioButtonAddTrainingDistance400.setText("400 m");

        LabelAddTrainingTrainingTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelAddTrainingTrainingTime.setText("Time:");

        TextFieldAddTrainingTrainingTime.setText("Seconds");

        javax.swing.GroupLayout PanelAddTrainingLayout = new javax.swing.GroupLayout(PanelAddTraining);
        PanelAddTraining.setLayout(PanelAddTrainingLayout);
        PanelAddTrainingLayout.setHorizontalGroup(
            PanelAddTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAddTrainingHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
            .addGroup(PanelAddTrainingLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PanelAddTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAddTrainingLayout.createSequentialGroup()
                        .addGroup(PanelAddTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldAddTrainingID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelAddTrainingTrainingDate)
                            .addGroup(PanelAddTrainingLayout.createSequentialGroup()
                                .addComponent(TextFieldAddTrainingTrainingYear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxAddTrainingMonths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextFieldAddTrainingDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LabelAddTrainingInsertID)
                            .addComponent(ButtonAddTrainigAddTraining)
                            .addGroup(PanelAddTrainingLayout.createSequentialGroup()
                                .addGroup(PanelAddTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(PanelAddTrainingLayout.createSequentialGroup()
                                        .addComponent(LabelAddTrainingTrainingTime)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TextFieldAddTrainingTrainingTime))
                                    .addComponent(LabelAddTrainingDisciplineType))
                                .addGap(18, 18, 18)
                                .addGroup(PanelAddTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RadioButtonAddTrainingCrawl)
                                    .addGroup(PanelAddTrainingLayout.createSequentialGroup()
                                        .addGroup(PanelAddTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelAddTrainingLayout.createSequentialGroup()
                                                .addGroup(PanelAddTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(RadioButtonAddTrainingButterfly)
                                                    .addComponent(RadioButtonAddTrainingBackstroke))
                                                .addGap(18, 18, 18)
                                                .addComponent(LabelAddTrainingDistance))
                                            .addComponent(RadioButtonAddTrainingBreaststroke))
                                        .addGap(18, 18, 18)
                                        .addGroup(PanelAddTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RadioButtonAddTrainingDistance400)
                                            .addComponent(RadioButtonAddTrainingDistance100)
                                            .addComponent(RadioButtonAddTrainingDistance200))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelAddTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textAreaAddTrainingMemberList, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelAddTrainingAllMembersIDName)))
                    .addGroup(PanelAddTrainingLayout.createSequentialGroup()
                        .addComponent(ButtonBackFromAddTraining)
                        .addContainerGap())))
        );
        PanelAddTrainingLayout.setVerticalGroup(
            PanelAddTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddTrainingLayout.createSequentialGroup()
                .addComponent(PanelAddTrainingHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelAddTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelAddTrainingAllMembersIDName)
                    .addComponent(LabelAddTrainingInsertID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAddTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAddTrainingLayout.createSequentialGroup()
                        .addComponent(textAreaAddTrainingMemberList, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(PanelAddTrainingLayout.createSequentialGroup()
                        .addComponent(TextFieldAddTrainingID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabelAddTrainingTrainingDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelAddTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldAddTrainingTrainingYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxAddTrainingMonths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldAddTrainingDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelAddTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAddTrainingLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(LabelAddTrainingDisciplineType))
                            .addGroup(PanelAddTrainingLayout.createSequentialGroup()
                                .addGroup(PanelAddTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelAddTrainingLayout.createSequentialGroup()
                                        .addComponent(RadioButtonAddTrainingButterfly)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RadioButtonAddTrainingBackstroke))
                                    .addGroup(PanelAddTrainingLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(LabelAddTrainingDistance))
                                    .addGroup(PanelAddTrainingLayout.createSequentialGroup()
                                        .addComponent(RadioButtonAddTrainingDistance100)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RadioButtonAddTrainingDistance200)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelAddTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RadioButtonAddTrainingBreaststroke)
                                    .addComponent(RadioButtonAddTrainingDistance400))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RadioButtonAddTrainingCrawl)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelAddTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelAddTrainingTrainingTime)
                            .addComponent(TextFieldAddTrainingTrainingTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonAddTrainigAddTraining)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(ButtonBackFromAddTraining)
                .addContainerGap())
        );

        PanelAddCompetitionResult.setPreferredSize(new java.awt.Dimension(858, 457));

        PanelAddCompetitionResultHeader.setBackground(new java.awt.Color(153, 153, 255));
        PanelAddCompetitionResultHeader.setPreferredSize(new java.awt.Dimension(770, 96));

        LabelAddCompetitionResultHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Trophy_50px.png"))); // NOI18N

        LabelAddCompetitionResultHeader.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        LabelAddCompetitionResultHeader.setForeground(new java.awt.Color(255, 255, 255));
        LabelAddCompetitionResultHeader.setText("Add competition result");

        LabelAddCompetitionResultLogAsTrainer.setFont(new java.awt.Font("Kartika", 1, 12)); // NOI18N
        LabelAddCompetitionResultLogAsTrainer.setForeground(new java.awt.Color(0, 0, 0));
        LabelAddCompetitionResultLogAsTrainer.setText("Logged in as Trainer");

        javax.swing.GroupLayout PanelAddCompetitionResultHeaderLayout = new javax.swing.GroupLayout(PanelAddCompetitionResultHeader);
        PanelAddCompetitionResultHeader.setLayout(PanelAddCompetitionResultHeaderLayout);
        PanelAddCompetitionResultHeaderLayout.setHorizontalGroup(
            PanelAddCompetitionResultHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddCompetitionResultHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelAddCompetitionResultHome)
                .addGroup(PanelAddCompetitionResultHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAddCompetitionResultHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelAddCompetitionResultHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(498, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAddCompetitionResultHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelAddCompetitionResultLogAsTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        PanelAddCompetitionResultHeaderLayout.setVerticalGroup(
            PanelAddCompetitionResultHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddCompetitionResultHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAddCompetitionResultHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAddCompetitionResultHeaderLayout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(PanelAddCompetitionResultHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAddCompetitionResultHeaderLayout.createSequentialGroup()
                                .addComponent(LabelAddCompetitionResultHome)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAddCompetitionResultHeaderLayout.createSequentialGroup()
                                .addComponent(LabelAddCompetitionResultHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(PanelAddCompetitionResultHeaderLayout.createSequentialGroup()
                        .addComponent(LabelAddCompetitionResultLogAsTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        LabelAddCompetitionResultAllMembersIDName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelAddCompetitionResultAllMembersIDName.setText("All members");

        ButtonBackFromAddCompetitionResult.setFont(new java.awt.Font("Iskoola Pota", 0, 12)); // NOI18N
        ButtonBackFromAddCompetitionResult.setText("BACK");
        ButtonBackFromAddCompetitionResult.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonBackFromAddCompetitionResultActionPerformed(evt);
            }
        });

        textAreaAddCompetitionResultMemberList.setEditable(false);

        TextFieldAddCompetitionResultID.setText("ID");

        LabelAddCompetitionResultInsertID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelAddCompetitionResultInsertID.setText("ID");

        LabelAddCompetitionResultCompetitionDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelAddCompetitionResultCompetitionDate.setText("Competition date");

        TextFieldAddCompetitionResultCompetitionYear.setText("(YYYY)");

        ButtonAddCompetitionResultAddCompetitionResult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonAddCompetitionResultAddCompetitionResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Add_20px.png"))); // NOI18N
        ButtonAddCompetitionResultAddCompetitionResult.setText("Add competition result ");
        ButtonAddCompetitionResultAddCompetitionResult.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonAddCompetitionResultAddCompetitionResultActionPerformed(evt);
            }
        });

        ComboBoxAddCompetitionResultMonths.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" }));

        TextFieldAddCompetitionResultDateDay.setText("(DD)");

        LabelAddCompetitionResultDisciplineType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelAddCompetitionResultDisciplineType.setText("Discipline type:");

        RadioButtonAddCompetitionResultButterfly.setText("Butterfly");

        RadioButtonAddCompetitionResultCrawl.setText("Crawl");

        RadioButtonAddCompetitionResultBackstroke.setText("Backstroke");

        RadioButtonAddCompetitionResultBreaststroke.setText("Breaststroke");

        LabelAddCompetitionResultDistance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelAddCompetitionResultDistance.setText("Distance:");

        RadioButtonAddCompetitionResultDistance100.setText("100 m");

        RadioButtonAddCompetitionResultDistance200.setText("200 m");

        RadioButtonAddCompetitionResultDistance400.setText("400 m");

        LabelAddCompetitionResultCompetitionTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelAddCompetitionResultCompetitionTime.setText("Time:");

        TextFieldAddCompetitionResultCompetitionTime.setText("Seconds");

        LabelAddCompetitionResultPlacement.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelAddCompetitionResultPlacement.setText("Placement");

        LabelAddCompetitionResultEventName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelAddCompetitionResultEventName.setText("Event name");

        TextFieldAddCompetitionResultPlacement.setText("#");

        TextFieldAddCompetitionResultEventName.setText("Name");

        javax.swing.GroupLayout PanelAddCompetitionResultLayout = new javax.swing.GroupLayout(PanelAddCompetitionResult);
        PanelAddCompetitionResult.setLayout(PanelAddCompetitionResultLayout);
        PanelAddCompetitionResultLayout.setHorizontalGroup(
            PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAddCompetitionResultHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
            .addGroup(PanelAddCompetitionResultLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAddCompetitionResultLayout.createSequentialGroup()
                        .addGroup(PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonAddCompetitionResultAddCompetitionResult)
                            .addGroup(PanelAddCompetitionResultLayout.createSequentialGroup()
                                .addGroup(PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(PanelAddCompetitionResultLayout.createSequentialGroup()
                                        .addComponent(LabelAddCompetitionResultCompetitionTime)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TextFieldAddCompetitionResultCompetitionTime))
                                    .addComponent(LabelAddCompetitionResultDisciplineType))
                                .addGap(18, 18, 18)
                                .addGroup(PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RadioButtonAddCompetitionResultCrawl)
                                    .addGroup(PanelAddCompetitionResultLayout.createSequentialGroup()
                                        .addGroup(PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelAddCompetitionResultLayout.createSequentialGroup()
                                                .addGroup(PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(RadioButtonAddCompetitionResultButterfly)
                                                    .addComponent(RadioButtonAddCompetitionResultBackstroke))
                                                .addGap(18, 18, 18)
                                                .addComponent(LabelAddCompetitionResultDistance))
                                            .addComponent(RadioButtonAddCompetitionResultBreaststroke))
                                        .addGap(18, 18, 18)
                                        .addGroup(PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RadioButtonAddCompetitionResultDistance400)
                                            .addComponent(RadioButtonAddCompetitionResultDistance100)
                                            .addComponent(RadioButtonAddCompetitionResultDistance200)))))
                            .addGroup(PanelAddCompetitionResultLayout.createSequentialGroup()
                                .addGroup(PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelAddCompetitionResultCompetitionDate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelAddCompetitionResultLayout.createSequentialGroup()
                                        .addComponent(TextFieldAddCompetitionResultCompetitionYear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboBoxAddCompetitionResultMonths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addComponent(TextFieldAddCompetitionResultDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelAddCompetitionResultLayout.createSequentialGroup()
                                .addGroup(PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelAddCompetitionResultLayout.createSequentialGroup()
                                        .addComponent(LabelAddCompetitionResultInsertID)
                                        .addGap(48, 48, 48)
                                        .addComponent(LabelAddCompetitionResultPlacement))
                                    .addGroup(PanelAddCompetitionResultLayout.createSequentialGroup()
                                        .addComponent(TextFieldAddCompetitionResultID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TextFieldAddCompetitionResultPlacement, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(42, 42, 42)
                                .addGroup(PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelAddCompetitionResultEventName)
                                    .addComponent(TextFieldAddCompetitionResultEventName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textAreaAddCompetitionResultMemberList, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelAddCompetitionResultAllMembersIDName)))
                    .addGroup(PanelAddCompetitionResultLayout.createSequentialGroup()
                        .addComponent(ButtonBackFromAddCompetitionResult)
                        .addContainerGap())))
        );
        PanelAddCompetitionResultLayout.setVerticalGroup(
            PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddCompetitionResultLayout.createSequentialGroup()
                .addComponent(PanelAddCompetitionResultHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelAddCompetitionResultAllMembersIDName)
                    .addComponent(LabelAddCompetitionResultInsertID)
                    .addComponent(LabelAddCompetitionResultPlacement)
                    .addComponent(LabelAddCompetitionResultEventName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAddCompetitionResultLayout.createSequentialGroup()
                        .addComponent(textAreaAddCompetitionResultMemberList, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(PanelAddCompetitionResultLayout.createSequentialGroup()
                        .addGroup(PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldAddCompetitionResultID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldAddCompetitionResultPlacement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldAddCompetitionResultEventName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(LabelAddCompetitionResultCompetitionDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldAddCompetitionResultCompetitionYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxAddCompetitionResultMonths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldAddCompetitionResultDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAddCompetitionResultLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(LabelAddCompetitionResultDisciplineType))
                            .addGroup(PanelAddCompetitionResultLayout.createSequentialGroup()
                                .addGroup(PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelAddCompetitionResultLayout.createSequentialGroup()
                                        .addComponent(RadioButtonAddCompetitionResultButterfly)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RadioButtonAddCompetitionResultBackstroke))
                                    .addGroup(PanelAddCompetitionResultLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(LabelAddCompetitionResultDistance))
                                    .addGroup(PanelAddCompetitionResultLayout.createSequentialGroup()
                                        .addComponent(RadioButtonAddCompetitionResultDistance100)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RadioButtonAddCompetitionResultDistance200)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RadioButtonAddCompetitionResultBreaststroke)
                                    .addComponent(RadioButtonAddCompetitionResultDistance400))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RadioButtonAddCompetitionResultCrawl)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelAddCompetitionResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelAddCompetitionResultCompetitionTime)
                            .addComponent(TextFieldAddCompetitionResultCompetitionTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonAddCompetitionResultAddCompetitionResult)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(ButtonBackFromAddCompetitionResult)
                .addContainerGap())
        );

        PanelViewTopFive.setPreferredSize(new java.awt.Dimension(858, 457));

        PanelViewTopFiveHeader.setBackground(new java.awt.Color(153, 153, 255));
        PanelViewTopFiveHeader.setPreferredSize(new java.awt.Dimension(770, 96));

        LabelViewTopFiveHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIImages/icons8_Leaderboard_50px.png"))); // NOI18N

        LabelViewTopFiveHeader.setFont(new java.awt.Font("GungsuhChe", 1, 24)); // NOI18N
        LabelViewTopFiveHeader.setForeground(new java.awt.Color(255, 255, 255));
        LabelViewTopFiveHeader.setText("View top 5 members");

        LabelViewTopFiveLogAsTrainer.setFont(new java.awt.Font("Kartika", 1, 12)); // NOI18N
        LabelViewTopFiveLogAsTrainer.setForeground(new java.awt.Color(0, 0, 0));
        LabelViewTopFiveLogAsTrainer.setText("Logged in as Trainer");

        javax.swing.GroupLayout PanelViewTopFiveHeaderLayout = new javax.swing.GroupLayout(PanelViewTopFiveHeader);
        PanelViewTopFiveHeader.setLayout(PanelViewTopFiveHeaderLayout);
        PanelViewTopFiveHeaderLayout.setHorizontalGroup(
            PanelViewTopFiveHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewTopFiveHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelViewTopFiveHome)
                .addGroup(PanelViewTopFiveHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelViewTopFiveHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelViewTopFiveHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(550, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelViewTopFiveHeaderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelViewTopFiveLogAsTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        PanelViewTopFiveHeaderLayout.setVerticalGroup(
            PanelViewTopFiveHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewTopFiveHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelViewTopFiveHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelViewTopFiveHeaderLayout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(PanelViewTopFiveHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelViewTopFiveHeaderLayout.createSequentialGroup()
                                .addComponent(LabelViewTopFiveHome)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelViewTopFiveHeaderLayout.createSequentialGroup()
                                .addComponent(LabelViewTopFiveHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(PanelViewTopFiveHeaderLayout.createSequentialGroup()
                        .addComponent(LabelViewTopFiveLogAsTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        LabelViewTopFiveTopFiveMembers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelViewTopFiveTopFiveMembers.setText("Top 5 members");

        ButtonBackFromViewTopFive.setFont(new java.awt.Font("Iskoola Pota", 0, 12)); // NOI18N
        ButtonBackFromViewTopFive.setText("BACK");
        ButtonBackFromViewTopFive.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonBackFromViewTopFiveActionPerformed(evt);
            }
        });

        textAreaViewTopFive.setEditable(false);

        ButtonViewTopFiveTraining.setText("Top 5 training");
        ButtonViewTopFiveTraining.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonViewTopFiveTrainingActionPerformed(evt);
            }
        });

        ButtonViewTopFiveCompetition.setText("Top 5 competition");
        ButtonViewTopFiveCompetition.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonViewTopFiveCompetitionActionPerformed(evt);
            }
        });

        RadioButtonTopFiveBackstroke.setText("Backstroke");

        RadioButtonTopFiveBreaststroke.setText("Breaststroke");

        LabelTopFiveDisciplineType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelTopFiveDisciplineType.setText("Discipline type:");

        RadioButtonTopFiveButterfly.setText("Butterfly");

        RadioButtonTopFiveCrawl.setText("Crawl");

        LabelTopFiveDistance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LabelTopFiveDistance.setText("Distance:");

        RadioButtonTopFiveDistance100.setText("100 m");

        RadioButtonTopFiveDistance200.setText("200 m");

        RadioButtonTopFiveDistance400.setText("400 m");

        javax.swing.GroupLayout PanelViewTopFiveLayout = new javax.swing.GroupLayout(PanelViewTopFive);
        PanelViewTopFive.setLayout(PanelViewTopFiveLayout);
        PanelViewTopFiveLayout.setHorizontalGroup(
            PanelViewTopFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelViewTopFiveHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
            .addGroup(PanelViewTopFiveLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(ButtonBackFromViewTopFive)
                .addGap(43, 760, Short.MAX_VALUE))
            .addGroup(PanelViewTopFiveLayout.createSequentialGroup()
                .addGroup(PanelViewTopFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelViewTopFiveLayout.createSequentialGroup()
                        .addGroup(PanelViewTopFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelViewTopFiveLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ButtonViewTopFiveTraining))
                            .addGroup(PanelViewTopFiveLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(PanelViewTopFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelTopFiveDisciplineType)
                                    .addComponent(LabelTopFiveDistance))))
                        .addGap(18, 18, 18)
                        .addGroup(PanelViewTopFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RadioButtonTopFiveDistance400)
                            .addComponent(RadioButtonTopFiveDistance100)
                            .addComponent(RadioButtonTopFiveDistance200)
                            .addComponent(RadioButtonTopFiveCrawl)
                            .addComponent(RadioButtonTopFiveButterfly)
                            .addComponent(RadioButtonTopFiveBackstroke)
                            .addComponent(RadioButtonTopFiveBreaststroke)))
                    .addGroup(PanelViewTopFiveLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(ButtonViewTopFiveCompetition)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelViewTopFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelViewTopFiveTopFiveMembers)
                    .addComponent(textAreaViewTopFive, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PanelViewTopFiveLayout.setVerticalGroup(
            PanelViewTopFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelViewTopFiveLayout.createSequentialGroup()
                .addComponent(PanelViewTopFiveHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelViewTopFiveTopFiveMembers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelViewTopFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textAreaViewTopFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelViewTopFiveLayout.createSequentialGroup()
                        .addGroup(PanelViewTopFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelViewTopFiveLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(LabelTopFiveDisciplineType))
                            .addGroup(PanelViewTopFiveLayout.createSequentialGroup()
                                .addComponent(RadioButtonTopFiveButterfly)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RadioButtonTopFiveBackstroke)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RadioButtonTopFiveBreaststroke)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RadioButtonTopFiveCrawl)))
                        .addGap(18, 18, 18)
                        .addGroup(PanelViewTopFiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelViewTopFiveLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(LabelTopFiveDistance))
                            .addGroup(PanelViewTopFiveLayout.createSequentialGroup()
                                .addComponent(RadioButtonTopFiveDistance100)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RadioButtonTopFiveDistance200)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioButtonTopFiveDistance400)
                        .addGap(19, 19, 19)
                        .addComponent(ButtonViewTopFiveTraining)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonViewTopFiveCompetition)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonBackFromViewTopFive)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLoginScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelLoggedInAsManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelCreateNewMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelEditMemberChooseMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelEditMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(20, 20, 20)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelDeleteMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(20, 20, 20)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(PanelViewMembers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelLoggedInAsCashier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelRegisterPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelRevokePayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelSingleMemberArrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(30, 30, 30)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelShowAllArrears, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(20, 20, 20)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelLoggedInAsTrainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelAddTraining, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(52, 52, 52)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelAddCompetitionResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(52, 52, 52)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelViewTopFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(94, 94, 94)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelLoginScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(PanelLoggedInAsManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelCreateNewMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelEditMemberChooseMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelEditMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(13, 13, 13)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelDeleteMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(14, 14, 14)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(PanelViewMembers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(4, 4, 4)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelLoggedInAsCashier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(56, 56, 56)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelRegisterPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(56, 56, 56)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelRevokePayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(56, 56, 56)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelSingleMemberArrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(57, 57, 57)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelShowAllArrears, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(57, 57, 57)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelLoggedInAsTrainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(11, 11, 11)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelAddTraining, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(65, 65, 65)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelAddCompetitionResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(66, 66, 66)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelViewTopFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(74, 74, 74)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCreateNewMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreateNewMemberActionPerformed
        PanelCreateNewMember.setVisible(true);
        PanelLoggedInAsManager.setVisible(false);
    }//GEN-LAST:event_ButtonCreateNewMemberActionPerformed

    private void ButtonBackToMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackToMainMenuActionPerformed
        PanelLoginScreen.setVisible(true);
        PanelLoggedInAsManager.setVisible(false);
    }//GEN-LAST:event_ButtonBackToMainMenuActionPerformed

    private void ButtonCancelCreateNewMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelCreateNewMemberActionPerformed
        PanelLoggedInAsManager.setVisible(true);
        PanelCreateNewMember.setVisible(false);
        //Clearing selection
        buttonGroupCreateMemberActivityType.clearSelection();
        buttonGroupCreateMemberPassiveActive.clearSelection();
        this.RadioButtonNewMemberBackstroke.setSelected(false);
        this.RadioButtonNewMemberBreaststroke.setSelected(false);
        this.RadioButtonNewMemberButterfly.setSelected(false);
        this.RadioButtonNewMemberCrawl.setSelected(false);
        //Disabling Radio Buttons
        this.RadioButtonNewMemberBackstroke.setEnabled(false);
        this.RadioButtonNewMemberBreaststroke.setEnabled(false);
        this.RadioButtonNewMemberButterfly.setEnabled(false);
        this.RadioButtonNewMemberCrawl.setEnabled(false);
        this.RadioButtonNewMemberBasic.setEnabled(false);
        this.RadioButtonNewMemberCompetitive.setEnabled(false);
        //Removing values from textfields
        this.TextFieldNewMemberName.setText("Enter name here");
        this.TextFieldNewMemberBirthYear.setText("Enter year here");
    }//GEN-LAST:event_ButtonCancelCreateNewMemberActionPerformed

    private void ButtonNewMemberCreateMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNewMemberCreateMemberActionPerformed
        /*
        Pre-creating values used in the actual creation of the new member
        */
        JFrame frame = new JFrame("Message");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String name = "";
        Year birthyear = null;
        MembershipType membershipType = MembershipType.PASSIVE;
        ActivityType activityType = ActivityType.BASIC;
        ArrayList <DisciplineType> disciplineList = new ArrayList();
        /*
        Changing values to the actual values chosen by the user
        */
        //Selecting birthyear based on user input
        try
        {
            birthyear = Year.parse(this.TextFieldNewMemberBirthYear.getText());
        }
        catch (DateTimeException dx)
        {
            System.out.println("Invalid value for birthyear");
            this.TextFieldNewMemberBirthYear.setText("! Enter valid year !");
        }
        //Selecting name based on user input
        try
        {
            name = this.TextFieldNewMemberName.getText();
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("Invalid value for name");
            this.TextFieldNewMemberName.setText("Invalid name");
        }
        //Selecting membership type based on user input
        if (this.RadioButtonNewMemberActive.isSelected())
        {
            membershipType = MembershipType.ACTIVE;
        }
        //Selecting activity type and disciplines based on user input
        if (this.RadioButtonNewMemberCompetitive.isEnabled() && this.RadioButtonNewMemberCompetitive.isSelected())
        {
            activityType = ActivityType.COMPETITIVE;
            if (this.RadioButtonNewMemberBackstroke.isSelected())
            {
                disciplineList.add(DisciplineType.BACKSTROKE);
            }
            if (this.RadioButtonNewMemberBreaststroke.isSelected())
            {
                disciplineList.add(DisciplineType.BREASTSTROKE);
            }
            if (this.RadioButtonNewMemberButterfly.isSelected())
            {
                disciplineList.add(DisciplineType.BUTTERFLY);
            }
            if (this.RadioButtonNewMemberCrawl.isSelected())
            {
                disciplineList.add(DisciplineType.CRAWL);
            }
        }
        //Guard checking if competitive member actually has a discipline
        if (this.RadioButtonNewMemberCompetitive.isSelected())
        {
            if (disciplineList.isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Could not create member, discipline type missing");
                return;
            }
        }
        /*
        Creating new member
        */
        //Member
        if (membershipType == MembershipType.PASSIVE)
        {
            try 
            {
                if (birthyear == null || name == null)
                {
                    throw new NullPointerException();
                }
                c.createMember(name, birthyear, membershipType);
                JOptionPane.showMessageDialog(frame, "Member created");
            } 
            catch (NullPointerException nx) 
            {
                System.out.println("Could not create member");
                JOptionPane.showMessageDialog(frame, "Could not create member");
            }
        }
        //MemberActive
        if (membershipType == MembershipType.ACTIVE && activityType == ActivityType.BASIC)
        {
            try 
            {
                if (birthyear == null || name == null)
                {
                    throw new NullPointerException();
                }
                c.createMemberActive(name, birthyear, membershipType, activityType);
                JOptionPane.showMessageDialog(frame, "Member created");
            } 
            catch (NullPointerException nx) 
            {
                System.out.println("Could not create member");
                JOptionPane.showMessageDialog(frame, "Could not create member");
            }
        }
        //MemberCompetitive
        if (activityType == ActivityType.COMPETITIVE)
        {
            try 
            {
                if (birthyear == null || name == null)
                {
                    throw new NullPointerException();
                }
                c.createMemberCompetitive(name, birthyear, membershipType, activityType, disciplineList);
                JOptionPane.showMessageDialog(frame, "Member created");
            } 
            catch (NullPointerException nx) 
            {
                System.out.println("Could not create member");
                JOptionPane.showMessageDialog(frame, "Could not create member");
            }
        }
        //Clearing selection
        buttonGroupCreateMemberActivityType.clearSelection();
        buttonGroupCreateMemberPassiveActive.clearSelection();
        this.RadioButtonNewMemberBackstroke.setSelected(false);
        this.RadioButtonNewMemberBreaststroke.setSelected(false);
        this.RadioButtonNewMemberButterfly.setSelected(false);
        this.RadioButtonNewMemberCrawl.setSelected(false);
        //Disabling Radio Buttons
        this.RadioButtonNewMemberBackstroke.setEnabled(false);
        this.RadioButtonNewMemberBreaststroke.setEnabled(false);
        this.RadioButtonNewMemberButterfly.setEnabled(false);
        this.RadioButtonNewMemberCrawl.setEnabled(false);
        this.RadioButtonNewMemberBasic.setEnabled(false);
        this.RadioButtonNewMemberCompetitive.setEnabled(false);
        //Removing values from textfields
        this.TextFieldNewMemberName.setText("Enter name here");
        this.TextFieldNewMemberBirthYear.setText("Enter year here");
    }//GEN-LAST:event_ButtonNewMemberCreateMemberActionPerformed

    private void RadioButtonNewMemberActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonNewMemberActiveActionPerformed
        //Enabling Radio Buttons
        this.RadioButtonNewMemberBasic.setEnabled(true);
        this.RadioButtonNewMemberCompetitive.setEnabled(true);
    }//GEN-LAST:event_RadioButtonNewMemberActiveActionPerformed

    private void RadioButtonNewMemberPassiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonNewMemberPassiveActionPerformed
        RadioButtonNewMemberBasicActionPerformed(evt);
        //Clearing selections
        this.buttonGroupCreateMemberActivityType.clearSelection();
        //Disabling Buttons
        this.RadioButtonNewMemberBasic.setEnabled(false);
        this.RadioButtonNewMemberCompetitive.setEnabled(false);
    }//GEN-LAST:event_RadioButtonNewMemberPassiveActionPerformed

    private void RadioButtonNewMemberCompetitiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonNewMemberCompetitiveActionPerformed
        //Enabling Radio Buttons
        this.RadioButtonNewMemberBackstroke.setEnabled(true);
        this.RadioButtonNewMemberBreaststroke.setEnabled(true);
        this.RadioButtonNewMemberButterfly.setEnabled(true);
        this.RadioButtonNewMemberCrawl.setEnabled(true);
    }//GEN-LAST:event_RadioButtonNewMemberCompetitiveActionPerformed

    private void RadioButtonNewMemberBasicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonNewMemberBasicActionPerformed
        //Clearing selections
        this.RadioButtonNewMemberBackstroke.setSelected(false);
        this.RadioButtonNewMemberBreaststroke.setSelected(false);
        this.RadioButtonNewMemberButterfly.setSelected(false);
        this.RadioButtonNewMemberCrawl.setSelected(false);
        //Disabling Radio Buttons
        this.RadioButtonNewMemberBackstroke.setEnabled(false);
        this.RadioButtonNewMemberBreaststroke.setEnabled(false);
        this.RadioButtonNewMemberButterfly.setEnabled(false);
        this.RadioButtonNewMemberCrawl.setEnabled(false);
    }//GEN-LAST:event_RadioButtonNewMemberBasicActionPerformed

    private void ButtonLoginAsManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginAsManagerActionPerformed
        PanelLoginScreen.setVisible(false);
        PanelLoggedInAsManager.setVisible(true);
    }//GEN-LAST:event_ButtonLoginAsManagerActionPerformed

    private void ButtonEditMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditMemberActionPerformed
        PanelLoggedInAsManager.setVisible(false);
        PanelEditMemberChooseMember.setVisible(true);
        //Clearing drop down menu and updating menu with latest data
        ComboBoxChooseMemberToEdit.removeAllItems();
        ArrayList<Member> members = c.getAllMembers();
        for (int i = 0; i < members.size(); ++i)
        {
            ComboBoxChooseMemberToEdit.addItem(members.get(i).toString());
        }
    }//GEN-LAST:event_ButtonEditMemberActionPerformed

    private void ButtonCancelEditMemberChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelEditMemberChooseActionPerformed
        PanelLoggedInAsManager.setVisible(true);
        PanelEditMemberChooseMember.setVisible(false);
    }//GEN-LAST:event_ButtonCancelEditMemberChooseActionPerformed

    private void ButtonOKChooseMemberToEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOKChooseMemberToEditActionPerformed
        PanelEditMemberChooseMember.setVisible(false);
        PanelEditMember.setVisible(true);
        try
        {
            //Choosing selected member from drop down menu
            String StrMember = ComboBoxChooseMemberToEdit.getSelectedItem().toString();
            String StrMemberSub = StrMember.substring(StrMember.indexOf(":") + 1,
                             StrMember.indexOf(","));
            idMember = 
            Integer.parseInt(StrMemberSub.trim());
            Member m = c.getMember(idMember);
            //Putting chosen member's base info into the Edit Member-screen
            this.TextFieldEditMemberName.setText(m.getName());
            this.TextFieldEditMemberBirthYear.setText(m.getBirthyear().toString());
            this.RadioButtonEditMemberPassive.setSelected(true);
        }
        catch (NullPointerException nx)
        {
            System.out.println("No member chosen");
            JFrame frame = new JFrame("Message");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JOptionPane.showMessageDialog(frame, "No member chosen");
            ButtonCancelEditMemberChooseActionPerformed(evt);
        }
    }//GEN-LAST:event_ButtonOKChooseMemberToEditActionPerformed

    
    private void ButtonCancelEditMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelEditMemberActionPerformed
        PanelLoggedInAsManager.setVisible(true);
        PanelEditMember.setVisible(false);
        PanelEditMemberChooseMember.setVisible(false);
    }//GEN-LAST:event_ButtonCancelEditMemberActionPerformed

    private void RadioButtonEditMemberPassiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonEditMemberPassiveActionPerformed
        RadioButtonEditMemberBasicActionPerformed(evt);
        //Clearing selections
        this.buttonGroupEditMemberActivityType.clearSelection();
        //Disabling Buttons
        this.RadioButtonEditMemberBasic.setEnabled(false);
        this.RadioButtonEditMemberCompetitive.setEnabled(false);
    }//GEN-LAST:event_RadioButtonEditMemberPassiveActionPerformed

    private void RadioButtonEditMemberActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonEditMemberActiveActionPerformed
        //Enabling Radio Buttons
        this.RadioButtonEditMemberBasic.setEnabled(true);
        this.RadioButtonEditMemberCompetitive.setEnabled(true);
    }//GEN-LAST:event_RadioButtonEditMemberActiveActionPerformed

    private void RadioButtonEditMemberBasicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonEditMemberBasicActionPerformed
        //Clearing selections
        this.RadioButtonEditMemberBackstroke.setSelected(false);
        this.RadioButtonEditMemberBreaststroke.setSelected(false);
        this.RadioButtonEditMemberButterfly.setSelected(false);
        this.RadioButtonEditMemberCrawl.setSelected(false);
        //Disabling Radio Buttons
        this.RadioButtonEditMemberBackstroke.setEnabled(false);
        this.RadioButtonEditMemberBreaststroke.setEnabled(false);
        this.RadioButtonEditMemberButterfly.setEnabled(false);
        this.RadioButtonEditMemberCrawl.setEnabled(false);
    }//GEN-LAST:event_RadioButtonEditMemberBasicActionPerformed

    private void RadioButtonEditMemberCompetitiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonEditMemberCompetitiveActionPerformed
        //Enabling Radio Buttons
        this.RadioButtonEditMemberBackstroke.setEnabled(true);
        this.RadioButtonEditMemberBreaststroke.setEnabled(true);
        this.RadioButtonEditMemberButterfly.setEnabled(true);
        this.RadioButtonEditMemberCrawl.setEnabled(true);
    }//GEN-LAST:event_RadioButtonEditMemberCompetitiveActionPerformed

    private void ButtonEditMemberConfirmEditChosenMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditMemberConfirmEditChosenMemberActionPerformed
        /*
        Pre-creating values used in the actual creation of the new member
        */
        JFrame frame = new JFrame("Message");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String name = "";
        Year birthyear = null;
        MembershipType membershipType = MembershipType.PASSIVE;
        ActivityType activityType = ActivityType.BASIC;
        ArrayList <DisciplineType> disciplineList = new ArrayList();
        /*
        Changing values to the actual values chosen by the user
        */
        //Selecting birthyear based on user input
        try
        {
            birthyear = Year.parse(this.TextFieldEditMemberBirthYear.getText());
        }
        catch (DateTimeException dx)
        {
            System.out.println("Invalid value for birthyear");
            this.TextFieldEditMemberBirthYear.setText("! Enter valid year !");
        }
        //Selecting name based on user input
        try
        {
            name = this.TextFieldEditMemberName.getText();
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("Invalid value for name");
            this.TextFieldEditMemberName.setText("Invalid name");
        }
        //Selecting membership type based on user input
        if (this.RadioButtonEditMemberActive.isSelected())
        {
            membershipType = MembershipType.ACTIVE;
        }
        //Selecting activity type and discipline(s) based on user input
        if (this.RadioButtonEditMemberCompetitive.isEnabled() && this.RadioButtonEditMemberCompetitive.isSelected())
        {
            activityType = ActivityType.COMPETITIVE;
            if (this.RadioButtonEditMemberBackstroke.isSelected())
            {
                disciplineList.add(DisciplineType.BACKSTROKE);
            }
            if (this.RadioButtonEditMemberBreaststroke.isSelected())
            {
                disciplineList.add(DisciplineType.BREASTSTROKE);
            }
            if (this.RadioButtonEditMemberButterfly.isSelected())
            {
                disciplineList.add(DisciplineType.BUTTERFLY);
            }
            if (this.RadioButtonEditMemberCrawl.isSelected())
            {
                disciplineList.add(DisciplineType.CRAWL);
            }
        }
        //Guard checking if competitive member actually has a discipline
        if (this.RadioButtonEditMemberCompetitive.isEnabled() && this.RadioButtonEditMemberCompetitive.isSelected())
        {
            if (disciplineList.isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Could not edit member, discipline type missing");
                return;
            }
        }
        /*
        Editing member
        */
        //Member
        if (membershipType == MembershipType.PASSIVE)
        {
            try 
            {
                if (birthyear == null || name == null)
                {
                    throw new NullPointerException();
                }
                c.editMember(c.createTempMember(idMember, name, birthyear, membershipType));
                JOptionPane.showMessageDialog(frame, "Member has been edited");
            } 
            catch (NullPointerException nx) 
            {
                System.out.println("Could not edit member");
                JOptionPane.showMessageDialog(frame, "Could not edit member");
            }
        }
        //MemberActive
        if (membershipType == MembershipType.ACTIVE && activityType == ActivityType.BASIC)
        {
            try 
            {
                if (birthyear == null || name == null)
                {
                    throw new NullPointerException();
                }
                c.editMember(c.createTempMemberActive(idMember, name, birthyear, membershipType, activityType));
                JOptionPane.showMessageDialog(frame, "Member has been edited");
            } 
            catch (NullPointerException nx) 
            {
                System.out.println("Could not edit member");
                JOptionPane.showMessageDialog(frame, "Could not edit member");
            }
        }
        //MemberCompetitive
        if (activityType == ActivityType.COMPETITIVE)
        {
            try 
            {
                if (birthyear == null || name == null)
                {
                    throw new NullPointerException();
                }
                c.editMember(c.createTempMemberCompetitive(idMember, name, birthyear, membershipType, activityType, disciplineList));
                JOptionPane.showMessageDialog(frame, "Member has been edited");
            } 
            catch (NullPointerException nx) 
            {
                System.out.println("Could not edit member");
                JOptionPane.showMessageDialog(frame, "Could not edit member");
            }
        }
        //Clearing selection
        buttonGroupEditMemberActivityType.clearSelection();
        buttonGroupEditMemberPassiveActive.clearSelection();
        this.RadioButtonEditMemberBackstroke.setSelected(false);
        this.RadioButtonEditMemberBreaststroke.setSelected(false);
        this.RadioButtonEditMemberButterfly.setSelected(false);
        this.RadioButtonEditMemberCrawl.setSelected(false);
        //Disabling Radio Buttons
        this.RadioButtonEditMemberBackstroke.setEnabled(false);
        this.RadioButtonEditMemberBreaststroke.setEnabled(false);
        this.RadioButtonEditMemberButterfly.setEnabled(false);
        this.RadioButtonEditMemberCrawl.setEnabled(false);
        this.RadioButtonEditMemberBasic.setEnabled(false);
        this.RadioButtonEditMemberCompetitive.setEnabled(false);
        //Removing values from textfields
        this.TextFieldEditMemberName.setText("Enter name here");
        this.TextFieldEditMemberBirthYear.setText("Enter year here");
        ButtonCancelEditMemberActionPerformed(evt);
    }//GEN-LAST:event_ButtonEditMemberConfirmEditChosenMemberActionPerformed

    private void ButtonDeleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteMemberActionPerformed
        PanelLoggedInAsManager.setVisible(false);
        PanelDeleteMember.setVisible(true);
        //Preparing drop down menu for the Delete Member-screen
        ComboBoxChooseMemberToDelete.removeAllItems();
        ArrayList<Member> members = c.getAllMembers();
        for (int i = 0; i < members.size(); ++i)
        {
            ComboBoxChooseMemberToDelete.addItem(members.get(i).toString());
        }
    }//GEN-LAST:event_ButtonDeleteMemberActionPerformed

    private void ButtonCancelDeleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelDeleteMemberActionPerformed
        PanelLoggedInAsManager.setVisible(true);
        PanelDeleteMember.setVisible(false);
    }//GEN-LAST:event_ButtonCancelDeleteMemberActionPerformed

    private void ButtonOKChooseMemberToDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOKChooseMemberToDeleteActionPerformed
        JFrame frame = new JFrame("Message");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try
        {
            //Fetching chosen member
            String StrMember = ComboBoxChooseMemberToDelete.getSelectedItem().toString();
            String StrMemberSub = StrMember.substring(StrMember.indexOf(":") + 1,
                                 StrMember.indexOf(","));
            idMember = 
            Integer.parseInt(StrMemberSub.trim());
            //Deleting chosen member
            c.deleteMember(idMember);
            JOptionPane.showMessageDialog(frame, "Member has been deleted");
        }
        catch (NullPointerException nx)
        {
            System.out.println("No member chosen");
            JOptionPane.showMessageDialog(frame, "No member chosen");
            ButtonCancelEditMemberChooseActionPerformed(evt);
        }
        //Going back to manager's menu
        PanelDeleteMember.setVisible(false);
        PanelLoggedInAsManager.setVisible(true);
    }//GEN-LAST:event_ButtonOKChooseMemberToDeleteActionPerformed

    private void ButtonViewMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonViewMembersActionPerformed
        PanelLoggedInAsManager.setVisible(false);
        PanelViewMembers.setVisible(true);
        //Clearing the All Members-list and updating with latest data
        this.textAreaAllMembers.setText("");
        for (int i = 0; i < c.getAllMembers().size(); ++i)
        {
            this.textAreaAllMembers.append(c.getAllMembers().get(i).toString());
            this.textAreaAllMembers.append("\n");
        }
    }//GEN-LAST:event_ButtonViewMembersActionPerformed

    private void ButtonBackFromViewAllMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackFromViewAllMembersActionPerformed
        PanelLoggedInAsManager.setVisible(true);
        PanelViewMembers.setVisible(false);
    }//GEN-LAST:event_ButtonBackFromViewAllMembersActionPerformed

    private void ButtonViewAllMembersAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonViewAllMembersAllActionPerformed
        //Clearing the All Members-list and updating with latest data
        this.textAreaAllMembers.setText("");
        for (int i = 0; i < c.getAllMembers().size(); ++i)
        {
            this.textAreaAllMembers.append(c.getAllMembers().get(i).toString());
            this.textAreaAllMembers.append("\n");
        }
    }//GEN-LAST:event_ButtonViewAllMembersAllActionPerformed

    private void ButtonViewAllMembersCompetitionModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonViewAllMembersCompetitionModeActionPerformed
        //Clearing the All Members-list and loading only the competitive members to the list
        this.textAreaAllMembers.setText("");
        for (int i = 0; i < c.getAllCompetitiveMembers().size(); ++i)
        {
            this.textAreaAllMembers.append(c.getAllCompetitiveMembers().get(i).toStringCompetitionVersionForManager());
            this.textAreaAllMembers.append("\n");
        }
    }//GEN-LAST:event_ButtonViewAllMembersCompetitionModeActionPerformed

    private void ButtonRegisterPaymentActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonRegisterPaymentActionPerformed
    {//GEN-HEADEREND:event_ButtonRegisterPaymentActionPerformed
        PanelLoggedInAsCashier.setVisible(false);
        PanelRegisterPayment.setVisible(true);
        //Clearing the member list and updating with latest data
        //This member list is necessary because there's no way the cashier has memorised all the members and their ID
        this.textAreaRegisterPaymentMemberList.setText("");
        for (int i = 0; i < c.getAllMembers().size(); ++i)
        {
            this.textAreaRegisterPaymentMemberList.append(c.getAllMembers().get(i).toStringNameID());
            this.textAreaRegisterPaymentMemberList.append("\n");
        }
    }//GEN-LAST:event_ButtonRegisterPaymentActionPerformed

    private void ButtonAllArrearsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonAllArrearsActionPerformed
    {//GEN-HEADEREND:event_ButtonAllArrearsActionPerformed
        PanelLoggedInAsCashier.setVisible(false);
        PanelShowAllArrears.setVisible(true);
        //Getting the amount of money owed by the club members
        int arrears = 0;
        arrears = c.getArrearsAllMembers();
        this.TextFieldTotalAmountArrears.setText(arrears + "");
        //Updating list of members in arrear with the latest data
        this.textAreaShowAllArrearsMemberList.setText("");
        for (int i = 0; i < c.getAllArrearMembers().size(); ++i)
        {
            this.textAreaShowAllArrearsMemberList.append(c.getAllArrearMembers().get(i).toStringNameID());
            this.textAreaShowAllArrearsMemberList.append("\n");
        }
    }//GEN-LAST:event_ButtonAllArrearsActionPerformed

    private void ButtonBackToMainMenuFromCashierActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonBackToMainMenuFromCashierActionPerformed
    {//GEN-HEADEREND:event_ButtonBackToMainMenuFromCashierActionPerformed
        PanelLoggedInAsCashier.setVisible(false);
        PanelLoginScreen.setVisible(true);
    }//GEN-LAST:event_ButtonBackToMainMenuFromCashierActionPerformed

    private void ButtonLoginAsCashierActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonLoginAsCashierActionPerformed
    {//GEN-HEADEREND:event_ButtonLoginAsCashierActionPerformed
        PanelLoginScreen.setVisible(false);
        PanelLoggedInAsCashier.setVisible(true);
    }//GEN-LAST:event_ButtonLoginAsCashierActionPerformed

    private void ButtonBackFromRegisterPaymentActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonBackFromRegisterPaymentActionPerformed
    {//GEN-HEADEREND:event_ButtonBackFromRegisterPaymentActionPerformed
        PanelLoggedInAsCashier.setVisible(true);
        PanelRegisterPayment.setVisible(false);
    }//GEN-LAST:event_ButtonBackFromRegisterPaymentActionPerformed

    private void ButtonRegisterPaymentRegisterPaymentActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonRegisterPaymentRegisterPaymentActionPerformed
    {//GEN-HEADEREND:event_ButtonRegisterPaymentRegisterPaymentActionPerformed
        JFrame frame = new JFrame("Message");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int ID = 0;
        Year year = null; 
        //Selecting ID based on user input
        try
        {
            ID = Integer.parseInt(this.TextFieldRegisterPaymentID.getText().trim());
        }
        catch (NumberFormatException nx)
        {
            JOptionPane.showMessageDialog(frame, "Invalid value for ID");
        }
        //Selecting payment year based on user input
        try
        {
            year = Year.parse(this.TextFieldRegisterPaymentPaymentYear.getText());
        }
        catch (DateTimeException dx)
        {
            JOptionPane.showMessageDialog(frame, "Invalid value for year");
        }
        //Checking if values are somewhat correct
        if (ID <= 0 || year == null)
        {
            JOptionPane.showMessageDialog(frame, "Could not register payment");
            return;
        }
        //Registering payment
        try
        {
            c.registerPayment(ID, year);
        }
        catch (NullPointerException nx)
        {
            JOptionPane.showMessageDialog(frame, "Unable to register payment with given ID");
            return;
        }
        JOptionPane.showMessageDialog(frame, "Register complete");
        //Clearing text boxes
        this.TextFieldRegisterPaymentID.setText("ID");
        this.TextFieldRegisterPaymentPaymentYear.setText("YYYY");
        //Updating the memberlist with the latest data
        this.textAreaRegisterPaymentMemberList.setText("");
        for (int i = 0; i < c.getAllMembers().size(); ++i)
        {
            this.textAreaRegisterPaymentMemberList.append(c.getAllMembers().get(i).toStringNameID());
            this.textAreaRegisterPaymentMemberList.append("\n");
        }
    }//GEN-LAST:event_ButtonRegisterPaymentRegisterPaymentActionPerformed

    
    private void ButtonRevokePaymentActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonRevokePaymentActionPerformed
    {//GEN-HEADEREND:event_ButtonRevokePaymentActionPerformed
        PanelLoggedInAsCashier.setVisible(false);
        PanelRevokePayment.setVisible(true);
        //Clearing and updating member list with the latest data
        this.textAreaRevokePaymentMemberList.setText("");
        for (int i = 0; i < c.getAllMembers().size(); ++i)
        {
            this.textAreaRevokePaymentMemberList.append(c.getAllMembers().get(i).toStringNameID());
            this.textAreaRevokePaymentMemberList.append("\n");
        }
    }//GEN-LAST:event_ButtonRevokePaymentActionPerformed

    private void ButtonBackFromRevokePaymentActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonBackFromRevokePaymentActionPerformed
    {//GEN-HEADEREND:event_ButtonBackFromRevokePaymentActionPerformed
        PanelRevokePayment.setVisible(false);
        PanelLoggedInAsCashier.setVisible(true);
    }//GEN-LAST:event_ButtonBackFromRevokePaymentActionPerformed

    private void ButtonRevokePaymentRevokePaymentActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonRevokePaymentRevokePaymentActionPerformed
    {//GEN-HEADEREND:event_ButtonRevokePaymentRevokePaymentActionPerformed
        JFrame frame = new JFrame("Message");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int ID = 0;
        Year year = null;
        //Selecting ID based on user input
        try
        {
            ID = Integer.parseInt(this.TextFieldRevokePaymentID.getText().trim());
        }
        catch (NumberFormatException nx)
        {
            JOptionPane.showMessageDialog(frame, "Invalid value for ID");
        }
        //Selecting payment year based on user input
        try
        {
            year = Year.parse(this.TextFieldRevokePaymentPaymentYear.getText());
        }
        catch (DateTimeException dx)
        {
            JOptionPane.showMessageDialog(frame, "Invalid value for year");
        }
        //Checking values
        if (ID <= 0 || year == null)
        {
            JOptionPane.showMessageDialog(frame, "Could not revoke payment");
            return;
        }
        //Adding debt
        try
        {
            c.revokePayment(ID, year);
        }
        catch (NullPointerException nx)
        {
            JOptionPane.showMessageDialog(frame, "Unable to revoke payment with given ID");
            return;
        }
        JOptionPane.showMessageDialog(frame, "Revocation complete");
        //Resetting text boxes
        this.TextFieldRevokePaymentID.setText("ID");
        this.TextFieldRevokePaymentPaymentYear.setText("YYYY");
        //Updating member list
        this.textAreaRevokePaymentMemberList.setText("");
        for (int i = 0; i < c.getAllMembers().size(); ++i)
        {
            this.textAreaRevokePaymentMemberList.append(c.getAllMembers().get(i).toStringNameID());
            this.textAreaRevokePaymentMemberList.append("\n");
        }
    }//GEN-LAST:event_ButtonRevokePaymentRevokePaymentActionPerformed

    private void ButtonCheckMembersArrearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonCheckMembersArrearActionPerformed
    {//GEN-HEADEREND:event_ButtonCheckMembersArrearActionPerformed
        PanelLoggedInAsCashier.setVisible(false);
        PanelSingleMemberArrear.setVisible(true);
        //Clearing and updating list of members
        this.textAreaSingleMemberArrearMemberList.setText("");
        for (int i = 0; i < c.getAllMembers().size(); ++i)
        {
            this.textAreaSingleMemberArrearMemberList.append(c.getAllMembers().get(i).toStringNameID());
            this.textAreaSingleMemberArrearMemberList.append("\n");
        }
    }//GEN-LAST:event_ButtonCheckMembersArrearActionPerformed

    private void ButtonBackFromSingleMemberArrearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonBackFromSingleMemberArrearActionPerformed
    {//GEN-HEADEREND:event_ButtonBackFromSingleMemberArrearActionPerformed
        this.TextFieldSingleMemberArrearID.setText("ID");
        this.TextFieldSingleMemberArrearCurrentArrear.setText("€");
        PanelSingleMemberArrear.setVisible(false);
        PanelLoggedInAsCashier.setVisible(true);
    }//GEN-LAST:event_ButtonBackFromSingleMemberArrearActionPerformed

    private void ButtonSingleMemberArrearShowArrearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonSingleMemberArrearShowArrearActionPerformed
    {//GEN-HEADEREND:event_ButtonSingleMemberArrearShowArrearActionPerformed
        JFrame frame = new JFrame("Message");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int ID = 0;
        int arrear = 0;
        //Selecting ID based on user input
        try
        {
            ID = Integer.parseInt(this.TextFieldSingleMemberArrearID.getText().trim());
        }
        catch (NumberFormatException nx)
        {
            JOptionPane.showMessageDialog(frame, "Invalid value for ID");
        }
        //Selecting amount of debt based on user input
        try
        {
            arrear = c.getArrearSingleMember(ID);
        }
        catch (NullPointerException nx)
        {
            JOptionPane.showMessageDialog(frame, "Could not find member");
        }
        //Showing debt of chosen member
        this.TextFieldSingleMemberArrearCurrentArrear.setText(arrear + "");
    }//GEN-LAST:event_ButtonSingleMemberArrearShowArrearActionPerformed

    private void ButtonBackFromShowAllArrearsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonBackFromShowAllArrearsActionPerformed
    {//GEN-HEADEREND:event_ButtonBackFromShowAllArrearsActionPerformed
        PanelShowAllArrears.setVisible(false);
        PanelLoggedInAsCashier.setVisible(true);
    }//GEN-LAST:event_ButtonBackFromShowAllArrearsActionPerformed

    private void ButtonLoginAsTrainerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonLoginAsTrainerActionPerformed
    {//GEN-HEADEREND:event_ButtonLoginAsTrainerActionPerformed
        PanelLoginScreen.setVisible(false);
        PanelLoggedInAsTrainer.setVisible(true);
    }//GEN-LAST:event_ButtonLoginAsTrainerActionPerformed

    private void ButtonAddTrainingActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonAddTrainingActionPerformed
    {//GEN-HEADEREND:event_ButtonAddTrainingActionPerformed
        PanelAddTraining.setVisible(true);
        PanelLoggedInAsTrainer.setVisible(false);
        //Clearing and updating list of members with latest data
        //This list only contains competitive members since only competitive members are allowed to train their chosen discipline(s)
        this.textAreaAddTrainingMemberList.setText("");
        for (int i = 0; i < c.getAllCompetitiveMembers().size(); ++i)
        {
            this.textAreaAddTrainingMemberList.append(c.getAllCompetitiveMembers().get(i).toStringNameIDDiscipline());
            this.textAreaAddTrainingMemberList.append("\n");
        }
    }//GEN-LAST:event_ButtonAddTrainingActionPerformed

    private void ButtonAddCompetitionResultActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonAddCompetitionResultActionPerformed
    {//GEN-HEADEREND:event_ButtonAddCompetitionResultActionPerformed
        PanelLoggedInAsTrainer.setVisible(false);
        PanelAddCompetitionResult.setVisible(true);
        //Clearing and updating list of members with latest data
        //This list only contains competitive members since only competitive members participate in competitions
        this.textAreaAddCompetitionResultMemberList.setText("");
        for (int i = 0; i < c.getAllCompetitiveMembers().size(); ++i)
        {
            this.textAreaAddCompetitionResultMemberList.append(c.getAllCompetitiveMembers().get(i).toStringNameIDDiscipline());
            this.textAreaAddCompetitionResultMemberList.append("\n");
        }
    }//GEN-LAST:event_ButtonAddCompetitionResultActionPerformed

    private void ButtonSeeTopFiveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonSeeTopFiveActionPerformed
    {//GEN-HEADEREND:event_ButtonSeeTopFiveActionPerformed
        PanelLoggedInAsTrainer.setVisible(false);
        PanelViewTopFive.setVisible(true);
    }//GEN-LAST:event_ButtonSeeTopFiveActionPerformed

    private void ButtonBackToMainMenuFromTrainerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonBackToMainMenuFromTrainerActionPerformed
    {//GEN-HEADEREND:event_ButtonBackToMainMenuFromTrainerActionPerformed
        PanelLoggedInAsTrainer.setVisible(false);
        PanelLoginScreen.setVisible(true);
    }//GEN-LAST:event_ButtonBackToMainMenuFromTrainerActionPerformed

    private void ButtonBackFromAddTrainingActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonBackFromAddTrainingActionPerformed
    {//GEN-HEADEREND:event_ButtonBackFromAddTrainingActionPerformed
        PanelAddTraining.setVisible(false);
        PanelLoggedInAsTrainer.setVisible(true);
        //Resetting values
        this.buttonGroupAddTrainingDistance.clearSelection();
        this.buttonGroupAddTrainingDisciplineTypes.clearSelection();
        this.TextFieldAddTrainingDateDay.setText("(DD)");
        this.TextFieldAddTrainingID.setText("ID");
        this.TextFieldAddTrainingTrainingTime.setText("Seconds");
        this.TextFieldAddTrainingTrainingYear.setText("(YYYY)");
        this.ComboBoxAddTrainingMonths.setSelectedIndex(0);
    }//GEN-LAST:event_ButtonBackFromAddTrainingActionPerformed

    private void ButtonAddTrainigAddTrainingActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonAddTrainigAddTrainingActionPerformed
    {//GEN-HEADEREND:event_ButtonAddTrainigAddTrainingActionPerformed
        JFrame frame = new JFrame("Message");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int ID = 0;
        int trainingYear = 0000;
        Date trainingDate = null;
        int trainingDay = 0;
        DisciplineType discipline = DisciplineType.BACKSTROKE;
        Distance distance = Distance.METERS_100;
        int timeInSec = 0;
        //Selecting ID of chosen member 
        try
        {
            ID = Integer.parseInt(TextFieldAddTrainingID.getText().trim());
        }
        catch (NumberFormatException nx)
        {
            JOptionPane.showMessageDialog(frame, "Invalid value for ID");
            return;
        }
        //Selecting year for this training session
        try
        {
            trainingYear = Integer.parseInt(TextFieldAddTrainingTrainingYear.getText().trim());
        }
        catch (NumberFormatException nx)
        {
            JOptionPane.showMessageDialog(frame, "Invalid value for year");
            return;
        }
        //Selecting day for this training session
        try
        {
            trainingDay = Integer.parseInt(TextFieldAddTrainingDateDay.getText().trim());
        }
        catch (NumberFormatException nx)
        {
            JOptionPane.showMessageDialog(frame, "Invalid value for day");
            return;
        }
        //Checking if chosen day matches the chosen month
        if ((ComboBoxAddCompetitionResultMonths.getSelectedItem() == "JANUARY" && trainingDay <= 0)||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "JANUARY" && trainingDay > 31)||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "MARCH" && trainingDay <= 0) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "MARCH" && trainingDay > 31) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "MAY" && trainingDay <= 0) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "MAY" && trainingDay > 31) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "JULY" && trainingDay <= 0) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "JULY" && trainingDay > 31) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "AUGUST" && trainingDay <= 0) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "AUGUST" && trainingDay > 31) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "OCTOBER" && trainingDay <= 0) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "OCTOBER" && trainingDay > 31) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "DECEMBER" && trainingDay <= 0) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "DECEMBER" && trainingDay > 31))
        {
            JOptionPane.showMessageDialog(frame, "Invalid value for day");
            return;
        }
        //Can't be bothered to check for leap years
        if ((ComboBoxAddCompetitionResultMonths.getSelectedItem() == "FEBRUARY" && trainingDay <= 0)||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "FEBRUARY" && trainingDay > 28)||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "APRIL" && trainingDay <= 0) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "APRIL" && trainingDay > 30) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "JUNE" && trainingDay <= 0) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "JUNE" && trainingDay > 30) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "SEPTEMBER" && trainingDay <= 0) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "SEPTEMBER" && trainingDay > 30) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "NOVEMBER" && trainingDay <= 0) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "NOVEMBER" && trainingDay > 30))
        {
            JOptionPane.showMessageDialog(frame, "Invalid value for day");
            return;
        }
        //Creating date for this training session
        try
        {
            trainingDate = new GregorianCalendar(trainingYear, ComboBoxAddTrainingMonths.getSelectedIndex(), trainingDay).getTime();
        }
        catch (IllegalArgumentException ix)
        {
            JOptionPane.showMessageDialog(frame, "Failed to create training date!");
            return;
        }
        //Selecting discipline for this training session
        if (this.RadioButtonAddTrainingBackstroke.isSelected())
        {
            discipline = DisciplineType.BACKSTROKE;
        }
        if (this.RadioButtonAddTrainingBreaststroke.isSelected())
        {
            discipline = DisciplineType.BREASTSTROKE;
        }
        if (this.RadioButtonAddTrainingButterfly.isSelected())
        {
            discipline = DisciplineType.BUTTERFLY;
        }
        if (this.RadioButtonAddTrainingCrawl.isSelected())
        {
            discipline = DisciplineType.CRAWL;
        }
        //Guard checking if competitive member actually has a discipline
        if (this.RadioButtonAddTrainingCrawl.isSelected() == false && 
                this.RadioButtonAddTrainingBackstroke.isSelected() == false &&
                this.RadioButtonAddTrainingBreaststroke.isSelected() == false &&
                this.RadioButtonAddTrainingButterfly.isSelected() == false)
        {
            JOptionPane.showMessageDialog(frame, "Could not add training, discipline type missing");
            return;
        }
        //Selection distance for this training session
        if (this.RadioButtonAddTrainingDistance100.isSelected())
        {
            distance = Distance.METERS_100;
        }
        if (this.RadioButtonAddTrainingDistance200.isSelected())
        {
            distance = Distance.METERS_200;
        }
        if (this.RadioButtonAddTrainingDistance400.isSelected())
        {
            distance = Distance.METERS_400;
        }
        //Guard checking if distance has been chosen
        if (this.RadioButtonAddTrainingDistance100.isSelected() == false && 
                this.RadioButtonAddTrainingDistance200.isSelected() == false &&
                this.RadioButtonAddTrainingDistance400.isSelected() == false)
        {
            JOptionPane.showMessageDialog(frame, "Could not add training, distance type missing");
            return;
        }
        //Selecting the time for this training session
        try
        {
            timeInSec = Integer.parseInt(TextFieldAddTrainingTrainingTime.getText().trim());
        }
        catch (NumberFormatException nx)
        {
            JOptionPane.showMessageDialog(frame, "Invalid value for training time");
            return;
        }
        //Adding training to chosen member using memberID
        try
        {
            c.addTrainingSession(ID, trainingDate, discipline, distance, timeInSec);
            JOptionPane.showMessageDialog(frame, "Training added to member");
            System.out.println(c.getTopFiveTraining(discipline, distance, c.getAllCompetitiveMembers()));
        }
        catch (NullPointerException nx)
        {
            JOptionPane.showMessageDialog(frame, "Unable to add training");
        }
    }//GEN-LAST:event_ButtonAddTrainigAddTrainingActionPerformed

    private void ButtonBackFromAddCompetitionResultActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonBackFromAddCompetitionResultActionPerformed
    {//GEN-HEADEREND:event_ButtonBackFromAddCompetitionResultActionPerformed
        PanelAddCompetitionResult.setVisible(false);
        PanelLoggedInAsTrainer.setVisible(true);
        //Clearing selections and resetting everything
        this.buttonGroupAddCompetitionResultDistance.clearSelection();
        this.buttonGroupAddCompetitionResultDisciplineTypes.clearSelection();
        this.TextFieldAddCompetitionResultDateDay.setText("(DD)");
        this.TextFieldAddCompetitionResultID.setText("ID");
        this.TextFieldAddCompetitionResultCompetitionTime.setText("Seconds");
        this.TextFieldAddCompetitionResultCompetitionYear.setText("(YYYY)");
        this.ComboBoxAddCompetitionResultMonths.setSelectedIndex(0);
        this.TextFieldAddCompetitionResultPlacement.setText("#");
        this.TextFieldAddCompetitionResultEventName.setText("Name");
    }//GEN-LAST:event_ButtonBackFromAddCompetitionResultActionPerformed

    private void ButtonAddCompetitionResultAddCompetitionResultActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonAddCompetitionResultAddCompetitionResultActionPerformed
    {//GEN-HEADEREND:event_ButtonAddCompetitionResultAddCompetitionResultActionPerformed
        JFrame frame = new JFrame("Message");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int ID = 0;
        int competitionYear = 0000;
        Date competitionDate = null;
        int competitionDay = 0;
        DisciplineType discipline = DisciplineType.BACKSTROKE;
        Distance distance = Distance.METERS_100;
        int placement = 0;
        String eventName = "";
        int timeInSec = 0;
        //Selecting event name for this competition
        eventName = TextFieldAddCompetitionResultEventName.getText();
        if (eventName == null)
        {
            JOptionPane.showMessageDialog(frame, "Invalid event name");
            return;
        }
        //Selecting placement for this competition result
        try
        {
            placement = Integer.parseInt(TextFieldAddCompetitionResultPlacement.getText().trim());
        }
        catch (NumberFormatException nx)
        {
            JOptionPane.showMessageDialog(frame, "Invalid value for placement");
            return;
        }
        //Selecting ID of chosen member 
        try
        {
            ID = Integer.parseInt(TextFieldAddCompetitionResultID.getText().trim());
        }
        catch (NumberFormatException nx)
        {
            JOptionPane.showMessageDialog(frame, "Invalid value for ID");
            return;
        }
        //Selecting year for this competition result
        try
        {
            competitionYear = Integer.parseInt(TextFieldAddCompetitionResultCompetitionYear.getText().trim());
        }
        catch (NumberFormatException nx)
        {
            JOptionPane.showMessageDialog(frame, "Invalid value for year");
            return;
        }
        //Selecting day for this competition result
        try
        {
            competitionDay = Integer.parseInt(TextFieldAddCompetitionResultDateDay.getText().trim());
        }
        catch (NumberFormatException nx)
        {
            JOptionPane.showMessageDialog(frame, "Invalid value for day");
            return;
        }
        //Checking if chosen day matches the chosen month
        if ((ComboBoxAddCompetitionResultMonths.getSelectedItem() == "JANUARY" && competitionDay <= 0)||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "JANUARY" && competitionDay > 31)||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "MARCH" && competitionDay <= 0) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "MARCH" && competitionDay > 31) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "MAY" && competitionDay <= 0) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "MAY" && competitionDay > 31) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "JULY" && competitionDay <= 0) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "JULY" && competitionDay > 31) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "AUGUST" && competitionDay <= 0) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "AUGUST" && competitionDay > 31) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "OCTOBER" && competitionDay <= 0) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "OCTOBER" && competitionDay > 31) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "DECEMBER" && competitionDay <= 0) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "DECEMBER" && competitionDay > 31))
        {
            JOptionPane.showMessageDialog(frame, "Invalid value for day");
            return;
        }
        if ((ComboBoxAddCompetitionResultMonths.getSelectedItem() == "FEBRUARY" && competitionDay <= 0)||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "FEBRUARY" && competitionDay > 28)||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "APRIL" && competitionDay <= 0) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "APRIL" && competitionDay > 30) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "JUNE" && competitionDay <= 0) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "JUNE" && competitionDay > 30) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "SEPTEMBER" && competitionDay <= 0) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "SEPTEMBER" && competitionDay > 30) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "NOVEMBER" && competitionDay <= 0) ||
            (ComboBoxAddCompetitionResultMonths.getSelectedItem() == "NOVEMBER" && competitionDay > 30))
        {
            JOptionPane.showMessageDialog(frame, "Invalid value for day");
            return;
        }
        //Creating date for this competition result
        try
        {
            competitionDate = new GregorianCalendar(competitionYear, ComboBoxAddCompetitionResultMonths.getSelectedIndex(), competitionDay).getTime();
        }
        catch (IllegalArgumentException ex)
        {
            JOptionPane.showMessageDialog(frame, "Failed to create competition date");
            return;
        }
        //Selecting discipline for this competition result
        if (this.RadioButtonAddCompetitionResultBackstroke.isSelected())
        {
            discipline = DisciplineType.BACKSTROKE;
        }
        if (this.RadioButtonAddCompetitionResultBreaststroke.isSelected())
        {
            discipline = DisciplineType.BREASTSTROKE;
        }
        if (this.RadioButtonAddCompetitionResultButterfly.isSelected())
        {
            discipline = DisciplineType.BUTTERFLY;
        }
        if (this.RadioButtonAddCompetitionResultCrawl.isSelected())
        {
            discipline = DisciplineType.CRAWL;
        }
        //Guard checking if competitive member actually has a discipline
        if (this.RadioButtonAddCompetitionResultCrawl.isSelected() == false && 
                this.RadioButtonAddCompetitionResultBackstroke.isSelected() == false &&
                this.RadioButtonAddCompetitionResultBreaststroke.isSelected() == false &&
                this.RadioButtonAddCompetitionResultButterfly.isSelected() == false)
        {
            JOptionPane.showMessageDialog(frame, "Could not add competition result, discipline type missing");
            return;
        }
        //Selection distance for this competition result
        if (this.RadioButtonAddCompetitionResultDistance100.isSelected())
        {
            distance = Distance.METERS_100;
        }
        if (this.RadioButtonAddCompetitionResultDistance200.isSelected())
        {
            distance = Distance.METERS_200;
        }
        if (this.RadioButtonAddCompetitionResultDistance400.isSelected())
        {
            distance = Distance.METERS_400;
        }
        //Guard checking if distance has been chosen
        if (this.RadioButtonAddCompetitionResultDistance100.isSelected() == false && 
                this.RadioButtonAddCompetitionResultDistance200.isSelected() == false &&
                this.RadioButtonAddCompetitionResultDistance400.isSelected() == false)
        {
            JOptionPane.showMessageDialog(frame, "Could not add competition result, distance type missing");
            return;
        }
        //Selecting the time for this competition result
        try
        {
            timeInSec = Integer.parseInt(TextFieldAddCompetitionResultCompetitionTime.getText().trim());
        }
        catch (NumberFormatException nx)
        {
            JOptionPane.showMessageDialog(frame, "Invalid value for competition time");
            return;
        }
        //Adding competition result to chosen member using memberID
        try
        {
            c.addCompetitionResult(ID, competitionDate, discipline, distance, timeInSec, placement, eventName);
            JOptionPane.showMessageDialog(frame, "Competition result added to member");
            System.out.println(c.getTopFiveCompetition(discipline, distance, c.getAllCompetitiveMembers()));
        }
        catch (NullPointerException nx)
        {
            JOptionPane.showMessageDialog(frame, "Unable to add competition result");
        }
    }//GEN-LAST:event_ButtonAddCompetitionResultAddCompetitionResultActionPerformed

    private void ButtonBackFromViewTopFiveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonBackFromViewTopFiveActionPerformed
    {//GEN-HEADEREND:event_ButtonBackFromViewTopFiveActionPerformed
        PanelViewTopFive.setVisible(false);
        PanelLoggedInAsTrainer.setVisible(true);
    }//GEN-LAST:event_ButtonBackFromViewTopFiveActionPerformed

    private void ButtonViewTopFiveTrainingActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonViewTopFiveTrainingActionPerformed
    {//GEN-HEADEREND:event_ButtonViewTopFiveTrainingActionPerformed
        JFrame frame = new JFrame("Message");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DisciplineType discipline = DisciplineType.BACKSTROKE;
        Distance distance = Distance.METERS_100;
        //Selecting discipline for the top 5 list
        if (this.RadioButtonTopFiveBackstroke.isSelected())
        {
            discipline = DisciplineType.BACKSTROKE;
        }
        if (this.RadioButtonTopFiveBreaststroke.isSelected())
        {
            discipline = DisciplineType.BREASTSTROKE;
        }
        if (this.RadioButtonTopFiveButterfly.isSelected())
        {
            discipline = DisciplineType.BUTTERFLY;
        }
        if (this.RadioButtonTopFiveCrawl.isSelected())
        {
            discipline = DisciplineType.CRAWL;
        }
        if (this.RadioButtonTopFiveBackstroke.isSelected() == false && 
                this.RadioButtonTopFiveBreaststroke.isSelected() == false &&
                this.RadioButtonTopFiveButterfly.isSelected() == false &&
                this.RadioButtonTopFiveCrawl.isSelected() == false)
        {
            JOptionPane.showMessageDialog(frame, "Could not find results, discipline type missing");
            return;
        }
        //Selection distance for the top 5 list
        if (this.RadioButtonTopFiveDistance100.isSelected())
        {
            distance = Distance.METERS_100;
        }
        if (this.RadioButtonTopFiveDistance200.isSelected())
        {
            distance = Distance.METERS_200;
        }
        if (this.RadioButtonTopFiveDistance400.isSelected())
        {
            distance = Distance.METERS_400;
        }
        //Guard checking if distance has been chosen
        if (this.RadioButtonTopFiveDistance100.isSelected() == false && 
                this.RadioButtonTopFiveDistance200.isSelected() == false &&
                this.RadioButtonTopFiveDistance400.isSelected() == false)
        {
            JOptionPane.showMessageDialog(frame, "Could not find results, distance type missing");
            return;
        }
        //Showing the top five members in the text box
        this.textAreaViewTopFive.setText("");
        for (int i = 0; i < c.getTopFiveTraining(discipline, distance, c.getAllCompetitiveMembers()).size(); ++i)
        {
            this.textAreaViewTopFive.append("Number " + (i + 1));
            this.textAreaViewTopFive.append("\n");
            this.textAreaViewTopFive.append(c.getTopFiveTraining(discipline, distance, c.getAllCompetitiveMembers()).get(i).toStringNameIDDiscipline());
            this.textAreaViewTopFive.append("\n" 
                    + c.getTopFiveTraining(discipline, distance, c.getAllCompetitiveMembers()).get(i).getTrainingSessions().getBestTraining(discipline, distance).toString());
            this.textAreaViewTopFive.append("\n");
            this.textAreaViewTopFive.append("\n");
        }
    }//GEN-LAST:event_ButtonViewTopFiveTrainingActionPerformed

    private void ButtonViewTopFiveCompetitionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonViewTopFiveCompetitionActionPerformed
    {//GEN-HEADEREND:event_ButtonViewTopFiveCompetitionActionPerformed
        JFrame frame = new JFrame("Message");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DisciplineType discipline = DisciplineType.BACKSTROKE;
        Distance distance = Distance.METERS_100;
        //Selecting discipline for the top 5 list
        if (this.RadioButtonTopFiveBackstroke.isSelected())
        {
            discipline = DisciplineType.BACKSTROKE;
        }
        if (this.RadioButtonTopFiveBreaststroke.isSelected())
        {
            discipline = DisciplineType.BREASTSTROKE;
        }
        if (this.RadioButtonTopFiveButterfly.isSelected())
        {
            discipline = DisciplineType.BUTTERFLY;
        }
        if (this.RadioButtonTopFiveCrawl.isSelected())
        {
            discipline = DisciplineType.CRAWL;
        }
        if (this.RadioButtonTopFiveBackstroke.isSelected() == false && 
                this.RadioButtonTopFiveBreaststroke.isSelected() == false &&
                this.RadioButtonTopFiveButterfly.isSelected() == false &&
                this.RadioButtonTopFiveCrawl.isSelected() == false)
        {
            JOptionPane.showMessageDialog(frame, "Could not find results, discipline type missing");
            return;
        }
        //Selection distance for the top 5 list
        if (this.RadioButtonTopFiveDistance100.isSelected())
        {
            distance = Distance.METERS_100;
        }
        if (this.RadioButtonTopFiveDistance200.isSelected())
        {
            distance = Distance.METERS_200;
        }
        if (this.RadioButtonTopFiveDistance400.isSelected())
        {
            distance = Distance.METERS_400;
        }
        //Guard checking if distance has been chosen
        if (this.RadioButtonTopFiveDistance100.isSelected() == false && 
                this.RadioButtonTopFiveDistance200.isSelected() == false &&
                this.RadioButtonTopFiveDistance400.isSelected() == false)
        {
            JOptionPane.showMessageDialog(frame, "Could not find results, distance type missing");
            return;
        }
        //Showing the top five members in the text box
        this.textAreaViewTopFive.setText("");
        for (int i = 0; i < c.getTopFiveCompetition(discipline, distance, c.getAllCompetitiveMembers()).size(); ++i)
        {
            this.textAreaViewTopFive.append("Number " + (i + 1));
            this.textAreaViewTopFive.append("\n");
            this.textAreaViewTopFive.append(c.getTopFiveCompetition(discipline, distance, c.getAllCompetitiveMembers()).get(i).toStringNameIDDiscipline());
            this.textAreaViewTopFive.append("\n" 
                    + c.getTopFiveCompetition(discipline, distance, c.getAllCompetitiveMembers()).get(i).getCompetitionResults().getBestCompetitionRes(discipline, distance).toString());
            this.textAreaViewTopFive.append("\n");
            this.textAreaViewTopFive.append("\n");
        }
    }//GEN-LAST:event_ButtonViewTopFiveCompetitionActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAddCompetitionResult;
    private javax.swing.JButton ButtonAddCompetitionResultAddCompetitionResult;
    private javax.swing.JButton ButtonAddTrainigAddTraining;
    private javax.swing.JButton ButtonAddTraining;
    private javax.swing.JButton ButtonAllArrears;
    private javax.swing.JButton ButtonBackFromAddCompetitionResult;
    private javax.swing.JButton ButtonBackFromAddTraining;
    private javax.swing.JButton ButtonBackFromRegisterPayment;
    private javax.swing.JButton ButtonBackFromRevokePayment;
    private javax.swing.JButton ButtonBackFromShowAllArrears;
    private javax.swing.JButton ButtonBackFromSingleMemberArrear;
    private javax.swing.JButton ButtonBackFromViewAllMembers;
    private javax.swing.JButton ButtonBackFromViewTopFive;
    private javax.swing.JButton ButtonBackToMainMenu;
    private javax.swing.JButton ButtonBackToMainMenuFromCashier;
    private javax.swing.JButton ButtonBackToMainMenuFromTrainer;
    private javax.swing.JButton ButtonCancelCreateNewMember;
    private javax.swing.JButton ButtonCancelDeleteMember;
    private javax.swing.JButton ButtonCancelEditMember;
    private javax.swing.JButton ButtonCancelEditMemberChoose;
    private javax.swing.JButton ButtonCheckMembersArrear;
    private javax.swing.JButton ButtonCreateNewMember;
    private javax.swing.JButton ButtonDeleteMember;
    private javax.swing.JButton ButtonEditMember;
    private javax.swing.JButton ButtonEditMemberConfirmEditChosenMember;
    private javax.swing.JButton ButtonLoginAsCashier;
    private javax.swing.JButton ButtonLoginAsManager;
    private javax.swing.JButton ButtonLoginAsTrainer;
    private javax.swing.JButton ButtonNewMemberCreateMember;
    private javax.swing.JButton ButtonOKChooseMemberToDelete;
    private javax.swing.JButton ButtonOKChooseMemberToEdit;
    private javax.swing.JButton ButtonRegisterPayment;
    private javax.swing.JButton ButtonRegisterPaymentRegisterPayment;
    private javax.swing.JButton ButtonRevokePayment;
    private javax.swing.JButton ButtonRevokePaymentRevokePayment;
    private javax.swing.JButton ButtonSeeTopFive;
    private javax.swing.JButton ButtonSingleMemberArrearShowArrear;
    private javax.swing.JButton ButtonViewAllMembersAll;
    private javax.swing.JButton ButtonViewAllMembersCompetitionMode;
    private javax.swing.JButton ButtonViewMembers;
    private javax.swing.JButton ButtonViewTopFiveCompetition;
    private javax.swing.JButton ButtonViewTopFiveTraining;
    private javax.swing.JComboBox<String> ComboBoxAddCompetitionResultMonths;
    private javax.swing.JComboBox<String> ComboBoxAddTrainingMonths;
    private javax.swing.JComboBox<String> ComboBoxChooseMemberToDelete;
    private javax.swing.JComboBox<String> ComboBoxChooseMemberToEdit;
    private java.awt.Label LabeManagerScreenHeader;
    private javax.swing.JLabel LabeManagerScreenHome;
    private javax.swing.JLabel LabelAddCompetitionResultAllMembersIDName;
    private javax.swing.JLabel LabelAddCompetitionResultCompetitionDate;
    private javax.swing.JLabel LabelAddCompetitionResultCompetitionTime;
    private javax.swing.JLabel LabelAddCompetitionResultDisciplineType;
    private javax.swing.JLabel LabelAddCompetitionResultDistance;
    private javax.swing.JLabel LabelAddCompetitionResultEventName;
    private java.awt.Label LabelAddCompetitionResultHeader;
    private javax.swing.JLabel LabelAddCompetitionResultHome;
    private javax.swing.JLabel LabelAddCompetitionResultInsertID;
    private java.awt.Label LabelAddCompetitionResultLogAsTrainer;
    private javax.swing.JLabel LabelAddCompetitionResultPlacement;
    private javax.swing.JLabel LabelAddTrainingAllMembersIDName;
    private javax.swing.JLabel LabelAddTrainingDisciplineType;
    private javax.swing.JLabel LabelAddTrainingDistance;
    private java.awt.Label LabelAddTrainingHeader;
    private javax.swing.JLabel LabelAddTrainingHome;
    private javax.swing.JLabel LabelAddTrainingInsertID;
    private java.awt.Label LabelAddTrainingLogAsTrainer;
    private javax.swing.JLabel LabelAddTrainingTrainingDate;
    private javax.swing.JLabel LabelAddTrainingTrainingTime;
    private javax.swing.JLabel LabelBirthYearFormat;
    private javax.swing.JLabel LabelBirthYearFormatEditMember;
    private java.awt.Label LabelCashierScreenHeader;
    private javax.swing.JLabel LabelCashierScreenHome;
    private java.awt.Label LabelCreateNewMemberHeader;
    private javax.swing.JLabel LabelCreateNewMemberHome;
    private java.awt.Label LabelCreateNewMemberLogAsManager;
    private javax.swing.JLabel LabelDeleteMemberChooseMember;
    private java.awt.Label LabelDeleteMemberHeader;
    private javax.swing.JLabel LabelDeleteMemberHome;
    private java.awt.Label LabelDeleteMemberLogAsManager;
    private javax.swing.JLabel LabelEditMemberActivityType;
    private javax.swing.JLabel LabelEditMemberChooseMember;
    private javax.swing.JLabel LabelEditMemberDisciplineType;
    private java.awt.Label LabelEditMemberHeader;
    private java.awt.Label LabelEditMemberHeaderChoose;
    private javax.swing.JLabel LabelEditMemberHome;
    private javax.swing.JLabel LabelEditMemberHomeChoose;
    private java.awt.Label LabelEditMemberLogAsManager;
    private java.awt.Label LabelEditMemberLogAsManagerChoose;
    private javax.swing.JLabel LabelEditMemberMembershipType;
    private java.awt.Label LabelLoginScreenHeader;
    private javax.swing.JLabel LabelLoginScreenHome;
    private javax.swing.JLabel LabelNewMemberActivityType;
    private javax.swing.JLabel LabelNewMemberBirthYear;
    private javax.swing.JLabel LabelNewMemberBirthYear1;
    private javax.swing.JLabel LabelNewMemberDisciplineType;
    private javax.swing.JLabel LabelNewMemberMembershipType;
    private javax.swing.JLabel LabelNewMemberName;
    private javax.swing.JLabel LabelNewMemberName1;
    private javax.swing.JLabel LabelRegisterPaymentAllMembersIDName;
    private java.awt.Label LabelRegisterPaymentHeader;
    private javax.swing.JLabel LabelRegisterPaymentHome;
    private javax.swing.JLabel LabelRegisterPaymentInsertID;
    private java.awt.Label LabelRegisterPaymentLogAsCashier;
    private javax.swing.JLabel LabelRegisterPaymentPaymentYear;
    private javax.swing.JLabel LabelRegisterPaymentYearFormat;
    private javax.swing.JLabel LabelRevokePaymentAllMembersIDName;
    private java.awt.Label LabelRevokePaymentHeader;
    private javax.swing.JLabel LabelRevokePaymentHome;
    private javax.swing.JLabel LabelRevokePaymentInsertID;
    private java.awt.Label LabelRevokePaymentLogAsCashier;
    private javax.swing.JLabel LabelRevokePaymentPaymentYear;
    private javax.swing.JLabel LabelRevokePaymentYearFormat;
    private javax.swing.JLabel LabelShowAllArrearsAllArrearMembers;
    private javax.swing.JLabel LabelShowAllArrearsAllArrears;
    private java.awt.Label LabelShowAllArrearsHeader;
    private javax.swing.JLabel LabelShowAllArrearsHome;
    private java.awt.Label LabelShowAllArrearsLogAsCashier;
    private javax.swing.JLabel LabelShowAllArrearsTotalAmount;
    private javax.swing.JLabel LabelSingleMemberArrearAllMembersIDName;
    private javax.swing.JLabel LabelSingleMemberArrearCurrentArrear;
    private java.awt.Label LabelSingleMemberArrearHeader;
    private javax.swing.JLabel LabelSingleMemberArrearHome;
    private javax.swing.JLabel LabelSingleMemberArrearInsertID;
    private java.awt.Label LabelSingleMemberArrearLogAsCashier;
    private javax.swing.JLabel LabelTopFiveDisciplineType;
    private javax.swing.JLabel LabelTopFiveDistance;
    private java.awt.Label LabelTrainerScreenHeader;
    private javax.swing.JLabel LabelTrainerScreenHome;
    private javax.swing.JLabel LabelViewMembersAllMembers;
    private java.awt.Label LabelViewMembersHeader;
    private javax.swing.JLabel LabelViewMembersHome;
    private java.awt.Label LabelViewMembersLogAsManager;
    private java.awt.Label LabelViewTopFiveHeader;
    private javax.swing.JLabel LabelViewTopFiveHome;
    private java.awt.Label LabelViewTopFiveLogAsTrainer;
    private javax.swing.JLabel LabelViewTopFiveTopFiveMembers;
    private javax.swing.JPanel PanelAddCompetitionResult;
    private javax.swing.JPanel PanelAddCompetitionResultHeader;
    private javax.swing.JPanel PanelAddTraining;
    private javax.swing.JPanel PanelAddTrainingHeader;
    private javax.swing.JPanel PanelCreateNewMember;
    private javax.swing.JPanel PanelCreateNewMemberHeader;
    private javax.swing.JPanel PanelDeleteMember;
    private javax.swing.JPanel PanelDeleteMemberHeader;
    private javax.swing.JPanel PanelEditMember;
    private javax.swing.JPanel PanelEditMemberChooseMember;
    private javax.swing.JPanel PanelEditMemberHeader;
    private javax.swing.JPanel PanelEditMemberHeaderChoose;
    private javax.swing.JPanel PanelLoggedInAsCashier;
    private javax.swing.JPanel PanelLoggedInAsCashierScreenHeader;
    private javax.swing.JPanel PanelLoggedInAsManager;
    private javax.swing.JPanel PanelLoggedInAsManagerScreenHeader;
    private javax.swing.JPanel PanelLoggedInAsTrainer;
    private javax.swing.JPanel PanelLoggedInAsTrainerScreenHeader;
    private javax.swing.JPanel PanelLoginScreen;
    private javax.swing.JPanel PanelLoginScreenHeader;
    private javax.swing.JPanel PanelRegisterPayment;
    private javax.swing.JPanel PanelRegisterPaymentHeader;
    private javax.swing.JPanel PanelRevokePayment;
    private javax.swing.JPanel PanelRevokePaymentHeader;
    private javax.swing.JPanel PanelShowAllArrears;
    private javax.swing.JPanel PanelShowAllArrearsHeader;
    private javax.swing.JPanel PanelSingleMemberArrear;
    private javax.swing.JPanel PanelSingleMemberArrearHeader;
    private javax.swing.JPanel PanelViewMembers;
    private javax.swing.JPanel PanelViewMembersHeader;
    private javax.swing.JPanel PanelViewTopFive;
    private javax.swing.JPanel PanelViewTopFiveHeader;
    private javax.swing.JRadioButton RadioButtonAddCompetitionResultBackstroke;
    private javax.swing.JRadioButton RadioButtonAddCompetitionResultBreaststroke;
    private javax.swing.JRadioButton RadioButtonAddCompetitionResultButterfly;
    private javax.swing.JRadioButton RadioButtonAddCompetitionResultCrawl;
    private javax.swing.JRadioButton RadioButtonAddCompetitionResultDistance100;
    private javax.swing.JRadioButton RadioButtonAddCompetitionResultDistance200;
    private javax.swing.JRadioButton RadioButtonAddCompetitionResultDistance400;
    private javax.swing.JRadioButton RadioButtonAddTrainingBackstroke;
    private javax.swing.JRadioButton RadioButtonAddTrainingBreaststroke;
    private javax.swing.JRadioButton RadioButtonAddTrainingButterfly;
    private javax.swing.JRadioButton RadioButtonAddTrainingCrawl;
    private javax.swing.JRadioButton RadioButtonAddTrainingDistance100;
    private javax.swing.JRadioButton RadioButtonAddTrainingDistance200;
    private javax.swing.JRadioButton RadioButtonAddTrainingDistance400;
    private javax.swing.JRadioButton RadioButtonEditMemberActive;
    private javax.swing.JRadioButton RadioButtonEditMemberBackstroke;
    private javax.swing.JRadioButton RadioButtonEditMemberBasic;
    private javax.swing.JRadioButton RadioButtonEditMemberBreaststroke;
    private javax.swing.JRadioButton RadioButtonEditMemberButterfly;
    private javax.swing.JRadioButton RadioButtonEditMemberCompetitive;
    private javax.swing.JRadioButton RadioButtonEditMemberCrawl;
    private javax.swing.JRadioButton RadioButtonEditMemberPassive;
    private javax.swing.JRadioButton RadioButtonNewMemberActive;
    private javax.swing.JRadioButton RadioButtonNewMemberBackstroke;
    private javax.swing.JRadioButton RadioButtonNewMemberBasic;
    private javax.swing.JRadioButton RadioButtonNewMemberBreaststroke;
    private javax.swing.JRadioButton RadioButtonNewMemberButterfly;
    private javax.swing.JRadioButton RadioButtonNewMemberCompetitive;
    private javax.swing.JRadioButton RadioButtonNewMemberCrawl;
    private javax.swing.JRadioButton RadioButtonNewMemberPassive;
    private javax.swing.JRadioButton RadioButtonTopFiveBackstroke;
    private javax.swing.JRadioButton RadioButtonTopFiveBreaststroke;
    private javax.swing.JRadioButton RadioButtonTopFiveButterfly;
    private javax.swing.JRadioButton RadioButtonTopFiveCrawl;
    private javax.swing.JRadioButton RadioButtonTopFiveDistance100;
    private javax.swing.JRadioButton RadioButtonTopFiveDistance200;
    private javax.swing.JRadioButton RadioButtonTopFiveDistance400;
    private javax.swing.JTextField TextFieldAddCompetitionResultCompetitionTime;
    private javax.swing.JTextField TextFieldAddCompetitionResultCompetitionYear;
    private javax.swing.JTextField TextFieldAddCompetitionResultDateDay;
    private javax.swing.JTextField TextFieldAddCompetitionResultEventName;
    private javax.swing.JTextField TextFieldAddCompetitionResultID;
    private javax.swing.JTextField TextFieldAddCompetitionResultPlacement;
    private javax.swing.JTextField TextFieldAddTrainingDateDay;
    private javax.swing.JTextField TextFieldAddTrainingID;
    private javax.swing.JTextField TextFieldAddTrainingTrainingTime;
    private javax.swing.JTextField TextFieldAddTrainingTrainingYear;
    private javax.swing.JTextField TextFieldEditMemberBirthYear;
    private javax.swing.JTextField TextFieldEditMemberName;
    private javax.swing.JTextField TextFieldNewMemberBirthYear;
    private javax.swing.JTextField TextFieldNewMemberName;
    private javax.swing.JTextField TextFieldRegisterPaymentID;
    private javax.swing.JTextField TextFieldRegisterPaymentPaymentYear;
    private javax.swing.JTextField TextFieldRevokePaymentID;
    private javax.swing.JTextField TextFieldRevokePaymentPaymentYear;
    private javax.swing.JTextField TextFieldSingleMemberArrearCurrentArrear;
    private javax.swing.JTextField TextFieldSingleMemberArrearID;
    private javax.swing.JTextField TextFieldTotalAmountArrears;
    private javax.swing.ButtonGroup buttonGroupAddCompetitionResultDisciplineTypes;
    private javax.swing.ButtonGroup buttonGroupAddCompetitionResultDistance;
    private javax.swing.ButtonGroup buttonGroupAddTrainingDisciplineTypes;
    private javax.swing.ButtonGroup buttonGroupAddTrainingDistance;
    private javax.swing.ButtonGroup buttonGroupCreateMemberActivityType;
    private javax.swing.ButtonGroup buttonGroupCreateMemberPassiveActive;
    private javax.swing.ButtonGroup buttonGroupEditMemberActivityType;
    private javax.swing.ButtonGroup buttonGroupEditMemberPassiveActive;
    private javax.swing.ButtonGroup buttonGroupTopFiveDiscipline;
    private javax.swing.ButtonGroup buttonGroupTopFiveDistance;
    private java.awt.TextArea textAreaAddCompetitionResultMemberList;
    private java.awt.TextArea textAreaAddTrainingMemberList;
    private java.awt.TextArea textAreaAllMembers;
    private java.awt.TextArea textAreaRegisterPaymentMemberList;
    private java.awt.TextArea textAreaRevokePaymentMemberList;
    private java.awt.TextArea textAreaShowAllArrearsMemberList;
    private java.awt.TextArea textAreaSingleMemberArrearMemberList;
    private java.awt.TextArea textAreaViewTopFive;
    // End of variables declaration//GEN-END:variables
}
