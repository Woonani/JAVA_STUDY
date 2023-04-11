import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// ����Stream - PrintWriter 

public class Ex12_PrintWriter_String_Finder {

	String baseDir = "D:\\temp"; //�˻��� ���丮
	String word="HELLO";//�˻��� �ܾ�
	String savetxt = "result.txt"; //HELLO�ܾ ����ִ� ���� ���� ����
	
	void Find() throws IOException { //Find �Լ� ���� try .. throw���� ����ó�� ����
		File dir = new File(baseDir);
		if(!dir.isDirectory()) {
			System.out.println("��ȿ�� ������ �ƴϿ���");
			System.exit(0);
		}
		
		PrintWriter writer = new PrintWriter(new FileWriter(savetxt));
		BufferedReader br = null;
		
		File[] files = dir.listFiles();
		for(int i = 0 ; i < files.length ; i++) {
			if(!files[i].isFile()) {
				continue; //skip �Ʒ� �ڵ� ���� ...
			}
			//�����̸�
			br = new BufferedReader(new FileReader(files[i]));
			
			//a.txt
			//a.txt �ѹ��徿 read  (����)
			String line="";
			while((line = br.readLine()) != null) {
				//�ܾ�˻�
				if(line.indexOf(word) != -1) {
					//a.txt ���پ� �о �׹��� �ȿ� HELLO �ܾ �ϳ��� �����ϸ�
					writer.write("word = " + files[i].getAbsolutePath() +"\n");
				}
//				else {
//					writer.write("�ƹ��͵� �����"  +"\n");
//				}
			}
			writer.flush();
		}
		br.close();
		writer.close();
	}
	
	public static void main(String[] args) {
		Ex12_PrintWriter_String_Finder wordFinder =new Ex12_PrintWriter_String_Finder();
		try {
			wordFinder.Find();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
