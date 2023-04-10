import java.util.ArrayList;
import java.util.List;

// ���� 13��
/*
 Today Point
 jdk 1.5����
 
 C#, JAVA(�ʼ����)
 
 1. Ÿ���� ó�� ���� ����
 2. Ÿ�� ������ (Ÿ�� ����)
 3. ���� ����ȯ �ʿ� ����. ex) (Car) Object �ʿ����
 
 */
// ���赵�� ���鶧
class MyGeneric<T>{ // Type parameter
	T obj;
	
	void add(T obj) {
		this.obj = obj;
	}
	T get() {
		return this.obj;
	}
} // Ÿ���� ����� �� �ִ�

class Person{
	int age = 100;
}

public class Ex04_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGeneric<String> mygen=new MyGeneric<String>();
		/*
		 class MyGeneric<String>{ 
			String obj;
			
			void add(String obj) {
				this.obj = obj;
			}
			String get() {
				return this.obj;
			}
		 }

		 */
		mygen.add("���ڿ�");
		String str = mygen.get();
		System.out.println(str);
		
		ArrayList<String> list = new ArrayList<>();
		list.add("���ڿ�");
		
		//--------------------------------------------
		// �������� ��������
		ArrayList list2 = new ArrayList();
		list2.add(10); //int
		list2.add("ȫ�浿"); // String
		list2.add(new Person()); // ��ü
		//������ for�� ����ؼ� Person ��ü�� age ���� ����ϰ� �������� ���� ���
		
		for(Object p : list2) {
//			System.out.println(p); //10 , ȫ�浿 , Person@1c4af82c age�� �ȳ���
			if(p instanceof Person) {
				Person j = (Person) p;
				System.out.println(j.age); //Person age : 100
			}else {
				System.out.println(p); //10 , ȫ�浿 
			}
		}
		
		//���ʸ� ����--------------------------------------------
		List<Person> plist = new ArrayList<>();
		plist.add(new Person());
		plist.add(new Person());
		for(Person p : plist) {
			System.out.println(p.age);
		}
		
		
	}

}
