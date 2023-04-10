/*
 �������̽� : ���, ��Ģ, �Ծ�, "ǥ��" �� ����� ��
 ���� �ֻ��� �ܰ� ....
 �ʱ� ������ : �������̽� ��� ��� ....
 �����ΰ� ����� (�߻��ڿ�)
 
 ---------------------------------------------
 �߻� Ŭ������ �������̽�
  1. ������ ��ü ���� �Ұ��� (New �����ڸ� ��� �Ұ�)
  1.1 �� ���� ������ : �߻� Ŭ���� (�ϼ� + �̿ϼ�), �������̽�(��� ���� �̿ϼ�)
  
  2. ���
  �߻�Ŭ���� extends 
  �������̽� implements
  
  class Car extends AbClass { }
  class Car implements Ia { }
  
  �Ѵ� �߻��ڿ��� ������ �ִ� >> ������ ������ ���� (������)
  
  �߻�Ŭ���� �������̽� �ٸ���
  3. �߻�Ŭ���� (�ϼ��� �ڵ� �Ϻ�) �׷��� �������̽��� ��ü�� �̿ϼ� �ڵ�(���+default �Լ�)
  3.1 ��Ģ�����δ� Ŭ������ ���߻�� x >> ������ ��� �Ǵ� ���� ���踦 ...
  	  �׷��� �������̽��� [���� ����]�� ���� >> �������� ���� �������̽��� ��� ��� �� ....������
  	  �ʹ� ū �������̽��� ����� ���뼺�� �������� ....
  	  Ia, Ib, Ic
  	  class Test extends Object inplements Ia, Ib, Ic // ���� ���� ����
  	  Tip) �������̽��� �������̽��� ���� �� ����� ����
  	  		���� ��� >> ��� >> ū ���
  4. �������̽� (����� ������ �������� �̿ϼ� �߻� �Լ�) >> JDK8 (default, static)
  
  �ʱް����� �ü�����
  1. �������̽��� [[ ������ ]] �������� ����( �������̽� ��� Ÿ�� �θ�) ***************
  2. ���� �������� ���� Ŭ������ �ϳ��� �����ִ� ���� (���� �θ� ������ �����ν�)
  3. JAVA API �� ���� �������̽��� ������ ���Ҿ��
  4. �������̽� (~able) : �����ִ�, ������ �� �ִ�, 
  5. ��ü�� ���� �� (��ü�� ����) ������
  
  
  interface
  
  1. ���� �����θ� ���������� �ʴ� >> ������� ���� >> ���
  2. interface Ia { void move(int x, int y); } >> ������ �˾Ƽ� ... ������ �� ����
  3. JAVA API >> Collection >> ���� �������̽� >> List , Set , Map
  
  
  �������
  1. ����������� 
  public static final int VERSION = 1 >> int VERSION = 1
  �����Ϸ��� �˾Ƽ� 
  
  2. �߻��Լ�
  public abstract void run(); >> void run()
  
  ����
  interface Aable{ } // �ƹ� �ڿ��� ����� (���� �������� ������ �� ���)
  interface Aable { int NUM = 10; }
  interface Aable {void run (); }
  
 */

interface Ia { // �������̽��� ��� ����� static final // �ڿ��� ���� abstract �ڵ����� ����
	int AGE=100; //public static final 
	public static final String GENDER="��";
	String print();// (X){} �߻��ڿ� 		//public abstract 
	void message(String str);	//public abstract �����Ϸ��� ����
	
}

interface Ib {
	int AGE=10;
	void info();
	String val(String s);
}

//��ӹ����鼭 �������̽��� �����ǵ� ���������� ���� ����.
class Test2 extends Object implements Ia { 

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void message(String str) {
		// TODO Auto-generated method stub
		
	}
	
}
// �������̽��� ���� ���(?) ����(?) �� �����ϴ�
class Test3 extends Object implements Ia, Ib {

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String val(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void message(String str) {
		// TODO Auto-generated method stub
		
	}
	
}
public class Ex03_Interface {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		////////////////////////////////////
		Ia ia = t2; // �θ�� �ڽİ�ü�� �ּҸ� ���� �� �ִ�.
		////////////////////////////////////
		ia.message("������"); // �������̽��� �����ǵ� �ڿ��� ȣ��
		System.out.println(ia.GENDER);
		
		Test3 t3 = new Test3();
		
		Ia ia2 = t3;
		Ib ib2 = t3;
		System.out.println(ia2.GENDER);
		System.out.println(ia2.AGE);
	}

}
