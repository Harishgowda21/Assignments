package Test;

public class CurrentAccount implements BankAccount {
	
	 private final String a= "Current Account";
	  
	  public void AccountType(){
	    System.out.println("This is "+a);
	  }
	  public void checkBankBalance(){
	    System.out.println("The balance is Rs.80000000");
	  }
	  public void validateUser(){
	    System.out.println("User is valid");
	  }

}
