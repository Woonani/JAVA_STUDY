import java.util.*;

/*
 HashMap<k,v>
 
 HashMap<String,String>
 HashMap<Integer,String>
 HashMap<String,Student>  POINT 
 
 put("kglim", new Student())
 �տ��� Ÿ���̰� �ڿ� ��ü�� �ּҰ� ����
 
 
 */
class ArrayTest{
	ArrayList<String[]> al = new ArrayList<>(); // String�迭�� �ּҰ��� �ްڴ�.
}
class Student{
	int kor;
	int math;
	int eng;
	String name;
	public Student(int kor, int math, int eng, String name) {
		super();
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.name = name;
	}
	 
}

public class Ex13_Map_Generic {

	public static void main(String[] args) {
		HashMap<String, String> sts  = new HashMap<>();
		sts.put("A", "AAA");
		System.out.println(sts.get("A"));
		
		// �ǹ����� Map
		//�л��� ���� ������
		// key(�й�), value[����, ����, ����] >> Array, Collection(ArrayList);
		
		HashMap<String, Student> smap = new HashMap<>(); // Student��� ��ü�� �ּҰ��� �־�� ��! put�Ҷ�!!
		smap.put("hong", new Student(100, 90, 50, "ȫ�浿"));
		smap.put("kim", new Student(50, 30, 50, "������"));
		
		Student sd = smap.get("kim");
		System.out.println(smap.get("kim")); // �ּ� ���� : Student@626b2d4a
		System.out.println(sd.kor +" / " + sd.eng +" / " + sd.math );
		
		//---------------------------------------------------------------------------
		//???????????
		ArrayTest at = new ArrayTest();
		String[] strarr = {"A", "B", "C"};
		at.al.add(strarr);
		//System.out.println(at.al.get(0));//[Ljava.lang.String;@1c4af82c �ּҰ� ����
//		System.out.println(at.al.get(0)[0] +" / "+ at.al.get(0)[1]+" / "+ at.al.get(0)[2]);
		//A / B / C
		String[] strarr2 = {"��", "��", "��"};
		at.al.add(strarr2);
//		System.out.println(at.al.get(1)[0] +" / "+ at.al.get(1)[1]+" / "+ at.al.get(1)[2]);
		//�� / �� / ��
		
		//---------------------------------------------------------------------------
		// Tip _ entrySet() �Լ�
		Set set = smap.entrySet(); // Map(key,value) ���� >> key + "=" + value 
		//set���� �޴� ���� : set�� �ߺ��� ������� �ʱ� ������ key�� ���� ��!
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); //kim=Student@626b2d4a  : Ű = ��ü �ּ�
		}

		// Tip2 _ key�� value�� �и��ؼ� ����ʹ�
		// class Entry {Object key, Object value}
		// Map {Entry[] elements} >>> Map.Entry
		for(Map.Entry m: smap.entrySet()) { // entryset�� ������ for�� ����
			System.out.println(m.getKey() + " ^/ " + ((Student) m.getValue()).name); //Student Ÿ������ down casting�ɾ �����ִ� �ڿ����� ����� �� �� �ִ�.
		}
		//hong ^/ ȫ�浿
		//kim ^/ ������  ��µ�.

	}

}
