
import javax.swing.JOptionPane;


public enum AccountType {
	
	
    Administrator, Student, Staff, Guest; 
public static void main(String[] args) {
    AccountType[] choices = { AccountType.Administrator,
                 AccountType.Student, AccountType.Staff, AccountType.Guest };
AccountType select = (AccountType)JOptionPane.showInputDialog(null, "Select your account type.", "Account Type", JOptionPane.QUESTION_MESSAGE,null, choices,choices[3]);
        
		switch (select){
           
           case Administrator:
           JOptionPane.showMessageDialog(null, "Welcome Administrator ");
           break;
           
           case Student:
               JOptionPane.showMessageDialog(null, "Welcome Student ");
               break;
               
           case Staff:
               JOptionPane.showMessageDialog(null, "Welcome Staff ");
               break;
               
           case Guest:
               JOptionPane.showMessageDialog(null, "Welcome Guest ");
               break;
           
    }
}}
