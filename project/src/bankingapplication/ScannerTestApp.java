package bankingapplication;

import java.util.Scanner;

public class ScannerTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a charecter");
		//int a=scanner.nextInt();
		char c=scanner.next().charAt(0);
		System.out.println("value="+c);
		}


	}


