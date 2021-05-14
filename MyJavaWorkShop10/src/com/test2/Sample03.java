package com.test2;
class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}//체크할로직추가
}
public class Sample03 {
	static void checkMethod(int num) throws MyException {
		if (num % 2 ==0) {
			throw new MyException("짝수입니다.");//ArithmeticException();
		}
	}

	public static void main(String[] args) {
		try {
		throw new MyException("나의 오류입니다.");
		}catch(MyException ex) {
			System.out.println("오류입니다."+ ex.getMessage());
		}
//	checkMethod(1);
//	checkMethod(2);
//	Exception ex = new Exception("테스트입니다."); //(); null
//	try {
//		throw ex;
//	}catch (Exception e) {
//		System.out.println(ex.getMessage());
//	}
	}
}
