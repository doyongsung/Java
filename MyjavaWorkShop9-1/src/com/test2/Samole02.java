package com.test2;

interface IStudent{//�߻�޼���� ����� ����
	                
	public void study(); //sys.out �Է¿���  Ŭ������� ����Ѵٴ°Ϳܿ��� �ۼ�������
}
class Student implements IStudent{ //ǥ��ȭ �������������� �����������
	public void study() { //���� ����������
		System.out.println("�л��� �����ϴ�.");
	}
	
	
}
public class Samole02 {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.study();
		IStudent stu2 = new Student();
		stu2.study();
		
	}
}
