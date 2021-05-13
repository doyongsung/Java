package com.test4;
interface IDatabase {
	public void open();
	}
class Oracle implements IDatabase {
	public void open() {
		System.out.println("Oracle open");
	}
}
class MySql implements IDatabase {
	public void open() {
		System.out.println("MySql open");
	}
}
class SqlServer implements IDatabase {
	public void open() {
		System.out.println("SqlServer open");
	}
}
class DbManager { // 이곳에서 로직을 짜야함
	IDatabase db;
	public DbManager(IDatabase db) { // IDtabase db = new Oracle();
		this.db = db;
	}
	public void run() {
		db.open();
	}
}
public class Sample05 {

	public static void main(String[] args) {
		DbManager dbg = new DbManager(new SqlServer()); //new MySql 부분만 바꿔주면됌 
		dbg.run();
		
		
	}

}
