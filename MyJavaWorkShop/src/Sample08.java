import java.util.Scanner;

public class Sample08 {

	public static void main(String[] args) {
//		int input;
//		
//		System.out.println("�޴� ��ȣ�� �Է����ּ���.");
//		
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine();
//		input = Integer.parseInt(tmp);
//		
//		if(input == 1) {
//			System.out.println("�����Դϴ�.");
//		} else if (input == 2) {
//			System.out.println("�����Դϴ�.");
//		} else if (input == 3) {
//			System.out.println("�����Դϴ�.");
//		} else if (input == 4) {
//			System.out.println("�������Դϴ�.");
//		} else {
//			System.out.println("����");
//		}
	     
        System.out.println("�޴� ��ȣ�� �Է����ּ���");
	    Scanner scanner = new Scanner(System.in);
	    String num = scanner.nextLine();
	    int num2 = Integer.parseInt(num);
	    if(num2 == 1) {
	    	System.out.println("�����Դϴ�.");
	    } else if (num2 == 2) {
	    	System.out.println("�����Դϴ�.");
	    } else if (num2 == 3) {
	    	System.out.println("�����Դϴ�.");
	    } else if (num2 == 4) {
	    	System.out.println("�������Դϴ�.");
	    } else if (num2 == 5) {
	    	System.out.println("����.");
	    } else {
	    	System.out.println("�ٽ� �Է����ּ���.");
	    }
	    

	}

}
