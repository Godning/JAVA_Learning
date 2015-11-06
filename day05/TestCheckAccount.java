package day08;

public class TestCheckAccount {
	public static void main(String[] args) {
		CheckAccount ca = new CheckAccount(1122, 20000, 0.045, 1000);
		
		ca.withdraw(5000);
		System.out.println("当前余额为："+ ca.getBalance());
		System.out.println("当前的可透支额度为： "+ ca.getOverdraft());
		
		ca.withdraw(18000);
		System.out.println("当前余额为："+ ca.getBalance());
		System.out.println("当前的可透支额度为： "+ ca.getOverdraft());
		
		ca.withdraw(16000);
		System.out.println("当前余额为："+ ca.getBalance());
		System.out.println("当前的可透支额度为： "+ ca.getOverdraft());
		
	}
}
