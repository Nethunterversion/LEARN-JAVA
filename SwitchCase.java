package Practice;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int ask;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The Value: ");
		ask = scan.nextInt();
		
		switch(ask) {
		case 1:
			System.out.println("Monday...........");
		break;
		case 2:
			System.out.println("Tuesday.........");
		break;
		case 3:
			System.out.println("Wednesday.......");
		break;
		case 4:
			System.out.println("Thursday.......");
		break;
		case 5:
			System.out.println("Friday.........");
		break;
		case 6:
			System.out.println("Saturday.......");
		break;
		default:
			System.out.println("Sunday........");
		}
		

	}

}
