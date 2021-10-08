package sample;
import java.util.Scanner;

public class CoinFlip {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Flip: ");
		int numberOfFlips = sc.nextInt();
		if(numberOfFlips <= 0) {
			System.out.println("The value of number of flips should be greater 0 ");
			return;
		}
		
		int headCounter = 0;
		int tailCounter = 0;
		while ( numberOfFlips > 0) {
			double flipVal = Math.random();
			if(flipVal < 0.5) {
				tailCounter ++;
				
			}
			else {
				headCounter ++;
			}
			numberOfFlips--;
		}
		double headPercentage = ((double)headCounter/numberOfFlips)*100;
		double tailPercentage = ((double)tailCounter/numberOfFlips)*100;
		
		System.out.println("Head Percentage is :" + headPercentage);
		System.out.println("Tail Percentage is : " + tailPercentage );
	}

}
