
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.Arrays;
 
public class BankAccount extends JFrame {
 
    // Make these variables publicly available
    public static String Name;
    public static int Accountnum;
    public static int Balance;
    private static final String EMPTY = "EMPTY";
 
    // Setup Arrays for each account
    public static String[] account1 = new String[3];
    public static String[] account2 = new String[3];
    public static String[] account3 = new String[3];
    public static String[] account4 = new String[3];
    public static String[] account5 = new String[3];
    public static String[] account6 = new String[3];
    public static String[] account7 = new String[3];
    public static String[] account8 = new String[3];
    public static String[] account9 = new String[3];
    public static String[] account10 = new String[3];
 
    // JPanel for user inputs
    private JPanel inputDetailJPanel;
 
    // JLabel and JTextField for account name
    private JLabel NameJLabel;
    private JTextField NameJTextField;
 
    // JLabel and JTextField for account number
    private JLabel AccountnumJLabel;
    private JTextField AccountnumJTextField;
 
    // JLabel and JTextField for balance
    private JLabel BalanceJLabel;
    private JTextField BalanceJTextField;
 
    // JLabel and JTextField for withdraw
    private JLabel LodgeJLabel;
    private JTextField LodgeJTextField;
 
    // JLabel and JTextField for Withdraw
    private JLabel WithdrawJLabel;
    private JTextField WithdrawJTextField;
 
    // JButton to create account
    private JButton CreateAccountJButton;
 
    // JButton to delete account
    private JButton DeleteAccountJButton;
 
    // JButton to make transaction
    private JButton TransactionJButton;
 
    // JLabel and JTextArea to display account details
    private JLabel displayJLabel;
    private JTextArea displayJTextArea;
 
    // initialize number of students to zero
    private int BankCount = 0;
 
    // constants
    private final int Details = 3;
    private final int MaxAccounts = 10;
    private final int FIRST = 0;
    private final int SECOND = 1;
    private final int THIRD = 2;
 
    // one-dimensional array to store Account names
    private String AccountNames[] = new String[MaxAccounts];
 
    // two-dimensional array to store Account details
    private int Account[][] = new int[MaxAccounts][Details];
 
    // constructor
    public BankAccount() {
        createUserInterface();
    }
 
