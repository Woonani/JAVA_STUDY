/*
 * �ڹ�4��_ �ζǹ�ȣ ��÷�� _ â�����ڵ�
 * �λ���� �� : �ּ����̵� �ڵ尡 ���صǴ� ������. Ư�� lineChange();�Լ� 
 * ǥ�������� �����Ͽ� �ζǹ�ȣ�� �̴� ���
 */
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Quiz_Lotto {

    public static void main(String[] args) {
    	LottoProgram lotto = new LottoProgram();
    	
		
    	lotto.run();
		
//		lotto.write();
//    	lotto.read();
		
    }
}

class LottoProgram {
	List<int[]> lottoNumbers = new ArrayList<>();
	public void write(String path) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(path + "lottoNumbers.txt", true); // ��ο� ������ ������ create �Ѵ�
			
			String data = "";
				for(int i=0; i<lottoNumbers.size() ; i++) {
					data = Arrays.toString(lottoNumbers.get(i));
				}
				fw.write("�ζǹ�ȣ : ");
				fw.write(data+" ");
				LocalDateTime now = LocalDateTime.now();
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
				fw.write(" " + (String)now.format(dtf));
				fw.write("\n");
		} catch (Exception e) {
			e.printStackTrace(); // catch�� ��¹�
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public void write() {
		String defaultPath = "C:\\Douzone\\JAVA\\Labs\\QuizOrCote";
		this.write(defaultPath);
	}
	
	public void read() {
		
	}

    public void run() {

        Print print = new Print();
        User user = new User();

        int[] lottoNumber = new int[6];
        boolean stop = false;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                print.startLotto();
                int userInput = user.getUserInput(user, print);

                switch (userInput) {
                    case 1:
                        print.autoMenu();
                        checkOptionInAuto(user, lottoNumber, print);
                        break;

                    case 2:
                        print.requestSixManualNumber();
                        getManualLottoNumber(user, lottoNumber, print);
                        sortLottoNumber(lottoNumber);
                        print.manualNumber(lottoNumber);
                        break;

                    case 3:
                        print.requestSemiAutoNumber();

                        int manualQuantity = user.getUserInput(user, print);

                        manualQuantity = getManualQuantity(user, manualQuantity, print);
                        print.requestUserManualNumber(manualQuantity);
                        getManualLottoNumber(user, lottoNumber, manualQuantity, print);

                        generateLottoNumberSemiAuto(lottoNumber, manualQuantity);
                        sortLottoNumber(lottoNumber);
                        print.semiAutoNumber(lottoNumber);
                        break;

                    case 4:
                        int[][] previousWinNumber = new int[5][7];
                        int[] previousRound = new int[5];
                        int[] fiveMostWinNumber = new int[5];
                        int[] originWinNumber = new int[45];
                        int[] sortedWinNumber = new int[45];
                        int[] originLottoNumber = new int[45];

                        allocatePreviousRound(previousRound);
                        allocatePreviousWinNumber(previousWinNumber);
                        allocateOriginWinNumber(previousWinNumber, originWinNumber);
                        allocateOriginLottoNumber(originLottoNumber);
                        createSortedWinNumber(originWinNumber, sortedWinNumber);
                        createFiveMostWinNumber(fiveMostWinNumber, originWinNumber, sortedWinNumber, originLottoNumber);

                        print.previousWinLottoNumber(previousRound, previousWinNumber);
                        print.fiveMostWinNumber(fiveMostWinNumber);
                        break;

                    case 5:
                        print.exitProgram();
                        stop = true;
                        
                    case 6:
                    	// IO �߰��κ�
                        lottoNumbers.add(lottoNumber);
                        write();
                    	System.out.println("����Ǿ����ϴ�.");
                    case 7:
                    	// IO �߰��κ�
                        lottoNumbers.add(lottoNumber);
                        String path = sc.nextLine();
                        write(path);
                    	System.out.println("������ ��θ� ��������");
                    	
                }
            } catch (Exception e) {
                e.printStackTrace();
                print.exceptionMessage();
            }
        } while (!stop);
    }

    private void checkOptionInAuto(User user, int[] lottoNumber, Print print) {
        int userInput1 = user.getUserInput(user, print);

        switch (userInput1) {
            case 1:
                firstOptionInAuto(print, lottoNumber, userInput1);
                break;
            case 2:
                secondOptionInAuto(print, lottoNumber, userInput1);

        }
    }

    private void firstOptionInAuto(Print print, int[] lottoNumber, int userInput1) {
        if (userInput1 == 1) {
            generateLottoNumberAuto(lottoNumber);
            sortLottoNumber(lottoNumber);
            print.autoNumber(lottoNumber);
        }
    }

    private void secondOptionInAuto(Print print, int[] lottoNumber, int userInput1) {
        double standardDeviation;
        if (userInput1 == 2) {
            do {
                generateLottoNumberAuto(lottoNumber);
                sortLottoNumber(lottoNumber);
                standardDeviation = standardDeviation(lottoNumber);
            } while (standardDeviation <= 9 || 15 <= standardDeviation);
            print.standardDeviationNumber(lottoNumber, standardDeviation);
        }
    }
