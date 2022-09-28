package game.snake.ladder;

import java.util.Random;

public class Snake_And_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		System.out.println("welcome to the snake and ladder program");
		int userPosition = 0;
		
		System.out.println("Initial position of user: "+userPosition);
		
		int dice = random.nextInt(6)+1;
		System.out.println("player rolls a die and get a random number is: "+dice);
		
	}

}
