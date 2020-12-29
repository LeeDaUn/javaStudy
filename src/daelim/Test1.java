package daelim;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		int first,second;
		int r = 1;
		int LCM;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하시오");
		first = sc.nextInt();
		System.out.println("두번째 수를 입력하시오");
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
		
		System.out.println("GCD(최대공약수) "+ first);
		System.out.println("LCM(최소공배수) "+ LCM);
		
	}

}
