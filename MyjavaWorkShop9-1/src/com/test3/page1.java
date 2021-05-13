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
			System.out.println("f�� Unit Ŭ������ �ڼ��Դϴ�.");
		}
		if(f instanceof Fightable) {
			System.out.println("f�� Fightable�������̽��� �����߽��ϴ�.");
		}
		if(f instanceof IMovable) {
			System.out.println("f�� IMovable�������̽��� �����߽��ϴ�.");
		}
		if(f instanceof IAttackable) {
			System.out.println("f�� IAttackable�������̽��� �����߽��ϴ�.");
		}
		if(f instanceof Object) {
			System.out.println("f�� ObjectŬ������ �ڼ��Դϴ�.");
		}
		

	}

}
