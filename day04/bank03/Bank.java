package bank03;

public class Bank {
	private Customer[] customers; // �ͻ�
	private int numberOfCustomers; // �ͻ�����

	public Bank() {
		customers = new Customer[5];
	}

	// ���һ��customer
	public void addCustomer(String f, String l) {
		Customer cust = new Customer(f, l);
		customers[numberOfCustomers++] = cust;
	}

	// ��ȡcustomer����
	public int getNumberOfCustomer() {
		return numberOfCustomers;
	}

	// ����ָ������λ�õ�customer
	public Customer getCustomer(int index) {
		return customers[index];
	}
}
