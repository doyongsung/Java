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
		System.out.println("계좌번호 " +customer.getNumber());
		System.out.println("예금주이름 " +customer.getName());
		System.out.println("잔액 " +customer.getBal());
		System.out.println();
		
	
		
	}

	

	public static void main(String[] args) {
		Account customer1 = new Account("111-222-33333333","최은희",20000);
		Account customer2 = new Account("555-666-77777777","남매월",100000);
		System.out.println("기본 적립금");
		printAcoount(customer1);
		printAcoount(customer2);
		System.out.println("한번의 입출금");
		customer1.deposit(1000000);
		customer2.withdraw(30000);
		System.out.println("이자율의 계산");
		printAcoount(customer1);
		printAcoount(customer2);
		System.out.println("이자율의 계산");
		Account.interest = 0.05;
		customer1.addInterest();
		customer2.addInterest();
		printAcoount(customer1);
		printAcoount(customer2);
		
		

		
		
		
		
		
		
		

	}

}
