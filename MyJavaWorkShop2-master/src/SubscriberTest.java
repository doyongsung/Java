class SubscriberInfo {
	private String name;
	private String id;
	private String password;
	private String phoneNo;
	private String address;
	
	
	SubscriberInfo(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
		
	}
	
	SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
		 this.name = name;
		 this.id = id;
		 this.password = password;
		 this.phoneNo = phoneNo;
		 this.address = address;
	}
	SubscriberInfo() {
		
	}
	
	
	
    public String GetName() {
			return this.name;
	}
    public String GetId() {
    	return this.id;
    }
    public String GetPassword() {
    	return this.password;
    }
    public String GetPhoneNo() {
    	return this.phoneNo;
    }
    public String GetAddress() {
    	return this.address;
    }
	
    public void setAddress() {
    	this.address = "������1����"; 
   }
    public void setPhoneNo() {
    	this.phoneNo = "133-1234-5678";
    }
}
public class SubscriberTest {
	
	static void printSubscriberInfo(SubscriberInfo obj) {
		System.out.println("�̸�:"+ obj.GetName());
		System.out.println("���̵�:" + obj.GetId());
		System.out.println("�н�����:" +obj.GetPassword());
		System.out.println("��ȭ��ȣ:" +obj.GetPhoneNo());
		System.out.println("�ּ�:" +obj.GetAddress());
		System.out.println();
		
		
	}

	public static void main(String[] args) {
		SubscriberInfo obj1 = new SubscriberInfo("������","1017db","daewi");
		printSubscriberInfo(obj1);
		SubscriberInfo obj2 = new SubscriberInfo("���","baekom","white","200-000-0000","north pole");
		printSubscriberInfo(obj2);
		SubscriberInfo obj3 = new SubscriberInfo();
		printSubscriberInfo(obj3);
		obj1.setAddress();
		obj1.setPhoneNo();
		printSubscriberInfo(obj1);
		
		
		

	}

}
