/*
 Today Point
 ��Ӱ��迡�� override : ��Ӱ��迡�� �ڽ��� �θ��� �Լ��� [������]
 [��Ӱ���]���� [�ڽ�Ŭ����]�� [�θ�Ŭ����]�� �޼��带 ������ (������ �ٲ�)
 ������ : Ʋ�� ��ȭ�� ���� (�Լ��� �̸�, Ÿ��) ���븸 ��ȯ(�߰�ȣ �ȿ� �����ڵ� �ڵ� ����)
 
 ����)
 1. �θ��Լ� �̸� ����
 2. �θ��Լ� parameter ����
 3. �θ��Լ� return type ����
 4. �ᱹ { ����� �ڵ常 ���� }
 
 */

class Point2{
	int x = 4;
	int y = 5;
	
	String getPosition() {
		return this.x + "/" + this.y;
	}
}

class Point3D extends Point2 {
	int z =6;
	// z�� ���Ե� �Լ�
	// getPosition() �Լ� �̹� ���� �θ�.....
	
	//���ο� �Լ��� ������ ���� �ƴ϶� .... �θ� �Լ� �״�� .... �ǹ� ... override(������)
	//���� ����� �Լ��� ���� ���������� �ƴ��� �����ϰ� �ʹ�! 
	 
	//Annotation
	/*
	������̼��� ������ �ǹ̷δ� �ּ��̶�� ���̴�. 
	�ڹٿ��� ���� ���� ������̼��� �ڵ� ���̿� �ּ�ó�� ������ Ư���� �ǹ�, ����� �����ϵ��� �ϴ� ����̴�. 
	��, ���α׷����� �߰����� ������ �������ִ� ��Ÿ������(meta data: �����͸� ���� ������,
	�����͸� �ؼ��ϱ� ���� ������)��� �� �� �ִ�.
	
	1. �����Ϸ����� �ڵ� �ۼ� ���� ������ üũ�ϵ��� ������ ����
	2. ����Ʈ���� �������� ���峪 ��Ģ�� �ڵ带 �ڵ����� ������ �� �ֵ��� ���� ����
	3. ����� (��Ÿ�ӽ�)Ư�� ������� �����ϵ��� ������ ����
	 */
	
	@Override // �����Ϸ����� �ڵ� �ۼ� ���������� üũ�ϵ��� ������ ����
	String getPosition() { //getPositions : The method getPositions() of type Point3D must override or implement a supertype method �̸� �׳� ���δ� �Լ� �������
		return this.x + "/" + this.y + "/" + this.z;
	}
	
}
//�����ε��� �ϳ��� �̸����� �������� ����� �����ϴ� ��, �������̵� ��Ӱ��迡�� ������
public class Ex04_Inheritance_Override {
	public static void main(String[] args) {
		
		Point3D p = new Point3D();
		String result = p.getPosition();
		System.out.println(result);
	}
	
	
}
