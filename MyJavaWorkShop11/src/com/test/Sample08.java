package com.test;

public class Sample08 {

	public static void main(String[] args) {
		String msg1 = "�̼���";
		String msg2 = "������";
		String msg3 = msg1 + msg2;
		System.out.println(msg3);
		
		StringBuffer sb = new StringBuffer("�̼���");
		System.out.println(sb.capacity()); // ������
		sb.append("������"); // �ڿ��� ��� �߰�������
		sb.insert(3, "�������"); // �ε�����ȣ �߰��� �����Ⱑ��
		sb.replace(1, 3, "�ȳ�"); // �ε�����ȣ �ȿ��ִ� ���ڸ� �ٲ���
		sb.delete(1, 3); //�ε�����ȣ�ȿ� ���� ����
		System.out.println(sb.toString());
		System.out.println(sb.capacity());
		
		
	}
}
