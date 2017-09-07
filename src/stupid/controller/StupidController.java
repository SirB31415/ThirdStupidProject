package stupid.controller;

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
		
		testScanner();
	}
	private void testScanner()
	{
		Scanner firstScanner;
		firstScanner = new Scanner(System.in);
		System.out.println("What is your favorite food?");
		String answer = firstScanner.nextline();
		System.out.println("Oh" + answer "thats okay");
	}
}
