import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Quiz_Dos {

	static String defaultPath = "D:" + File.separator + "temp" + File.separator;
	static String path = defaultPath;
	
	public static void main(String[] args) {
	
		System.out.println("Bitamp Microsoft Windows DOS ��ɾ� [Version 1.1]");
		System.out.println("2020 Bitcamp. All rights reserved\n");
	
		Scanner sc = new Scanner(System.in);
	
		String[] input = null;
	
		while (true) {
			System.out.print(path + ">");
			input = sc.nextLine().trim().split(" "); // input�迭�� ���� �������� �� �濡 ����, ù ��° �� ���� ���� ����
	
			if (input[0].equalsIgnoreCase("exit")) { // ���� exit�θ� Dos ���� ����
				System.out.println("Exit");
				System.exit(0);
				return;
			}
	
			switch (input[0].toLowerCase()) {
//			case "dir":
//				searchDirectory();
//				break;
			case "cd": 
			case "cd..":
			case "cd\\": 
			case "cd/": 
				changeDirectory(input);
				break;
//			case "md":
//			case "mkdir":
//				makeDirectory(input);
//				break;
//			case "rd":
//			case "rmdir":
//				removeDirectory(input);
//				break;
			case "ren":
			case "rename":
				//System.out.println(Arrays.toString(input));
				renameDirectory(input);
				break;
//			case "type":
//				readTextFile(input);
//				break;
//			case "help":
//				displayHelp();
//				break;
			default:
			}
		}
	}
	
	static void changeDirectory(String[] input) { // input�� ����� ���еǾ� ������ �迭

		if(input.length > 1) {
			// �����Ҷ��� ����
			if(input[1].equals("\\") || input[1].equals("/")) {
				//�ֻ��� ��η� �̵�
				path = path.split(":")[0]+":"+ File.separator;
			}else {
				StringTokenizer st = new StringTokenizer(input[1], "\\/");
				while(st.hasMoreTokens()) {
					String parsePath = st.nextToken();
					if(parsePath.equals("..")) { 
						//���� ��η� �̵�				
						File temp1 = new File(path);
						path = temp1.getParent() ;	
						if(path.equals(path.split(":")[0] + ":" + File.separator)) {
							break;
						}else {
							path += File.separator;
						}						
					}else {
						File temp2 = new File(path + parsePath);
						if(temp2.exists()) {
							path += parsePath + File.separator;
						}else {
							System.out.println("�������� �ʴ� ����Դϴ�. �ùٸ���θ� �Է��ϼ���");
							break;
						}
					}
				}
			}
		}else if(input.length == 1){
			if(input[0].equals("cd..")) {				
				//���� ��η� �̵�
				File temp = new File(path);
				path = temp.getParent();
			} else if( input[0].equals("cd\\") || input[0].equals("cd/")) {
				//�ֻ��� ��η� �̵�
				path = path.split(":")[0]+":"+ File.separator;	
			} else if( input[0].equals("cd")) {
				//�����ο� �״��
			} 
		}
	}
	
	static void renameDirectory(String[] input) {
		File beforeRen = new File(path + input[1] );//input[1] : ���� ���ϸ�
		if(beforeRen.exists()) {
			File afterRen = new File(path + input[2] );//input[2] : �ٲ� ���ϸ�
			if(afterRen.exists()) {
				System.out.println("�̹� �����ϴ� ���ϸ��Դϴ�.");
			}else {				
				beforeRen.renameTo(afterRen);
				if(!afterRen.exists()) {
				System.out.println("error!");
				}
			}
		}else {
			System.out.println("�������� �ʴ� �����Դϴ�.");
		}
	}
}