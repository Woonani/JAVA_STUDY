/*
 �߻� Ŭ����
 >> �̿ϼ� Ŭ���� (���赵)
 1. �ϼ��� �ڵ� + �̿ϼ� �ڵ�
 2. �̿ϼ�(�Լ�) >> ������� ���� �Լ� >> public void run()  (X){}  : �߻��Լ�
 3. �̿ϼ��� Ŭ���� (������ ��ü ������ �Ұ���)
 
 ���赵�� ����� ���忡�� 
 >> �̿ϼ� ���赵 ����(�̿ϼ� �Լ�) >> �ǵ� >> ���� ���ϴϱ� >> ������ ������ �������� 
 
 ����� ������� ...
 */

// �߻�Ŭ���� �̿ϼ� �Լ� 1���־���Ѵ�. �̿ϼ��Լ� ������̾��� �Լ���. �ݵ�� ����� ���� �������Ҷ� �ǹ̸� ���´�.


/*  ver1 ������ ���� �ڵ�  */
class Car{
	void run() {} // {���� ������ ��ü �����ϰ� ����ϴ� �� ���� ����.}
	// ������ ������ ���ھ�... �������� ����
}

class Hcar extends Car{
	// ����
	@Override
	void run() {
		System.out.println("������ �߾��");
	}
}


/*  ver2 �ǹ� �ݵ�� ���赵   */
abstract class Abclass{ // Ŭ���� �ȿ��� �ּ� 1�� �̻��� �߻��Լ��� ������ �ְڴ�.
	int pos; // position
	void run() {
		pos++;
	}
	// �����ǰ� �ʿ��� �Լ��� �߻��Լ��� ����
	abstract void stop(); //������� ����� >> �ݵ�� ����� ���ؼ� ���� >> ������ 
}
// ����� ���ؼ� ����
class Child extends Abclass{
	@Override
	void stop() {
		// �����ϴ� ��� �������....
		this.pos = 0;
		System.out.println("stop : " + this.pos);
	}
}

class Child2 extends Abclass{
	@Override
	void stop() {
		this.pos = -1;
		System.out.println("stop : " + this.pos);
	}
}




public class Ex01_abstract_class {

	public static void main(String[] args) {
		Hcar hc = new Hcar();
		hc.run();
		
//		Abclass ab = new Abclass();// �߻�Ŭ������ ������ �� ����
		
		Child child = new Child();
		child.run();
		child.run();
		child.stop();
		
		Child2 child2 = new Child2();
		child2.run();
		child2.stop();
		//////////////////////////////////////////
		// ������
		Abclass ab = child;
		// ��Ӱ��迡�� �θ�Ÿ���� ���������� �ڽ�Ÿ�� ��ü ���� �ּҸ� ���� �� �ִ�. : ������
		// �� �θ��� �ڽ��� �͸� �� �� �ִ�. (�ڽ��� �����̹��� �߿���)
		// �� ������ �� ... �ڽ��� �ڿ��� ����
		ab.run();
		ab.stop(); // ������ �� �ڽ� �Լ� ȣ��  >> �翬: �θ�� �θ𲨸� ������ �ڽ��� �θ𹰰� �������� ���� �װ͵� �� �� �ִ� ��!
		
		
	}

}
