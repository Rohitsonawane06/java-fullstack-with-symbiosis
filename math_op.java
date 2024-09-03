/* Write a menu driven program for basic mathematicle opration*/
import java.util.Scanner;
public class math_op {
	int choice,num1,num2;
	public math_op(){
		do {
	Scanner sc=new Scanner(System.in);
	System.out.println("1.Addition");
	System.out.println("2.Substraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Divison");
	System.out.println("5.Exit");
	System.out.println("Enter Your Choice:");
	choice=sc.nextInt();
	
	
		switch(choice)
		{
		case 1:
			System.out.println("Enter First number:");
				num1=sc.nextInt();
				System.out.println("Enter Second Number:");
				num2=sc.nextInt();
				System.out.println("Addition of number:"+(num1+num2));
		break;
		case 2:
			System.out.println("Enter First number:");
				num1=sc.nextInt();
				System.out.println("Enter Second Number:");
				num2=sc.nextInt();
				System.out.println("substraction of number:"+(num1-num2));
		break;
		case 3:
			System.out.println("Enter First number:");
				num1=sc.nextInt();
				System.out.println("Enter Second Number:");
				num2=sc.nextInt();
				System.out.println("multiplication of number:"+(num1*num2));
		break;
		case 4:
			System.out.println("Enter First number:");
				num1=sc.nextInt();
				System.out.println("Enter Second Number:");
				num2=sc.nextInt();
				System.out.println("Division of number:"+(num1/num2));
		break;
		case 5:
			System.out.println("Exit the program");
		break;
		
		}
		
	}while(choice!=5);
	}
	public static void main(String[] args)
	{
		math_op sc=new math_op();
	}
	
}
