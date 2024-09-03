/*  write a program to accept character to find out weather the given character is digit.character,alphabe
 * or spcial symbol*/
import java.util.Scanner;
public class character {
	char choice;
	public character()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		choice=sc.next().charAt(0);
				
	}
	public void check_alpha()
	{
		if((choice>='a'&& choice<='z'||choice>='A'&&choice<='Z'))
		{
			System.out.println("Is alphabet");
		}
		else if(choice>='0' && choice<='9')
		{
			System.out.println("Not alphabet");
		}
		else
		{
			System.out.println("Is a Spcial Character");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		character sc=new character();
		sc.check_alpha();
	}

}
