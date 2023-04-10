/*
 String Ŭ���� (���ڸ� ������ ���� �� �ִ� Ŭ����)
 String �� ���� �Լ� ������ �ִ�.. ��κ��� �����ʹ� ���ڿ� (�ڸ���, ��ġ��, ������,, ����)
 String >> ������ �ִ� �Ϲ��Լ� + static �Լ� Ȱ�� (15~20) �Լ� ���� ...
 
 */
public class Ex05_String_Class {

	public static void main(String[] args) {
			String str = ""; // �ʱ�ȭ
			String[] strarr = {"abc", "bbb", "ccc"};
			
			for(String s : strarr) {
				System.out.println(s);
			}
			// ����� : int , double ��Ÿ�� ó�� �δ���� ���
			
			String st = "ȫ�浿";
			System.out.println(st.length()); // �迭
			//[ȫ][��][��] >> char[]�� ����
			System.out.println(st); //ȫ�浿 // �ּ� ���� >> �����δ� �� (toString() ���� �ص� �����Ϸ��� �˾Ƽ� ���� > �׷��� �ּҰ��� �ȳ����� ���� �����°�!)
			System.out.println(st.toString());//ȫ�浿
			//String Ŭ������ Object �θ� Ŭ������ ������ �ְ� toString()
			//��Ӱ��� String extends Object >> ������ (override) >> �ּҿ� ���� ���� read �ؼ� ���� return
			
			//����ǥ��
			String sdata = new String("������"); //String st = "ȫ�浿";�� �ٸ�!!
			System.out.println(sdata);
			
			//�������� �Ʊ� ����µ���..
			String name = "�����ٶ�";
			//String ���������� char[] member field >> �迭[��][��][��][��][��]
			// class String extends Object {private char[] str ...... setter, getter....@Override toString()} //@Override toString()�̷������� ������ ���� ���̶�� ����
			
			String str1 = "AAA";
			String str2 = "AAA";
			
			//���ڿ��� ��
			System.out.println(str1); //toString() �������ִ�.
			System.out.println(str2.toString()); // toString() ������ �ּҰ��� �ƴϰ� ���� ��������
			
			System.out.println(str1 == str2); // true
			// == �����ڴ� ���� �� str1 �ּҰ� str2 �ּҰ�
			// �����ּҰ� �Ǻ�
			// ** �޸𸮿� ������ ���� ���ڿ��� ������ ������
			// str1�� str2 ���� �޸𸮸� ����
			
			//POINT
			//���ڿ��� �񱳴� ������ ... equals()
			System.out.println(str1.equals(str2)); // true
			
			//Why : equals
			String str3 = new String("BBB");
			String str4 = new String("BBB");
			System.out.println(str3 == str4); // false : new�� �����ϸ� ���� �������� ���ؼ� �ּҰ��� �ٸ�
			System.out.println(str3.equals(str4)); // true 
			
			String s = "A";
			s += "B";
			s += "C";
			System.out.println(s); // ABC
			s = "A";
			System.out.println(s); // A : �ּҵ� ���� �Ͱ� ����. �޸𸮿� �ִ°� ������ ���� ����~
			// �׷��� .. String ��������.. �ٺ� .... (���� �����ϸ� �޸𸮿� ���� ����)
			// Stringbuilder, Stringbuffer
			
	}

}
