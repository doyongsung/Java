
public class BBSItem {
	
	private String writer; //작성자 필드
	private String writtenDate; //작성일자 필드
	private String title; //제목필드
	private String content; //내용필드
	
	static int seqNo = 0;
	int seqNoInfo;
	
	
	BBSItem(String writer, String writtenDate,
			String title, String content){//생성자

	 ++seqNo;
     seqNoInfo = seqNo; 
	this.writer=writer;
	this.writtenDate=writtenDate;
	this.title=title;
	this.content=content;

	}



	public static void main(String[] args) {
		BBSItem p1 = new BBSItem("도용성","05 10","Java","클래스");
		BBSItem p2 = new BBSItem("도용성","05 10","Java","클래스");
		BBSItem p3 = new BBSItem("도용성","05 10","Java","클래스");
		
		System.out.println(p1.seqNoInfo);
		System.out.println(p2.seqNoInfo);
		System.out.println(p3.seqNoInfo);

		}

	

	
}
	


