package day08;

public class TestAccount {
	public static void main(String[] args) {
		Account acct = new Account(1122,20000,0.045);
		
		acct.withdraw(30000);
		System.out.println("��ǰ���Ϊ��"+acct.getBalance());
		
		acct.withdraw(2500);
		acct.deposit(3000);
		System.out.println("��ǰ���Ϊ�� "+ acct.getBalance());
		System.out.println("������Ϊ�� "+ acct.getMonthlyInterest());
	}
}
