package com.test;

import java.util.*;

public class Sample08 {
	//�ٿ�� �����̵Ȱ� ������ ü��
	static void test(ArrayList<?> al) { // <?> ����Ÿ������ �ټ���
		for(Object o : al) {
			System.out.println(o);
		}
	}
//	static void test2(? a) { ����
//		
//	}

	public static void main(String[] args) {
	//	ArrayList<?> al = new ArrayList<Integer>();  //     <?>    integer , String. int ������������������ 
		test(new ArrayList<Integer>());
		test(new ArrayList<String>());
	}

}
