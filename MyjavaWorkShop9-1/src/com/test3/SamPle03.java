package com.test3;
interface IDatabase{
	public void open();//인터페이스 사용시 그대로 사용해야함
}
interface IQuery {
	public void select();
}

class Oracle implements IDatabase, IQuery{//인터페이스 사용시 그대로 사용해야함
	public void open() {
		System.out.println("Oracle open");
	}
	public void select() {
		System.out.println("Oracle query");
	}
}
class MySql implements IDatabase {//인터페이스 사용시 그대로 사용해야함
	public void open() {
		System.out.println("MySql open");
	}
}
public class SamPle03 {
	static void openDb(IDatabase db) {
		db.open();
	}
	public static void main(String[] args) {
		Oracle oracle = new Oracle();
		oracle.open();
		IDatabase db = new Oracle();
		db.open();
		IDatabase db2 = new MySql();
		db2.open();
		IQuery db3 = new Oracle();
		db3.select();
	}
	

}
