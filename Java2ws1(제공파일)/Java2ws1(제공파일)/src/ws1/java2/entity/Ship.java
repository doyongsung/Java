package ws1.java2.entity;

public class Ship extends Vehicle{
	
	private int replacement;
	
	public void set_replacement(int replacement) {
		this.replacement = replacement;
	}
	public int get_replacement() {
		return replacement;
	}

public Ship(String modelName, int maxSpeed, int numberLimit, int replacement ) {
	super(modelName, maxSpeed, numberLimit);
	this.replacement = replacement;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println(" ¹è ¼ö ·® : " + replacement + "Åæ");
	}
}
