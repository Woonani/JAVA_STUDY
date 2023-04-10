import java.io.*;
import java.util.Arrays;
//������ �Է¹޾� byte�� ���
/*
 IO(input / output)
 
 Stream(���)
 ������ ���� : �̹���, ���� <> ����
 
 JAVA API >> Ŭ������ ���� �޾ƿ� - ������� ���� Ŭ����
 I/O �⺻ ������ Byte
 
 �߻� Ŭ���� 
 InputStream, OutputStream (�߻��Լ� ... ������)
 
 *����� Byte ������ ���� �۾��� �ϰ�ʹٸ� 
 [�Է�] InputStream�� ��� �����ϰ� �ִ� Ŭ������ ����ض�
 -
 file�� �Է��� ����� 
 1. Memory��� : ByteArrayInputStream
 2. File : FileInputStream	(**)
 
 *����� Byte ������ ���� �۾��� �ϰ�ʹٸ� 
 [���] OutputStream�� ��� �����ϰ� �ִ� Ŭ������ ����ض�
 -
 file�� ����� ����� 
 1. Memory��� : ByteArrayOutputStream
 2. File : FileOutputStream	(**)
 
 ��� ���ݱ��� memory Array, Collection ���ؼ� �޸𸮱�� �۾� .....
 
 */
public class Ex01_Stream {

	public static void main(String[] args) {
		
		//byte (-128 ~ 127) ������ �����ϴ� Ÿ��
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null; // ���� �޸𸮸� ������ ���� �ʾƿ�
		
		// ���� >> memory >> read, write
		ByteArrayInputStream input = null;// ���� (���) �Է�
		ByteArrayOutputStream output = null; // ���� (���) ���
		
		input = new ByteArrayInputStream(inSrc); // Byte�迭�� Ÿ������ �ϴ� �ּҰ��� parameter�� �ѱ�
												  // input ��� inSrc >> read
		output = new ByteArrayOutputStream(); // write
		
		System.out.println("outSrc before : " + Arrays.toString(outSrc)); //Arrays.toString(outSrc): �迭�� ���� Ȯ���� �� �ִ� �ż���
		
		//���İ��� ����(�ϱ�)
//		int data = 0;
//		while((data = input.read()) != -1) { // ������ -1�ΰ���			
//			System.out.println("data : " + data);
//
//		}
		/*
		 * �׸��� ������ read�� input���� �Ҹ��ع����� �� while������ read�� data�� �� �����ǰ� ���� ����
		while(input.read() != -1) { 
			System.out.println(input.read()); //1,3,5,7,9
			// read() �Լ��� ���������� next() �� ������ �־ ���ǹ����� �ѹ� �Һ�Ǿ� ������ �����̴�. 
		}
		 */
		
		int data = 0;
		while((data = input.read()) != -1) { // inSrc�κ��� input�о�� �����Ͱ� ������ -1 return.			
//			System.out.println("data : " + data);
			//read �� �����͸� �ٸ� Stream�� ����ؼ� ���
			output.write(data); // ������ �ȿ� (����) �ȿ� �����͸� ��� �ִ� ��
			//write ����� data �ƴϰ� ByteArrrayOutputStream �ڽ��� ��ο� ....
		}
		// byte[] outSrc = null;
		outSrc = output.toByteArray(); // �ڽ��� ������ �ִ� �����͸� Byte[]�� �ٲپ �ּҸ� outSrc�� ����
		//�ٲپ �ּҸ� outSrc ����
		System.out.println("outSrc before :" + Arrays.toString(outSrc));
		
		
		// �� ������ ��� �迭�� ���縦 �̿��ϸ� �����ϰ� ���������ϴ�.
	}

}
