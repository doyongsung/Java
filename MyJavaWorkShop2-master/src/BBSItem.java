
public class BBSItem {
	
	private String writer; //�ۼ��� �ʵ�
	private String writtenDate; //�ۼ����� �ʵ�
	private String title; //�����ʵ�
	private String content; //�����ʵ�
	
	static int seqNo = 0;
	int seqNoInfo;
	
	
	BBSItem(String writer, String writtenDate,
			String title, String content){//������

	 ++seqNo;
     seqNoInfo = seqNo; 
	this.writer=writer;
	this.writtenDate=writtenDate;
	this.title=title;
	this.content=content;

	}



	public static void main(String[] args) {
		BBSItem p1 = new BBSItem("���뼺","05 10","Java","Ŭ����");
		BBSItem p2 = new BBSItem("���뼺","05 10","Java","Ŭ����");
		BBSItem p3 = new BBSItem("���뼺","05 10","Java","Ŭ����");
		
		System.out.println(p1.seqNoInfo);
		System.out.println(p2.seqNoInfo);
		System.out.println(p3.seqNoInfo);

		}

	

	
}
	


