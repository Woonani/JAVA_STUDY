import kr.or.kosa.Pclass;

/*
 private
 default : ���� ����(��Ű��)
 public 
 ��Ӱ��迡�� protected : ����� �־�߸� �ǹ̰� �ִ� ������
 
 protected ��鼺 >> default, public 
 >> ����� ���� Ŭ���� �ȿ��� protected >> default ����
 >> �ᱹ ��Ӱ��迡���� �ǹ� >> public 
 
 */

class Dclass {
	public int j;
	private int p;
	int s; //default 
	protected int k;
}

class Child2 extends Pclass{ // ���
	void method() {
		this.k = 100; // ����� protected
		// ��Ӱ��迡�� >> �ڽ��� �θ��� protected �ڿ��� ��밡��(public)// protected ����ǵ� : �����Ǹ� ������ ���ھ�..
		System.out.println(this.k);
		// m(); ���� �ڽ� �ȿ��� ����
		
	}
	// protected ������ �ǹ� : �����Ǹ� ������ ���ڴµ�.. �������ذ� �� �׷�
	@Override // ��Ӱ��迡���� �� �� ������ �������� ���迡���� �� �� //�׷��� �Ʒ� main�Լ� �ȿ��� m();�� �Ⱥ��̴� ����
	protected void m() { // protected�� �Լ� �����ǿ� ���� �ణ�� �������� ��ٰ� �����ִ�.
		// TODO Auto-generated method stub
		super.m();
	}
}

public class Ex08_Inheritance_Protected {

	public static void main(String[] args) {
		Pclass pclass = new Pclass();
//		pclass.i public�� ����

		Dclass dclass = new Dclass();
		
		Child2 child = new Child2();
//		child.

	}

}
