import java.util.Vector;

/*
 Collection FrameWork
 [�ټ��� ������]�� �ٷ�� [ǥ��ȭ�� �������̽�]�� �����ϰ� �ִ� [Ŭ������ ����]�� ����!
 
 Collection �������̽� >> ��� List >> ���� ArrayList
 Collection �������̽� >> ��� Set >> ���� HashSet
 
 * ArrayList�� �θ�Ÿ���� List �̴� (o)>> ������
 * Collection �������̽��� ArrayList�� �θ�Ÿ���̴� (o)
 * instanceof ����
 
 * Map �������̽� (key, value) ���� �迭 >> ���� HashMap
  
 1. List (�������ÿ�)
 ������ �ִ� ������ ����(��ȣǥ) ... �ߺ���� >> ����(0), �ߺ�(0) ������ ����
 >> Tip) Array ���� O >> [ȫ�浿][ȫ�浿][ȫ�浿][][] >> [0] ��° �� ...
 array ���� : �ѹ� ������ �迭�� ũ�⸦ ���� �� �� ����
 
 1.1 Vector    (������) -> ����ȭ ���� (o) >> Lock default
 				Vector (ȭ���) -> ��Ƽ ������ ȯ��(Lock) -> ����(x), ����(o)
 1.2 ArrayList (�Ź���) -> ����ȭ ���� (x) >> Lock option
 				ArrayList (�����) -> ��Ƽ ������ ȯ��(Lock) -> ����(o), ����(o)
 Vector ��������,  �н���
 ArrayList Ȱ��
 
 ------------------------------------------------------------------------
 �ټ��� �����͸� �ٷ�� ��� (Array >> ����, ���� 
 ****** Point ���� ������ �ѹ� �������� (���� ũ��� ����Ұ�)
  1. int[] arr = new int[3];
  2. int[] arr = new int[]{1,2,3};
  3. int[] arr = {10,20,30};
  arr3 ��� �ִµ� �����Ͱ� 100���� �߰�
  int[] arr4 = new int[100];
  *******���ο� �迭 �����ϰ� ������ �̵� (�ڵ�� ���� ������ ����)
  
  Array
  1. �迭�� ũ�Ⱑ ���� : Car[] cars = {new Car(), new Car()} 2��
  2. ���ٹ�� (index) >> cars[0] ,,, n(length-1)
  
   List �������̽��� �����ϰ� �ִ� ArrayList, Vector�� 
   1. �迭�� ũ�Ⱑ �������� Ȯ�� or ��� ���� >> ������ ***�����Ϸ��� ���ο� �迭�� ����� ������ �̵� ,,,
   2. ������ ����(���������� Array) ���, �ߺ��� ���
   3. �ߺ��� ��� (index �� ���ؼ� ����)
   
 
 */
public class Ex01_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("�ʱ�뷮 : "+v.capacity()); //������ 10ĭ : 10��¥�� �����迭 ����
		System.out.println("size(���� ũ��(����)) :  "+ v.size()); // ���� 0�� �������
		
		v.add("AA"); // ���� [0]
		v.add("BB"); // ���� [1]
		v.add("CC"); // ���� [2]
		v.add(10);
		System.out.println("size(���� ũ��(����)) :  "+ v.size()); // ���� 4��
		System.out.println(v.toString()); //[AA, BB, CC, 10] ������ �� 
		// Array >> �迭�� ���� >> length() >> ���� ����
		// Collection >> size() >> ���� ���� >> ��ü�� �Լ� ���� >> get(0)�Լ� �����
		for(int i =0; i<v.size(); i++) {
			System.out.println(v.get(i)); // get(indext) return �迭 ����
		}
		//������ for�� ��� 
		for(Object obj : v) {
			System.out.println(obj);
		}
		
		// ���� : ���� ������ (���� Ÿ���� ����Ŀ) >>> ���� ū Ÿ���� ����ؼ� ��� ���� ���ո�
		// ���ʸ� >> Ÿ���� ���� >> POINT
		Vector<String> v2 = new Vector<String>();
		v2.add("hello");
		v2.add("world");
		for(String a: v2) {
			System.out.println(a);
		}
		
		Vector v3 = new Vector<>();
		System.out.println(v3.capacity()); // �� 10�� ���� :  Object[] obj = new Object[10]; ����
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A"); // 11��° 
		System.out.println(v3.toString()); 
		System.out.println(v3.capacity()); // �� 20�� ������
		
		// �׳� ���ϰ� ������ (���� �þ�� �پ��) >> ���ο� �迭�� ����� �̻� ��Ű�� �۾��� �ڵ����� ��
		
		
		
		
	}

}
