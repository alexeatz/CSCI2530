package bankAccount;
//As requested, Ms. Mao asked for time to complete
//this took about 2 hours, w/ majority of the time spent
//finding a return if ID could not be found (IK, it should have been easier)
//However, really liked this project, helped me understand
//OOPS
public class BankAccount {

	private String name;
	private String ID;
	private double balance;
	private double interestRate= .035;
	private static int numAccounts = 0;
	
	public BankAccount(String n, String i, double b, double ir)
	{
		name = n;
		ID = i;
		balance = b;
		interestRate = ir;
		numAccounts++;
		
	}
	
	public BankAccount()
	{
		this("", "", 0.00, 0.035);
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getID()
	{
		return ID;
	}
	
	public double getBal()
	{
		return balance;
	}
	
	public double getInt()
	{
		return interestRate;
	}
	public static int getNumAccounts()
	{
		return numAccounts;
	}
	public void setInt(double newInt)
	{
		this.interestRate = newInt;
	}
	public double withdraw(double amnt)
	{
		if (amnt > balance)
		{
			System.out.println("Insufficient Funds");
			return 0;
			//maybe do boolean statement instead of return and use that to state a string with overdraw
		}
		
		else
		{
			balance = balance - amnt;
			System.out.println(this.getName() + "'s new balance: $" + balance);
			return balance;
			//return remaining balance
		}
	}
	
	public double deposit(double amnt)
	{
		balance = balance + amnt;
		System.out.println(this.getName() +"'s new Balance: $" + balance);
		return balance;
	}
}
