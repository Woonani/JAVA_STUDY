package kr.or.kosa.dto;

import java.util.Scanner;

public class CheckReservation {
	Scanner sc = new Scanner(System.in);

	String reservationNum = Cinema.reservationNum;
	
	String[][] seat;
	String[][] reservedSeatInfo;
	CheckReservation(String[][] seat, String[][] reservedSeatInfo){
		this.seat = seat;
		this.reservedSeatInfo = reservedSeatInfo;
	}
	
	
	// ���� ��ȣ�� �Է¹޾� ������ �¼��� Ȯ���ϴ� �Լ�
	public int[] checkReservation() {  //
		
		// �����ȣ �Է� �ޱ�
		System.out.println("���Ź�ȣ 6�ڸ��� �Է����ּ���.");
		String inputNum = sc.nextLine().replace(" ", "");
		int row=-1; int col=-1;
		boolean reservedSeat=false;

		// ���� ��ȣ�� �����¼� ��ȸ
		for(int i = 0; i<reservedSeatInfo.length;i++) {
			for(int j=0; j<reservedSeatInfo[i].length; j++) {
				//null üũ
				if(reservedSeatInfo[i][j] != null && reservedSeatInfo[i][j].equals(inputNum)) {
					row=i+1;
					col=j+1;
					reservedSeat = true;
					break;
				
				}
			}
		}
		
		
		// ���� ���� �¼��� �����ֱ�
		if(reservedSeat) {			
			System.out.println();
			System.out.println("###########ȭ��###########");
			String[][] seatCheck = new String[4][5];
			for(int i =0; i<seatCheck.length;i++) {
				for(int j=0; j<seatCheck[i].length; j++) {
					if(i == row-1 && j == col-1) {
						System.out.printf("[��]");						
						
					}else {
						System.out.printf("[%d-%d]", i+1,j+1);						
					}
				}
				System.out.println();
			}
			System.out.println();
			System.out.printf("������ �����Ͻ� �¼��� [%d-%d]�Դϴ�.", row, col);
			System.out.println();
			
		}else {
			System.out.println("�Է��ֽ� ���Ź�ȣ�� ��ȸ�Ǵ� �¼��� �����ϴ�.");
			System.out.println();
			System.out.println();
		}
		
		// ��ȸ�� �¼� ��ȣ ��ȯ : 3�� �޴� ���� ��ҿ��� ���
		int[] result = {row,col};
		return result;
	}
	
}
