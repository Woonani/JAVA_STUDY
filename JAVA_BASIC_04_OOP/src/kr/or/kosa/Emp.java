package kr.or.kosa;

// �Ѱ��� �����͸� ���� �� �ִ� Ŭ����
// �����ͺ��̽��� ���̺�� 1: 1�� �����ϴ� Ŭ����
// create table emp( empno number, ename varchar2(30)); >> 1rjsdml	//������ variable character���ٴ�
// select * from emp where empno=7902
// DTO, VO, DOMAIN 
public class Emp {
	private int empno;
	private String ename;
	
	// public Emp(){} //default constructor
	public Emp(int empno, String ename) { // overloading constructor
		super();
		this.empno = empno;
		this.ename = ename;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

//	@Override
//	public String toString() {
//		return "Emp [empno=" + empno + ", ename=" + ename + "]";
//	}
//
//	public void setEname(String ename) {
//		this.ename = ename;
//	}
//	
//	public void empInfoPrint() {
//		System.out.println(this.empno + "-"+ this.ename);
//	}
	/*
	 
	  package kr.or.kosa;

//�Ѱ��� �����͸� ���� �� �ִ� Ŭ����
//�����ͺ��̽��� ���̺�� 1:1 ���� �ϴ� Ŭ���� 
//create table emp( empno number , ename varchar2(30)); >> 1���� 
//select * from emp where empno=7902
//DTO , VO ,DOMAIN
public class Emp {
	private int empno;
	private String ename;
	//public Emp(){}
	public Emp(int empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public void empInfoPrint() {
		System.out.println(this.empno +  "-" + this.ename);
	}
	
	
	//Object toString() �ּҰ� ��ȯ
    //�����Ǹ� ���ؼ� member field ���� ���� Ȯ���ϴ� �뵵�� 
	//�����ڰ� �����Ǹ� �ϴ� �� �� �߿� �ϳ��� toString() 
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
	
	
	
}

	 
	 */

	
	
	
}
