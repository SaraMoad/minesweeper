package minesweeper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Grid grid = new Grid();
		boolean hasGameEnded = false;
		Scanner s = new Scanner(System.in);
		
		do {
			grid.printGrid();
			 try {
				 System.out.println("Please enter you next x coordinate");
//				    int isInt = Integer.parseInt(s.nextLine());
				    int x = s.nextInt();
				    System.out.println("Please enter you next y coordinate");
//				    isInt = Integer.parseInt(s.nextLine());
				    int y = s.nextInt();	
				    hasGameEnded = true;
				  } catch (InputMismatchException e) {
				    System.out.println("That wasn't a valid int. Please try again.");
				  }
 
//			if (grid.gameGrid[x][y].isHasBomb() == true) {
//			}
		}
		while(!hasGameEnded);
		

	}

}
