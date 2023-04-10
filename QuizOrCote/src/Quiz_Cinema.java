/*
 * �ڹ�4��_ ��ȭ �����ϱ�_���徲�ڵ�
 * �λ���� �� : �����ȣ�� ���� �迭�� ������.
 * �¼��� �迭�� �Է¹���. (split("-")���) : ���� charAt�� ����Ͽ� ���ڸ� �� ������. ������
 * ����ó��***�� �� �Ǿ��ִ�. : ����ó�� ���� ������
 * ��ȭ���� �¼����� ������ �� �ִٴ� ��. 
 */
//package kr.or.kosa.dto;

import java.util.Scanner;

public class Quiz_Cinema {

	public static void main(String[] args) {
		Cinema cinema = new Cinema(5,4); 

	}

}

class Cinema {
   
   public int inputIntValue;

   public int[] choice;
   
   public String[][] seat;
   
   public static int resNum;
   
   public int[][] resSeat;
   
   public Cinema(int row, int col) {
      this.seat = new String[row][col];
      for (int i = 0 ; i < row ; i++) {
         for (int j = 0 ; j < col ; j++) {
            this.seat[i][j] = i+"-"+j;
         }         
      }
      
      this.resSeat = new int[row][col];
      for (int i = 0 ; i < row ; i++) {
         for (int j = 0 ; j < col ; j++) {
            this.resSeat[i][j] = 0;
         }         
      }

      this.resNum = 0;
      this.choice = new int[2];
      this.inputIntValue = 0;;
   }
   
   public int showMenu() {
      System.out.println("************************");
      System.out.println("****** ��ȭ �����ϱ� ******");
      System.out.println("************************");
      System.out.println("1. �����ϱ�");
      System.out.println("2. ������ȸ");
      System.out.println("3. �������");
      System.out.println("-���Ͻô� �޴��� ��ȣ�� �Է����ּ���-");
      return inputIntValue();
   }
   
   public void showSeat(String[][] seat) {
      for (int i = 0 ; i < seat.length ; i++) {
         for (int j = 0 ; j < seat[i].length ; j++) {
            System.out.printf("[%s]",seat[i][j]);
         }
         System.out.println();
      }
   }
   
   //������ �Է¹޾� ����ϴ� �Լ�
   public int inputIntValue() { 
      Scanner sc = new Scanner(System.in);
      this.inputIntValue = sc.nextInt();      
      return this.inputIntValue;
   }
   
   // �¼� "4-5"�� �Է¹޾� int[]�迭 [4,5]�� ����ϴ� �Լ�
   public void inputStrValue() { 
      Scanner sc = new Scanner(System.in);
      String inputStrValue = sc.nextLine();
      String[] result = inputStrValue.split("-");
      for(int i = 0 ; i < this.choice.length ; i++) {
         this.choice[i] = Integer.parseInt(result[i]);
      }
   }
   
   public void selectSeat() {
      System.out.println("�����ϰ� ������ �¼��� �������ּ���.");
      System.out.println("�Է¿���) 1-1");
      inputStrValue();      
   }
   
   public boolean isReserved(int[] choice) {
      if(seat[choice[0]][choice[1]].equals("�Ұ�")) {
         System.out.println("���Ű� �Ұ����մϴ�");
         return true;
      } else {
         System.out.println("���Ű� �����մϴ�");
         return false;}
   }
   
   public int ruSureReservation() {
      System.out.println("�����Ͻðڽ��ϱ�?");
      System.out.println("1.��\t2.�ƴϿ�");
      return inputIntValue();
   }
   
   public void reservation(int[] choice) {
      this.seat[choice[0]][choice[1]] = "�Ұ�";      
      resNum++;
      this.resSeat[choice[0]][choice[1]] = resNum;
      showReservation(choice);
   }
   
   public void showReservation(int[] choice) {
      System.out.println("��������");
      System.out.println("�����ȣ : "+this.resNum);
      System.out.println("�¼� : "+choice[0]+"-"+choice[1]);      
   }
   
   public void checkRes() {
      System.out.println("�����ȣ�� �¼��� ��ȸ�մϴ�");
      System.out.println("�����ȣ�� �Է��ϼ���");
      inputIntValue();
      for ( int i = 0 ; i < this.resSeat.length ; i++) {
         for ( int j = 0 ; j < this.resSeat[i].length ; j++) {
            if(resSeat[i][j] == this.inputIntValue) {
               System.out.println("�����ȣ : "+this.inputIntValue);
               System.out.println("�����¼� : "+i+"-"+j);
               break;
            }
         }
      }
      System.out.println("�ʱ�ȭ������ ���ư����� �ƹ����̳� �Է��ϼ���");
      inputIntValue();
   }
   
   public void removeRes() {      
      System.out.println("����� �����ȣ�� �Է��ϼ���");
      inputIntValue();
      for (int i = 0 ; i < this.resSeat.length ; i++) {
         for (int j = 0 ; j < this.resSeat[i].length ; j++) {
            if(resSeat[i][j] == this.inputIntValue) {
               this.choice[0] = i;
               this.choice[1] = j;
            }
         }
      }
      System.out.println("["+choice[0]+"-"+choice[1]+"] �¼��� ����Ͻðڽ��ϱ�?");
      System.out.println("1.��\t2.�ƴϿ�");
      inputIntValue();
      if(inputIntValue ==1) {
         resSeat[choice[0]][choice[1]] = 0;
         seat[choice[0]][choice[1]] = choice[0]+"-"+choice[1];         
         System.out.println("������ ��ҵǾ����ϴ�.");
         System.out.println("�ʱ�ȭ������ ���ư����� �ƹ����̳� �Է��ϼ���");
         inputIntValue();
      } else {System.out.println("�ʱ�ȭ������ ���ư��ϴ�");}

      
   }
   
   public void run() {
      boolean runState = true;
      do {
         try {
            switch(showMenu()) {
               case 1:{
                  showSeat(seat);
                  selectSeat();
                  if(isReserved(choice)) {continue;}
                  else if(ruSureReservation()==1) {
                     reservation(choice);
                     continue;
                  } else {continue;}
               }            
               case 2:{
                  checkRes();
                  continue;
               }
               case 3:{
                  removeRes();
                  continue;
               }
               case 4444:{
                  System.out.println("���α׷��� �����մϴ�");
                  runState = false;
               }
         }
         } catch (Exception e) {
            System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
            System.out.println("�ʱ�ȭ������ ���ư��ϴ�");
         }         
      } while(runState);
   }
   
}