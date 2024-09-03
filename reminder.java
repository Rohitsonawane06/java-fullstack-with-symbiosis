/*Write a program  find reminder without using mod oprator */
import java.util.Scanner;
public class reminder {
	int num1=0,num2=0,rem=0;
	public reminder()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First Value:");
		num1=sc.nextInt();
		System.out.println("Enter a Second value:");
		num2=sc.nextInt();
		rem=num1-(num1/num2)*num2;
	}
	void show()
	{
		System.out.println("Remainder is:"+rem);
	}
	public static void main(String [] args)
	{
		reminder sc=new reminder();
		sc.show();
	}

}