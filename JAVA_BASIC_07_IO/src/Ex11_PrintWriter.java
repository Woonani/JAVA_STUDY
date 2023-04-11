import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 ��� ������ ���� ���� ��Ʈ��
 1. printf
 2. String.format
 3. I/O PrintWriter (���Ͽ� ��� ���� (�̻ڰ�))
 
 ����) ���ݰ�꼭, ������Ǽ� ���, �ް���, ǰ�Ǽ� >> ����� �ִ� >> ������ >> ����, ũ����Ż ����Ʈ
 
 */
public class Ex11_PrintWriter {

	public static void main(String[] args) {
		// FileReader fr = null; //finally block�� �ݱ� ���� ����� �����߾���(try���� �ȿ��� �����ϸ� try���� �ۿ���(finally��) ������ϴϱ�)
		try {
			/*
			PrintWriter pw = new PrintWriter("D:\\temp\\homework.txt");
			pw.println("********************************************");
			pw.println("**				  HOMEWORK 				**");
			pw.printf("%s : %5d %5d %5d %5.1f","�ƹ���",100,88,98,(float)((100+88+90)/3));
			pw.println("********************************************");
			pw.close();
			 */
			
			//read (Line����) ���� 
			FileReader fr = new FileReader("D:\\temp\\homework.txt");
			BufferedReader br = new BufferedReader(fr);
			String s = "";
			while((s = br.readLine()) != null){
				System.out.println(s);
			}
			br.close(); // finally�� �ؾ��ϴµ� �ӽ÷� ����ٰ� ��. (�� ���� ����)
			fr.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
