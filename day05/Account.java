package day08;

public class Account {
	protected int id; //�˺�
	protected double balance; //���
	protected double annuaInterestsRate; //������
	
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
	//������
	public double getMonthlyInterest(){
		return this.annuaInterestsRate/12;
	}
	//���
	public void deposit(double amount){
		balance += amount;
	}
	//ȡ�
	public void withdraw(double amount){
		if(this.balance >= amount){
			balance -= amount;		
		}else{
		System.out.println("���㣡");
		}
	}
	
}
