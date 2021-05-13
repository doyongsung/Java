package com.test3;
interface IAttackable {
	void attack(Unit u);
}
interface IMovable {
	void move(int x, int y);
}
interface Fightable extends IMovable, IAttackable{
}

class Unit {
	int currentHP;
	int x;
	int y;
}
class Fighter extends Unit implements Fightable {
	public void move(int x, int y) { }
	public void attack(Unit u) { }
}


public class page1 {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit) {
			System.out.println("f는 Unit 클래스의 자손입니다.");
		}
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable인터페이스를 구현했습니다.");
		}
		if(f instanceof IMovable) {
			System.out.println("f는 IMovable인터페이스를 구현했습니다.");
		}
		if(f instanceof IAttackable) {
			System.out.println("f는 IAttackable인터페이스를 구현했습니다.");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object클래스의 자손입니다.");
		}
		

	}

}
