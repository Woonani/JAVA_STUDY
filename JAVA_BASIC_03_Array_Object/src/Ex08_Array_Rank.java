
public class Ex08_Array_Rank {

	public static void main(String[] args) {
		/*
		 ������ �迭(2����)
		 [��][��]
		 ��ȭ�� �¼�, PC�� �¼�, ���� ��ǥ��(�浵, ����) , ����, ����
		 */
		
		int[][] score = new int[3][2];
		//3�� 2�� �迭
		// ÷�� 0
		
		score[0][0] = 100;
		score[0][1] = 200;
		
		score[1][0] = 300;
		score[1][1] = 400;
		
		score[2][0] = 500;
		score[2][1] = 600;



		//��� : for��
		//��ø for
		for(int i =0; i<3; i++) {
			for(int j =0; j<2; j++) {
				System.out.printf("score[%d][%d]=[%d]\t", i,j,score[i][j]);
			}
			System.out.println();
		}
		
		// Point! : j<score[i].length;
		for(int i =0; i<score.length; i++) {
			for(int j =0; j<score[i].length; j++) {
				System.out.printf("score[%d][%d]=[%d]\t", i,j,score[i][j]);
			}
			System.out.println();
		}
		
		int[][] score2 = new int[][] {{11,12},{13,14},{15,16}};
		// 3�� 2�� 
		//
		// ������ for��
		for(int[] i : score) { // i�� �ּ�!!!!!!!!!!���� ���� �迭
			for(int j : i) { // �迭���� i�� ���� j�� �׳� int
				System.out.printf("score[%d]\t", j);
			}
			System.out.println();
		}

	}
	

}
