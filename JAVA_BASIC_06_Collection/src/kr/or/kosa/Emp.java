package kr.or.kosa;

// �Ѱ��� �����͸� ���� �� �ִ� Ŭ����
// �����ͺ��̽��� ���̺�� 1: 1�� �����ϴ� Ŭ����
// create table emp( empno number, ename varchar2(30)); >> 1����	//������ variable character���ٴ�
// select * from emp where empno=7902 			
// DTO, VO, DOMAIN 
public class Emp {
	private int empno;
	private String ename;
	private String job;
	
	
	// source > Generate Constructor using Fields
	public Emp(int empno, String ename, String job) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
	}
	
	// source > Generate Getters and Setters...
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	// source > Generate toString...
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + "]";
	}
	
	


	
	
}
