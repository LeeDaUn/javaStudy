package daelim;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int coke = 900;
		int cider = 800;
		int money ;
		int menu;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("요금을 투입하세요 >>>");
		money = sc.nextInt();
		
		while(true) {
			System.out.println("=========커피 자판기==========");
			System.out.println("1.콜라(900) \t 2.사이다(800) \t 3.잔액확인 \t 4. 반환/종료");
			System.out.print("메뉴를 선택하세요 >>>");
			menu = sc.nextInt();
			
			if(menu == 1) {
				if(money > coke) {
					System.out.println("콜라가 뽑혔습니다.");
					money = money - coke;
				}
				else {
					System.out.println("금액이 부족합니다.");
				}	
			}
			if(menu == 2) {
				if(money > cider) {
					System.out.println("사이다가 뽑혔습니다.");
					money = money - cider;
				}
				else {
					System.out.println("금액이 부족합니다.");
				}	
			}
			if(menu == 3) {
				System.out.println("현재 잔액은" + money + "원 입니다");
				continue;
			}
			if(menu == 4) {
				System.out.println(money + "원이 반환되었습니다.");
				System.out.println("종료합니다.");
				break;
			}
		}
		
	}
}
