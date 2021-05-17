package ws1.java2.controller;

import java.util.*;

import ws1.java2.entity.*;

public class VehicleManager{
//	Airplane[] airplaneArr;
//	Car[] carArr;
//	Ship[] shipArr;
	
//	Vehicle[] vehicles;
	ArrayList Vehicle;
	public VehicleManager() {
		
//		vehicles = new Vehicle[3];
//		vehicles[0] = new Airplane("보잉747", 1300 ,300 ,4);
//		vehicles[1] = new Car("그랜저" ,180 ,5 ,10);
//		vehicles[2] = new Ship("크루즈2",30 ,400 ,35000);
//		
//		List<Vehicle> al = new ArrayList<Vehicle>();
//		al.add(new Airplane("보잉747",1300,300,4));
//		al.add(new Car("그랜저", 180, 5, 10));
//		al.add(new Ship("크루즈2",30 , 400, 35000));
		Vehicle = new ArrayList();
		Vehicle.add(new Airplane("보잉747", 1300 ,300 ,4));
		Vehicle.add(new Car("그랜저" ,180 ,5 ,10));
		Vehicle.add(new Ship("크루즈2",30 ,400 ,35000));
		
		
	
	
		
//		airplaneArr[0] = new Airplane("보잉747", 1300 ,300 ,4);
//		airplaneArr[1] = new Airplane("F-15",1600 ,1 ,1);
//		
//		carArr[0] = new Car("그랜저" ,180 ,5 ,10);
//		carArr[1] = new Car("스파크",130,4,15);
//		carArr[2] = new Car("스타렉스",150 ,10 ,11);
//		
//
//		shipArr[0] = new Ship("크루즈2",30 ,400 ,35000);
//		shipArr[1] = new Ship("노틸러스",25 ,150 ,15000);
}
	
	
	public void displayVehicles(String title) {
		System.out.println(title);
		
		for(int inx = 0; inx <Vehicle.size(); inx++) {
			Object obj = Vehicle.get(inx);
			Vehicle a = (Vehicle)obj;
			a.displayInfo();
			}
		
		Iterator itr = Vehicle.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			Vehicle a = (Vehicle)obj;
			a.displayInfo();
		}
	  
//		for(int i = 0; i < vehicles.length; i++) {
//			vehicles[i].displayInfo();
//		}
//		for (int inx = 0 ; inx < airplaneArr.length ; inx++) {
//			airplaneArr[inx].displayInfo();
//			airplaneArr[inx].set_available(true);
//		}
//		
//		for (int inx = 0 ; inx < carArr.length ; inx++) {
//			carArr[inx].displayInfo();
//			carArr[inx].set_available(true);
//		}
//		
//		for (int inx = 0 ; inx < shipArr.length ; inx++) {
//			shipArr[inx].displayInfo();
//			shipArr[inx].set_available(true);
//		}
//		
//		System.out.println();
		

	}
	public void displayVehicles1() {
		
	}

	}


