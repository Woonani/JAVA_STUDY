class Unit2{
	int hitpoint; //�⺻������
	final int MAX_HP; // �ִ뿡����
	Unit2(int hp){
		this.MAX_HP = hp;
	}
}
//�������̽�
//~ �� �� �ִ� (������ �� �ִ�)
interface Irepairable{}

//��������
class GroundUnit extends Unit2 {
	GroundUnit(int hp) {
		super(hp);
	}
}
//��������
class AirUnit extends Unit2 {
	AirUnit(int hp){
		super(hp);
	}
}
// �ǹ�
class CommandCener  implements Irepairable{}

// ����
class Tank2 extends GroundUnit implements Irepairable {
	Tank2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank2";
	}	
	
}
class Marine2 extends GroundUnit {

	Marine2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Marine2";
	}
}
// Scv ����ĳ��, ����(��ũ)
class Scv extends GroundUnit  implements Irepairable{

	Scv() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Marine2";
	}
	/*
	Scv ��üȭ, Ư��ȭ�� ������ ��� ����
	 �����ϴ� (repair)
	 Tank2, Scv, CommandCenter
	
	 ������ǰ ���� ��ǰ 1000�� >>  buy() >> 100�� buy�Լ� (X)
	 ������ buy(Product n) ... 
	 */
	 // GroundUnit�� �θ�ϱ� (Tank2, Marine2, Scv)
	// void repair(Unit2 unit) >> class AirUnit extends Unit2(x), Marine2(x)
	// void repair(GroundUnit unit) >> Tank2, Marine(x), Scv 
	
	// CommandCenter repair ������ ������ (����� >> �θ� ���� �ʾƿ�)
	// -> �ɸ��� �� �ʹ� ���� ������ ã�Ⱑ;;
	// ���� �ѹ� �غ��Կ�
	// interface Irepairable{}
	
	// class CommandCenter implements Irepairable {}
	// class Tank2 extends GroundUnit implements Irepairable {}
	// class Scv extends GroundUnit implements Irepairable {}
	
	// �θ�μ� Irepairable�� ���� �ִ�.
	// ���� �������� ���� �ڿ��� ���ؼ� ... ���� �θ� ... ����!
	
	// ������
	
	void repair( Irepairable repairunit ) {
		// Tank2, Scv, CommandCenter
		// �����ϴ� ����� �޶��
		// Tank2, Scv >> HP ������ �÷��ָ� �ǿ�
		// �ٸ� ������� repair
		
		// repairunit �Ϲ� Unit2 �ƴϳ� �Ǵ��ؼ� ����
		if(repairunit instanceof Unit2) {
			//Tank2, Scv
//			((Unit2) repairunit).hitpoint
			Unit2 unit2 = (Unit2) repairunit; // �������̽��� ���� �ֻ��� Ÿ���̹Ƿ� �ٿ�ĳ���� ���ش�.
			// Irepairable repairunit >> �Ѵܰ� ���� Unit���� ����
			if(unit2.hitpoint != unit2.MAX_HP) {
				unit2.hitpoint = unit2.MAX_HP; // ����
			}
		}else {
			// �ǹ�
			System.out.println("�ٸ� ���� ����� ���ؼ� repair �մϴ�");
		}
	}
	
}
public class Ex04_Interface_Poly {

	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine2 = new Marine2();
		Scv scv = new Scv();
		
		CommandCener center = new CommandCener();
		
		// ����
		tank.hitpoint -= 20;
		System.out.println("��ũ : "+ tank.hitpoint);
		System.out.println("Scv ���� ��û");
		scv.repair(tank);
		System.out.println("��ũ ���� �Ϸ� : "+ tank.hitpoint);

	}

}
