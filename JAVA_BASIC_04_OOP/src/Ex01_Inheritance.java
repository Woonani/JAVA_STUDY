/*
 OOP Ư¡ (�������� ����(����)(Ŭ����) ���� �����ؼ� �ϳ��� ū �׸�(��ǰ)�� ����� ����)
 ���赵 : ���� ���赵�� �κ� ���赵, ���� ���赵�� ���� ���赵, ���� �������� ���赵...
 
 1. ���
 2. ĸ��ȭ(����ȭ) >> private 
 3. ������ (��Ӱ��迡�� �θ� Ÿ���� �ڽ� Ÿ���� �ּҸ� ���� �� �ִ�.)
 
 ���
 JAVA : child extends Base // Base(�θ�)���� Ȯ����
 C#   : child : Base
 
 Ư¡
 1. ���� ��� �Ұ� (���� ��� ��Ģ >> ������ ���)
 2. ������ ���(�������� Ŭ������ ���)
 3. ���� ��� ������ interface �� [ǥ��, ���, ��Ģ, �Ծ�]�� �����ϰ� �ִ� Ŭ���� // �Ź߸��鶧 5mm ������ �����~ �� �̷� ��Ģ�� interface �����ŷ�
 
 ���
 1. ������ �ǹ� : ���뼺
 2. ���� : ��� (�ʱ� ���� ���)			... �θ� �ڽ� ���� (Ŀ�ø�) (���Ӽ��� �ʹ�ũ��?)>> ���� Ʈ����� ������ ���踦 ������
 3. ���뼺 >> ���� >> �ð� >> ....���뼺 �������� ...
 
 
 ��� Ŭ������ �޸𸮿� �ö󰡾� ��밡���ϴ�
 
 Child child = new Child();

 Child > Father > GrandFather // X
 ���� �޸𸮿� �ö󰡴� ���� 
 Object >> GrandFather >> Father >> Child
 
 ����ڰ� ����� ��� Ŭ������ default (������� �ʾƵ�) : Object ����Ѵ�
 class Car extends Object ����
 Object  >> Root >> �ֻ��� >> ���Ŭ������ �θ� Ŭ���� >> �ܱ�?
 
 */
class Car{ // Car extends Object
	
}

class GrandFather {
	public int gmoney = 5000;
	private int pmoney = 10000; // ��Ӱ��迡�� ���� �Ұ�... �������� �������� ��
								// public �Լ� ���� (���������� ���� �ϸ� ...)
	// ��ü������ ���ÿ� ȣ��Ǵ� �Լ� (������)
	public GrandFather(){
		System.out.println("GrandFather ������");
	}
	public int getPmoney() {
		return pmoney;
	}
	
}

class Father extends GrandFather {
	public int fmoney = 3000;
	public Father(){
		System.out.println("Father ������");
	}
	
}

class Child extends Father {
	public int cmoney = 100;
	public Child(){
		System.out.println("Child ������");
	}
	
}

public class Ex01_Inheritance {

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.gmoney);
		System.out.println(child.fmoney);
		System.out.println(child.cmoney);
		
		//child.pmoney; // ��Ӱ���� ���� �Ұ� The field GrandFather.pmoney is not visible
		child.getPmoney();

	}

}
