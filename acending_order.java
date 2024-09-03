//14]sort an array in ascending order

import java.util.Scanner;

public class acending_order {
	public static void sd_example4()//sorting the array
	{
		Scanner sc=new Scanner(System.in);
		{
			int[] marks=new int[5];
			for(int i=0;i<marks.length;i++)
			{
				System.out.println("Enter the marks:");
				marks[i]=sc.nextInt();
	
		}
			System.out.println("Before the sorting");
			for(int i=0;i<marks.length;i++)
			{
				System.out.println(marks[i]);
			}
			
				for(int i=0;i<marks.length;i++)
				{
					for(int j=0;j<marks.length;j++)
					{
						if(marks[i] <marks[j])//sorting and reversed
							{
							int temp= marks[i];
							marks[i]=marks[j];
							marks[j]=temp;
						}
					}
				}
				System.out.println("After the sorting");
				for(int i=0;i<marks.length;i++)
				{
					System.out.println(marks[i]);
				}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sd_example4();
	}

}
