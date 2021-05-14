package com.test3;
interface IDatabase{
	public void open();//�������̽� ���� �״�� ����ؾ���
}
interface IQuery {
	public void select();
}

class Oracle implements IDatabase, IQuery{//�������̽� ���� �״�� ����ؾ���
	public void open() {
		System.out.println("Oracle open");
	}
	public void select() {
		System.out.println("Oracle query");
	}
}
class MySql implements IDatabase {//�������̽� ���� �״�� ����ؾ���
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
