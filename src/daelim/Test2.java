package daelim;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int coke = 900;
		int cider = 800;
		int money ;
		int menu;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("����� �����ϼ��� >>>");
		money = sc.nextInt();
		
		while(true) {
			System.out.println("=========Ŀ�� ���Ǳ�==========");
			System.out.println("1.�ݶ�(900) \t 2.���̴�(800) \t 3.�ܾ�Ȯ�� \t 4. ��ȯ/����");
			System.out.print("�޴��� �����ϼ��� >>>");
			menu = sc.nextInt();
			
			if(menu == 1) {
				if(money > coke) {
					System.out.println("�ݶ� �������ϴ�.");
					money = money - coke;
				}
				else {
					System.out.println("�ݾ��� �����մϴ�.");
				}	
			}
			if(menu == 2) {
				if(money > cider) {
					System.out.println("���̴ٰ� �������ϴ�.");
					money = money - cider;
				}
				else {
					System.out.println("�ݾ��� �����մϴ�.");
				}	
			}
			if(menu == 3) {
				System.out.println("���� �ܾ���" + money + "�� �Դϴ�");
				continue;
			}
			if(menu == 4) {
				System.out.println(money + "���� ��ȯ�Ǿ����ϴ�.");
				System.out.println("�����մϴ�.");
				break;
			}
		}
		
	}
}
