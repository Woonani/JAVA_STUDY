import kr.or.kosa.Singleton;

public class Ex15_Singleton_main {

	public static void main(String[] args) {
		/* 1 */
//		Singleton s = new �����ڸ� private���� ���� ������ �ʰ� ��
		/* 2 */
//		System.out.println(Singleton.p); //�Ϲ������� ���� //kr.or.kosa.Singleton@1c4af82c
		
		/* 3 */
		Singleton s = Singleton.getInstance();//kr.or.kosa.Singleton@1c4af82c
		Singleton s1 = Singleton.getInstance();//kr.or.kosa.Singleton@1c4af82c
		Singleton s2 = Singleton.getInstance();//kr.or.kosa.Singleton@1c4af82c
		
		System.out.println((s == s1)); // true
		System.out.println((s2 == s1)); //true
		// s, s1, s2 ��� ����!! �̰��� �̱���!
		 
		

	}

}
