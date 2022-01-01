package assignment;

//Assignment4 4)
public class Student {
	String name;
	String id;
	String course;
	public Student() {
	}
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, String id) {
		this(name);
		this.id = id;
	}
	public Student(String name, String id, String course) {
		this(name, id);
		this.course = course;
	}
}
