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
class DbManager { // �̰����� ������ ¥����
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
		DbManager dbg = new DbManager(new SqlServer()); //new MySql �κи� �ٲ��ָ�� 
		dbg.run();
		
		
	}

}
