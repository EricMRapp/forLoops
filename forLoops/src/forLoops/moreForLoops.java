package forLoops;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class moreForLoops {

	public static void main(String[] args) {
		//challengeOne();
		//challengeTwo();
		challengeThree();
	}

	
	


	private static void challengeOne() {
		int sum = 0;
		for(int i = 5; i <= 100; i = i + 5)
		{
			sum = sum + i;
			
		
		}
		System.out.println("The sum of all the numbers between 5-100 by multiples of 5 is " +sum );
	
	}
	private static void challengeTwo()
	{
	System.out.println("Please give a lower bound number");
	Scanner s1 = new Scanner(System.in);
	int lower = s1.nextInt();
	System.out.println("Please give a higher bound nubmer");
	Scanner s2 = new Scanner(System.in);
	int higher = s2.nextInt();
	int sum = 0;
	for(int i = lower; i <= higher; i++)
	{
		sum = sum + i;
		
	}
	System.out.println(sum);
	}
	
	private static void challengeThree() {
		System.out.println("Please give a lower bound number");
		Scanner s1 = new Scanner(System.in);
		int lower = s1.nextInt();
		System.out.println("Please give a higher bound nubmer");
		Scanner s2 = new Scanner(System.in);
		int higher = s2.nextInt();
		int sum = 0;
		for(; lower <= higher; lower++)
		{
			if(lower % 3 == 0)
				{
				sum = sum + lower;
				
				}
			
		}
		System.out.println(sum);
		}
}
	
	

