package labexe4;


public class CurrentAccount extends Account
{
	final long overdraft=20000;
	
	public CurrentAccount(double balance, Person accHolder) {
	super(balance, accHolder);
	}

	//@Override
	public void withdraw(double withdrawMoney) {
		if(overdraft-withdrawMoney>0)
			super.withdraw(withdrawMoney);
		else 
			System.out.println(" cannot withdraw above your account overdraft limit ");
	}

}
