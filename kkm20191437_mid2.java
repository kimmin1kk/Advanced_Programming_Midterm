package kimmin_1;

import java.util.Scanner;
//switch/case ���� Ȱ���� ����������
public class kkm20191437_mid2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		game: while(true) {
			int CRNum=(int) (Math.random()*3);
			
			System.out.println("����(0), ����(1), ��(2)�߿� ���ÿ�.");	
			int user=scanner.nextInt();
			
			switch(user) {
			case 0:
				switch(CRNum) {
				case 0 : {System.out.println("��ǻ�Ͱ� ������ ���� �����ϴ�.");}
				break;
				case 1 : {System.out.println("��ǻ�Ͱ� ������ ���� �����ϴ�.");}
				break game;
				case 2 : {System.out.println("��ǻ�Ͱ� ���� ���� �̰���ϴ�.");}
				break game;
				}break;
			case 1:
				switch(CRNum) {
				case 0 : {System.out.println("��ǻ�Ͱ� ������ ���� �̰���ϴ�.");}
				break game;
				case 1 : {System.out.println("��ǻ�Ͱ� ������ ���� �����ϴ�.");}
				break;
				case 2 : {System.out.println("��ǻ�Ͱ� ���� ���� �����ϴ�.");}
				break game;
				}break;
			case 2 :
				switch(CRNum) {
				case 0 : {System.out.println("��ǻ�Ͱ� ������ ���� �����ϴ�.");}
				break game;
				case 1 : {System.out.println("��ǻ�Ͱ� ������ ���� �̰���ϴ�.");}
				break game;
				case 2 : {System.out.println("��ǻ�Ͱ� ���� ���� �����ϴ�.");}
				break;
				}break;
			default : {System.out.println("�߸� �Է��ϼ̽��ϴ�.");}
			break;
			}
		}		
	}

}