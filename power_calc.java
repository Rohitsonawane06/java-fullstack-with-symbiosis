//2]calculate power of given number

import java.util.*;
public class power_calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base number:");
		double base=sc.nextDouble();
		System.out.println("Enter Exponent:");
		double exponent=sc.nextDouble();
		double result=Math.pow(base, exponent);
		System.out.println("Power of fiven number "+result);
	}

}
