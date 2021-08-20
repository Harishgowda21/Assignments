package Test;

public class SavingsAccount implements BankAccount {
	
	private final String c= "Savings Account";
	  public void AccountType(){
	    System.out.println("This is "+c);
	    
	  }
	  public void checkBankBalance(){
	    System.out.println("The balance is Rs 100000000");
	  }
	  public void validateUser(){
	    System.out.println("User is valid");
	  }

}