// �ζ� ��ȣ �����Լ�
    private void generateLottoNumberAuto(int[] lottoNumber) {
        Random random = new Random();
        for (int i = 0; i < lottoNumber.length; i++) {
            lottoNumber[i] = random.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (lottoNumber[i] == lottoNumber[j]) {
                    i--;
                    break;
                }
            }
        }
    }              
    private void getManualLottoNumber(User user, int[] lottoNumber, int manualQuantity, Print print) {
        for (int i = 0; i < manualQuantity; i++) {
            lottoNumber[i] = user.getUserInput(user, print);
            if (lottoNumber[i] < 1 || lottoNumber[i] > 45) {
                i--;
                print.requestManualNumber();
                continue;

            }
            for (int j = 0; j < i; j++) {
                if (lottoNumber[i] == lottoNumber[j]) {
                    print.numberDuplication(manualQuantity, i);
                    i--;
                    break;
                }
            }
            print.totalInputSoFar(i, lottoNumber);
        }
    }

    private int getManualQuantity(User user, int manualQuantity, Print print) {
        while (manualQuantity < 1 || manualQuantity > 5) {
            print.requestManualNumberQuantity();
            manualQuantity = user.getUserInput(user, print);
        }
        return manualQuantity;
    }


    private void getManualLottoNumber(User user, int[] lottoNumber, Print print) {
        for (int i = 0; i < lottoNumber.length; i++) {
            lottoNumber[i] = user.getUserInput(user, print);
            if (lottoNumber[i] < 1 || lottoNumber[i] > 45) {
                i--;
                print.requestManualNumber();
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (lottoNumber[i] == lottoNumber[j]) {
                    print.numberDuplication(lottoNumber, i);
                    i--;
                    break;
                }
            }
            print.totalInputSoFar(i, lottoNumber);
        }

    }

    private void generateLottoNumberSemiAuto(int[] lottoNumber, int manualQuantity) {
        Random random = new Random();
        for (int i = manualQuantity; i < lottoNumber.length; i++) {
            lottoNumber[i] = random.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (lottoNumber[i] == lottoNumber[j]) {
                    i--;
                    break;
                }
            }
        }
    }

    private void sortLottoNumber(int[] lottoNumber) {
        for (int i = 0; i < lottoNumber.length; i++) {
            for (int j = i + 1; j < lottoNumber.length; j++) {
                if (lottoNumber[i] > lottoNumber[j]) {
                    int temp1;
                    int temp2;
                    temp1 = lottoNumber[j];
                    temp2 = lottoNumber[i];
                    lottoNumber[i] = temp1;
                    lottoNumber[j] = temp2;
                }
            }
        }
    }

    private double standardDeviation(int[] lottoNumber) {
        double sumLottoNumber = 0;
        double sumSqrtLottoNumber = 0;
        for (int j : lottoNumber) {
            sumLottoNumber += j;
            sumSqrtLottoNumber += Math.pow(j, 2);
        }
        return Math.sqrt((sumSqrtLottoNumber / 6) - (Math.pow((sumLottoNumber / 6), 2)));
    }

    private void allocateOriginLottoNumber(int[] originLottoNumber) {
        for (int i = 0; i < 45; i++) {
            originLottoNumber[i] = i + 1;
        }
    }

    private void allocateOriginWinNumber(int[][] previousWinNumber, int[] originWinNumber) {
        int count;
        for (int i = 0; i < 45; i++) {
            count = 0;
            for (int j = 0; j < previousWinNumber.length; j++) {
                for (int k = 0; k < previousWinNumber[0].length; k++) {
                    if (previousWinNumber[j][k] == i + 1) {
                        count++;
                    }
                }
            }
            originWinNumber[i] = count;
        }
    }
    private void allocatePreviousWinNumber(int[][] previousWinNumber) {
        previousWinNumber[0][0] = 3;
        previousWinNumber[0][1] = 10;
        previousWinNumber[0][2] = 24;
        previousWinNumber[0][3] = 33;
        previousWinNumber[0][4] = 38;
        previousWinNumber[0][5] = 45;
        previousWinNumber[0][6] = 36;

        previousWinNumber[1][0] = 7;
        previousWinNumber[1][1] = 10;
        previousWinNumber[1][2] = 22;
        previousWinNumber[1][3] = 25;
        previousWinNumber[1][4] = 34;
        previousWinNumber[1][5] = 40;
        previousWinNumber[1][6] = 27;

        previousWinNumber[2][0] = 11;
        previousWinNumber[2][1] = 23;
        previousWinNumber[2][2] = 25;
        previousWinNumber[2][3] = 30;
        previousWinNumber[2][4] = 32;
        previousWinNumber[2][5] = 40;
        previousWinNumber[2][6] = 42;

        previousWinNumber[3][0] = 8;
        previousWinNumber[3][1] = 13;
        previousWinNumber[3][2] = 19;
        previousWinNumber[3][3] = 27;
        previousWinNumber[3][4] = 40;
        previousWinNumber[3][5] = 45;
        previousWinNumber[3][6] = 12;

        previousWinNumber[4][0] = 13;
        previousWinNumber[4][1] = 20;
        previousWinNumber[4][2] = 24;
        previousWinNumber[4][3] = 32;
        previousWinNumber[4][4] = 36;
        previousWinNumber[4][5] = 45;
        previousWinNumber[4][6] = 29;
    }

    private void allocatePreviousRound(int[] previousRound) {
        previousRound[0] = 1060;
        previousRound[1] = 1059;
        previousRound[2] = 1058;
        previousRound[3] = 1057;
        previousRound[4] = 1056;
    }

    private void createFiveMostWinNumber(int[] fiveMostWinNumber, int[] originWinNumber, int[] sortedWinNumber,
                                         int[] originLottoNumber) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 45; j++) {
                if (originWinNumber[j] == sortedWinNumber[i]) {
                    fiveMostWinNumber[i] = originLottoNumber[j];
                    for (int k = 0; k < i; k++) {
                        if (fiveMostWinNumber[i] == fiveMostWinNumber[k]) {
                            i--;
                            fiveMostWinNumber[i] = 0;
                            break;
                        }
                    }
                }
                if (fiveMostWinNumber[i] != 0) {
                    break;
                }
            }
        }
        System.out.println();
    }

    private void createSortedWinNumber(int[] originWinNumber, int[] sortedWinNumber) {
        for (int i = 0; i < 45; i++) {
            sortedWinNumber[i] = originWinNumber[i];
        }
        int temp;
        for (int i = 0; i < sortedWinNumber.length; i++) {
            for (int j = 1; j < sortedWinNumber.length - i; j++) {
                if (sortedWinNumber[j - 1] < sortedWinNumber[j]) {
                    temp = sortedWinNumber[j - 1];
                    sortedWinNumber[j - 1] = sortedWinNumber[j];
                    sortedWinNumber[j] = temp;
                }
            }
        }
    }


}

