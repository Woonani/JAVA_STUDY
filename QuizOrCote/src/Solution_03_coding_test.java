/*
 3/29 ����
 */
import java.util.Scanner;
import java.io.FileInputStream;
class Solution_03_coding_test {
	
	static int AnswerN;
	static int N = 10;

	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("C:\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt(); // ����� ĭ ��
			
			String blank = sc.nextLine(); // �׽�Ʈ�� ���� : ���� ���

			
			// �ٵ��� �迭 ����
			char[][] pan = new char[N][N]; // �ٵ���
			int rX=0; int cX=0; // X�� �ʱ� ��ǥ
			int rowX=0; int colX=0; // X�� �̵��� ��ǥ
			
			for(int i = 0; i<N; i++) {
				String oneLine = sc.nextLine().replace(" ", "");
				for(int j= 0; j<N; j++) {
					pan[i][j] = oneLine.charAt(j);
					if(oneLine.charAt(j) == 'X') { rX = i; cX = j; }
				}
			}
			
//			System.out.printf("(%d,%d)\n", rX, cX);
//			System.out.printf("(%d,%d)\n", rowX, colX);
			
			
			//x��ġ���� �����»� �˻�
			//�� �˻� : colX +
//			rowX=rX; colX=cX; // X��ǥ �ʱ�ȭ
//			
//			do {
//				if(pan[rowX][colX+1] == 'L') {
//					colX+=1;
//				}else if(pan[rowX][colX+1] == 'H') {
//					if(pan[rowX][colX+2]== 'H') {
//						colX+=2;
//						AnswerN +=(colX<=7)?1:0;
//						break;
//					}else if(pan[rowX][colX+2]== 'L') {
//						colX+=2;
//					}else if(pan[rowX][colX+2]== 'Y') {
//						break;
//					}
//				}else { 
//					break; // ���� �����ų� Y�� ���� ���
//				}
//			}while(colX<6);
//			
//			
//			//�� �˻� : colX -
//			rowX=rX; colX=cX; // X��ǥ �ʱ�ȭ
//
//			do {
//				if(pan[rowX][colX-1] == 'L') {
//					colX-=1;
//				}else if(pan[rowX][colX-1] == 'H') {
//					if(pan[rowX][colX-2]== 'H') {
//						colX-=2;
//						AnswerN += (colX >= 0) ? 1:0;
//						break;
//					}else if(pan[rowX][colX-2]== 'L') {
//						colX-=2;
//					}else if(pan[rowX][colX-2]== 'Y') {
//						break;
//					}
//				}else { 
//					break; // ���� �����ų� Y�� ���� ���
//				}
//			}while(colX>1);
//			
//			
//			//�� �˻� : rowX +
//			rowX=rX; colX=cX; // X��ǥ �ʱ�ȭ
//
//			do {
//				if(pan[rowX+1][colX] == 'L') {
//					rowX+=1;
//				}else if(pan[rowX+1][colX] == 'H') {
//					if(pan[rowX+2][colX]== 'H') {
//						rowX+=2;
//						AnswerN +=1;
//						break;
//					}else if(pan[rowX+2][colX]== 'L') {
//						rowX+=2;
//					}else if(pan[rowX+2][colX]== 'Y') {
//						break;
//					}
//				}else { 
//					break; // ���� �����ų� Y�� ���� ���
//				}
//			}while(rowX<6);
//
//			
//			//�� �˻� : rowX -
//			rowX=rX; colX=cX; // X��ǥ �ʱ�ȭ
//
//			do {
//				if(pan[rowX-1][colX] == 'L') {
//					rowX-=1;
//				}else if(pan[rowX-1][colX] == 'H') {
//					if(pan[rowX-2][colX]== 'H') {
//						AnswerN += 1;
//						rowX-=2;
//						break;
//					}else if(pan[rowX-2][colX]== 'L') {
//						rowX-=2;
//					}else if(pan[rowX-2][colX]== 'Y') {
//						break;
//					}
//				}else { 
//					break; // ���� �����ų� Y�� ���� ���
//				}
//			}while(rowX>1);
			
			//-----------------------------------------------------------------------
			// ����ȭ�� ���Ѻ���
//			if()1234 �������� rowX �Ǵ� colX�� ���� �� �� ����
			for(int k=1; k<=4; k++) {
			 
				int a=0; int b=0;
				switch(k) {
				case 1: // ��
					a = -1; b=0;
					break;
				case 2: // ��
					a = 1; b=0;
					break;
				case 3: // ��
					a = 0; b = -1;
					break;
				case 4: // ��
					a = 0; b = 1;
					break;
				}
				rowX=rX; colX=cX; // X��ǥ �ʱ�ȭ
				do {
					if(pan[rowX+a][colX+b] == 'L') {
						rowX = rowX + a;
						colX = colX + b;
					}else if(pan[rowX+a][colX+b] == 'H') {
						if(pan[rowX+a+a][colX+b+b]== 'H') {
							AnswerN += 1;
							rowX = rowX +a +a;
							colX = colX +b +b;
							break;
						}else if(pan[rowX+a+a][colX+b+b]== 'L') {
							rowX = rowX +a +a;
							colX = colX +b +b;
						}else if(pan[rowX+a+a][colX+b+b]== 'Y') {
							break;
						}
					}else { 
						break; // ���� �����ų� Y�� ���� ���
					}
				}while(rowX>1 && rowX<6);
			
			}
			//-----------------------------------------------------------------------
			
			System.out.println("#"+test_case+" "+AnswerN);
			AnswerN=0;
		}
	}
	

}
