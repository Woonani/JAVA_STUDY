/*
 ������(��Ӱ��迡�� ����)
 ������ : �������� ����(����)�� ���� �� �ִ� �ɷ�
  
  JAVA : [��Ӱ���]���� [�ϳ��� ��������]�� [�������� Ÿ��]�� ���� �� �ִ� ��
  >> [�ϳ��� ��������] >> �θ�Ÿ��
  >> [�������� Ÿ��] >> �θ� ��ӹ��� �ڽ�Ÿ��
  
  ������ : ���� >> �θ�� �ڽĿ��� ��� ���� ....
  		���α׷� >> �ڽ��� �θ𿡰� ���� ���� �帰��~ 
 */

class Tv2{
	boolean power;
	int ch;
	
	void power() {
		this.power = !this.power;
		}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}

class CapTv extends Tv2 {
	String text;
	String captionText() {
		return this.text = "���� �ڸ� ���� ó���� ...";
	}
}

public class Ex10_Inheritance_Polymorphism {

	public static void main(String[] args) {
		CapTv ct = new CapTv();
		ct.power();
		ct.chUp();
		System.out.println(ct.captionText());
		///////////////////////////////////////
		Tv2 tv2 = ct;
		// ��Ӱ��迡�� �θ�Ÿ���� ���������� �������� �ڽ�Ÿ���� ���� �ּҸ� ���� �� �ִ�.
		// �� �θ�� [�ڽ��� �ڿ��� ���� ] ����
		// �� �����Ǵ� �����ϰ�
		
		System.out.println(tv2.toString()); //CapTv@5e91993f // �ڽ��� ������ Ÿ������(�θ�)
		System.out.println(ct.toString());  //CapTv@5e91993f

	}

}
