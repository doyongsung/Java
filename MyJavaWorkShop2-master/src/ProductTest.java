class Product {
	private String writer;
	private String writtenDate;
	private String title;
	private String content;
	
	static int count = 0;
	int serialNo;
	
	{
		 ++count;
		 serialNo = count;
		 
		 
	}
	Product(String writer, String writtenDate,

			String title, String content){//������
		    
          
			this.writer=writer;
			this.writtenDate=writtenDate;
			this.title=title;
			this.content=content;

			}

}
public class ProductTest {
	
public static void main(String[] args) {
	Product p1 = new Product("���뼺","05 10","Java","Ŭ����");
	Product p2 = new Product("���뼺","05 10","Java","Ŭ����");
	Product p3 = new Product("���뼺","05 10","Java","Ŭ����");
	
	System.out.println(p1.serialNo);
	System.out.println(p2.serialNo);
	System.out.println(p3.serialNo);

	}

}
