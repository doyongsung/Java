import java.util.Scanner;

public class Sample08 {

	public static void main(String[] args) {
//		int input;
//		
//		System.out.println("메뉴 번호를 입력해주세요.");
//		
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine();
//		input = Integer.parseInt(tmp);
//		
//		if(input == 1) {
//			System.out.println("덧셈입니다.");
//		} else if (input == 2) {
//			System.out.println("뺄셈입니다.");
//		} else if (input == 3) {
//			System.out.println("곱셈입니다.");
//		} else if (input == 4) {
//			System.out.println("나눗셈입니다.");
//		} else {
//			System.out.println("종료");
//		}
	     
        System.out.println("메뉴 번호를 입력해주세요");
	    Scanner scanner = new Scanner(System.in);
	    String num = scanner.nextLine();
	    int num2 = Integer.parseInt(num);
	    if(num2 == 1) {
	    	System.out.println("덧셈입니다.");
	    } else if (num2 == 2) {
	    	System.out.println("뺄셈입니다.");
	    } else if (num2 == 3) {
	    	System.out.println("곱셈입니다.");
	    } else if (num2 == 4) {
	    	System.out.println("나눗셈입니다.");
	    } else if (num2 == 5) {
	    	System.out.println("종료.");
	    } else {
	    	System.out.println("다시 입력해주세요.");
	    }
	    

	}

}
