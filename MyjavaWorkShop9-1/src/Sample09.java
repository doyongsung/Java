
public class Sample09 {

	public static void main(String[] args) {
		try { // 자주쓰임 try.catch 여러번발생할수도이음
	  int a = 1 / 0;
	} catch(OutOfMemoryError ex) { //ex 참조변수
		System.out.println("오류 발생하였으니 관리자에게 문의해주세요.");
	} catch(ArithmeticException ex) {
		String name = ex.getMessage();
		System.out.println(name);
		System.out.println("ArithmeticException오류 발생하였으니 관리자에게 문의해주세요.");
	} catch(Exception ex) {//상위
		System.out.println("Exception오류가 발생하였습니다.");
	}
	 System.out.println("종료합니다");
	 
}
}
