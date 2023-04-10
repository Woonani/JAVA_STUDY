/*
 ���� : ����(unit)
 
 unit : ������(�̵���ǥ, �̵�, �����) : �߻�ȭ , �Ϲ�ȭ
 unit : �̵������ �ٸ��� (�̵������ unit ���� ������ ���� �ʿ�(�ݵ��))
 
 class unit { void move(){}; } // ���� ������ ����µ� �ݵ�� move() �ٸ� ���·� ����
 // �������� ���� ..... 
 
 
 */

// ������ ��� ...
abstract class Unit {
	int x,y;
	void stop() {
		System.out.println("Unit stop");
	}
	
	// �̵� (���� �ٸ���) ���� ���� .. �ٸ��� ����
	abstract void move(int x, int y); // �����(x) >>  �߻��Լ� >> �̿ϼ� �Լ�
}
class Tank extends Unit {
	
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank �Ҹ����� �̵� : " + this.x + ", " + this.y);
	}
	// �ʿ信 ���� ��üȭ, Ư��ȭ ���� (������ ���)
	void changeMode() {
		System.out.println("��ũ��� ��ȯ");
	}
}

class Marine extends Unit{
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine �̵� : "+ this.x + ","+ this.y);
	}
	// Ư��ȭ , ��üȭ
	void stimpack() {
		System.out.println("������ ���");
	}
}

class DropShip extends Unit{
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("DropShip �ϴ÷� �̵� : " + this.x + ", " + this.y);
	}
	//Ư��ȭ, ��üȭ
	void load() {
		System.out.println("Unit load");
	}
	void unload() {
		System.out.println("Unit unload");
	}
	
}

public class Ex02_abstract_class {

	public static void main(String[] args) {
		/*
		Tank tank = new Tank();
		tank.move(500, 200);
		tank.stop();
		tank.changeMode();
		
		Marine marine = new Marine();
		marine.move(200, 300);
		marine.stop();
		marine.stimpack();
		 */
		
		// Today Point (������ �����ϴ� ���� Ȱ�� �մϴ�)
		// JAVA :  instanceof (��ü�� Ÿ�� ���ϴ� ������ true, false)
		// JavaScript : typeof , instanceof, 
		
		Tank tank = new Tank();

		if(tank instanceof Unit) {
			// ��ü 			// Ÿ��
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(tank instanceof Tank) {
			//��ü           //Ÿ�� 
			System.out.println("true");
		 }else {
				 System.out.println("false");
		 }
	 
		
		//1. ��ũ 3�븦 ����� ���� ��ǥ(600, 800)�� �̵� ��Ű����

		Tank[] tanks = {new Tank(), new Tank(), new Tank()};
		for(Tank t : tanks) {
			t.move(600, 800);			
		}
		//2. �������� Tank 1�� Marine 1���, DropShip 1��) �����ϰ� ���� ��ǥ
		// (666,888)

		Unit[] unitlist = {new Tank(), new Marine(), new DropShip()};
		for(Unit unit : unitlist) {
			unit.move(666, 888);
		}
		
		
		
	}

}
