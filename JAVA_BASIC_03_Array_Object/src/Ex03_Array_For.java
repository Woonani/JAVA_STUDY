
public class Ex03_Array_For {

	public static void main(String[] args) {
		 /*
		  Today point
		  for�� >> ���� for�� , ������ for��
		  JAVA : for(Type ������ : �迭 or collection) { ����� } 
		  C# : for(Type ������ in �迭 or collection) { ����� }
		  JavaScript : for(Type ������ in �迭 or collection) { ����� }
		   
		   
		  */
		int[] arr = {5,6,7,8,9};
		for(int i = 0 ; i < arr.length ; i++) {
//			System.out.println(arr[i]);
			System.out.printf("%d \t",arr[i]);
		}
		System.out.println();
		
		//������
		for(int value : arr) {
//			System.out.println(value);
			System.out.printf("%d \t",value);
			
		}
		
		//
		String[] strarr = {"A","B","C","D","FFFFF"};
		for(String str : strarr) {
			System.out.printf("%s \t",str);
		}
	}

}
