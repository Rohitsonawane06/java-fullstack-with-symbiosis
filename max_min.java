//17)find the minimum and maximum number from given array
	import java.util.*;
public class max_min {
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of the array:");
			int n = sc.nextInt();
			int [] num = new int[n];
			System.out.println();
			for(int i=0;i<num.length;i++)
			{
				num[i] = sc.nextInt();
			}
			int max = num[0];
			int min = num[0];
			
			for(int i=0;i<num.length;i++)
			{
				if (num[i] > max)
				{
					max = num[i];
				}
				if(num[i] < min)
				{
					min = num[i];
				}
				
			}
			System.out.println("Maximum number  is: " + max);
			System.out.println("Minimum number  is: " + min);

		}

	}

