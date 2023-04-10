import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
// �̹��� ������ �Է¹޾� �̹��� ���Ϸ� ���
public class Ex03_Stream_ImageCopy {

	public static void main(String[] args) {
		String oriFile = "D:\\Temp\\apple.jpg";
		String targetFile = "copy.jpg"; // �ƹ� ��ε� �Ⱦ��� default ��ο� 
		// default ��� : C:\Douzone\JAVA\Labs\JAVA_BASIC_07_IO\copy.jpg
		// ������Ʈ ������ default ��ΰ� �ȴ���
		
		FileInputStream fs = null;
		FileOutputStream fos = null;
		
		try {
			fs = new FileInputStream(oriFile);
			fos = new FileOutputStream(targetFile);
			
			int data = 0;
			while((data = fs.read()) != -1) {
				fos.write(data); // byte��
			}
		} catch (Exception e) {
			e.printStackTrace();

		}finally {
			try {
				fs.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
