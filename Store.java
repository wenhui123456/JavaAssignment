package assignment;

//Assignment4 5) and Assigment6
/* Create class Store and set its attributes location, store name to private. 
Write constructor of class Store to initialize attributes  location, store name. 
Write method set and get to change the attributes of objects of class Store.
*/ 

public class Store {
	private String location;
	private String storeName;
	
	public Store(String location, String storeName) {
		this.storeName = storeName;
		this.location = location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	public String getLocation() {
		return this.location;
	}
	public String getStoreName() {
		return this.storeName;
	}
	
	//Assignment4 5)
	public String returnExchange(double payment) {
		return "exchange "+Double.valueOf(payment);
	}
	public static void main(String[] args) {
		Store store = new Store("sacramento", "wenhui");
		System.out.println(store.getLocation()+ " "+ store.getStoreName());
		store.setLocation("san jose");
		store.setStoreName("lily");
		System.out.println(store.getLocation()+ " "+ store.getStoreName());
		System.out.println(store.returnExchange(3.3));

	}
}
