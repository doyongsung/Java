class MyClass {	
	void myMethod() {
		int a = 0;
		System.out.println(name);
	}
	String name;
	static String name2;
	static void myMethod2() {
		System.out.println(name2);
	}
}

public class Sample01 {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		
		obj.name = "�̼���";
		System.out.println(obj.name);
		obj.myMethod();
		MyClass.name2 = "�������";
		MyClass.myMethod2();
		

	}

}
