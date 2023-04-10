

class Person{
	String name;
	int age;
	
	//���� ����� ���� �� �̸�, ���� ���� �ϰ� ������
	//Person(){}
//	Person(String name, int age){this.name = name; 	this.age = age;	}
	void print() {
		System.out.println(this.name + " : "+ this.age);
	}
}

public class Ex04_Object_Array {

	public static void main(String[] args) {
		int[] intarr = new int[10];
		boolean[] boolarr = new boolean[5];// false (default)
//		int[] arr9= {};
		Person p = new Person(); // local ���� ���� p >> p��� ������ �ּҰ��� ������
		p.name = "ȫ�浿";
		p.age = 100;
		
		// Person Ÿ���� ��� �� ���� ���弼��
		// heap ��ü�� 3�� 
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		
		// int i , int j , int k
		Person[] persons = new Person[3]; // �游 ����� �濡 �ƹ��� ���� �ʾƿ�. PersonŸ���� ���� ��
		System.out.println(persons);
		System.out.println(persons[0]);
		System.out.println(persons[1]);
		System.out.println(persons[2]);
		
		//���� ����� �־��
		persons[0] = new Person(); // ���� �ּҰ��� ���´�.
		
		Person p5 = new Person();
		persons[1] = p5;
		
		persons[2] = new Person();
		
		persons[2].name="������";
		persons[2].age = 100;
		
		System.out.println(persons[2].name);
		System.out.println(persons[2].age);
		
		//�ʱ���
		// ��ü �迭�� ���� ����� �Ͱ� ���� ä��� �۾��� ������.*********************************
		
		// ��ü�迭�� ... [ 1) ���� ����� �Ͱ� 2) �� �ּ� ä��� �� ] �� ���� �۾��� �ʿ��ϴ�. 
		
		// ��ü �迭 3���� ��� ...
		//1. int[] arr = new int[10]
		Person[] parray = new Person[10]; // �游 ��������
//		for(Person i : parray) {
		for(int i = 0; i < parray.length; i++) {
			parray[i] = new Person();
			System.out.println("�ּҰ� : " +  parray[i]);
		}
		/*
		 �ּҰ� : Person@5e91993f
		 �ּҰ� : Person@1c4af82c
		 �ּҰ� : Person@379619aa
		 �ּҰ� : Person@cac736f
		 �ּҰ� : Person@5e265ba4
		 �ּҰ� : Person@156643d4
		 �ּҰ� : Person@123a439b
		 �ּҰ� : Person@7de26db8
		 �ּҰ� : Person@1175e2db
		 �ּҰ� : Person@36aa7bc2
		 */
		
		// 2. int[] arr = new int[]{10,20,30} 
		Person[] parray2 = new Person[] {new Person(), new Person(), new Person()};
		
		// 3. int[] arr = {10,20,30} 
		Person[] parray3 = {new Person(), new Person(), new Person()};
	}

}
