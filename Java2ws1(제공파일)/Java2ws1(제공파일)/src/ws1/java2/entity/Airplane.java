package ws1.java2.entity;//공통요소뽑기 // 상위선언 super 

public class Airplane extends Vehicle {

	private int numOfEngine;

	public void set_numOfEngine(int numOfEngine) {
		this.numOfEngine = numOfEngine;
	}
	public int get_numOfEngine() {
		return numOfEngine;
	}

	
	public Airplane(String modelName, int maxSpeed, int numberLimit, int numOfEngine ) {
	    super(modelName, maxSpeed, numberLimit);
	    this.numOfEngine = numOfEngine;
	
	}
	public void displayInfo() {
	    super.displayInfo();
		System.out.println(" 엔진개수 : " + numOfEngine + "개");
	}
}
