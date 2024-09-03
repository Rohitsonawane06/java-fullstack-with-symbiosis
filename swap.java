/*3]swap of two number call value, call reference and without using
 *  third variable
  */
import java.util.Scanner;


public class swap {

	int a,b,temp;
	public swap()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  First Number:");
		a=sc.nextInt();
		System.out.println("Enter a  Second Number:");
		b=sc.nextInt();
		System.out.println("Before the swaping number:"+a+" "+b);
		
		temp=a;
		 a=b;
		 b=temp;
	}
	
	 void show()
	 {
	 System.out.println("After the swaping nuber:"+a+" "+b);
	
	 }
	 public static void main(String[] args) {
		 swap sc=new swap();
		 sc.show();

	}

}

