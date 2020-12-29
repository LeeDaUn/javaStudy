package daelim;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("어절 갯수를 구하기 위한 구문을 입력하시오");
		String s = sc.nextLine();
		
		while(s.equals("exit")) {
			System.out.println("종료합니다.");
			break;
		}
		
		StringTokenizer st = new StringTokenizer(s," ");
		int n = st.countTokens();
		
		System.out.println("어절 개수는 " + n);
	}
}
