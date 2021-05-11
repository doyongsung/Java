class Member {
	private String name;
	private String id;
	private int age;
		

public void setName(String name) {
	this.name = name;
	 }	
public String getName() {
	return this.name; 
	}
public void setId(String id) {
	this.id = id;
}
public String getId() {
	return this.id;
}
public void setAge(int age) {
	this.age = age;
}
public int getAge() {
	return this.age;
}

}
public class Quiz01 {

	public static void main(String[] args) {
		Member a = new Member();
		
		a.setName("µµ¿ë¼º");
		String name = a.getName();
		System.out.println(name);
		
		a.setId("ppelpp");
		String id = a.getId();
		System.out.println(id);
        
		a.setAge(28);
		int age = a.getAge();
		System.out.println(age);
        
	    
	}

}
