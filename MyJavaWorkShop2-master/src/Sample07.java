class Employee2 {
	String name;
	int age;
	boolean gender;
	int grade;
}
public class Sample07 {
//	static void printEmp(String name, int age, boolean gender, int grade) {
//		Employee2 emp = new Employee2();
//		emp.name = name;
//		emp.age = age;
//		emp.gender = gender;
//		emp.grade = grade;
//		
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(gender);
//		System.out.println(grade);
//	}
	static void printEmp(Employee2 e) {
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.gender);
		System.out.println(e.grade);
		
		
	}
	public static void main(String[] args) {
		Employee2 emp = new Employee2();
		printEmp(emp);
		
		
		

	}

}
