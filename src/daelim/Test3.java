package daelim;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ������ ���ϱ� ���� ������ �Է��Ͻÿ�");
		String s = sc.nextLine();
		
		while(s.equals("exit")) {
			System.out.println("�����մϴ�.");
			break;
		}
		
		StringTokenizer st = new StringTokenizer(s," ");
		int n = st.countTokens();
		
		System.out.println("���� ������ " + n);
	}
}
