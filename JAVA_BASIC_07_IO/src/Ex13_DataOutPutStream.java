import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 ���� ��Ʈ��
 DataOutputStream
 DataInputStream
 
 ����
 JAVA�� �����ϴ� 8���� �⺻Ÿ�Ժ��� write, read ����
 �� ������ DataOutputStream���� �ݵ�� >> DataInputStream ���� �޾ƾ��Ѵ�. ���θ� ȣȯ ����
 
 ----------------------------------------------------------------
 ����.txt  >>   ��Ģ����
 100,99,60,50
 50,55,30,100
 Line ���� read >> split >> Ÿ�Ժ�ȯ >> Array >> read ���� 
 */
public class Ex13_DataOutPutStream {

	public static void main(String[] args) {
		int[] score = {100, 60, 55, 95, 50};
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("score.txt"); //FileOutputStream�� String�� param���� �޴´�. char�� �ȵ�
			dos = new DataOutputStream(fos);
			for(int i =0; i < score.length; i++) {
				dos.writeInt(score[i]);  //������ �״�� write
				//���� : Byte write ������ �ݵ��
				//DataInputStream(����dos) ���ؼ��� read ����
				//ä�ý� ... �ѱ۱��� ����
				//dos.writeUTF(null);
			}
		} catch (Exception e) {
			e.printStackTrace(); // ���� ��������
		} finally {
			try {
				dos.close();
				fos.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
