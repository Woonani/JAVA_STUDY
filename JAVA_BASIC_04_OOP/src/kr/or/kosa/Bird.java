package kr.or.kosa;

// �� (���� : �Ϲ� , �߻�) : ���� ���� �ִ� , ���� ������
public class Bird {
	//������
	public void fly() {
		System.out.println("flying");
	}
	//������ ���
	//Bird ����ϴ� ����� moveFast() �ڿ��� ���ؼ� ������ �ؼ� ����� ...����....
	protected void moveFast() {
		fly();
	}
}
