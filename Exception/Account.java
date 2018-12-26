package bank;


public abstract class Account
{
	private static long accNum=0;
	private double balance;
	private static Person accHolder;
	
	
	abstract void withdraw(double withdrawMoney);
	
	public long getAccNum() 
	{
		return accNum;
	}
	public void setAccNum(long accNum)
	{
		Account.accNum = accNum;
	}
	public static Person getAccHolder()
	{
		return accHolder;
	}
	public void setAccHolder(Person accHolder) 
	{
		Account.accHolder = accHolder;
	}
	
	public void setBalance(double balance) 
	{
		//this.balance = balance;
		if(balance>=500)
			this.balance=balance;
		else
		System.out.println("Minimum balance must be 500");
	}
	public void deposit(double depositMoney)
	{
		balance += depositMoney;
		System.out.println(depositMoney+" INR has been successfully Deposited to "+accHolder.getName()+" Account");
		System.out.println("Updated Balance of "+accHolder.getName()+" account is "+balance);
	}
	
	public double getBalance()
	{
		
		return balance;
	}
	public Account(double balance,Person accHolder)
	{
		super();
		Account.accNum++;
		setBalance(balance);
		Account.accHolder=accHolder;
	}
	
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder.getName() + "]";
	}
	
}
