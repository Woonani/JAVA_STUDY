import java.util.*;

/*
 Map �������̽�
 (Key, value) ���� ������ ���� �迭
 ex) ������ȣ (02, ����) (031, ���)
 
 key �ߺ� (x)  >> Set�� ����
 value �ߺ� (o) >> List�� ����
 
 Generic ����
 
 Map �������� �����ϴ� Ŭ���� : ����ȭ(Thread: stack ������ ����ϱ�)
 ������ : HashTable (����ȭ) ���� : �Ѱ� ȭ��� (Lock) �ڿ���ȣ
 �Ź��� : HashMap   (����ȭ) �������� �ʾƿ� : �Ѱ� ����� (����) ********
 
 ArrayList, HashMap + Generic >> �⺻���� CRUD >> DB
 
 */
public class Ex11_Map_Interface {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("Tiger", "1004"); // id, pw
		map.put("scott", "1004"); 
		map.put("Superman", "1007");

		// System.out.println(map.containsKey("tiger")); // false ��ҹ��� �����ϱ� ����
		System.out.println(map.containsKey("Tiger"));
		System.out.println(map.containsValue("1007"));
		
		//key ���� ... value ��
	    System.out.println(map.get("Tiger"));//value
	    System.out.println(map.get("hong"));//null
	    
	    //���࿡
	    System.out.println(map.size()); // ������
	    map.put("Tiger", "1008"); //key �����ϸ� value (replace) : ���
	    System.out.println(map.size()); // ������ ����
	    System.out.println(map.get("Tiger"));
	    System.out.println(map.toString()); // toString �������̵� �Ǿ�����

	    Object value = map.remove("Superman");
	    System.out.println("������ value : "+ value);
	    System.out.println(map.toString()); // toString �������̵� �Ǿ�����
	    
	    //����(����)
	    Set set = map.keySet();
	    // keySet() �Լ��� Set �������̽��� �����ϰ� �ִ� ��ü�� �����ϰ� ������ ��Ƽ� 
	    // �� �ּ� ����
	    // �θ�Ÿ���� Set �������̽��� ���ؼ� �ڽİ�ü�� �ּҸ� ���� �� �ִ�.
	    // ǥ��ȭ�� ���
	    Iterator it = set.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	    
	    Collection clist = map.values();
	    System.out.println(clist.toString());
	    
	}

}
