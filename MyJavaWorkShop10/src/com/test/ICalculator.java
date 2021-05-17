package com.test;

public interface ICalculator { //+ - 상속받아서구현
	public int operate(int x, int y); 
}
//public class Plus implements ICalculator {
//
//	@Override
//	public int operate(int x, int y) {
//		return x + y;
//	}
//
//
//@Override
//public int operate(int x, int y) {
//
//	return x - y;
//
//
//}
//public class Calculator {
//	ICalculator calc;
//	public Calculator(ICalculator calc) {
//		this.calc = calc;
//	}
//	public int operate(int a, int b) {
//		return this.calc.operate(a, b);
//	}
//
//}