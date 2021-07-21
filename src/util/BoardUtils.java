package util;

import java.util.Random;

public class BoardUtils {
	
	public static int rollDice(){
		Random rand = new Random();
		int result = rand.nextInt(6 + 1);
		
		return result;
	}
	
}//
