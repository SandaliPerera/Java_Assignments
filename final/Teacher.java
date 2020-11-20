public class Teacher extends Person{
	private int numCourses;
	private String[] courses;
	private int maxCourses = 5;
	private double baseSalary;
	
	public Teacher(String name, String address){
		setName(name);
		setAddress(address);
		numCourses = 0;
		courses = new String[maxCourses];
	}
	
	public Teacher(String name, String address, int salary){
		setName(name);
		setAddress(address);
		numCourses = 0;
		courses = new String[maxCourses];
		this.baseSalary = salary;
	}
	
	public void setBaseSalary(int salary){
		this.baseSalary = salary;
	}
	
	public void addCourse(String course){
		courses[numCourses] = course;
		numCourses++;
	}
	
	public void printBaseSalary(){
		System.out.println(this);
		System.out.println("Base Salary: "+ baseSalary);
	}
}