package kimmin_1;

import java.util.Scanner;
//switch/case 문을 활용한 가위바위보
public class kkm20191437_mid2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		game: while(true) {
			int CRNum=(int) (Math.random()*3);
			
			System.out.println("가위(0), 바위(1), 보(2)중에 고르시오.");	
			int user=scanner.nextInt();
			
			switch(user) {
			case 0:
				switch(CRNum) {
				case 0 : {System.out.println("컴퓨터가 가위를 내서 비겼습니다.");}
				break;
				case 1 : {System.out.println("컴퓨터가 바위를 내서 졌습니다.");}
				break game;
				case 2 : {System.out.println("컴퓨터가 보를 내서 이겼습니다.");}
				break game;
				}break;
			case 1:
				switch(CRNum) {
				case 0 : {System.out.println("컴퓨터가 가위를 내서 이겼습니다.");}
				break game;
				case 1 : {System.out.println("컴퓨터가 바위를 내서 비겼습니다.");}
				break;
				case 2 : {System.out.println("컴퓨터가 보를 내서 졌습니다.");}
				break game;
				}break;
			case 2 :
				switch(CRNum) {
				case 0 : {System.out.println("컴퓨터가 가위를 내서 졌습니다.");}
				break game;
				case 1 : {System.out.println("컴퓨터가 바위를 내서 이겼습니다.");}
				break game;
				case 2 : {System.out.println("컴퓨터가 보를 내서 비겼습니다.");}
				break;
				}break;
			default : {System.out.println("잘못 입력하셨습니다.");}
			break;
			}
		}		
	}

}