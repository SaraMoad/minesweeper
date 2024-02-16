package minesweeper;

import java.util.Random;

public class Grid {
	Random random = new Random();
	private boolean[][] mines = new boolean[10][10];
	private boolean[][] isOpened = new boolean[10][10];
	private int[][] surroundingMines = new int[10][10];
	public int[][] gameGrid;	
	private Integer xsize = 10;
	private Integer ysize = 10;
	public Integer uncoveredCells = 0;
	public int[][] playerGrid = new int [10][10];
	
	public Grid() {
		placeMines();
		countSurroundingMines();
		boolean[][] mines;
		int[][] surroundingMines;
		int[][] gameGrid;	
		Integer xsize;
		Integer ysize;
		Integer numOfMines;
		Integer uncoveredCells;
		int[][] playerGrid;
		boolean[][] isOpened; 		
	}

	
	public void generateField() {
		for (int i = 0; i < ysize; i++) {
			
		} 
		
	}

	private void placeMines() {		
		int placedMines = 0;
		while (placedMines <10) {
			int i = random.nextInt(10);
			int j = random.nextInt(10);
			
			if(!mines[i][j]) {
				mines[i][j] = true;
				placedMines++;
			}
		}
		
	}
	
	public void revealTile(int x, int y) {
		if (isOpened[x][y]) {
			System.out.println("Tile has already been opened, try again.");
		}
		if (!mines[x][y]) {
			playerGrid[x][y] = surroundingMines[x][y];
			uncoveredCells++;
			isOpened[x][y] = true;
			
			
		}
		else {
			playerGrid[x][y] = 9;
		}
	}
	
	private void countSurroundingMines() {
		for (int i = 0; i <10; i++) {
			for (int j = 0; j < 10; j++) {
				if (!mines[i][j]) {
					int count = 0;
	                if (i > 0 && mines[i - 1][j]) count++;
	              
	                if (i < 9 && mines[i + 1][j]) count++;
	               
	                if (j > 0 && mines[i][j - 1]) count++;
	               
	                if (j < 9 && mines[i][j + 1]) count++;
	               
	                if (i > 0 && j > 0 && mines[i - 1][j - 1]) count++;
	                
	                if (i < 9 && j < 9 && mines[i + 1][j + 1]) count++;
	                
	                if (i > 0 && j < 9 && mines[i - 1][j + 1]) count++;
	               
	                if (i < 9 && j > 0 && mines[i + 1][j - 1]) count++;
	             
	                surroundingMines[i][j] = count;
				}
			}
		}
	}
	
	
	

	public void printGrid() {
		System.out.print("  "); 
		for (int i = 0; i < 10; i++) {
			if (i<9) {
				System.out.print("  " + (i+1));
			} else { System.out.print("  " + (i+1));
		}
	}
		System.out.print("\n");
	for (int k = 0; k <10; k++) {
		if(k < 9) {			
			System.out.print(String.format("%s  ", k+1));
		} else {
			System.out.print(String.format("%s ", k+1));
		}
	for (int j = 0;	 j < 10; j++) {
		if (isOpened[k][j]) {
			System.out.print(String.format("[%s]", playerGrid[k][j]));	
		}
		else {
			System.out.print("[ ]");
		}
		}
	System.out.print("\n");	
	}
	}
			
		
		
	}