    // create and position GUI components; register event handlers
    private void createUserInterface() {
        // get content pane for attaching GUI components
        Container contentPane = getContentPane();
 
        // enable explicit positioning of GUI components
        contentPane.setLayout(null);
 
        // set up inputDetailJPanel
        inputDetailJPanel = new JPanel();
        inputDetailJPanel.setBounds(16, 16, 208, 218);
        inputDetailJPanel.setBorder(new TitledBorder("Input Details"));
        inputDetailJPanel.setLayout(null);
        contentPane.add(inputDetailJPanel);
 
        // set up NameJLabel
        NameJLabel = new JLabel();
        NameJLabel.setBounds(8, 32, 90, 23);
        NameJLabel.setText("Name:");
        inputDetailJPanel.add(NameJLabel);
 
        // set up NameJTextField
        NameJTextField = new JTextField();
        NameJTextField.setBounds(104, 32, 88, 21);
        NameJTextField.setHorizontalAlignment(JTextField.RIGHT);
        inputDetailJPanel.add(NameJTextField);
 
        // set up AccountnumJLabel
        AccountnumJLabel = new JLabel();
        AccountnumJLabel.setBounds(8, 56, 100, 23);
        AccountnumJLabel.setText("Account Number:");
        inputDetailJPanel.add(AccountnumJLabel);
 
        // set up AccountnumTextField
        AccountnumJTextField = new JTextField();
        AccountnumJTextField.setBounds(112, 56, 80, 21);
        AccountnumJTextField.setHorizontalAlignment(JTextField.RIGHT);
        inputDetailJPanel.add(AccountnumJTextField);
 
        // set up BalanceJLabel
        BalanceJLabel = new JLabel();
        BalanceJLabel.setBounds(8, 80, 60, 23);
        BalanceJLabel.setText("Balance:");
        inputDetailJPanel.add(BalanceJLabel);
 
        // set up BalanceTextField
        BalanceJTextField = new JTextField();
        BalanceJTextField.setBounds(112, 80, 80, 21);
        BalanceJTextField.setHorizontalAlignment(JTextField.RIGHT);
        inputDetailJPanel.add(BalanceJTextField);
 
        // set up LodgeJLabel
        LodgeJLabel = new JLabel();
        LodgeJLabel.setBounds(8, 104, 80, 23);
        LodgeJLabel.setText("Lodgement:");
        inputDetailJPanel.add(LodgeJLabel);
 
        // set up LodgeJTextField
        LodgeJTextField = new JTextField();
        LodgeJTextField.setBounds(112, 104, 80, 21);
        LodgeJTextField.setHorizontalAlignment(JTextField.RIGHT);
        inputDetailJPanel.add(LodgeJTextField);
 
        // set up WithdrawJLabel
        WithdrawJLabel = new JLabel();
        WithdrawJLabel.setBounds(8, 128, 60, 23);
        WithdrawJLabel.setText("Withdraw:");
        inputDetailJPanel.add(WithdrawJLabel);
 
        // set up WithdrawJTextField
        WithdrawJTextField = new JTextField();
        WithdrawJTextField.setBounds(112, 128, 80, 21);
        WithdrawJTextField.setHorizontalAlignment(JTextField.RIGHT);
        inputDetailJPanel.add(WithdrawJTextField);
 
        // set up CreateAccountButton
        CreateAccountJButton = new JButton();
        CreateAccountJButton.setBounds(112, 152, 80, 24);
        CreateAccountJButton.setText("Create");
        inputDetailJPanel.add(CreateAccountJButton);
        CreateAccountJButton.addActionListener(
 
        new ActionListener() {
            // event handler called when CreateAccountJButton
            // is clicked
            public void actionPerformed(ActionEvent event) {
                CreateAccountJButtonActionPerformed(event);
            }
 
        }
 
        ); // end call to addActionListener
 
        // set up DeleteAccountButton
        DeleteAccountJButton = new JButton();
        DeleteAccountJButton.setBounds(16, 152, 80, 24);
        DeleteAccountJButton.setText("Delete");
        inputDetailJPanel.add(DeleteAccountJButton);
        DeleteAccountJButton.addActionListener(
 
        new ActionListener() // anonymous inner class
                {
                    // event handler called when DeleteAccountJButton
                    // is clicked
                    public void actionPerformed(ActionEvent event) {
                        DeleteAccountJButtonActionPerformed(event);
 
                    }
 
                }
 
                ); // end call to addActionListener
 
        // set up TransactionJButton
        TransactionJButton = new JButton();
        TransactionJButton.setBounds(16, 180, 176, 24);
        TransactionJButton.setText("Make Transaction");
        inputDetailJPanel.add(TransactionJButton);
        TransactionJButton.addActionListener(
 
        new ActionListener() // anonymous inner class
                {
                    // event handler called when TransactionJButton
                    // is clicked
                    public void actionPerformed(ActionEvent event) {
                        TransactionJButtonActionPerformed(event);
                    }
 
                } // end anonymous inner class
 
                ); // end call to addActionListener
 
        // set up displayJLabel
        displayJLabel = new JLabel();
        displayJLabel.setBounds(240, 16, 150, 23);
        displayJLabel.setText("Account Details:");
        contentPane.add(displayJLabel);
 
        // set up displayJTextArea
        displayJTextArea = new JTextArea();
        displayJTextArea.setBounds(240, 48, 402, 184);
        displayJTextArea.setEditable(false);
        contentPane.add(displayJTextArea);
 
        // set properties of application's window
        setTitle("Bank Accounts"); // set title bar string
        setSize(670, 308); // set window size
        setVisible(true); // display window
 
    } // end method createUserInterface
 
    private void CreateAccountJButtonActionPerformed(ActionEvent event) {
        // System.out.println("Create Account Button Clicked");
        Name = NameJTextField.getText();
        Accountnum = Integer.parseInt(AccountnumJTextField.getText());
        Balance = Integer.parseInt(BalanceJTextField.getText());
 
        displayJTextArea.setText(Name + " " + Accountnum + " " + Balance);
 
        // Check to see if each account array is populated and
        // if not add account details
        if (account1[0] == EMPTY) {
            account1[0] = Name;
            account1[1] = Integer.toString(Accountnum);
            account1[2] = Integer.toString(Balance);
            System.out.println("Account 1 Created");
        } else if (account2[0] == EMPTY) {
            account2[0] = Name;
            account2[1] = Integer.toString(Accountnum);
            account2[2] = Integer.toString(Balance);
            System.out.println("Account 2 Created");
        } else if (account3[0] == EMPTY) {
            account3[0] = Name;
            account3[1] = Integer.toString(Accountnum);
            account3[2] = Integer.toString(Balance);
            System.out.println("Account 3 Created");
        } else if (account4[0] == EMPTY) {
            account4[0] = Name;
            account4[1] = Integer.toString(Accountnum);
            account4[2] = Integer.toString(Balance);
            System.out.println("Account 4 Created");
        } else if (account5[0] == EMPTY) {
            account5[0] = Name;
            account5[1] = Integer.toString(Accountnum);
            account5[2] = Integer.toString(Balance);
            System.out.println("Account 5 Created");
        } else if (account6[0] == EMPTY) {
            account6[0] = Name;
            account6[1] = Integer.toString(Accountnum);
            account6[2] = Integer.toString(Balance);
            System.out.println("Account 6 Created");
        } else if (account7[0] == EMPTY) {
            account7[0] = Name;
            account7[1] = Integer.toString(Accountnum);
            account7[2] = Integer.toString(Balance);
            System.out.println("Account 7 Created");
        } else if (account8[0] == EMPTY) {
            account8[0] = Name;
            account8[1] = Integer.toString(Accountnum);
            account8[2] = Integer.toString(Balance);
            System.out.println("Account 8 Created");
        } else if (account9[0] == EMPTY) {
            account9[0] = Name;
            account9[1] = Integer.toString(Accountnum);
            account9[2] = Integer.toString(Balance);
            System.out.println("Account 9 Created");
        } else if (account10[0] == EMPTY) {
            account10[0] = Name;
            account10[1] = Integer.toString(Accountnum);
            account10[2] = Integer.toString(Balance);
            System.out.println("Account 10 Created");
 
            // Once account 10 is created. All accounts full.
            System.out.println("All Accounts Full!");
            // disable CreateAccountsJButton
            CreateAccountJButton.setEnabled(false);
        }
 
        // This is just an example so show the arrays are populated...
        displayJTextArea.setText("Account 1: " + "\n" + account1[0] + "\n"
                + account1[1] + "\n" + account1[2] + "\n" + "Account 2: " + "\n"
                + account2[0] + "\n" + account2[1] + "\n" + account2[2] + "\n"
                + "Account 3: " + "\n" + account3[0] + "\n" + account3[1]
                + "\n" + account3[2] + "\n");
 
 
    }
 
