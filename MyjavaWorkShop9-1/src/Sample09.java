
public class Sample09 {

	public static void main(String[] args) {
		try { // ���־��� try.catch �������߻��Ҽ�������
	  int a = 1 / 0;
	} catch(OutOfMemoryError ex) { //ex ��������
		System.out.println("���� �߻��Ͽ����� �����ڿ��� �������ּ���.");
	} catch(ArithmeticException ex) {
		String name = ex.getMessage();
		System.out.println(name);
		System.out.println("ArithmeticException���� �߻��Ͽ����� �����ڿ��� �������ּ���.");
	} catch(Exception ex) {//����
		System.out.println("Exception������ �߻��Ͽ����ϴ�.");
	}
	 System.out.println("�����մϴ�");
	 
}
}
