public class Student extends Person{
	private int numCourse;
	private String[] courses;
	private int[] grades;
	private int maxCourses = 20;
	
	public Student(String name, String address){
		setName(name);
		setAddress(address);
		numCourse = 0;
		courses = new String[maxCourses];
		grades = new int[maxCourses];
	}
	
	public void addCourseGrade(String course, int grade){
		course[numCourse] = course;
		grade[numCourse] = grade;
		++numCourse;
	}
	
	public void printGrade(){
		System.out.println(this);
		for(int i=0; i<numCourse; ++i){
			System.println("Course "+ course[i]+": Grade : "+ grades[i])
		}
		System.out.println();
	}
		
}