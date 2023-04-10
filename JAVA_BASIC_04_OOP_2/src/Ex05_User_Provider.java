/*
 user ����� <> provider ������
 
 class A {}
 class B {}
 
 ���� : A�� B�� ����մϴ�
 
 1. ��� : A extends B 
 2. ���� : A��� Ŭ������ member field B�� ��� class A {B b;}
 2.1 �κ��� ����
 2.2 ��ü�� ����
  ===================
 ����) 2.2 ��ü�� ���� // ���� �������� ����
 class B{}
 class A{
 	int i;
 	B b; // A�� B�� ����մϴ� (����)
 	A(){ // ������
 		b = new B();
 	}
 }
 >> main(){
	 	A a = new A(); // ���� ���ü
	 	a = null;
	 	a.b.�ڿ���
 	}
 	
���԰��� 
>> B�� ���� ���� �Ұ��� >> A��� ��ü�� �����Ǹ� B�� ����
>> �������ü (��ü����)
>> �ڵ��� ����, ��Ʈ�ϰ� cpu
 ===================
 ����) 2.1 �κ��� ���� // ������ �������� ����
 class B{}
 class A{
 	int i;
 	B b; // A�� B�� ����մϴ�. (����)
 	A(){
 	
 	}
 	// method
 	void m(B b) {
 		this.b=b;
 	}
 }
  >> main(){
	 	A a = new A(); 
	 	a = null;
	 	B b = new B();
	 	// �ʿ信 ����
	 	a.m(b);
	 	// ���� ����� �ƴϴ�
	 	// �κ�����
	 	// ��Ʈ�ϰ� ���콺, �б��� �л�
 	}
 	
 	A�� B�� ����մϴ�(����) >> ���� >> A�� B�� member field >> ������ ���� �ϴ��� ���� �ϴ���
 	
 */

interface Icall {
	void m(); // public abstract void m();
}

class D implements Icall {
	@Override
	public void m() {
		System.out.println("D ... Icall �������̽��� m() ������ �߽��ϴ�.");
	}
}

class F implements Icall {
	@Override 
	public void m() {
		System.out.println("F ... Icall �������̽��� m() ������ �߽��ϴ�.");
	}
}

// �������� ���α׷��� ����� (interface �뼼) >> ������ >> ���� ����� ����
// �����ϰ� (������)

class C {
	void method(Icall ic) {
		// �Լ��� parameter���� Icall�� �����ϰ� �ִ� (�θ�) ��� ��ü�� �ּҴ� �� �� �ִ�
		ic.m();
	}
} 

public class Ex05_User_Provider {

	public static void main(String[] args) {
		C c = new C();
		D d = new D();                                                                                                                                        
		F f = new F(); 
		c.method(d);
		c.method(f);
		
	}

}

