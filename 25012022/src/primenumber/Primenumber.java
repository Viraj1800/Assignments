package primenumber;
import java.util.Scanner;

public class Primenumber {

	public Primenumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		boolean flag = false ;
		int i=2;
		while(i<=num/2) {
			if(num % i==0) {
				flag = true;
			}
			i=i+1;
		}
		if(!flag) {
			System.out.println(num+" "+"Is a prime number");
		}else {
			System.out.println(num+" "+"Is not a prime number");
		}

	}

}
