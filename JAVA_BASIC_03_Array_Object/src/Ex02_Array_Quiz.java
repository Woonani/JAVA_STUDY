
public class Ex02_Array_Quiz {

	public static void main(String[] args) {
		//������ �л����� �⸻��� ���������Դϴ�
		int[] score = new int[] {79,88,97,54,56,95};
		int max = score[0];
		int min = score[0];
		/*
		  [���]�� ���ؼ� max ��� ������ ���������߿� �ִ밪�� ���
		  min ������ ���������߿� �ּҰ��� ��������
		  ��°�� : max >> 97 , min >> 54 
		  ��) for���� �ѹ��� ����ϼ��� (ó���Ͻô� �� �ι�)
		*/
		for(int i=1; i<score.length; i++) {
//			for(int i=0; i<score.length; i++) { // 0���� �����ϸ� �� 2���ǹǷ�
			max = (max < score[i]) ? score[i] : max;
			min = (min > score[i]) ? score[i] : min;
		}
		
		System.out.printf("max: %d min: %d \n",max, min); // Ȯ��) max: 97 min: 54 
		
		
		int[] numbers = new int[10];
		//10���� ���� ���� 1 ~ 10������ �ʱ�ȭ�ϰ� ����ϼ���
		
		for(int i = 0; i< numbers.length; i++) {
			numbers[i] = i+1;
			System.out.println("numbers : "+numbers[i]);
		}
		
		//��� �л��� �⸻��� �������� (5����)
		int[] jumsu = {100,55,90,60,78};
		int sum = 0;
		float avg = 0f;
				
		//1. �Ѱ����� ��
		System.out.printf("�Ѱ����� �� : %d \n", jumsu.length);
		//2. ������ ��
		//3. ������ ���
		for(int i = 0; i< jumsu.length; i++) {
			sum += jumsu[i];
			if(i == jumsu.length -1 ) {// ������ ���̶��
				avg =  sum / (float)jumsu.length;
			}
		}
		//�� 2,3������ �ϳ��� for���� �ذ�  ?
		
		System.out.printf("�� �����:[%d] ,����:[%d] ,���:[%f] \n",jumsu.length,sum,avg);
		System.out.println("avg : "+avg); // avg �տ� + �ٿ��� ������� �ʱ�!
	}

}
