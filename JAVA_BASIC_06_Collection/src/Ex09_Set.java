import java.util.*;

/*
 Set �������̽�
 (�� �ȿ� ������) : ������ ����(x), ������ ����. �ߺ��� ���� ������� �ʴ´�
 ������ ���� �ߺ��� ������� �ʴ� ������ ����
 �����ϴ� Ŭ����
 HashSet, TreeSet (�ڷᱸ��)
 
 # �˻��� �����Ҷ� TreeSet
 */
public class Ex09_Set {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(100);
		boolean bo = hs.add(55);
		System.out.println("���� : "+ bo);
		
		bo = hs.add(1); // �̹� 1�̶�� �����Ͱ� �����ؼ� false ��ȯ
		System.out.println("��� : "+bo);//false ������ ���� �����Ͱ� �����ָӴϾȿ� �־��
		
		System.out.println(hs.toString()); // toString()�� ������ �Ǿ��־ for���� ������ �ʾƵ� ��µ�.
		// �ζ�, ������ȣ, ȸ�� id .....
		HashSet<String> hs2 = new HashSet<>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("C");
		hs2.add("Z");
		hs2.add("A");// �ߺ��̶� �ȵ�
		hs2.add("H");
		hs2.add("b");// �ߺ��̶� �ȵ�
		hs2.add("b");// �ߺ��̶� �ȵ�
		System.out.println(hs2.toString());//[A, b, C, F, H, Z]
		
		String[] strobj = {"A", "B", "C", "D", "B", "A"}; // 10000��
		HashSet<String> hs3 = new HashSet<>();
		for(int i = 0; i<strobj.length;i++) {
			hs3.add(strobj[i]);  //�ߺ� �����ʹ� add ���� �ʴ´� 
		}
		System.out.println(hs3.toString());
		
		//==========================================
		//Quiz
		//�Ʒ� �ڵ带 HashSet ���� ����� �Ļ��ϼ���
		/*
		 for(int i = 0 ; i < 6 ; i++) {
			lotto[i] = (int)(Math.random()*45 + 1);
			for(int j = 0 ; j < i ; j++) { //j < i (ä���� ���� ��ŭ ��)
				if(lotto[i] == lotto[j]) {
					i--;
					break;
					
				}
			}
		} 
	   */
		HashSet<Integer> lotto = new HashSet<>();
//		for(int i = 0 ; i <6 ; i++) {
//			lotto.add((int) (Math.random()*45) + 1);
//			// if�� �ʿ�
//		} 
		while(lotto.size() < 6) {
			lotto.add((int) (Math.random()*45) + 1);
			
		}
		
		System.out.println(lotto.toString());
	}

}
