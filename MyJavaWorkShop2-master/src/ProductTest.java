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

			String title, String content){//생성자
		    
          
			this.writer=writer;
			this.writtenDate=writtenDate;
			this.title=title;
			this.content=content;

			}

}
public class ProductTest {
	
public static void main(String[] args) {
	Product p1 = new Product("도용성","05 10","Java","클래스");
	Product p2 = new Product("도용성","05 10","Java","클래스");
	Product p3 = new Product("도용성","05 10","Java","클래스");
	
	System.out.println(p1.serialNo);
	System.out.println(p2.serialNo);
	System.out.println(p3.serialNo);

	}

}
