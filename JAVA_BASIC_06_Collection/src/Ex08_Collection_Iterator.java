import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 Collection FrameWork
 >> �ټ��� �����͸� �ٷ�� ǥ��ȭ�� ��� �н� >> �������̽��� Ŭ������ ����
 >> �� ���� �������̽��� ������ �ִ� (�ټ��� �����͸� ȿ�������� �ٷ�� ����)
 
 Iterator �������̽�
 ������ �ڿ��� ���ؼ� ���������� �����ؼ� ���� ������ �Ǵ��ϰ� ���� �����ϴ� ǥ���� ����
 �߻��ڿ��� ������ �ִ� >> � Ŭ������ Iterator �������̽� �����ؼ� >> ǥ��ȭ�� ���� ����� ����
 
 Iterator �������̽� ������ �ִ� �߻��ڿ�
 hasNext(), Next(), remove() �߻�
 ArrayList implements Iterator {3���� �Լ��� ������ �ϰ� �ִ�.}
 
 */

public class Ex08_Collection_Iterator {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//-------------------------------------------------------------------

		
		//Collection FrameWork �����ϴ� ǥ��ȭ�� ���� ���
		Iterator it = list.iterator(); // ȣ���ϸ� �Լ��ȿ��� �������̽��� �����ϴ� ��ü�� �����ǰ� �� �ּҸ� ����
		// iterator() �� ����ϸ� �ڿ��� Iterator�������̽��� �����ϰ� �ִ� �Լ��� ���ؼ� ���� �����ϴ�
		
		while(it.hasNext()) {  //���� ���� (ǥ��ȭ�� ���)
			System.out.println(it.next());
		}
		
		ArrayList<Integer> intlist = new ArrayList<>();
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
		
		// �������̽� generic ���
		Iterator<Integer> it2 = intlist.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		System.out.println("***********************");
		// ���ͷ����� ���� : ������ �����⸸ ����. �Ʒ� for�� ó�� �ڷ��Ӱ� ���� ���
		for(int i = intlist.size()-1; i>=0; i--) {
			System.out.println(intlist.get(i));
		}
		//====================================
		//Iterator ������ ����� �⺻
		// ������ ��ȸ 
		ListIterator<Integer> it3 = intlist.listIterator();
		
		// ������
		while(it3.hasNext()) {
			System.out.println("��"+it3.next());
		}
		// ������
		while(it3.hasPrevious()) {
			System.out.println("�� "+it3.previous());
		}

		// ����
		while(it3.hasNext()) {
			int i = it3.next();
			if(i == 3) {
				it3.remove(); //  ���ͷ����ʹ� �ε����� �������ֵ�
			}
		}
		//--------------------?
		//���� >>> remove/////////////////////////////
		/*
		 
				List<Integer> numbers = new ArrayList<>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				
				System.out.println(numbers);
				
				Iterator<Integer> itr = numbers.iterator();
				while(itr.hasNext()) {
					int num = itr.next();
					if(num % 2 == 0 ) {
						itr.remove();
					}
				}
				System.out.println(numbers);
		
		
		 */
	}

}
