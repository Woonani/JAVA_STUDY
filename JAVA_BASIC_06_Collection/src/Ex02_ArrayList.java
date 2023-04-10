import java.util.*;

//Today Point(ArrayList)
public class Ex02_ArrayList {

	public static void main(String[] args) {
		// List �������̽� �����ϰ� �ִ� Ŭ���� >> ArrayList >> ��������(index), �ߺ������� ���
		// �Ĵ� ��ȣǥ, ���� ��ȣǥ(��������)
		ArrayList arraylist = new ArrayList(); // ctrl + shift + o
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		
		for(int i=0; i<arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}
		// �� / �Ʒ� ���� ������ ������ ���� ����� �ϱ�!!!!!!!!!!!
		System.out.println(arraylist.toString());
		
		// add �Լ��� ������ ���������� �ֱ�
		arraylist.add(400); // index > 3��° 
		arraylist.add(0, 1111); // push ó�� ����
		System.out.println("0��° �濡 1111cnrk : "+arraylist.toString());
		//0��° �濡 1111cnrk : [1111, 100, 200, 300, 400]
		// 1. ��������� ������ �߰�, ���� >> ������ ���� �ʾƿ� >> ������ �ִ� ������ ����
		// 2. �������� ������ �߰�, ���� ����
		
		System.out.println(arraylist.contains(200)); // true
		System.out.println(arraylist.size()); //5
		arraylist.clear(); // ������ ���� (�뷮�� ���� �ִ�)
		System.out.println(arraylist.size()); //0
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		System.out.println(arraylist.isEmpty()); // false
		System.out.println(arraylist.size()); // 3
		
		Object value = arraylist.remove(0); // remove�� ���� �����͸� ��ȯ
		System.out.println(value); // 101 // [101][102][103] >> 101 ����
		System.out.println(arraylist.toString()); //[102][103] >> ����� �Ų�
		
		//Point ������
		// �������̽� �θ� Ÿ��
		// ������(Ȯ�强, ������)
		// ArrayList arralist = new ArrayList();
		// ���������� ������ �Ϸ��� ����ϱ�!
		List li = new ArrayList();
		// �θ�Ÿ���� �������� li�� �ڽİ�ü�� �ּҰ��� ���� �� �ִ� (������)
		// �������̽��� �����ڵ尡 ����� ... ������ ... �ڽ��� �Լ� ����ȴ�!!!
//		��ƴٸ� li��� ������ Vector�� �� ���� ���ݾ�
		// Buy��� �Լ� �Ҷ� Audio ���� Tv�� ��� ���� Product�� �޾��ݾ� �׷��ž�
		li.add("��");
		li.add("��");
		li.add("��");
		li.add("��");
		System.out.println(li.toString());
		List li2 = li.subList(0, 2); // ���������� List �������̽� ...�ڵ� : �����迭 ����
		// List �� ū �絿�̶�� ��������
		System.out.println(li2);
		System.out.println(li);
		
		// ArrayList >> Array
		// ���� 
		 ArrayList alist = new ArrayList();
		 alist.add(50);
		 alist.add(1);
		 alist.add(7);
		 alist.add(40);
		 alist.add(46);
		 alist.add(3);
		 alist.add(15);
		 System.out.println(alist.toString());//[50, 1, 7, 40, 46, 3, 15]
		 Collections.sort(alist); //���� ������ ����
		 // �ʱ� .. �ڵ� ���� �ۼ�
		 System.out.println(alist.toString()); //[1, 3, 7, 15, 40, 46, 50]
		 //������
		 Collections.reverse(alist);
		 
		 System.out.println(alist.toString()); //[50, 46, 40, 15, 7, 3, 1]
		 
		 
		//======================================
		 
		
	}

	class Solution {
		public int solution(int[] ingredient) {
			ArrayList<Integer> array = new ArrayList<>();
			for(int i=0; i < ingredient.length; i++ ) {
				array.add(ingredient[i]);
			}
			
			int answer = 0;
			for(int i=0; i<=ingredient.length-4; i++) {
				if(array.get(i) == 1 &&array.get(i+1) == 2 && array.get(i+2) == 3 && array.get(i+3) == 1 ) {
					array.remove(i);
					array.remove(i+1);
					array.remove(i+2);
					array.remove(i+3);
					answer++;
					i-=2;
				} 
				
			}
			return answer;
		}
	}
}
