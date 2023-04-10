
class Pbase{
	int p = 100;
}

class Cbase extends Pbase {
	int c = 200;
}

class Dbase extends Pbase {
	
}

public class Ex11_Inheritance_Polymorphism {

	public static void main(String[] args) {
		
		//��Ӱ��迡�� �θ�Ÿ���� ���� ������ �������� �ڽ�Ÿ�� �ּҸ� ���� �� �ִ�.(������)
		Cbase cbase = new Cbase();
		System.out.println(cbase.toString()); //Cbase@5e91993f
//		System.out.println(cbase); �Ȱ��� �����µ� ���Ϸ� toString ����?
		
		//������
		Pbase pbase = cbase;
		
		Dbase dbase = new Dbase();
		pbase = dbase;
		System.out.println(pbase.toString()); //Dbase@379619aa
		
		/////////////////////////////////////////////////////////////
		//�θ��ּҸ� �ڽĿ��� ....�Ұ� .... ���� ��ȯ
		Cbase ccc = (Cbase) pbase; // down casting
		
		 
	}

}
