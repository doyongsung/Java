//value type Ŭ����Ÿ������ �ٲ��ִ� �Լ� ,�޼ҵ�
//Integer
//reference type => Object class

class Employee extends Object{
		public String toString() {
		//��ü�Ǵ����ؽ��ڵ带�޾Ƽ��Ҽ�������
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
