import java.util.Scanner;

public class Sample11 {
	static int getInputValue() {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		int input = 0;
		try {
			input = Integer.parseInt(inputString);
		}catch(NumberFormatException ex) {
			System.out.println("���ڸ� �Է����ּ���");
			int input1 = getInputValue();
		}
		
		return input;
	}

	public static void main(String[] args) {
		System.out.print("���� �Է����ּ���.");
		int input = getInputValue();
	}

}
