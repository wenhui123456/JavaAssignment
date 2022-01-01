package assignment;

//Assignment4 6)
public class Customer {
	
	public static void main(String[] args) {
		int n = 3;
		Customer[] customers = new Customer[3];
		for(int i = 0; i < n; i++) {
			customers[i] = new Customer();
			System.out.println(customers[i]);
		}
		System.out.println(customers.toString());
	}
}