class User {
    public int getUserInput(User user, Print print) {
        Scanner sc = new Scanner(System.in);
        int input;
        try {
            input = sc.nextInt();
        } catch (InputMismatchException e) {
            sc.next();
            print.exceptionMessage();
            return getUserInput(user, print);
        }
        return input;
    }
}

class Print {
    public void startLotto() {
        lineChange();
        System.out.println("***************************");
        System.out.println("�ζ� ������ �����մϴ�!");
        System.out.println("[1. �ڵ� �ζ�]");
        System.out.println("[2. ���� �ζ�]");
        System.out.println("[3. ���ڵ� �ζ�]");
        System.out.println("[4. ��÷ ��� Ȯ���ϱ�]");
        System.out.println("[5. ���α׷� ����]");
        System.out.println("[6. ������ ��ȣ ���Ϸ� �����ϱ�]");
        System.out.println("[7. ������ ��ȣ ���� �����Ͽ� �����ϱ�]");
        System.out.println("***************************");
        lineChange();
        System.out.print("���ϴ� �޴��� �Է��ϼ��� : ");
    }

    public void autoMenu() {
        lineChange();
        System.out.println("[1 : ���� �ڵ�]");
        System.out.println("[2 : ���� �̱�(ǥ������ 9�̻� 15����)]");
        lineChange();
        System.out.print("���ϴ� �޴��� �Է��ϼ��� : ");
    }

