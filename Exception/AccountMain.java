package bankAccount;

public class AccountMain extends Account
{
	
	




	public AccountMain(double balance, Person accHolder) {
		super(balance, accHolder);
		// TODO Auto-generated constructor stub
	}




	void withdraw(double withdrawMoney)
	{
		if((getBalance()-withdrawMoney)>=500) {
		setBalance(getBalance() - withdrawMoney);
		System.out.println(withdrawMoney+" INR has been successfully Withdrawn from "+getAccHolder().getName()+" Account");
		System.out.println("Updated Balance of "+getAccHolder().getName()+" account is "+getBalance());
		}
		else {
			System.out.println("Money can't be withdrawn");
			System.out.println("Insufficient Fund / Minimum Balance Should be Rs. 500");
		}
	}
	
	
	
	
	public static void main(String[] args)
	{
		Person person = new Person("Smith", 21);
		AccountMain account = new AccountMain(2450, person);
		System.out.println("Available Balance in the account of "+getAccHolder().getName()+" account is :"+account.getBalance());
		//System.out.println();
		account.withdraw(2000);
		System.out.println(account);
		
		System.out.println("----------------------------------------------------------\n");
		Person person1 = new Person("kathy", 21);
		AccountMain account1 = new AccountMain(500000, person1);
		System.out.println("Available Balance in the account of "+getAccHolder().getName()+" account is :"+account1.getBalance());
		account1.withdraw(50001);
		System.out.println(account1);
		
	}
}
