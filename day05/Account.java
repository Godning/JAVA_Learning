package day08;

public class Account {
	protected int id; //账号
	protected double balance; //余额
	protected double annuaInterestsRate; //年利率
	
	public Account(int id, double balance, double annuaInterestsRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annuaInterestsRate = annuaInterestsRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnuaInterestsRate() {
		return annuaInterestsRate;
	}

	public void setAnnuaInterestsRate(double annuaInterestsRate) {
		this.annuaInterestsRate = annuaInterestsRate;
	}
	//月利率
	public double getMonthlyInterest(){
		return this.annuaInterestsRate/12;
	}
	//存款
	public void deposit(double amount){
		balance += amount;
	}
	//取款、
	public void withdraw(double amount){
		if(this.balance >= amount){
			balance -= amount;		
		}else{
		System.out.println("余额不足！");
		}
	}
	
}
