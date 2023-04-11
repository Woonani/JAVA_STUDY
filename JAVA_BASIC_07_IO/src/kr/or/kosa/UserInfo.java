package kr.or.kosa;

import java.io.Serializable;

/*
��ü ���
��ü(Car , Tv , Tank) >> ���μ��� , ��Ʈ��ũ , ���� ���� ��� >> ����� ���ؼ� ����ȭ , ������ȭ

����ȭ : ��ü�� �����ؼ� ���� ���� ������ ����
������ȭ : ��ü�� �ٽ� �����ϴ� ����

��� �ڿ�(class) ����ȭ ���� >> �ƴϿ� 
����ȭ ������ ��ǰ ���� (�����) 

UserInfo implements Serializable

*/
public class UserInfo implements Serializable {
	private String name;
	private String pwd;
	private int age;
	
	public UserInfo(String name, String pwd, int age) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getPwd() {
		return pwd;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
	}
	
	
	
}