    public void autoNumber(int[] lottoNumber) {
        lineChange();
        System.out.println("�ڵ� �̱Ⱑ �Ϸ� �Ǿ����ϴ�.");
        System.out.println("[�ζ� ��ȣ : " + Arrays.toString(lottoNumber) + "]");
    }

    public void standardDeviationNumber(int[] lottoNumber, double standardDeviation) {
        lineChange();
        System.out.println("���� �̱Ⱑ �Ϸ� �Ǿ����ϴ�.");
        System.out.println("ǥ�������� " + String.format("%.2f", standardDeviation) + "�Դϴ�.");
        System.out.println("[�ζ� ��ȣ : " + Arrays.toString(lottoNumber) + "]");
    }

    public void requestSixManualNumber() {
        lineChange();
        System.out.println("1 ~ 45 ������ ���ڸ� 6�� �Է����ּ���.");
    }

    public void requestUserManualNumber(int manualQuantity) {
        lineChange();
        System.out.println("1 ~ 45 ������ ���ڸ� " + manualQuantity + "�� �Է����ּ���.");
    }

    public void manualNumber(int[] lottoNumber) {
        lineChange();
        System.out.println("���� �̱Ⱑ �Ϸ� �Ǿ����ϴ�.");
        System.out.println("[�ζ� ��ȣ : " + Arrays.toString(lottoNumber) + "]");
    }

    public void semiAutoNumber(int[] lottoNumber) {
        lineChange();
        System.out.println("���ڵ� �̱Ⱑ �Ϸ� �Ǿ����ϴ�.");
        System.out.println("[�ζ� ��ȣ : " + Arrays.toString(lottoNumber) + "]");
    }

    public void requestSemiAutoNumber() {
        lineChange();
        System.out.println("1 ~ 5�� �� �������� �Է��� ������ �Է��ϼ���.");
    }

    public void previousWinLottoNumber(int[] previousRound, int[][] previousWinNumber) {
        for (int i = 0; i < 5; i++) {
            System.out.print(previousRound[i] + "ȸ�� ��÷��ȣ : ");
            System.out.println(Arrays.toString(previousWinNumber[i]));
        }
    }

    public void fiveMostWinNumber(int[] fiveMostWinNumber) {
        lineChange();
        System.out.println("�ֱٿ� ���� ���� ���� ���ڴ� : " + Arrays.toString(fiveMostWinNumber) + "�Դϴ�.");
    }

    public void exitProgram() {
        lineChange();
        System.out.println("�ζ� �Ǹ� ���α׷��� ����˴ϴ�.");
    }

    public void requestManualNumberQuantity() {
        System.out.println("1 ~ 5�� �� �������� �Է��� ������ �Է��ϼ���.");
    }

    public void requestManualNumber() {
        System.out.println("1 ~ 45 ������ ���ڸ� �Է��ϼ���.");
    }

    public void numberDuplication(int[] lottoNumber, int i) {
        System.out.println("�ߺ��� ���� �Է��ϼ̽��ϴ�." + (lottoNumber.length - i) + "���� ���ڸ� �Է����ּ���.");
    }

    public void numberDuplication(int manualQuantity, int i) {
        System.out.println("�ߺ��� ���� �Է��ϼ̽��ϴ�." + (manualQuantity - i) + "���� ���ڸ� �Է����ּ���.");
    }

    public void exceptionMessage() {
        System.out.println("�ùٸ� ���ڸ� �Է��ϼ���");
        lineChange();
    }

    public void totalInputSoFar(int i, int[] lottoNumber) {
        System.out.print("���� �Է��� ���ڴ� : [");
        for (int j = 0; j <= i; j++) {
            System.out.print(lottoNumber[j] + " ");
        }
        System.out.println("]�Դϴ�.");
    }

    public void lineChange() {
        System.out.println();
    }
}