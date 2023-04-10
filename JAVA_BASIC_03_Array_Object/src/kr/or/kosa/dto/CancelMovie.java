package kr.or.kosa.dto;

import java.util.Scanner;

public class CancelMovie {
	String[][] seat;
	String[][] reservedSeatInfo;
	
	public CancelMovie(String[][] seat, String[][] reservedSeatInfo) {
		this.seat = seat;
		this.reservedSeatInfo = reservedSeatInfo;
	}
	
	
	// ������ ��ȭ ����ϴ� �Լ�
	public void cancelMovieTicket(int[] result) {
		Scanner sc = new Scanner(System.in);
		
		int row = result[0];
		int col = result[1];
		int inputNum= 9999999;
		
		// �����¼��� �ִ� ��� ��� ���θ� �Է¹���
		if(row !=-1&&col!=-1) {

			System.out.println("���Ÿ� ����Ͻðڽ��ϱ�?");
			System.out.println("��(1), �ƴϿ�(2) �� �ϳ��� �Է��� �ּ���.");
				
			inputNum = Integer.parseInt(sc.nextLine());
		}
		
		// ���� ��� �޴� ó�� :  �¼� �ִ� ��� & ���°�� ��� ó��
		switch(inputNum) {
		case 1: 
			// �¼� �ʱ�ȭ
			seat[row-1][col-1] = row+"-"+col; // ���� �¼� ǥ��
			reservedSeatInfo[row-1][col-1] = String.valueOf("");
			System.out.println("Ȯ�� "+seat[row-1][col-1] + reservedSeatInfo[row-1][col-1]);
			System.out.println("���Ű� ��ҵǾ����ϴ�. �����մϴ�.");
			System.out.println();
			System.out.println();
			break;
		case 2:
			System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");
			System.out.println();
			break;
		case 9999999:
			System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");
			System.out.println();

			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�. �ʱ�ȭ������ ���ư��ϴ�.");
			System.out.println();

			break;
			
		}
		
		
		
	}
	
	
}
