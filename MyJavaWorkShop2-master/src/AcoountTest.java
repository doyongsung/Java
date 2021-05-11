 class Account {
	 private String number;
	 private String name;
	 private double bal;
	 public static double interest;
	 public Account(String number, String name, int bal) {
		 this.number = number;
		 this.name = name;
		 this.bal = bal;
	 }
	public String getNumber() {
		return this.number;
	}

	public String getName() {
		return this.name;
	}

	public double getBal() {
		return this.bal;
	}

  public void deposit(int price) {
	  this.bal += price;
  }
  public void withdraw(int price) {
	  this.bal -= price;
  }
  
  public void addInterest() {
	  this.bal = this.bal + (this.bal * this.interest);
  }
 }

	
	
 
  
public class AcoountTest {
	
	static void printAcoount(Account customer) {
		System.out.println("���¹�ȣ " +customer.getNumber());
		System.out.println("�������̸� " +customer.getName());
		System.out.println("�ܾ� " +customer.getBal());
		System.out.println();
		
	
		
	}

	

	public static void main(String[] args) {
		Account customer1 = new Account("111-222-33333333","������",20000);
		Account customer2 = new Account("555-666-77777777","���ſ�",100000);
		System.out.println("�⺻ ������");
		printAcoount(customer1);
		printAcoount(customer2);
		System.out.println("�ѹ��� �����");
		customer1.deposit(1000000);
		customer2.withdraw(30000);
		System.out.println("�������� ���");
		printAcoount(customer1);
		printAcoount(customer2);
		System.out.println("�������� ���");
		Account.interest = 0.05;
		customer1.addInterest();
		customer2.addInterest();
		printAcoount(customer1);
		printAcoount(customer2);
		
		

		
		
		
		
		
		
		

	}

}
