package daelim;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		int first,second;
		int r = 1;
		int LCM;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է��Ͻÿ�");
		first = sc.nextInt();
		System.out.println("�ι�° ���� �Է��Ͻÿ�");
		second = sc.nextInt();
		
		int tmp1 = first, tmp2 = second;
		if(second > first) {
			second = tmp1;
			first = tmp2;
		}
		while(r>0) {
			r = first % second;
			first = second;
			second = r;
		}
		
		LCM = tmp1 * tmp2 / first;
		
		System.out.println("GCD(�ִ�����) "+ first);
		System.out.println("LCM(�ּҰ����) "+ LCM);
		
	}

}
