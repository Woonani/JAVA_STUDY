
public class Ex14_Quiz {

	public static void main(String[] args) {
//		System.out.println("�̰� ��� ������ �Լ� �ϱ��");
		
		//System
		//out
		//println
		//�� ������ ������
		//���� �����Ͻ� ������ Ŀ�� �帱�Կ� ^^(�ұ��̴ϱ��)

		Ssystem.out.printt();
		
	}

}
class Ssystem{
	public static final print out; // �ʵ尡 ����Ʈ ��ü�� �ּҰ��� ����
	static {
		out = new print();
	}
}
class print{
	public void printt() {System.out.println("1111");}
}
/*
  //�� �� ���� Ʋ�� : final static public �̷���
   
 
public class Ex14_Quiz {

	public static void main(String[] args) {
//		System.out.println("�̰� ��� ������ �Լ� �ϱ��");
		
		Ssystem ssystem = new Ssystem();
		ssystem.out.print();
		
	}

} 

class Ssystem{
	static print out= new print();
}
final class print{
	public void print() {}
}
 */

