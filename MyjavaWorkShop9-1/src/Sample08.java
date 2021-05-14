//value type 클래스타입으로 바꿔주는 함수 ,메소드
//Integer
//reference type => Object class

class Employee extends Object{
		public String toString() {
		//객체의대한해쉬코드를받아서할수도있음
		Integer i = new Integer(this.hashCode());
		return i.toString();
		//return "Employee Class";
		
	}
}

public class Sample08 {
	public static void main(String[] args) {
		Employee emp = new Employee();
		String temp = emp.toString();
		System.out.println(temp);
		System.out.println(emp);
		Employee emp2 = new Employee();
	    System.out.println(emp2);
	    int a = 1;
	    Integer a1 = new Integer(1);
	    Float a2 = new Float(1.2);

	}
}
