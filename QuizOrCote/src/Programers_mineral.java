
public class Programers_mineral {
	public static void main(String[] args) {
		int[] picks = new int[] {0,1,1};
//		int[] picks = new int[] {1, 3, 2};
		String[] minerals = new String[] {"diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond"};
//		String[] minerals = new String[] {"diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone"};
		// TODO Auto-generated method stub

//		class Solution {
//		    public int solution(int[] picks, String[] minerals) {
		        int totalPickNo = 0;
		        for(int i : picks){
		            totalPickNo += i;
		        }
		        // 5���� ��� ���̾� ���� �����ź��� ���̾� ���
		        
		        int l =(totalPickNo*5 > minerals.length) ? (int)((minerals.length+4)/5) : totalPickNo*5;
		        
		        int[][] mineral5each = new int[l][3]; // [�տ������� 5����][���̾Ƽ�, ö��, ����] �� ���� ����
		        
		        for(int i=0; i<l;i++){
		            int dia=0; int iro = 0; int sto=0;
		            for(int j= i; j<i+5; j++){
		                try{
		                   if(minerals[j].equals("diamond")){
		                        dia += 1;
		                    }else if(minerals[j].equals("iron")){
		                        iro += 1;
		                    }else if(minerals[j].equals("ston")){
		                        sto += 1;
		                    }   
		                }catch(Exception e){
		                    continue;
		                }
		            }
		            if(i == 0) {			            	
			            mineral5each[i][0] = dia;  // ���̾�
			            mineral5each[i][1] = iro;  // ö
			            mineral5each[i][2] = sto;  // ��
		            }else {
		            	for(int k = 0; k<i; k++) {
		            		if(mineral5each[k][0] < mineral5each[i][0]) {
		            			int temp1 = mineral5each[k][0];
		            			mineral5each[k][0] = mineral5each[i][0];
		            			mineral5each[i][0] = temp1;
		            			int temp2 = mineral5each[k][1];
		            			mineral5each[k][1] = mineral5each[i][1];
		            			mineral5each[i][1] = temp2;
		            			int temp3 = mineral5each[k][2];
		            			mineral5each[k][2] = mineral5each[i][2];
		            			mineral5each[i][2] = temp3;
		            		}else if (mineral5each[k][0] == mineral5each[i][0]) {
		            			if(mineral5each[k][1] < mineral5each[i][1]) {
			            			int temp1 = mineral5each[k][0];
			            			mineral5each[k][0] = mineral5each[i][0];
			            			mineral5each[i][0] = temp1;
			            			int temp2 = mineral5each[k][1];
			            			mineral5each[k][1] = mineral5each[i][1];
			            			mineral5each[i][1] = temp2;
			            			int temp3 = mineral5each[k][2];
			            			mineral5each[k][2] = mineral5each[i][2];
			            			mineral5each[i][2] = temp3;
			            		}else if (mineral5each[k][1] == mineral5each[i][1]) {
			            			if(mineral5each[k][2] < mineral5each[i][2]) {
				            			int temp1 = mineral5each[k][0];
				            			mineral5each[k][0] = mineral5each[i][0];
				            			mineral5each[i][0] = temp1;
				            			int temp2 = mineral5each[k][1];
				            			mineral5each[k][1] = mineral5each[i][1];
				            			mineral5each[i][1] = temp2;
				            			int temp3 = mineral5each[k][2];
				            			mineral5each[k][2] = mineral5each[i][2];
				            			mineral5each[i][2] = temp3;
				            		}else if (mineral5each[k][0] == mineral5each[i][0]) {
				            			
				            		}
			            		}
		            		}
		            	}
		            }
		            
		            System.out.printf("%d, %d, %d \n",mineral5each[i][0],mineral5each[i][1],mineral5each[i][2]);
		        // ���̾� >> ö >> �� ������ ����?
		            
		        }
		     // ���̾� ���� ������ ö ����    /    ���̾� ��̰� ������ ö��̷� �Ѿ�� ��
		        //���̾� ��� �� ��� : �׳� +( 5 )
		        //ö ��� �� ��� : ���̾� �� * 25 + (���� ������)
		        //�� ��� �� ��� : ���̾� �� * 25 + ö ��*5 + (���� ���� ��)
		        

		        
		        int answer = 0;
//		        return answer;
		        System.out.println("answer : "+ answer);
//		    }
//		}
		
	}

}
