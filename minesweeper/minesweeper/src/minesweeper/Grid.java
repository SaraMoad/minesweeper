package minesweeper;

public class Grid {

	public int[][] gameGrid;
	private String[] topNavigation = {"A","B", "C", "D", "E", "F", "G", "H", "I", "J"};
	private Integer[] sideNavigation = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	public Grid (int[][]gameGrid) {
		this.gameGrid = gameGrid;
	}
	public void printGrid() {
		System.out.println(topNavigation); 
		for (int i = 0; i < sideNavigation.length; i++) {
			System.out.println(sideNavigation[i] + "|");
		}
		
	}

}
