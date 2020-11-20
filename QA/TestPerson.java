public class TestPerson{
	public static void main(String[] args){
		System.println("Details of Students: ");
		System.println("--------------------");
		Student s1 = student ("Sanjani","UCSC, Colombo");
		s1.addCourseGrade("IS2104", 67);
		s1.addCourseGrade("IS2101", 87);
		s1.printGrade();
		
		Ststem.out.println("Details of teachers: ");
		System.out.println("-----------------");
		Teacher t1 = Teacher ("Mark Silva", "UCSC, Colombo");
		t1.printBaseSalary();
		String[] courses = {"CS11201", "CS1234"};
		
		for (String course : courses){
			t1.addCourse(course);
			System.out.println("Course" + course + "assigned");
		}
	}
}