    private void DeleteAccountJButtonActionPerformed(ActionEvent event) {
 
        System.out.println("DELETE BUTTON PRESSED");
        Name = NameJTextField.getText();
        System.out.println("Delete Account: " + Name);
 
        // Delete accounts which match the account Name
        if (account1[0].equals(Name)) {
            Arrays.fill(account1, EMPTY);
            displayJTextArea.setText(Name + " Account Deleted.");
 
        } else if (account2[0].equals(Name)) {
            Arrays.fill(account2, EMPTY);
            displayJTextArea.setText(Name + " Account Deleted.");
 
        } else if (account3[0].equals(Name)) {
            Arrays.fill(account3, EMPTY);
            displayJTextArea.setText(Name + " Account Deleted.");
 
        } else if (account4[0].equals(Name)) {
            Arrays.fill(account4, EMPTY);
            displayJTextArea.setText(Name + " Account Deleted.");
 
        } else if (account5[0].equals(Name)) {
            Arrays.fill(account5, EMPTY);
            displayJTextArea.setText(Name + " Account Deleted.");
 
        } else if (account6[0].equals(Name)) {
            Arrays.fill(account6, EMPTY);
            displayJTextArea.setText(Name + " Account Deleted.");
 
        } else if (account7[0].equals(Name)) {
            Arrays.fill(account7, EMPTY);
            displayJTextArea.setText(Name + " Account Deleted.");
 
        } else if (account8[0].equals(Name)) {
            Arrays.fill(account8, EMPTY);
            displayJTextArea.setText(Name + " Account Deleted.");
 
        } else if (account9[0].equals(Name)) {
            Arrays.fill(account9, EMPTY);
            displayJTextArea.setText(Name + " Account Deleted.");
 
        } else if (account10[0].equals(Name)) {
            Arrays.fill(account10, EMPTY);
            displayJTextArea.setText(Name + " Account Deleted.");
 
        }
 
 
        // clear JTextFields for new data
 
        //NameJTextField.setText("");
        //AccountnumJTextField.setText("");
        //BalanceJTextField.setText("");
        //LodgeJTextField.setText("");
        //WithdrawJTextField.setText("");
 
    }
 
 
    private void TransactionJButtonActionPerformed(ActionEvent event) {
        // get user input
        int Accountnum = Integer.parseInt(AccountnumJTextField.getText());
        int Lodge = Integer.parseInt(LodgeJTextField.getText());
        int Withdraw = Integer.parseInt(LodgeJTextField.getText());
        
        
 
        Account[BankCount][SECOND] = Lodge;
        Account[BankCount][THIRD] = Withdraw;
 
        // clear other JTextFields for new data
        NameJTextField.setText("");
        AccountnumJTextField.setText("");
        BalanceJTextField.setText("");
        LodgeJTextField.setText("");
        WithdrawJTextField.setText("");
 
        // if no Accounts have been entered
        if (BankCount < 1) {
            // disable TransactionJButton
            TransactionJButton.setEnabled(false);
        }
 
    }
 
    private void display() {
        // add a header to displayJTextArea
        displayJTextArea
                .setText("Name\tAccount No.\tLodge\tWithdraw\tBalance\n");
 
        /*
         * for ( int account = 0; account < BankCount; account++ ) { // display
         * names displayJTextArea.append( Name[ account ] + "\t" ); }
         */
 
    }
 
    public static void main(String[] args) {
        // Populate arrays with the word EMPTY
        // so we can check to see if the values are empty later
        Arrays.fill(account1, EMPTY);
        Arrays.fill(account2, EMPTY);
        Arrays.fill(account3, EMPTY);
        Arrays.fill(account4, EMPTY);
        Arrays.fill(account5, EMPTY);
        Arrays.fill(account6, EMPTY);
        Arrays.fill(account7, EMPTY);
        Arrays.fill(account8, EMPTY);
        Arrays.fill(account9, EMPTY);
        Arrays.fill(account10, EMPTY);
 
        BankAccount application = new BankAccount();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
}