import java.util.StringTokenizer;

import javax.annotation.processing.SupportedSourceVersion;

public class Ex06_String_Method {

	public static void main(String[] args) {
		String str = "hello";
		String concatstr = str.concat(" world");
		System.out.println(concatstr); // hello world
		
		System.out.println(str.contains("elo")); // false : ello��
		System.out.println(str.contains("ello")); // true
		
		String str2 = "a b c d"; //[a][ ][b][ ][c][ ][d]
		System.out.println(str2.length()); //7
		// ����) �� ����� �����Ͽ�
//		char blank = ' '; // : ���鰡��
//		char blank = ''; // : ���ڴ� �ȵ�

		
		String filename ="hello java world";
		System.out.println(filename.indexOf("e")); // 1
		System.out.println(filename.indexOf("java")); // 6
		System.out.println(filename.indexOf("������")); // -1
		// ���� ������ -1 ���� .... �迭�� ���ϴ� �ܾ ����.
		// �Ź��缳 ���ϴ� �˻� ... ���� ���ϴ� �ܾ �ִ����� ...Ȯ��
		if(filename.indexOf("wo") != -1) {
			System.out.println("wo �ܾ�� �ϳ��� �ִ�."); // �����ϱ� ��µ�
		}
		System.out.println("indexOf : "+filename.indexOf("wo")); // 11
		System.out.println("contains : "+filename.contains("wo")); // true
		
		// .lastIndexOf() : ���������� ���� ���ĺ�
		System.out.println(filename.lastIndexOf("a")); //9 
		System.out.println(filename.lastIndexOf("l")); //14 
		
		// length(), indexOf(), substring(), replace(), split() �ϱ�...
		
		//.substring() : ���� index ~ �� index ���� �ڸ�
		String result = "superman";
		System.out.println(result.substring(0)); // superman
		System.out.println(result.substring(1)); // uperman
		System.out.println(result.substring(3,6)); // erm
		System.out.println(result.substring(0,1)); // s
		System.out.println(result.substring(0,0)); // (0,-1)�� �ż� �ȳ���
		
		
		// Quiz
		String filename2 = "home.jpg"; //�Ǵ� h.jpeg, aaaaa.hwp�� �� �־��
		// ���⼭ ���ϸ�� Ȯ���ڸ� �и��ؼ� ���
		// ���ϸ� : home
		// Ȯ���� : jpg
		// �� ���� ��� �Լ��� ����ؼ� ����ϼ���.
		int position = filename2.indexOf(".");
		System.out.println("���ϸ� : "+ filename2.substring(0,position) +", Ȯ���� : "+ filename2.substring(position+1));
		
//		//Quiz
//				String filename2 = "home.jpg"; //�Ǵ�  h.jpeg , aaaaa.hwp �� �� �־��
//				//���⼭ ���ϸ�� Ȯ���ڸ� �и��ؼ� ���
//				//���ϸ� : home
//				//Ȯ���� : jpg
//				//�� ���� ��� �Լ��� ����ؼ� ����ϼ���
//				int position = filename2.indexOf(".");
//				String file = filename2.substring(0,position);
//				
//				
//				String extention2 = filename2.substring(++position);
//				System.out.println(extention2);
//				
//			
//				String extention =  filename2.substring(position, filename2.length());
//				System.out.println(extention);
//				
//				System.out.println(position);
//				System.out.println(file);
		
		// replace()
		String str3 = "ABCDDADDDDDDA";
		String result3 = str3.replace("DDDDD", "������ ȭ����");
		System.out.println(result3);
		
		result3 = str3.replace("A", "a");
		System.out.println(result3);
		
		// ETC
		System.out.println(str3.charAt(0));
		System.out.println(str3.charAt(3));
		System.out.println(str3.endsWith("DDDA")); // true  �ڿ��� ���� ã�´ٸ�
		System.out.println(str3.equalsIgnoreCase("abcDDADDDDDDA")); //true ��ҹ��� ���о��� ��
		
		// Today Point
		String str4 = "���۸�,��Ƽ,�����,������,������";
		String[] namearray = str4.split(","); // split ����� �迭�̴�
		for(String s: namearray) {
			System.out.println("s: "+s);
		}
		
		
		// ����ǥ���� �� �˾ƾ� �Ѵ�! >> ǥ��ȭ �Ǿ��ְ� ����!
		
		/*
		IP �ּҸ� .(dot) �������� ������ �����Դϴ�.
	    �����ڸ� �����ϴ� �Ķ���ʹ� ����ǥ�����̶� .�� ������ ���Ͻô´�� ������ �ʽ��ϴ�.
		����ǥ������ ������ .(dot) �տ� ��������(\)�� 2�� �־�� �νĵ˴ϴ�.
		*/
		//����ǥ���� ������ ����� .�� ����ϱ� ���ؼ��� \\. ����!
		String ipAddress = "110.20.0.255";
		String[] ips = ipAddress.split("\\.");
		for (int i = 0; i < ips.length; i++) {
			System.out.println("ips[" + i + "] = " + ips[i]);
		}

		// ���
		//ips[0] = 110
		//ips[1] = 20
		//ips[2] = 0
		//ips[3] = 255	
		 
		//����ǥ���� (���ڵ��� �����ؼ� ��Ģ�� ����� : �� ��Ģ�ϰ� ������ ���ؼ� �Ǵ�)
				//�����ȣ : {\d3}-{\d3} >> 12-123 (false) , 123*123(false) , 111-111(true)
				//https://cafe.naver.com/erpzone/220
					
				//���� ǥ����(java , javascript , Oracle , C#) ǥ�� 
				//�ڵ��� , ������ȣ , �������ּ� , �̸��� ����ǥ������ ���� >> �Է��� ������ ��ȿ�� ����  	

				//���� ....StringTokenizer
				 String str6 = "a/b,c-d.f";
				 StringTokenizer sto = new StringTokenizer(str6 , "/,-.");
				 while(sto.hasMoreElements()) {
					 System.out.println(sto.nextToken());
				 }
		
		
		 // �ͼ���
		 String str7 = "ȫ     ��     ��";
		 //���� >> �������� >> "ȫ�浿"
		 System.out.println(str7.replace(" ", "")); // ȫ�浿
		
		 String str8 = "     ȫ�浿      ";
		 System.out.println(">"+str8+"<");
		 System.out.println(">"+str8.trim()+"<");
		 
		 String str9 = "    ȫ    ��    ��    ";
		 //"ȫ�浿"
		 //�ڹٸ� .... ȥ����
		 String result5 = str8.trim();
		 result5 = result5.replace(" ", "");
		 System.out.println(result5);
		 
		 // �������� �Լ��� �����ؼ� (method chain)
		 System.out.println(str9.trim());
		 System.out.println(str8.replace(" ", "").trim().substring(2));
		 
		 //hint
		 
		 int sum=0;
		 String[] numarr = {"1","2","3","4"};
		 for(String s : numarr) {
			 sum += Integer.parseInt(s);
		 }
		 System.out.println("sum : " + sum);
		 
		 
		 //Quiz //�ֹι�ȣ�� ���� ���ϼ���
		 String jumin = "123456-1234567";
		 int sum3 = 0;
		 for(int i=0; i<jumin.replace("-", "").split("").length; i++) {
			 sum3 += Integer.parseInt(jumin.replace("-", "").split("")[i]);
		 }
		 System.out.println(sum3);
		 
		 // ����õ ��
		 int sum4=0;
		 for(int i=0; i<jumin.length()-1; i++) {
			sum4 += Integer.parseInt(String.valueOf(jumin.replace("-", "").charAt(i)));
		 }
		 System.out.println(sum4);
			 
		 // ���� ��
//			 String jumin="123456-1234567";
//			 int sum1 = 0;
//			 jumin = jumin.replace("-", "");
//			 for (int i = 0 ; i < jumin.length() ; i++) {
//				 sum1 += Integer.parseInt(jumin.substring(i,i+1));
			 	//
//			 }
//			 System.out.println(sum1);
		//4��
		 int sum1 = 0;
		 jumin = jumin.replace("-", "");
		 for (int i = 0 ; i < jumin.length() ; i++) {
			 sum1 += Integer.parseInt(jumin.substring(i,i+1));
		 }
		 System.out.println(sum1);
		
		 /* 6��
			int sum = 0;
			for (int i = 0; i < jumin.length(); i++) {
				if(jumin.charAt(i)!='-') 	{
						sum += Character.getNumericValue(jumin.charAt(i));
						//sum+=Integer.parseInt(String.valueOf(jumin4.charAt(i)));
				}
			}
				System.out.println(sum);
		 */
		 /* 2��
		    jumin.replace("-", "0");
			System.out.println(jumin);
			
			int[] input = new int[jumin.length()];
			int sum1=0;
			for(int i=0; i<jumin.length(); i++) {
				input[i]=Character.getNumericValue(jumin.charAt(i));
				sum1+=input[i];
			}System.out.println(sum1);
		*/	
		 /* 5��
		 int sum = 0;
		 for (int i = 0; i < jumin.length(); i++) {
		     char c = jumin.charAt(i);
		     if (c == '-') continue;
		     sum += Integer.parseInt(String.valueOf(c));
		 }
		 System.out.println(sum);
		 */
		 /*
		   String[] numarr2 = jumin.replace("-","").split("");
		   int sum3=0;
		   for(String i : numarr2) {
			   sum3+= Integer.parseInt(i);
		   }
		   System.out.println("�ֹι�ȣ ��2:" + sum3);
		  */
	}
	// concat = push()
	// substring(2) ���� �ϳ��� ���� 2���� ��~
	// split ����� �迭�̴�

}
