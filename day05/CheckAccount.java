package day08;

//��͸֧���˻�
public class CheckAccount extends Account {
	private double overdraft;// ��͸֧���

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

	//����͸֧���ȡǮ����
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else if (overdraft >= amount - balance) {
			//ע�������е�˳��
			overdraft -= (amount - balance);
			balance = 0;
		}else{
			System.out.println("������͸֧����޶");
		}
	}
}
