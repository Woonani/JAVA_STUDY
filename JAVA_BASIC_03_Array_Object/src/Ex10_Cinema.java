import kr.or.kosa.dto.Cinema;

public class Ex10_Cinema {

	public static void main(String[] args) {
		// �¼� �ʱ�ȭ
		String[][] seat = new String[4][5];
		String[][] reservedSeatInfo = new String[4][5];
		for(int i =0; i<seat.length;i++) {
			
			for(int j=0; j<seat[i].length; j++) {
				//�¼��� �ʱ�ȭ
				seat[i][j]=(i+1)+"-"+(j+1); 
			}
		}


		// ��ȭ�� �ý��� �ѱ�
		Cinema ci = new Cinema(seat,reservedSeatInfo);
		ci.movieSystem();

	}

}
