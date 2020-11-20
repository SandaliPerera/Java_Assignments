public class Student extends Person{
	private int numCourses;
	private String[] courses;
	private int[] grades;
	private int maxCourses = 20;
	
	public Student(String name, String address){
		setName(name);
		setAddress(address);
		numCourses = 0;
		courses = new String[maxCourses];
		grades = new int[maxCourses];
	}
	
	public void addCourseGrade(String course, int grade){
		courses[numCourse] = course;
		grades[numCourse] = grade;
		++numCourses;
	}
	
	public void printGrade(){
		System.out.println(this);
		for(int i=0; i<numCourses; ++i){
			System.out.println("Course "+ courses[i]+": Grade : "+ grades[i])
		}
		System.out.println();
	}
		
}