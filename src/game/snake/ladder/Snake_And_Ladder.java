package game.snake.ladder;

import java.util.Random;

public class Snake_And_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		System.out.println("welcome to the snake and ladder program");
		int userPosition = 0;
		int count = 0;
		System.out.println("Initial position of user: "+userPosition);
		while(userPosition != 100) 
		{
			 count++;
		
		int dice = random.nextInt(6)+1;
		System.out.println("player rolls a die and get a random number is: "+dice);
		int option = random.nextInt(3);
		switch(option)
		{
		case 0: System.out.println("No Play!!");
				break;
		case 1: System.out.println("Ladder!");
				userPosition = userPosition + dice;
				if(userPosition >100)
				{
					userPosition = dice;
				}
				break;
		default: System.out.println("Snake!");
				userPosition = userPosition - dice;
				
				if(userPosition<0)
				{ userPosition = 0; 
				}
		}
		System.out.println("Presnt Position of the User: "+userPosition);
	    }
		System.out.println("User has rolled "+count+" times to win!");
}
}
