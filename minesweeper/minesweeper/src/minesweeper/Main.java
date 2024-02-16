package minesweeper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Grid playingGrid = new Grid();
		
		boolean hasGameEnded = false;
		Scanner s = new Scanner(System.in);
		
		do {
			playingGrid.printGrid();
			 try {
				 System.out.println("Please enter your next row coordinate");
				    int x = s.nextInt() -1 ;
				    System.out.println("Please enter your next column coordinate");
				    int y = s.nextInt() - 1 ;
				    playingGrid.revealTile(x, y);
				    if(playingGrid.playerGrid[x][y] == 9) {
				    	System.out.println("Boom you've lost!");
			    		s.close();
			    		hasGameEnded = true;
				    }
				    	if(playingGrid.uncoveredCells.equals(90)) {
				    		System.out.println("Congratulations you win!");
				    		s.close();
				    		hasGameEnded = true;
				    	}
				    	else {
				    		continue;
				    	}
				    
				  } catch (InputMismatchException e) {
				    System.out.println("That wasn't a valid int. Please try again.");
				    continue;
				  }

		}
		while(!hasGameEnded);
		

	}

}
