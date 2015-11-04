package bank03;

public class Bank {
	private Customer[] customers; // 客户
	private int numberOfCustomers; // 客户个数

	public Bank() {
		customers = new Customer[5];
	}

	// 添加一个customer
	public void addCustomer(String f, String l) {
		Customer cust = new Customer(f, l);
		customers[numberOfCustomers++] = cust;
	}

	// 获取customer个数
	public int getNumberOfCustomer() {
		return numberOfCustomers;
	}

	// 返回指定索引位置的customer
	public Customer getCustomer(int index) {
		return customers[index];
	}
}
