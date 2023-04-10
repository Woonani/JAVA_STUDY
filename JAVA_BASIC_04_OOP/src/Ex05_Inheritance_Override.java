import kr.or.kosa.Emp;

class Test2{
	int x = 100;
	void print() {
		System.out.println("�θ��Լ� Test2");
	}
}
class Test3 extends Test2{
	int x= 300;	// C# �θ� �����ϱ� (���� ������)
	
	// ������ 
	@Override
	void print() { // �̰��� �������̵�
		// �̷��� ���ص� ���� �ȳ�! �Լ��� ����, ����Ÿ�� ���Ƽ�!
		System.out.println("�ڽ��� �θ��� �Լ��� ������");
	}
	
	void print(String str) { // �̰��� Overloading!
		System.out.println("�� �����ε��̾� " + str);
	}
}
public class Ex05_Inheritance_Override {

	public static void main(String[] args) {
		Test3 test3 = new Test3();
		System.out.println(test3.x);
		test3.print();
//		test3.print("Overloadign");//
		
		Emp emp = new Emp(1000, "ȫ�浿");
		System.out.println(emp); //emp.toString() ����
		//kr.or.kosa.Emp@1c4af82c 
		//kr.or.kosa.Emp + "@"  + 1c4af82c  ���յ� ��
		System.out.println(emp.toString()); //kr.or.kosa.Emp@1c4af82c
		
		/*
		  class Object {
		  	public String toString(){
		  		return ��Ű���� + "@" + �ּҰ� 
		  	}
		  } 
		  
		  class Emp extends Object {
		  
		  } 
		  
		 */
	}

	
	

}
