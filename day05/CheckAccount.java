package day08;

//可透支的账户
public class CheckAccount extends Account {
	private double overdraft;// 可透支额度

	public CheckAccount(int id, double init_balance, double annualIterestRate, double overdraft) {
		super(id, init_balance, annualIterestRate);
		this.overdraft = overdraft;
	}
	
	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	//存在透支额的取钱操作
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else if (overdraft >= amount - balance) {
			//注意这两行的顺序
			overdraft -= (amount - balance);
			balance = 0;
		}else{
			System.out.println("超过可透支额的限额！");
		}
	}
}
