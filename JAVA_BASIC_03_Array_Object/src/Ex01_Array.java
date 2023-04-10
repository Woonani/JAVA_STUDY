import java.util.Arrays;

/*
 �迭�� ��ü�� (Array)
 1. new�� ���ؼ� �����Ѵ�. (�ּҰ��� ���´�)
 2. heap �޸𸮿� ���� (�����ڿ�)
 3. �����迭(�����迭) : �迭�� �ѹ� �����ϸ� (ũ�Ⱑ ��������) ���� �Ұ� < > ����(Collection : API Ŭ����)
 4. �ڷᱸ��(�˰���) : ���(����) : �������� �ڷᱸ��
 
 */
public class Ex01_Array {

	public static void main(String[] args) {
		int s, s1, s2, s3, s4;
		int s5; int s6; int s7;
		//���� Ÿ���� ���� �������� �����ؼ� ���
		
		// �迭
		int[] score = new int [5];
		//score (101��) >> 101ȣ, 102ȣ ��Ģ ....
		// int Ÿ���� ���� 5�� >> heap >> ���ӵ� ���� >> ���̸� ����(index(÷��)) >> [0][1][2][3][4]
		System.out.println(score[0]);
		score[0] = 100;
		score[1] = 200;
		score[2] = 300;
		score[3] = 400;
		score[4] = 500;
		//score[5] = 600;
		// java.lang.ArrayIndexOutOfBoundsException:Index 5 out of bounds for length 5
		// ���� ������ �׻� index ������ 1�� ũ�� (n-1 ������ index)
		System.out.println(score[3]);
		//Array �濡 �ִ� (score) ��� ���� �ѹ��� ���
		// ���� (for >> ��ø for)
		for(int i = 0 ; i < 5 ; i++) {
			System.out.printf("score[%d]=%d\t",i,score[i]);
		}
		System.out.println();
		
		//�迭�� ��ü�� 
		for(int i = 0 ; i < score.length ; i++) {  //Array �迭�� ������ �����Ѵ� (score.length)
			System.out.printf("score[%d]=%d\t",i,score[i]);
		}
		System.out.println();
		// java.util.Arrays  ����Ŭ���� >> ����� �ʿ��� �پ��� �Լ� >> static
		String resultArray = Arrays.toString(score);
		// [100, 200, 300, 400, 500] �Լ��� �ڵ� ����
		System.out.println(resultArray);
		
		// Tip) ��а� ���� ������
		//Arrays.sort(score);
		// ���� 3�� �ڸ��̵� ���� �ٲٴ� ....swap .... 
		//  ���� �˰��� (���� : ����, ��, ���� ���ĵ� �� �� �־����.)
		
		//Today point
		//�迭 ����� 3����
		int[] arr = new int[5]; //�⺻
//		System.out.println("arr : "+arr[4]);
		int[] arr2 = new int[] {10,20,30,40,50}; //�ʱⰪ�� ���ؼ� �迭�� ������ �����ϰ� ���� �Ҵ�
		//System.out.println("arr2"+arr2); // arr2[I@6a5fc7f7

		int[] arr3 = {11,22,33}; //�����Ϸ��� �˾Ƽ� new ó��
		//System.out.println("arr3"+ arr3); // arr3[I@3b6eb2ec

		//Tip) const arr = [1,2,3,4,5]; let arr = [100, 200, 300, 400, 500];
		
		for(int i = 0; i < arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
		
		// �迭�� ��ü�� (new ... heap)
		int[] arr4; // stack arr4 ��������(null) >> �޸𸮰� �����
		arr4 = new int[] {21,22,23,24,25}; // �̷��� �ϸ� �޸𸮸� ����
		System.out.println(arr4); //I@5594a1b5 �ּҰ��� ������ �ִ�.
		
		int[] arr5 = arr4; // �ּҰ� �Ҵ�
		System.out.println(arr5); //I@5594a1b5 arr4�� ���� �ּҰ��� ������ �ִ�.

		// ���� �޸𸮸� ���� �ִ�
		System.out.println(arr5 == arr4); //true
		
		//�迭�� Ÿ���� : 8���� + String + Ŭ����(Ÿ��)
		String[] strarr = new String[] {"��", "��", "������"};
		for(int i = 0; i < strarr.length; i++) {
			System.out.println(strarr[i]);
		}
		
		char[] carr = {'A','B', 65};
		float[] farr = new float[3];
		Car[] cararr = new Car[3]; // cararr[0] ������ ���� �� ������� : Car Ÿ���� �ּҰ�
		// Car c = new Car();
		// cararr[0] = new Car();
		
	}

}

class Car{ // Ŭ���� == ���赵 == ������ Ÿ��
	
}
