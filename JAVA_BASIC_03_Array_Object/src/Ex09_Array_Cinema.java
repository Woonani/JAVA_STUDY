
public class Ex09_Array_Cinema {

	public static void main(String[] args) {
		String[][] seat = new String[3][5];
		/*
		 [][][][]
		 [][][][]
		 [][][][]
		 */
		for(int i =0; i<seat.length;i++) {
			for(int j=0; j<seat[i].length; j++) {
				//�¼��� �ʱ�ȭ
				seat[i][j]="__"; // ������ ��ġ
			}
		}
		//����
		seat[2][1]="ȫ�浿";
		seat[0][0]="������";
		
		// ���� �¼� ��Ȳ �����ֱ�
		for(int i =0; i<seat.length;i++) {
			for(int j=0; j<seat[i].length; j++) {
				//�¼��� �ʱ�ȭ
			System.out.printf("[%s]", seat[i][j].equals("__")?"�¼�":"����");
			}
		 System.out.println();
		}
		
		// ���� .... � �¼� ���� [��][��] ���� ���� ���� Ȯ���ϱ�
		// �¼� ������ �Է����ּ���
		int row, col;
		row = 1;
		col = 0;
		if(seat[row][col].equals("__")) {
			System.out.println("���� ���� �ؿ�");
		}else {
			System.out.println("�̹� ���� �Ǿ����ϴ�");
		}
		
		// ���� ���� (��ȭ ����)
		// �¼��� �ʱ�ȭ
		for(int i =0; i<seat.length;i++) {
			for(int j=0; j<seat[i].length; j++) {
				//�¼��� �ʱ�ȭ
				seat[i][j]="__"; // ������ ��ġ
			}
		}

	}

}
