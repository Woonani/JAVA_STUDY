package kr.or.kosa.dto;
import java.util.Scanner;

public class Reservation {
	Scanner sc = new Scanner(System.in);
	String[][] seat;
	String[][] reservedSeatInfo;
	String reservationNum = Cinema.reservationNum;
	
	
	Reservation(String[][] seat, String[][] reservedSeatInfo){
		this.seat = seat;
		this.reservedSeatInfo = reservedSeatInfo;
	}
	
	
	
	// ��ȭ ���� ��� �޴� �Լ�
		public void reservationMenu() {
			int resultNum;
			System.out.println("*********�¼� ��Ȳ**********");
			for(int i =0; i<seat.length;i++) {
				for(int j=0; j<seat[i].length; j++) {
				System.out.printf("[%s]", seat[i][j]);
				}
			 System.out.println();
			}
			System.out.println("-------------------------");
			System.out.println("�¼��� ������ �ּ���. �Է¿���)1-1");
			System.out.println("�̹� ���ŵ� �¼��� \"����\"��� ǥ�õ˴ϴ�.");
			try {
				String selectedSeat = sc.nextLine().replace(" ", "").replace("-","");

				int row = Character.getNumericValue(selectedSeat.charAt(0));
				int col = Character.getNumericValue(selectedSeat.charAt(1));
				
				System.out.printf("�����Ͻ� �¼��� :%s-%s \n", selectedSeat.charAt(0), selectedSeat.charAt(1));
				
				//
				boolean availableSeat = reservation(row,col);				
			}catch(Exception e) {
				System.out.println("�Է¿���. ó������ �ٽ� ������ �ּ���.");
//				e.printStackTrace();
			}
			
		}
		
	
		
		// ���� ó�� �Լ�
		public boolean reservation(int row, int col) {
			boolean result;

			if(seat[row-1][col-1].equals((row)+"-"+(col))) {
				System.out.printf("���� ���� �մϴ�. ");
				System.out.println("�����Ͻðڽ��ϱ�?");
				System.out.println("��(1), �ƴϿ�(2), �ʱ�ȭ��(0)�� �ϳ��� �Է����ּ���.");
				int menuNum = Integer.parseInt(sc.nextLine().replace(" ",""));
				
				switch(menuNum) {
				case 1:
					int reservationNum;
					do { // �����ȣ�� 6�ڸ��̰�, ù�ڸ��� 0���� �������� �ʵ��� üũ
						reservationNum= (int) (Math.random()*1000000+1);
					}while(String.valueOf(reservationNum).length()<6);
					
					// �����¼� ǥ��, ���� ��ȣ ���� �Է�
					seat[row-1][col-1] = "����"; 
					reservedSeatInfo[row-1][col-1] = String.valueOf(reservationNum);

					// ���������� �¼� ǥ��
					System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
					System.out.println();
					for(int i =0; i<seat.length;i++) {
						for(int j=0; j<seat[i].length; j++) {
						System.out.printf("[%s]", seat[i][j]);
						}
					 System.out.println();
					}
					System.out.println();
					System.out.printf("������ �¼���ȣ: [%d-%d] / ���Ź�ȣ : [%d] \n",row,col, reservationNum);
					System.out.println("�����մϴ�.");
					System.out.println();

					break;
				case 2:
					System.out.println("�¼��� �ٽ� ����ּ���");
					System.out.println();

					reservationMenu();
					break;
				case 3:
					System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");
					System.out.println();

					break;					
					default:
				}
				result = true;
			}else {
				System.out.println("�̹� ���� �Ǿ����ϴ�");
				System.out.println();

				result = false;
			}
			return result;
		}
		
		
}
