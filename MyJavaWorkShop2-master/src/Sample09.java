class Company {
	private String name;
	private String location;
	public Company() {
	}
	public Company(String name, String location) {
		this.name = name; this.location = location;
	}
	public void setName(String name) { // Setter
		this.name = name;
	}
	public String getName() { // Getter
		return this.name;
	}
	public void setCompanyAll(String name, String location) {
		this.name = name;
		this.location = location;
	}
	public void setLocation(String location) { // Setter
		this.location = location;
	}
	public String getLocation() { // Getter
		return this.location;
	}
}
public class Sample09 {

	public static void main(String[] args) {
		Company c = new Company();
		c.setName("ȫ�浿");
		String name = c.getName();
		System.out.println(name);
		c.setLocation("����");
		String location = c.getLocation();
		System.out.println(location);
		
		
	    
		
	
	}

}
