package COM.TYSS.ARRAY;

import java.util.Scanner;

public class Array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value for row");
	int row=sc.nextInt();
	
	System.out.println("enter the value for col");
	int col=sc.nextInt();
	
	int a[][]=new int[row][col];
	System.out.println("please enter the array elements");
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			System.out.print(a[i][j]);
		}
		System.out.println();
		System.out.println("first edit");
	}
	
	
}
}
