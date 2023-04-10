import java.io.*;
//������ buffer�� �ѹ��� �о ���� ���
/*
 Disk (File ó�� ���) >> DISK >> ������� ������ �� byte�� 
 
 ������ �л��� �Ѹ� �������� ������ ���� �ƴϰ�
 �������� Ż �� �ִ� ������ �뿩�ؼ� �ѹ��� ������ ó���ϰڴ�...
 
 ���� : Buffer 
 1. I/O ���� ���� ( ���� Ƚ��)
 2. Line ���� (����)
 BufferedOutputStream (���� ��Ʈ��) >> �������� �۾� �Ұ� >> File (input, output) Stream
 
 */
public class Ex04_Stream_Buffer {

	public static void main(String[] args) {
		//BufferedOutputStream bos = new // �⺻������ �����ɶ� OutputStream �̶�� �߻� �ڿ� Ÿ���� ��ü�� parameter�� �޾ƾ���.
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("data.txt"); // ���� ������ �˾Ƽ� ������
			bos = new BufferedOutputStream(fos); // ���� ź�� 
			
			for(int i =0; i<10; i++) {
				bos.write('A'); // data.txt....................�� 
			}
//			bos.flush();
			
			/*
			 JAVA Buffer (8k byte = 8192 byte)
			 1. Buffer �ȿ� ������ ä������ ������ ��� (���۸� ���� �۾�)
			 2. ������ ��� (buffer) ���� ���� : flush() or close()�ϸ� �ڵ� flush() (close�� flush ���ԵǾ�����)
			 3. ���� close() �ڿ����� >> ���������� flush()
			 
			 ���⸦ �� �ϸ� ��¾ȵǾ�����.
			 */
			
		} catch (Exception e) {
			
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e2) {
			}
		}
	}

}
