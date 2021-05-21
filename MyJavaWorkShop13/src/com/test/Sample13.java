package com.test;

import java.util.*;


class TestClass{
	public static void addNums(List<? extends Number> list) {
		for(Object o : list) {
			System.out.println(o);
		}
	}
}
public class Sample13 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30);
		System.out.println(list.getClass().getName());
		TestClass.addNums(list);

	}
}
