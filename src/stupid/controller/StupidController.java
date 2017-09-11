package stupid.controller;
import stupid.model.PlayDohCircle;
import stupid.model.MySnakeySnake;
import java.util.Scanner;
/**
 * 
 * @author Parker Brailow
 *
 */

public class StupidController
{
	
	public void start()
	{
		System.out.println("nailed it");
		
		
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		System.out.println("look I made a circle");
		System.out.println(firstCircle);
		System.out.println(secondCircle);
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("How big of a circle do you want?");
		int circleSize = myScanner.nextInt();
		PlayDohCircle thirdCircle = new PlayDohCircle(circleSize);
		System.out.println(thirdCircle);
		
		MySnakeySnake firstSnake = new MySnakeySnake();
		System.out.println("Look out a snakey snake!!!");
		System.out.println(firstSnake);
		

		
		testScanner();
		
	}


	private void testScanner()
	{
		Scanner firstScanner;
		firstScanner = new Scanner(System.in);
		
		System.out.println("What is your favorite food?");
		String answer = firstScanner.next();
		System.out.println("Oh " + answer + "run");
	}
}
