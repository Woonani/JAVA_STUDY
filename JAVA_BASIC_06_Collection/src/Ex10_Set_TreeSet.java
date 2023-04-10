import java.util.*;
public class Ex10_Set_TreeSet {

	public static void main(String[] args) {
		//set: ����(x), �ߺ�(x)
		
		/*
		 TreeSet ���� x, �ߺ� x, ���ı��(0)
		 �˻��ϰų� ���� �ʿ��� ��� ����ϴ� �ڷᱸ��
		 �ζ� >> 
		 
		 ����Ʈ�� : root > leaf 
		 ������ ����� ���ı�� ����
		 
		 */
		
		HashSet<String> hs = new HashSet<>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("G");
		hs.add("D");
		hs.add("P");
		System.out.println(hs.toString());
		// [P, A, B, D, F, G, K] ������ �������� �ʴ´� �ߺ������� ����
		
		Set<Integer> lotto = new TreeSet<>();
		for(; lotto.size()<6; ) {
			
			int num = (int)(Math.random()*45 +1);
			lotto.add(num);
			System.out.println("num : "+ num);
		}
		System.out.println(lotto.toString());

	}

}
