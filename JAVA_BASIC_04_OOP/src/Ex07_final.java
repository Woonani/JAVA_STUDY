/*
 ���� <> ���
 ��� : �ѹ� ���� [�ʱ�ȭ] �Ǹ� ���� �Ұ�
 ����ڿ� : ������ >> �ֹι�ȣ, ���� : PI=3.141591... , �ý��۹�ȣ (������ȣ v1.0, v1.0.0)
 ��� ���������� �빮�� 
 
 JAVA : final int NUM = 10; // �ڽ����� const�� ����
 C#   : const integer NUM = 10;
 
 final Ű���� 
 1. final class Car { } >> ��ӱ��� 
 	ex) public final class Math extends Object // Math ��ӱ�����
 2. public final void print(){} >> ��Ӱ��迡�� ������ ����
 
 3. member field (���) �߿�
 
 */

class Vcard{
	final String KIND = "heart"; // �ʱ�ȭ�� ���� ���ϰڴµ�? �ǹ̿��� ������
	final int NUM = 10; //The blank final field NUM may not have been initialized
	
	void method() {
		//JAVA API
		System.out.println(Math.PI);
	}
	
}
// ������ ���忡�� 
// 53���� ī�� ������ ī�帶�� �ٸ� ������� ������ �ϰ� �ʹ�
class Vcard2{
	final String KIND;
	final int NUM;
	// ����... ������ �ʱ�ȭ �ɰž�
	// �ʱ�ȭ�� ���� 
	// member field �ʱ�ȭ (������)
	
//	Vcard2(){	} //:The blank final field NUM may not have been initialized
	Vcard2(String kind, int num){
		this.KIND = kind;
		this.NUM = num;
	}

	@Override
	public String toString() {
		return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
	
	
}

public class Ex07_final {

	public static void main(String[] args) {
		Vcard vcard = new Vcard();
		// vcard.KIND = "AAA"; ����Ұ�
//		System.out.println(vcard.KIND);
//		vcard.method();
		
		Vcard2 v1 = new Vcard2("spade", 1);
		System.out.println(v1.toString());
		
		Vcard2 v2 = new Vcard2("spade", 2);
		System.out.println(v2.toString());
		
		Vcard2 v3 = new Vcard2("heart", 3);
		System.out.println(v3.toString());
		

	}

}
