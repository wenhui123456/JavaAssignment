package assignment;

public class Assignment6 {
	public static void talk() {
		System.out.println("hello there!");
	}
	// 1) Write a method that overloads the talk method by taking in a name and printing ¡°Hello¡± with that name:
	public static void talk(String name) {
		System.out.printf("hello %s!\n", name);
	}
	
	public static void main(String[] args) {
		talk();
		talk("Matthew");
	}

}
