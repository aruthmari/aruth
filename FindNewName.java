package newone;
import java.util.Random;
import java.util.Scanner;

public class FindNewName 
{
	public static void combineChar(String name1, String name2)
	{
		int l1 = name1.length(),l2 = name2.length(),lm = Math.min(l1, l2);	

		char newName[] = new char[lm];
		Random rand = new Random();

		for (int i=0;i<=15;i++)
		{			
			for (int a=0;a<=lm-1;a+=2)
			{
				newName [a] = name1.charAt((int)rand.nextInt(l1));
			}
			for (int b=1;b<=lm-1;b+=2)
			{
				newName [b] = name2.charAt((int)rand.nextInt(l2));					
			}			
			StringBuilder name3 = new StringBuilder();
			name3.append(newName);
			System.out.println(name3.toString());
		}
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Name1");
		String name1 = input.nextLine();

		System.out.println("Enter Name2");
		String name2 = input.nextLine();

		FindNewName.combineChar(name1, name2);
	}
}
