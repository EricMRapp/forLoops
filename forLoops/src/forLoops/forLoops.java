package forLoops;

public class forLoops {

	public static void main(String[] args) {
		challengeOne();
		challengeTwo();
	}

	
	private static void challengeOne() {
		for(int i = 1; i <= 5; i++)
			System.out.println(i);
	}
	private static void challengeTwo() {
		for(int i = 0; i <= 10; i = i + 2)
		{
			for(int t = 2; t <= 10; t = t + 2)
			{
			System.out.println(t + " I love Mullen!");
		}
		}
	}


	}



