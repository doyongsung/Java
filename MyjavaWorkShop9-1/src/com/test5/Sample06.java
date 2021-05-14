package com.test5;
abstract class Database {
	public void open() {
		System.out.println("Database open");
	}
	abstract void select();
}

class Oracle extends Database {
	public void select() {
		System.out.println("Oracle open");
	}	
}
class MySql extends Database {
	public void select() {
		System.out.println("MySql open");
	}
}
class Dbmanager1 {
	Database db;
	public Dbmanager1(Database db) {
		this.db = db;
	}
	public void run() {
		db.select();
	}
	
	
}
public class Sample06 {
	public static void main(String[] args) {
		Dbmanager1 dbg = new Dbmanager1(new MySql());
		dbg.run();
	

	}

}
