// �ΰ��� ���赵

class Tv{
	boolean power;
	int ch;
	
	void power() { // �ΰ��� ����� �ϳ��� �Լ� ó��
		// boolean 
		this.power = !this.power; // ��۸�!? : ���� ����ġ
		
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}

class Vcr{	//���� �÷��̾�
	boolean power;
	void power() {
		this.power = !this.power;
	}
	void play() {
		System.out.println("����ϱ�");
		
	}
	void stop() {
		System.out.println("�����ϱ�");
	}
	void rew() {}
	void ff() {}
}

//���赵 2��
	/*
	 class Tv
	 class Vcr
	 
	 ��ǰ
	 Tv �� Vcr ����� ������ ��ǰ TvVcr ���
	 
	 class TvVcr extends Tv, Vcr (x) ���߻�� ����
	 >> ������ ��� ( �Ҿƹ���, �ƹ��� ���� ����,,, �ڿ��̸� ���ƿ� ,,, ���Ұ� )
	 
	 �ѳ��� ����ϰ� �ѳ��� ����
	 �Ѵ� ���� 
	 1) class TvVcr (){ Tv tv; 	Vcr vcr; }
	 2) class TvVcr extends Tv (){ Vcr vcr;	 } // �Ϲ������� ���̾� 
	 TvVcr ���� ��� .... (����)
	 
	 */
class TvVcr{
	Tv tv;
	Vcr vcr;
	
	TvVcr(){
		this.tv = new Tv(); // �ʱ�ȭ (�ּҰ� �Ҵ�)
		this.vcr = new Vcr();
	}
}	
class TvVcr2 extends Tv{ // �Ϲ������� ���̾� 
	// �θ� ��ġ ���� ���� (������ �Լ��� ������) ����2��[] [] �ż���3��()()()
	// �ڽ� ��ü ����
	Vcr vcr; // ���� ����
	TvVcr2(){ 
		this.vcr = new Vcr(); // Vcr ����
	}
}	

public class Ex03_Inheritance {

	public static void main(String[] args) {
		TvVcr my = new TvVcr();
		my.tv.power();
		my.vcr.power();
		System.out.println(my.tv.power);
		System.out.println(my.vcr.power);
		//----------------------------------
		
		TvVcr2 tv2 = new TvVcr2();
		tv2.power();
		System.out.println("Tv���� : " + tv2.power);
		
		tv2.vcr.power();
		System.out.println("VCR���� : " + tv2.vcr.power);
		
		
	}

}
