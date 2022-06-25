package june;

import java.util.Scanner;

public class Print_table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		for (int i=1 ; i<=10; i++) {
			System.out.println(sum+" * "+i+" = "+sum*i);
		}
	}

}
