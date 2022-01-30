package power;
import java.util.Scanner;

public class Powerofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter base value");
		int base = sc.nextInt();
		System.out.println("Enter exponent value");
		int exponent =sc.nextInt();
		double PowerofNum = Math.pow(base,exponent);
		System.out.println(PowerofNum);
		
		

	}

}
