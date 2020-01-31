package COM.TYSS.ARRAY;

import java.util.Scanner;

public class JagArray {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int b[][]=new int[3][];
	b[0]=new int[2];
	b[1]=new int[3];
	b[2]=new int[2];
	
	for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b[i].length; j++) {
			System.out.println("enter the value of a[" +i +"][" +j+"]:");
			b[i][j]=sc.nextInt();
			
		}
		
	}
	for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b[i].length; j++) {
			System.out.println("value of a[" +i +"][" +j+"]is:" +b[i][j]);
		}
			
		}
		
}
}
