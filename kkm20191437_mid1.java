package kimmin_1;

import java.util.Scanner;
//if ���� Ȱ���� ����������
public class kkm20191437_mid1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("����(1) ����(2) ��(3)�߿� ������.");
			int num = scanner.nextInt();
			String user = null;
			
			int comNum = (int)((Math.random()*3)+1);
			String com = null;
			
			if(num == 1) {
				user = "����";
			}
			if(num == 2) {
				user = "����";
			}
			if(num == 3) {
				user = "��";
			}
			
			if (comNum ==1) {
				com = "����";
			}
			if (comNum ==2) {
				com = "����";
			}
			if (comNum ==3) {
				com = "��";
			}
			
			if (user == com) {
				System.out.printf("������ %s�� �°� ��ǻ�ʹ� %s�� �½��ϴ�. \n �����ϴ�.\n", user, com);
				continue;
			}else if((num == 1 && comNum == 3) || (num == 2 && comNum ==1) || (num == 3 && comNum == 2)){
				System.out.printf("������ %s�� �°� ��ǻ�ʹ� %s�� �½��ϴ�. \n �̰���ϴ�.\n", user, com);
				break;
			}else if((num == 1 && comNum==2) || (num == 2 && comNum==3) || (num ==3 && comNum==1)) {
				System.out.printf("������ %s�� �°� ��ǻ�ʹ� %s�� �½��ϴ�. \n �����ϴ�. \n", user, com);
				System.out.println("�絵�� �Ͻðڽ��ϱ�? 1(Yes)/2(No)");
				int reTry = scanner.nextInt();
				if(reTry == 1){
					continue;
				}
				else{ break; }	
			}else {continue;} 
		}
	}
}