package COM.TYSS.ARRAY;

import java.util.Scanner;

public class SingleDimension {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the array size");
		
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("enter the array element");
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
