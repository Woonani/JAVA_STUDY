import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// ���� ���� & ���� ���
		Bank bank = new Bank();
		bank.addAccount("10071", "��");
		bank.addAccount("890113", "��");
		bank.addAccount("0113", "��");
		bank.addAccount("987654321", "����");
		// ��ü ���¸�� ��ȸ
		bank.getAccounts();
		
		//�ش� ���¹�ȣ�� ��������		
		Account account = bank.getAccount("890113");

		//�Ա�
		account.deposit(20000);
//		bank.getAccount("890113");
//		account.deposit(20000);
		bank.getAccount("890113").deposit(20000);
		
		//�ش� �����ڸ��� ���� ���
		bank.findAccounts("��");
//		
		bank.getAccount("89011");
		bank.getAccount("890113");
//		
//		//����
		account.withdraw(5500);
		bank.getAccount("890113");
//		System.out.println("����"+account);
//	
		// �ŷ�����
		bank.getAccount("890113").getTransactions();		
	}

}

class Bank {
//	private ArrayList<Account> accounts = new ArrayList(); // ����(0���̻�)
	private List<Account> accounts; // ����(0���̻�)
	private int totalAccounts; // �Ѱ��¼�
	
	Bank(){
		this.accounts = new ArrayList<Account>(); // composition����� ����ʵ忡 ����, ������ �������Լ��ȿ���!
	}
	
	public int getTotalAccounts() {
		
		return totalAccounts;
	}
	public void setTotalAccounts(int totalAccounts) {
		this.totalAccounts = totalAccounts;
	}
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	
	
	// ���¸� �����Ѵ�
	public void addAccount(String accountNo, String name) {
		accounts.add( new Account(accountNo, name));
	}
	
	//���¸� ã�´�.(���¹�ȣ��)
    public Account getAccount(String accountNo) {
    	System.out.println(" = �ش� ���¹�ȣ�� �������� =");
        for (Account account : accounts) {
            if (account.getAccountNo().equals(accountNo)) {
            	System.out.println(account);
            	System.out.println();
                return account;
            }
        }
        System.out.println();
        return null;
    }
	//���¸� ã�´�. (�����ڸ�����)
	public ArrayList<Account> findAccounts(String name) {
		ArrayList<Account> foundAccounts = new ArrayList();
		System.out.println(" = �ش� �����ڸ��� ���� ��� =");
		for(int i=0; i< accounts.size(); i++) {
			if(accounts.get(i).getName().equals(name)) {
				foundAccounts.add(accounts.get(i));
				System.out.println(accounts.get(i));
			}
		}
		System.out.println();
		return foundAccounts;
	}
	//���� ����� ����.
	public List<Account> getAccounts() {
		System.out.println(" =��ü ���� ���=");
		for(Account account: this.accounts) {
			System.out.println(account);
		}
		System.out.println();
		return this.accounts;
	}
	
	//�Ѱ��¼��� ��ȯ�Ѵ�.
	public int getTotalAccount() {
		int totalAccount = accounts.size();
		return totalAccount;
	}
	
	
	
	
}

class Account {
    private String accountNo;
    private String name;
    private long balance;
    private ArrayList<Transaction> transactions;

    public Account(String accountNo, String name, long balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }
    
    public Account(String accountNo, String name) {
    	this( accountNo,  name, 0);
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public ArrayList<Transaction> getTransactions() {
    	System.out.println(" =�ŷ�����=");
    	for(Transaction transaction : transactions) {
    		System.out.println(transaction);    		
    	}
        return transactions;
    }

    public void deposit(long amount) {
        this.balance += amount;
        System.out.println(amount+"�� �Ա��ϼ̽��ϴ�.");
        System.out.println("�����ܾ��� "+this.balance+"�� �Դϴ�");
        System.out.println();
        Transaction transaction = new Transaction(LocalDate.now().toString(), LocalTime.now().toString(), "Deposit", amount, balance);
        addTransaction(transaction);
    }

    public void withdraw(long amount) {
        this.balance -= amount;
        System.out.println(amount+"�� �����ϼ̽��ϴ�.");
        System.out.println("�����ܾ��� "+this.balance+"�� �Դϴ�");
        System.out.println();
        Transaction transaction = new Transaction(LocalDate.now().toString(), LocalTime.now().toString(), "Withdrawal", amount, balance);
        addTransaction(transaction);
    }

    private void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

	@Override
	public String toString() {
		return " [���¹�ȣ :" + accountNo + ", ������ �� :" + name + ", �ܾ� :" + balance + "]";
	}

    
}

class Transaction {
	   private String transactionDate;
	   private String transactionTime;
	   private String kind;
	   private long amount;
	   private long balance;

	   public Transaction(String transactionDate, String transactionTime, String kind, long amount, long balance) {
	      this.transactionDate = transactionDate;
	      this.transactionTime = transactionTime;
	      this.kind = kind;
	      this.amount = amount;
	      this.balance = balance;
	   }

	   public String getTransactionDate() {
	      return transactionDate;
	   }

	   public void setTransactionDate(String transactionDate) {
	      this.transactionDate = transactionDate;
	   }

	   public String getTransactionTime() {
	      return transactionTime;
	   }

	   public void setTransactionTime(String transactionTime) {
	      this.transactionTime = transactionTime;
	   }

	   public String getKind() {
	      return kind;
	   }

	   public void setKind(String kind) {
	      this.kind = kind;
	   }

	   public long getAmount() {
	      return amount;
	   }

	   public void setAmount(long amount) {
	      this.amount = amount;
	   }

	   public long getBalance() {
	      return balance;
	   }

	   public void setBalance(long balance) {
	      this.balance = balance;
	   }

	@Override
	public String toString() {
		return "�ŷ��ݾ�: "+amount+"  �ܾ�: "+ balance+ "/" + transactionDate.substring(0,4)+ "��" + transactionDate.substring(5,7)+ "��" + transactionDate.substring(8,10)+ "��" +  
	transactionTime.substring(0, 2)+"��"+transactionTime.substring(3, 5)+"��"+transactionTime.substring(6, 8)+"��";//02/35/68
	}
	   
	}