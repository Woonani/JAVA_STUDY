import kr.or.kosa.Bird;

class Bi extends Bird {
	@Override
	protected void moveFast() {
		super.moveFast();
	}
}

class Ostrich extends Bird {
	// Ostrich
	// Ư��ȭ, ��üȭ
	void run() {
		System.out.println("run .....");
	}
	@Override
	protected void moveFast() { // �Լ����� ���� ���鼭 ����� ������ �����ϴ�!
		run();
	}
}

public class Ex09_Inherit_Protected {

	public static void main(String[] args) {
		Bi bi= new Bi();
		bi.fly();
		bi.moveFast();
		
		Ostrich o = new Ostrich();
		o.fly();
		o.moveFast();

	}

}
