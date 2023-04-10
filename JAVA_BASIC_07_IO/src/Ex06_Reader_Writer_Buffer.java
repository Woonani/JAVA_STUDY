import java.io.*;

public class Ex06_Reader_Writer_Buffer {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java");
			br = new BufferedReader(fr);
			//line ���� ó�� (����)
			String line = "";
			for(int i = 0; (line = br.readLine()) != null; i++) {
//				System.out.println(line);//���� �������� �״�� �о��
				if(line.indexOf(";") != -1) {
					System.out.println(line);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
			br.close();
			fr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
