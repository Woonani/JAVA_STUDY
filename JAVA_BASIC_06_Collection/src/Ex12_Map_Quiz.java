import java.util.*;
public class Ex12_Map_Quiz {

	public static void main(String[] args) {
		/*
		 Map ����ϴ� ������ ����
		 ������ȣ, �����ȣ, ȸ������(id, pwd)
		 */
		HashMap loginmap = new HashMap(); // �޸𸮿��� ȸ��id,pwd����
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");

		/*
		 �츮 �ý����� ȸ�������� ȸ���� id, pwd�� �����ϰ� �ִ�
		 �α��� �� ���̵�� ����� Ȯ���ؼ� ȸ���̶�� ����Ʈ ���� ����
		 
		 id(o), pwd(o) >> ȸ���� �氡		1
		 id(o), pwd(x) >> ��й�ȣ �Է� �߰�	2
		 
		 id(x), pwd(o) >>ȸ������ ����		3
		 id(x), pwd(x) >>ȸ������ ����		3
		 
		 ����ڷκ��� id, pwd�Է� ��������
		 id�� ��������, �ҹ��� ��ȯ String ������ ��Ƽ� ���
		 pwd�� ��������
		
		 id(o), pwd(o) >> ȸ���� �氡�氡 ����ϰ� while Ż��
		 id(o), pwd(x) >> ��й�ȣ Ȯ�� ��¸�
		 
		 id(x), pwd(o) >> id ���� �ʽ��ϴ�, ���Է��ϼ���
		 id(x), pwd(x) >> id ���� �ʽ��ϴ�, ���Է��ϼ���
		 
		 */
		// �� Ǯ��
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id�� �Է����ּ��� : ");
			String id = sc.nextLine().replace(" ","").toLowerCase();
			if(!loginmap.containsKey(id)) {
				System.out.println("id ���� �ʽ��ϴ�. ���Է��ϼ���");
			}else {
				System.out.println("pwd�� �Է����ּ��� : ");
				String pwd = sc.nextLine().replace(" ","").toLowerCase();
				if(loginmap.get(id).equals(pwd)) {
					System.out.println("ȸ���� �氡�氡");
					break;
				}else {
					System.out.println("��й�ȣ Ȯ��");
					
				}
			}
		}
		// ����� Ǯ��
		/*
		 Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id ,pwd �Է��� �ּ���");
			
			System.out.println("ID");
			String id = sc.nextLine().trim().toLowerCase();
			
			System.out.println("PWD");
			String pwd = sc.nextLine().trim();
			
			if(!loginmap.containsKey(id)) {
				//id(x)
				System.out.println("id ���� �ʾƿ� ...���Է��ϼ���");
			}else {
				//id(0)
				if(loginmap.get(id).equals(pwd)) {
					System.out.println("ȸ���� �氡�氡");
					break;
				}else {
					System.out.println("��й�ȣ Ȯ���ϼ���");
				}
				
			}
			
		}
		 */
		
	}

}
