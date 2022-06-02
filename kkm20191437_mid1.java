package kimmin_1;

import java.util.Scanner;
//if 문을 활용한 가위바위보
public class kkm20191437_mid1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("가위(1) 바위(2) 보(3)중에 고르세요.");
			int num = scanner.nextInt();
			String user = null;
			
			int comNum = (int)((Math.random()*3)+1);
			String com = null;
			
			if(num == 1) {
				user = "가위";
			}
			if(num == 2) {
				user = "바위";
			}
			if(num == 3) {
				user = "보";
			}
			
			if (comNum ==1) {
				com = "가위";
			}
			if (comNum ==2) {
				com = "바위";
			}
			if (comNum ==3) {
				com = "보";
			}
			
			if (user == com) {
				System.out.printf("유저는 %s를 냈고 컴퓨터는 %s를 냈습니다. \n 비겼습니다.\n", user, com);
				continue;
			}else if((num == 1 && comNum == 3) || (num == 2 && comNum ==1) || (num == 3 && comNum == 2)){
				System.out.printf("유저는 %s를 냈고 컴퓨터는 %s를 냈습니다. \n 이겼습니다.\n", user, com);
				break;
			}else if((num == 1 && comNum==2) || (num == 2 && comNum==3) || (num ==3 && comNum==1)) {
				System.out.printf("유저는 %s를 냈고 컴퓨터는 %s를 냈습니다. \n 졌습니다. \n", user, com);
				System.out.println("재도전 하시겠습니까? 1(Yes)/2(No)");
				int reTry = scanner.nextInt();
				if(reTry == 1){
					continue;
				}
				else{ break; }	
			}else {continue;} 
		}
	}
}