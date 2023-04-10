package kr.or.kosa;

import java.util.*;

public class BookManager {
//	List<Book> books; 
	HashMap<String,Book> books;
	
	public BookManager() {
		super();
		this.books = new HashMap<>();
	}
	
	public void Run() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1:�߰� 2:���� 3:�˻� 4:���� ��� 5:ISBN ��� 0:����");
			System.out.println("�޴���ȣ �Է� : ");
			String selectedMenu = sc.nextLine();
			switch(selectedMenu) {
			case "1" : // �����߰�
				System.out.println("�߰��� ���� ISBN: ");
				String bookNo = sc.nextLine();
				System.out.println("���� ����: ");
				String bookTitle = sc.nextLine();
				System.out.println("���� : ");
				int price = Integer.parseInt(sc.nextLine());
				addBook(bookNo, bookTitle, price);
				System.out.printf("ISBN:%s �̸�:%s ����:%d �����Ͽ����ϴ�.\n", bookNo, bookTitle, price);
				break;
			case "2" : 
				// ��������
				System.out.println("������ ���� ISBN: ");
				String bookNo2 = sc.nextLine();
				for(String isbn : books.keySet()) {
					if(isbn.equals(bookNo2)) {
						books.remove(isbn);
						System.out.printf("�����Ͽ����ϴ�");
						break;
					}
				}
				
				break;
			case "3" : 
				// ���� �˻�
				System.out.print("�˻��� ���� ISBN:");
				String isbn2 = sc.nextLine();
				for(String isbn : books.keySet()) {
					if(isbn.equals(isbn2)) {
						System.out.printf("�˻� ���>>ISBN:%s �̸�:%s ����:%d\n", isbn, books.get(isbn).bookTitle, books.get(isbn).price);
						break;
					}
				}
				break;
			case "4" : 
				// ���� ��� ��ȸ
				System.out.printf("������� \n ���� �� : %d \n", books.size());
				for(String isbn :books.keySet()) { //*********************
					System.out.printf(" ISBN:%s �̸�:%s ����:%d \n",isbn, books.get(isbn).bookTitle, books.get(isbn).price );
				}
				break;
			case "5" : 
				// ISBN ��� ��ȸ
				System.out.printf("ISBN ��� \n ���� �� : %d \n", books.size());
				for(String isbn : books.keySet()) {
					System.out.println(isbn);
				}
				break;
			case "0" : 
				// ����
				System.out.println("�����ý����� �����մϴ�.");
				System.exit(0);
				break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}
	
	
	void addBook(String bookNo, String bookTitle, int price) {
		this.books.put(bookNo, new Book(bookNo, bookTitle, price));
	}
}
/*
 // ������� ����� �ڵ�
  * 
  * package kr.or.kosa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BookManager {
	private HashMap<Integer, Book> books;
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public BookManager() {
		this.books = new HashMap<>();
	}
	
	
	public void run() throws NumberFormatException, IOException {
		
		boolean runState = true;
		while(runState) {			
			System.out.println("1:�߰�\t2:����\t3:�˻�\t4:���� ���\t5:ISBN ���\t 0:����");
			System.out.println("���Ͻô� �޴���ȣ�� �Է��ϼ���");
			int inputValue = Integer.parseInt(br.readLine());
			switch(inputValue) {
			case 1: addBook(); break;
			case 2: removeBook(); break;
			case 3: findBook(); break;
			case 4: showBookList(); break;
			case 5: showIsbnList(); break;
			case 0: runState = false; break;
			default: System.out.println("�߸��� ���Դϴ�");
			}	
		}
	}
	
	private void addBook() throws IOException {
		System.out.print("�߰��� ����(ISBN) : ");
		int isbn = Integer.parseInt(br.readLine());
		if(!books.containsKey(isbn)) {
			System.out.println("�ش� ������ �̹� �����մϴ�");
		} else {
			System.out.print("���� ���� : ");
			String bookName = br.readLine();
			System.out.print("���� : ");
			int bookPrice = Integer.parseInt(br.readLine());
			books.put(isbn, new Book(isbn, bookName, bookPrice));
			System.out.printf("ISBN:%d �̸�:%s ����:%d �����Ͽ����ϴ�.\n",isbn, bookName, bookPrice);		
		}
	}
	
	private void removeBook() throws NumberFormatException, IOException {
		System.out.print("������ ������ ISBN : ");
		int isbn = Integer.parseInt(br.readLine());
		if(books.containsKey(isbn)) {
			books.remove(isbn);
			System.out.println("�ش� ������ �����Ͽ����ϴ�");
			System.out.println("������ ���� ISBN : " + isbn);
		} else {
			System.out.println("�ش� ������ �����ϴ�.");
		}
	}
	
	private void findBook() throws NumberFormatException, IOException {
		System.out.print("�˻��� ������ ISBN : ");
		int isbn = Integer.parseInt(br.readLine());
		if(books.containsKey(isbn)) {
			System.out.printf("�˻� ���>> ISBN:%d �̸�:%s ����:%d\n",isbn, books.get(isbn).getBookName(),books.get(isbn).getBookPrice());
		} else {
			System.out.println("�ش� ������ �����ϴ�.");
		}
	}
	
	private void showBookList() {
		System.out.println("�������");
		System.out.println("���� �� : "+ books.size());
		for (int i : books.keySet()) {
			System.out.printf("ISBN:%d �̸�:%s ����:%d\n", books.get(i).getIsbn(), books.get(i).getBookName(), books.get(i).getBookPrice());			
		}
	}
	private void showIsbnList() {
		System.out.println("�������");
		System.out.println("���� �� : "+ books.size());
		for (int i : books.keySet()) {
			System.out.printf("ISBN:%d\n", books.get(i).getIsbn());			
		}
	}
}
 */
