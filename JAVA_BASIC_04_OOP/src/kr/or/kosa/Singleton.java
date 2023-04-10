package kr.or.kosa;
/*
  ������ ���� (������ ���õ� �̾߱�) >> new
  
  �̱��� : ��ü �ϳ��� ����� ����
  �ǵ� : �ϳ��� ��ü�� �����ϴ� ���强 �ڵ带 ������
  
  
  ���������� 
  ���� IP 
  
  Singleton s = new Singleton();
  Singleton s2 = new Singleton();
  Singleton s3 = new Singleton();
  
 */
// �̱����� �Ѱ��� ��ü���� ����� ���� �����ϴ� ����!
public class Singleton {
	/* 2 */
	public static Singleton p = new Singleton();
	
	/* 1 */
	private Singleton() {
		// ������ ������ private >> ������ ȣ������ ���ؼ� ��ü new ���� ���ϰ�... 
	}
	
	/* 3 */
	public static Singleton getInstance() {
		if(p == null) {
			p = new Singleton();// POINT // ���� Ŭ���� ���ο����� public, private �� �� �� �־��
 		}
		return p; // �׻� ���� �ּ�(�޸�) ���� 
	}
}
