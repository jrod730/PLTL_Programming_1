import java.util.Scanner;
public class BattleshipGame
{
	public static void main(String[] args)
	{
		char[][] computerLayout = populate();
		
		char[][] computerHidden = populate();
								 
		char[][] playerLayout = populate();
		
								 
		computerLayout = randomizeBoards(computerLayout);
		playerLayout = randomizeBoards(playerLayout);
		
		System.out.println("Computer Board");
		printGrid(computerHidden);
		System.out.println();
		System.out.println();
		System.out.println("Player Board");
		printGrid(playerLayout);
		
		promptPlayer(computerLayout, playerLayout, computerHidden);

	}
	public static char[][] populate()
	{
		char[][] a = new char[10][10];
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				a[i][j] = '#';
			}
		}
		
		return a;
	}
	public static char[][] randomizeBoards(char[][] a)
	{
		boolean[] x = new boolean[10];
		boolean[] y = new boolean[10];//change this to 100 and add spots accordingly
		int[] ships = {2, 2, 3, 3, 3, 4, 4, 4};
		
		 
		for(int i = 0; i < ships.length; i++)
		{	
			//randomize ether x or y direction y = 0 x =1
			int direction = (int) (Math.random() * 2);
			//coordinates randomized
			int xCoordinate = (int) (Math.random() * 10);
			
			//checks to make sure coordinate is not in use
			while(x[xCoordinate])
			{
				xCoordinate = (int) (Math.random() * 10);
			}
			x[xCoordinate] = true;
			
			int yCoordinate = (int) (Math.random() * 10);
			
			//checks to make sure coordinate is not in use
			while(y[yCoordinate])
			{
				yCoordinate = (int) (Math.random() * 10);
			}
			y[yCoordinate] = true;
			
			//begin of randomizing direction
			boolean down = true;
			boolean right = true;
			
			if(yCoordinate - ships[i] +1 >= ships[i] && direction == 0)
			{
				down = false;
			}
			else if(xCoordinate - ships[i] + 1 >= ships[i] && direction == 1)
			{
				right = false;
			}
			
			//begin placement of ships
			if((down && direction == 0) || (right && direction == 1))
			{
				boolean checkOccupancy = true;
				//Checks for coordinate occupancy
				for(int j = 0; j < ships[i]; j++)
				{
					if(direction == 0)
					{
						if(a[yCoordinate + j][xCoordinate] == 'S')
							checkOccupancy = false;
					}
					else if(direction == 1)
					{
						if(a[yCoordinate][xCoordinate + j] == 'S')
							checkOccupancy = false;
					}
						

				}
				
				//if occupancy is begin placement of ships based on direction
				if(checkOccupancy)
				{
					for(int j = 0; j < ships[i]; j++)
					{
						if(direction == 0)
							a[yCoordinate + j][xCoordinate] = 'S';
						else if(direction == 1)
							a[yCoordinate][xCoordinate + j] = 'S';
					}
					
				}
				else
				{
					//finds another set of coorrdinates that are not occupied
					i--;
					y[yCoordinate] = false;
					x[xCoordinate] = false;
				}
			}
			else if((!down && direction == 0) || (!right && direction == 1))
			{
				boolean checkOccupancy = true;
				//first checks for coordinate occupancy
				for(int j = 0; j < ships[i]; j++)
				{
					if(direction == 0)
					{
						if(a[yCoordinate - j][xCoordinate] == 'S')
							checkOccupancy = false;
					}
					else if(direction == 1)
					{
						if(a[yCoordinate][xCoordinate - j] == 'S')
							checkOccupancy = false;
					}

				}
				
				if(checkOccupancy)
				{
					for(int j = 0; j < ships[i]; j++)
					{
						if(direction == 0)
							a[yCoordinate - j][xCoordinate] = 'S';
						else if(direction == 1)
							a[yCoordinate][xCoordinate - j] = 'S';
					}
				}
				else
				{
					//finds another set of coorrdinates that are not occupied
					i--;
					y[yCoordinate] = false;
					x[xCoordinate] = false;
				}
			}
			else
			{
				i--;
				y[yCoordinate] = false;
				x[xCoordinate] = false;
				
			}
		
		}//end out loop
		return a;
		
	}//end randomizeBoard()
		
	public static void printGrid(char[][] a)
	{
		
		int count = 1;
			
		for(int i = 0; i < a.length; i++)
		{
			if(i != a.length - 1)
				System.out.print(" " + count + "|");
			else
				System.out.print(count + "|");
				
			for(int j = 0; j < a.length; j++)
			{
				System.out.print(a[i][j] + " | ");
				
			}//end inner loop
				
			count++;
			System.out.println();
		}//end outer loop
		
		System.out.println("-------------------------------------------");
		System.out.println("   1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10");
		
	}//end printGrid()
	public static void promptPlayer(char[][] computerLayout, char[][] player, char[][] computerHidden)//takes computer ship layout array 
	{
		Scanner kb = new Scanner(System.in);
		boolean gameOverPlayerWin = false, gameOverComputerWin = false;
		
		int x, y = -1;//y has to be negative in order to compile
		
		do
		{
			do
			{
				System.out.print("Enter X Coordinates: ");
				x = kb.nextInt();
				if(x >= 1 && x <= 10)
				{
					System.out.print("Enter Y Coordinates: ");
					y = kb.nextInt();
					
					if(y < 1 || y > 10)
						System.out.println("Enter Correct pair of coordinates!");
				}
				else
				{
					System.out.println("Enter Correct pair of coordinates!");
				}
				
			}while(y > 10 || 0 >= y || x > 10 || 0 >= x);
			
			//decrement user input in order to stay within array.
			x -= 1;
			y -= 1;
			
			
			boolean checkSpace = checkSpace(x, y, computerHidden);

			if(checkSpace)
			{	gameOverPlayerWin = shootCompArray(x, y, computerHidden, computerLayout);
				gameOverComputerWin = shootPlayerArray(-1, -1, player);
				System.out.println("Computer Board");
				printGrid(computerHidden);
				System.out.println();
				System.out.println();
				System.out.println("Player Board");
				printGrid(player);

			}
			else
			{
				System.out.println("Computer Board");
				printGrid(computerHidden);
				System.out.println();
				System.out.println();
				System.out.println("Player Board");
				printGrid(player);
				System.out.println("Those coordinates have already been choosen. Please pick again.");
				
			}
			
		}while(!gameOverPlayerWin && !gameOverComputerWin);
		
		if(gameOverPlayerWin)
		{
			System.out.println("Computer Board");
			printGrid(computerLayout);
			System.out.println();
			System.out.println();
			System.out.println("Player Board");
			printGrid(player);

			System.out.println("Congratulations you have won!");
		}
		else
		{
			System.out.println("Computer Board");
			printGrid(computerLayout);
			System.out.println();
			System.out.println();
			System.out.println("Player Board");
			printGrid(player);

			System.out.println("You lose! Try again!");
		}
	}//end prompt user
	public static boolean shootCompArray(int x, int y, char[][] hidden, char[][] layout)
	{
			//sets hit == x miss == o on the computers HIDDEN array
		if(layout[y][x] == 'S')
		{
			layout[y][x] = 'X';
			hidden[y][x] = 'X';
			
		}
		else
		{
			layout[y][x] = 'O';
			hidden[y][x] = 'O';
		}

		int count = 0;
		for(int i = 0; i < layout.length; i++)
		{
			for(int j = 0; j < layout[i].length; j++)
			{
				if(layout[i][j] == 'X')
					count++;
			}
			
			if(count == 25)
				return true;
		}
		
		return false;

	}
	
	public static boolean shootPlayerArray(int x, int y, char[][] a)
	{
		
			// b==x c==y
			int b = (int) (Math.random() * 10), c = (int) (Math.random() * 10);
			
			boolean occupancy = true;
			while(occupancy)//check occupancy
			{
				if(a[c][b] == '#' || a[c][b] == 'S')
					occupancy = false;
				else
				{
					occupancy = true;
					b = (int) (Math.random() * 10); 
					c = (int) (Math.random() * 10);
				}
			}
			
			//sets hit == x miss == o
			if(a[c][b] == 'S')
				a[c][b] = 'X';
			else
				a[c][b] = 'O';
		
			
		//checking for the amount of hits
		int count = 0;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				if(a[i][j] == 'X')
					count++;
			}
			
			if(count == 25)
				return true;
		}
		
		return false; 
	}//shootArray
	public static boolean checkSpace(int x, int y, char[][] a)
	{
		if(a[y][x] == '#')
			return true;
		else
			return false;

	}
}//end class