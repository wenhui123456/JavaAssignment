package assignment;

//8. 1) Edit this code so the class Beagle is a subclass of the Dog class. When you 
//run the code it should print ¡°woof!¡± and then ¡°arf arf¡±:
public class Dog {
	public void speak() {
		System.out.println("woof!");
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.speak();
		Dog b = new Beagle();
		b.speak();
	}
}
class Beagle extends Dog{
	public void speak() {
		System.out.println("arf arf!");
	}
}
