import java.lang.reflect.Method;

/*
��ü �Ѱ��� ������ ���
this : ��ü �ڽ��� ����Ű�� this (this.emno , this.ename)
this : �����ڸ� ȣ���ϴ� this ( this(100,"red"))

��Ӱ���
�θ� , �ڽ� 

super(��Ӱ��迡�� �ڽ��� �θ��� �ڿ� ���� �ϴ� �ּ�����) : ��Ӱ��迡�� �θ� ���� (super)

1. super : ��Ӱ��迡�� �θ��ڿ��� ����
2. super : ��Ӱ��迡�� �θ��� �����ڸ� ȣ��

Tip)
C# : base()
JAVA : super()

 */
class Base{
	String basename;
	Base(){
		System.out.println("�θ� Ŭ���� �⺻ ������");
	}
	Base(String basename){
		this.basename = basename;
		System.out.println("basename : " + this.basename);
	}
	void method() {
		System.out.println("�θ� method");
	}
}

class Derived extends Base {
	String dname;
	Derived() { // ������
		System.out.println("�ڽ� Ŭ���� �⺻ ������");
	}
	Derived(String dname){
		
		// �θ� ������ ȣ�� (super)
		super(dname); //�θ� ������ ȣ�� > super ������ �⺻ �����ڸ� ȣ���!!!!!!!!!!!!!!!!!!
		
		this.dname= dname;
		System.out.println("dname : " + dname);
		
		}
	
	
//@Override ������ : 
	//1. ���콺�� source > override
	//2. me(�θ� �޼ҵ�� �Ϻ�)+ctrl+space�ε� ����

		@Override
	void method() {
		System.out.println("�θ��Լ� ������");
//		super.method(); // �θ� �ڿ��� ����ϰ� �ʹٸ� 1
	}

	void pMethod() { // �θ� �ڿ��� ����ϰ� �ʹٸ� 2 
		// �ڽİ�ü�� �Լ��ȿ��� super ���
		super.method(); // super�� �θ� ��ü�� ã�ư��� �ּ�
//		String pname = super.basename;
//		System.out.println("�θ� ������ basename1 : "+basename);
//		System.out.println("�θ� ������ basename2 : "+super.basename);
	}

}



// ��Ӱ��迡���� �θ���� ����
public class Ex06_Inheritance_super {

	public static void main(String[] args) {
		//Derived d = new Derived(); // ��Ӱ��迡���� �θ���� ���� :  �θ� ��� ���� �� �ڽ� ��� ����
		
		Derived d = new Derived ("ȫ�浿"); // �����ε� �����ڸ� �θ� > �θ��ʿ��� "ȫ�浿"�� ���޵ɱ�? > x
		// ���� �θ��� �����ڵ� ȣ���ϰ� �ʹٸ�? (super)
		d.method(); //�����ǰ� �Ǹ� �θ� �ڿ� ���� �Ұ�
		
		// �θ� �׸�����
		d.pMethod();

//		Q �� �ν��Ͻ� ����, ���ú���
//		d.basename; //Syntax error, insert "VariableDeclarators" to complete LocalVariableDeclaration
		//�������� ���� �ǰ�, ����ϸ� ����! ��� �ʵ忡���� ���� �ȵ�... ����? 
		System.out.println(d.basename);
		String a = d.basename;
		System.out.println(a);

	}

}
