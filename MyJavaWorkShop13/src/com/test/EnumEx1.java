package com.test;
enum Direction { EAST, SOUTH, WEST, NORTH }
public class EnumEx1 {

	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class,"EAST");
		
		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);
		System.out.println("d3=" + d3);
		
		System.out.println("d1 == d2 ? "+ (d1 == d2));
		System.out.println("d1 == d3 ? "+ (d1 == d3));
		System.out.println("d1.equals(d3) ? " + (d1.compareTo(d3))); //함수는 두개의 값을 비교하여 int 값으로 반환해주는 함수이다.
//		System.out.println("d2 < d3 ? " + (d1 > d3)); //에러
		System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d2)));
		
		switch(d1) {
		case EAST: //Direction.EAST 라고 쓸수 없다.
			System.out.println("The direction is EAST.");
			break;
		case SOUTH :
			System.out.println("The direction is SOUTH.");
			break;
		case WEST:
			System.out.println("The direction is WEST.");
			break;
		default :
			System.out.println("Invalid direction.");
			break;
		}
		Direction[] dArr = Direction.values();
		
		for(Direction d : dArr) //for(Direction d : Direction.values())
			System.out.printf("%s=%d%n", d.name(), d.ordinal());
			
	

	}
}
